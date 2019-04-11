package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.InstrumentDefinition;
import com.finbourne.lusid.model.UpsertInstrumentsResponse;
import com.finbourne.lusid.model.InstrumentIdValue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Utility to load a set of instruments into LUSID
 */
class InstrumentLoader {

    private InstrumentsApi  instrumentsApi;

    InstrumentLoader(InstrumentsApi instrumentsApi) {
        this.instrumentsApi = instrumentsApi;
    }

    /**
     *  Loads a set of instruments into LUSID
     *
     * @return List of LUSID instrument ids
     */
    List<String> loadInstruments() throws ApiException {

        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(Stream.of(new Object[][] {
            { "request1", new InstrumentDefinition().name("VODAFONE GROUP PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000C6K6G9")); }}) },
            { "request2", new InstrumentDefinition().name("BARCLAYS PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000C04D57")); }}) },
            { "request3", new InstrumentDefinition().name("NATIONAL GRID PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000FV67Q4")); }}) },
            { "request4", new InstrumentDefinition().name("SAINSBURY (J) PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BF0KW3")); }}) },
            { "request5", new InstrumentDefinition().name("TAYLOR WIMPEY PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BF4KL1")); }}) }
        }).collect(Collectors.toMap(data -> (String)data[0], data -> (InstrumentDefinition)data[1])));

        return instrumentsResponse
                .getValues()
                .values()
                .stream()
                .sorted(Comparator.comparing(Instrument::getName))
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }

    void deleteInstruments() throws ApiException
    {
        List<String>    ids = Arrays.asList(
                "BBG000C6K6G9",
                "BBG000C04D57",
                "BBG000FV67Q4",
                "BBG000BF0KW3",
                "BBG000BF4KL1"
        );

        for (String id : ids) {
            instrumentsApi.deleteInstrument("Figi", id);
        }
    }
}
