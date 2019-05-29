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
public class InstrumentLoader {

    private InstrumentsApi  instrumentsApi;

    public InstrumentLoader(InstrumentsApi instrumentsApi) {
        this.instrumentsApi = instrumentsApi;
    }

    /**
     *  Loads a set of instruments into LUSID
     *
     * @return List of LUSID instrument ids
     */
    public List<String> loadInstruments() throws ApiException {

        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(Stream.of(new Object[][] {
            { "request1", new InstrumentDefinition().name("ASTRAZENECA PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000C0YGH4")); }}) },
            { "request2", new InstrumentDefinition().name("CENTRICA PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BPFPZ1")); }}) },
            { "request3", new InstrumentDefinition().name("DIAGEO PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BS69D5")); }}) },
            { "request4", new InstrumentDefinition().name("GLAXOSMITHKLINE PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000CT5GJ1")); }}) },
            { "request5", new InstrumentDefinition().name("MARKS & SPENCER GROUP PLC").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BDTRV3")); }}) }
        }).collect(Collectors.toMap(data -> (String)data[0], data -> (InstrumentDefinition)data[1])));

        return instrumentsResponse
                .getValues()
                .values()
                .stream()
                .sorted(Comparator.comparing(Instrument::getName))
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }

    public void deleteInstruments() throws ApiException
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
