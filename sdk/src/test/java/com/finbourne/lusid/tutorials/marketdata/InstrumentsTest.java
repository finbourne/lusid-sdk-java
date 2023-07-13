package com.finbourne.lusid.tutorials.marketdata;

import com.finbourne.features.LusidFeature;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.PropertyDefinitionsApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.finbourne.lusid.utilities.TestDataUtilities.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class InstrumentsTest {

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

        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration, 30, 30);

        instrumentsApi = new InstrumentsApi(apiClient);
        propertyDefinitionsApi = new PropertyDefinitionsApi(apiClient);

        seedInstrumentMaster();
        ensurePropertyDefinition("CustomSector");
    }

    private static void ensurePropertyDefinition(String code) throws ApiException {
        try {
            propertyDefinitionsApi.getPropertyDefinition("Instrument", TestDataUtilities.TutorialScope, code, null, null);
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
                        .name("Anglo American plc")

                        /*
                            Instruments are created with a set of identifiers
                            each under a different scheme
                         */
                                .identifiers(new HashMap<String, InstrumentIdValue>() {
                            {
                                put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000BBLDF4"));
                                put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("SDK_ID_1"));
                                put(ISIN_SCHEME, new InstrumentIdValue().value("GB00B1XZS820"));
                                put(SEDOL_SCHEME, new InstrumentIdValue().value("B1XZS82"));
                            }
                        })},


                        {"correlationId2", new InstrumentDefinition()
                                .name("Avast")
                                .identifiers(new HashMap<String, InstrumentIdValue>() {
                            {
                                put(FIGI_SCHEME, new InstrumentIdValue().value("BBG00KW3SK62"));
                                put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("SDK_ID_2"));
                                put(ISIN_SCHEME, new InstrumentIdValue().value("GB00BDD85M81"));
                                put(SEDOL_SCHEME, new InstrumentIdValue().value("BDD85M8"));
                            }
                        })},


                        {"correlationId3", new InstrumentDefinition()
                                .name("Berkeley Group Holdings")
                                .identifiers(new HashMap<String, InstrumentIdValue>() {
                            {
                                put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000H6ZKT3"));
                                put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("SDK_ID_3"));
                                put(ISIN_SCHEME, new InstrumentIdValue().value("GB00B02L3W35"));
                                put(SEDOL_SCHEME, new InstrumentIdValue().value("B02L3W3"));
                            }
                        })},


                        {"correlationId4", new InstrumentDefinition()
                                .name("Croda International")
                                .identifiers(new HashMap<String, InstrumentIdValue>() {
                            {
                                put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000BDCLS8"));
                                put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("SDK_ID_4"));
                                put(ISIN_SCHEME, new InstrumentIdValue().value("GB00BJFFLV09"));
                                put(SEDOL_SCHEME, new InstrumentIdValue().value("BJFFLV0"));
                            }
                        })},

                        {"correlationId5", new InstrumentDefinition()
                                .name("Experian")
                                .identifiers(new HashMap<String, InstrumentIdValue>() {
                            {
                                put(FIGI_SCHEME, new InstrumentIdValue().value("BBG000BKFZN3"));
                                put(CUSTOM_INTERNAL_SCHEME, new InstrumentIdValue().value("SDK_ID_5"));
                                put(ISIN_SCHEME, new InstrumentIdValue().value("GB00B19NLV48"));
                                put(SEDOL_SCHEME, new InstrumentIdValue().value("B19NLV4"));
                            }
                        })}

                }).collect(Collectors.toMap(data -> (String)data[0], data -> (InstrumentDefinition)data[1])),
                DefaultScope);

        assertThat(upsertInstrumentsResponse.getValues().size(), is(equalTo(5)));
    }

    @Test
    @LusidFeature("F22")
    public void lookup_instrument_by_unique_id() throws ApiException
    {
        /*
            Look up an instrument that already exists in the instrument master by a
            unique id, in this case an OpenFigi, and also return a list of aliases
         */

        GetInstrumentsResponse lookedUpInstruments = instrumentsApi.getInstruments(FIGI_SCHEME, Arrays.asList("BBG000BBLDF4"),
                null, null, Arrays.asList(ISIN_PROPERTY_KEY, SEDOL_PROPERTY_KEY), DefaultScope, null);

        assertThat(lookedUpInstruments.getValues(), hasKey("BBG000BBLDF4"));

        Instrument instrument = lookedUpInstruments.getValues().get("BBG000BBLDF4");

        assertThat(instrument.getName(), is(equalTo("Anglo American plc")));

        List<Property>  identifiers = instrument.getProperties();
        identifiers.sort(Comparator.comparing(Property::getKey));

        assertThat(identifiers.get(0).getKey(), equalTo(ISIN_PROPERTY_KEY));
        assertThat(identifiers.get(0).getValue().getLabelValue(), equalTo("GB00B1XZS820"));
        assertThat(identifiers.get(1).getKey(), equalTo(SEDOL_PROPERTY_KEY));
        assertThat(identifiers.get(1).getValue().getLabelValue(), equalTo("B1XZS82"));
    }

    @Test
    @LusidFeature("F23")
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
    @LusidFeature("F24")
    public void list_all_instruments() throws  ApiException {

        final int pageSize = 5;

        //    List the instruments restricting, the number that are returned
        PagedResourceListOfInstrument instruments = instrumentsApi.listInstruments(null, null, null, null, null, pageSize, null, null, DefaultScope, null);

        assertThat(instruments.getValues().size(), is(equalTo(pageSize)));
    }

    @Test
    @LusidFeature("F25")
    public void list_instruments_by_Identifier_type() throws ApiException {

        List<String>    figis = Arrays.asList("BBG000BBLDF4", "BBG00KW3SK62", "BBG000H6ZKT3");

        //  Get a set of instruments querying by FIGIs
        GetInstrumentsResponse instruments = instrumentsApi.getInstruments("Figi", figis, null, null, null, DefaultScope, null);

        for (String figi : figis) {
            assertThat(instruments.getValues(), hasKey(figi));
        }
    }

    @Test
    @LusidFeature("F26")
    public void edit_instrument_property() throws ApiException {
        String figi = "BBG000BBLDF4";
        //  Create the property value
        PropertyValue   propertyValue = new PropertyValue().labelValue("Telecoms");
        String propertyKey = String.format("Instrument/%s/CustomSector", TutorialScope);

        //    Add it to the instrument
        instrumentsApi.upsertInstrumentsProperties(Collections.singletonList(new UpsertInstrumentPropertyRequest()
                .identifierType(FIGI_SCHEME)
                .identifier(figi)
                .properties(Collections.singletonList(new Property().key(propertyKey).value(propertyValue)))),
                DefaultScope);

        Instrument instrument = instrumentsApi.getInstrument(
                FIGI_SCHEME,
                figi,
                null, null,
                Collections.singletonList(propertyKey),
                DefaultScope,
                null
        );

        assertThat(instrument.getProperties(), hasSize(greaterThanOrEqualTo(1)));

        Property property = instrument.getProperties().get(0);

        assertThat(property.getValue().getLabelValue(), equalTo("Telecoms"));
    }
}