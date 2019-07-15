package com.finbourne.lusid.tutorials.marketdata;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class InstrumentMaster {

    private static final String FIGI_SCHEME = "Figi";
    private static final String CUSTOM_INTERNAL_SCHEME = "ClientInternal";
    private static final String ISIN_SCHEME = "Isin";
    private static final String SEDOL_SCHEME = "Sedol";

    private static final String ISIN_PROPERTY_KEY = "Instrument/default/Isin";
    private static final String SEDOL_PROPERTY_KEY = "Instrument/default/Sedol";
    private static final String FIGI_PROPERTY_KEY = "Instrument/default/Figi";

    private static InstrumentsApi instrumentsApi;

    @BeforeClass
    public static void setUp() throws Exception {

        ApiClient apiClient = new ApiClientBuilder(CredentialsSource.credentialsFile).build();

        instrumentsApi = new InstrumentsApi(apiClient);

        seedInstrumentMaster();
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
        assertThat(identifiers.get(0).getValue(), equalTo("GB00BH4HKS39"));
        assertThat(identifiers.get(1).getKey(), equalTo(SEDOL_PROPERTY_KEY));
        assertThat(identifiers.get(1).getValue(), equalTo("BH4HKS3"));
    }

}
