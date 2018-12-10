package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.InstrumentDefinition;
import com.finbourne.lusid.model.UpsertInstrumentsResponse;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Utility to load a set of instruments into LUSID
 */
public class InstrumentLoader {

    /**
     *  Loads a set of instruments into LUSID
     *
     * @return List of LUSID instrument ids
     */
    public List<String> loadInstruments() throws IOException, ApiException {
        File configJson = new TestConfigurationLoader().loadConfiguration("secrets.json");
        ApiClient apiClient = new ApiClientBuilder(configJson).build();
        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);

        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(Map.of(
            "request1", new InstrumentDefinition().name("VODAFONE GROUP PLC").identifiers(Map.of("Figi", "BBG000C6K6G9")),
            "request2", new InstrumentDefinition().name("BARCLAYS PLC").identifiers(Map.of("Figi", "BBG000C04D57")),
            "request3", new InstrumentDefinition().name("NATIONAL GRID PLC").identifiers(Map.of("Figi", "BBG000FV67Q4")),
            "request4", new InstrumentDefinition().name("SAINSBURY (J) PLC").identifiers(Map.of("Figi", "BBG000BF0KW3")),
            "request5", new InstrumentDefinition().name("TAYLOR WIMPEY PLC").identifiers(Map.of("Figi", "BBG000BF4KL1"))
        ));

        return instrumentsResponse
                .getValues()
                .values()
                .stream()
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }
}
