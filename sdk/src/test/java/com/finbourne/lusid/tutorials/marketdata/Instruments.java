package com.finbourne.lusid.tutorials.marketdata;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.PropertyDefinitionsApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import com.finbourne.lusid.utilities.TestDataUtilities;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.finbourne.lusid.utilities.TestDataUtilities.TutorialScope;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Instruments {

    private static final String FIGI_SCHEME = "Figi";
    private static final String CUSTOM_INTERNAL_SCHEME = "ClientInternal";
    private static final String ISIN_SCHEME = "Isin";
    private static final String SEDOL_SCHEME = "Sedol";

    private static final String ISIN_PROPERTY_KEY = "Instrument/default/Isin";
    private static final String SEDOL_PROPERTY_KEY = "Instrument/default/Sedol";
    private static final String FIGI_PROPERTY_KEY = "Instrument/default/Figi";

    private static InstrumentsApi instrumentsApi;
    private static PropertyDefinitionsApi  propertyDefinitionsApi;

    @BeforeClass
    public static void setUp() throws Exception {

        ApiClient apiClient = new ApiClientBuilder(CredentialsSource.credentialsFile).build();

        instrumentsApi = new InstrumentsApi(apiClient);
        propertyDefinitionsApi = new PropertyDefinitionsApi(apiClient);

        seedInstrumentMaster();
        ensurePropertyDefinition("CustomSector");
    }

    private static void ensurePropertyDefinition(String code) throws ApiException {
        try {
            propertyDefinitionsApi.getPropertyDefinition("Instrument", TestDataUtilities.TutorialScope, code, null);
        } catch (ApiException e) {

            //  Property definition doesn't exist (returns 404), so create one
            //  Details of the property to be created
            CreatePropertyDefinitionRequest propertyDefinition = new CreatePropertyDefinitionRequest()
                    .domain(CreatePropertyDefinitionRequest.DomainEnum.INSTRUMENT)
                    .scope(TutorialScope)
                    .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)
                    .code(code)
                    .valueRequired(false)
                    .displayName("Fund Style")
                    .dataTypeId(new ResourceId().scope("system").code("string"));

            //  Create property definition
            propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);
        }
    }

    private static void seedInstrumentMaster() throws ApiException
    {
        UpsertInstrumentsResponse upsertInstrumentsResponse = instrumentsApi.upsertInstruments(Stream.of(new Object[][] {

                {"correlationId1", new InstrumentDefinition()
                        .name("VODAFONE GROUP PLC")

                        /*
                            Instruments are created with a set of identifiers
                            each under a different scheme
                         */
                        .identifiers(new HashMap<String, InstrumentIdValue>() {
                    {
                        put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000C6K6G9"));
                        put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("INTERNAL_ID_1"));
                        put(ISIN_SCHEME, new InstrumentIdValue().value("GB00BH4HKS39"));
                        put(SEDOL_SCHEME, new InstrumentIdValue().value("BH4HKS3"));
                    }
                })},


                {"correlationId2", new InstrumentDefinition()
                        .name("BARCLAYS PLC")
                        .identifiers(new HashMap<String, InstrumentIdValue>() {
                    {
                        put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000C04D57"));
                        put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("INTERNAL_ID_2"));
                        put(ISIN_SCHEME, new InstrumentIdValue().value("GB0031348658"));
                        put(SEDOL_SCHEME, new InstrumentIdValue().value("3134865"));
                    }
                })},


                {"correlationId3", new InstrumentDefinition()
                        .name("NATIONAL GRID PLC")
                        .identifiers(new HashMap<String, InstrumentIdValue>() {
                    {
                        put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000FV67Q4"));
                        put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("INTERNAL_ID_3"));
                        put(ISIN_SCHEME, new InstrumentIdValue().value("GB00BDR05C01"));
                        put(SEDOL_SCHEME, new InstrumentIdValue().value("BDR05C0"));
                    }
                })},


                {"correlationId4", new InstrumentDefinition()
                        .name("SAINSBURY (J) PLC")
                        .identifiers(new HashMap<String, InstrumentIdValue>() {
                    {
                        put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000BF0KW3"));
                        put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("INTERNAL_ID_4"));
                        put(ISIN_SCHEME, new InstrumentIdValue().value("GB00B019KW72"));
                        put(SEDOL_SCHEME, new InstrumentIdValue().value("B019KW7"));
                    }
                })},

                {"correlationId5", new InstrumentDefinition()
                        .name("TAYLOR WIMPEY PLC")
                        .identifiers(new HashMap<String, InstrumentIdValue>() {
                    {
                        put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000BF4KL1"));
                        put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("INTERNAL_ID_5"));
                        put(ISIN_SCHEME, new InstrumentIdValue().value("GB0008782301"));
                        put(SEDOL_SCHEME, new InstrumentIdValue().value("0878230"));
                    }
                })}

        }).collect(Collectors.toMap(data -> (String)data[0], data -> (InstrumentDefinition)data[1])));

        assertThat(upsertInstrumentsResponse.getValues().size(), is(equalTo(5)));
    }


    @Test
    public void lookup_instrument_by_unique_id() throws ApiException
    {
        /*
            Look up an instrument that already exists in the instrument master by a
            unique id, in this case an OpenFigi, and also return a list of aliases
         */

        GetInstrumentsResponse lookedUpInstruments = instrumentsApi.getInstruments(FIGI_SCHEME, Arrays.asList("BBG000C6K6G9"),
                null, null, Arrays.asList(ISIN_PROPERTY_KEY, SEDOL_PROPERTY_KEY));

        assertThat(lookedUpInstruments.getValues(), hasKey("BBG000C6K6G9"));

        Instrument instrument = lookedUpInstruments.getValues().get("BBG000C6K6G9");

        assertThat(instrument.getName(), is(equalTo("VODAFONE GROUP PLC")));

        List<Property>  identifiers = instrument.getProperties();
        identifiers.sort(Comparator.comparing(Property::getKey));

        assertThat(identifiers.get(0).getKey(), equalTo(ISIN_PROPERTY_KEY));
        assertThat(identifiers.get(0).getValue().getLabelValue(), equalTo("GB00BH4HKS39"));
        assertThat(identifiers.get(1).getKey(), equalTo(SEDOL_PROPERTY_KEY));
        assertThat(identifiers.get(1).getValue().getLabelValue(), equalTo("BH4HKS3"));
    }

    @Test
    public void list_available_identifiers() throws ApiException {

        //    Get the list of identifier schemes
        ResourceListOfInstrumentIdTypeDescriptor identifiers = instrumentsApi.getInstrumentIdentifierTypes();

        //    Schemes are returned as descriptors containing the name, property key and uniqueness constraint

        for (InstrumentIdTypeDescriptor scheme : identifiers.getValues())
        {
            System.out.println(String.format("name: %s\nproperty key: %s\nis unique: %s\n", scheme.getIdentifierType(),
                    scheme.getPropertyKey(), scheme.getIsUniqueIdentifierType()));
        }
    }

    @Test
    public void list_all_instruments() throws  ApiException {

        final int pageSize = 5;

        //    List the instruments restricting, the number that are returned
        ResourceListOfInstrument instruments = instrumentsApi.listInstruments(null, null, null, null, null, pageSize, null, null);

        assertThat(instruments.getValues().size(), is(equalTo(pageSize)));
    }

    @Test
    public void list_instruments_by_Identifier_type() throws ApiException {

        List<String>    figis = Arrays.asList("BBG000C6K6G9", "BBG000C04D57", "BBG000FV67Q4");

        //  Get a set of instruments querying by FIGIs
        GetInstrumentsResponse instruments = instrumentsApi.getInstruments("Figi", figis, null, null, null);

        for (String figi : figis) {
            assertThat(instruments.getValues(), hasKey(figi));
        }
    }

    @Test
    public void edit_instrument_property() throws ApiException {

        //  Create the property value
        PropertyValue   propertyValue = new PropertyValue().labelValue("Telecoms");
        String propertyKey = String.format("Instrument/%s/CustomSector", TutorialScope);

        //  Get the LusidInstrumentId (LUID)
        Instrument instrument = instrumentsApi.getInstrument("Figi", "BBG000C6K6G9", null, null, null);

        //    Add it to the instrument
        instrumentsApi.upsertInstrumentsProperties(Collections.singletonList(new UpsertInstrumentPropertyRequest()
                .lusidInstrumentId(instrument.getLusidInstrumentId())
                .properties(Collections.singletonList(new Property().key(propertyKey).value(propertyValue)))));

        instrument = instrumentsApi.getInstrument(
                "LusidInstrumentId",
                instrument.getLusidInstrumentId(),
                null, null,
                Collections.singletonList(propertyKey)
        );

        assertThat(instrument.getProperties(), hasSize(greaterThanOrEqualTo(1)));

        Property property = instrument.getProperties().get(0);

        assertThat(property.getValue().getLabelValue(), equalTo("Telecoms"));
    }

    @Test
    public void create_custom_instrument() throws ApiException {

        //  swap definition, this is uploaded in a client custom format
        InstrumentDefinition   swapDefinition = new InstrumentDefinition()
                .name("10mm 5Y Fixed")

                //  The set of identifiers used for identifying the instrument
                //  e.g. for uploading transactions
                .identifiers(Collections.singletonMap("ClientInternal", new InstrumentIdValue().value("SW-1")))

                //  The details for valuing the instrument
                .definition(

                        new InstrumentEconomicDefinition()

                                //  Identifies which valuation engine to use
                                .instrumentFormat("CustomFormat")
                                .content("<customFormat>upload in custom xml or JSON format</customFormat>")
                );

        //  create the swap
        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(
                Collections.singletonMap("request", swapDefinition)
        );

        assertThat(instrumentsResponse.getFailed().keySet(), is(empty()));
    }

}