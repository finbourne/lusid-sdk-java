package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.UpsertInstrumentRequest;
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
                "request1", new UpsertInstrumentRequest().name("inst-1").identifiers(Map.of("Figi", "BBG000C6K6G9")),
                "request2", new UpsertInstrumentRequest().name("inst-2").identifiers(Map.of("Figi", "BBG000C04D57")),
                "request3", new UpsertInstrumentRequest().name("inst-3").identifiers(Map.of("Figi", "BBG000FV67Q4")),
                "request4", new UpsertInstrumentRequest().name("inst-4").identifiers(Map.of("Figi", "BBG000BF0KW3")),
                "request5", new UpsertInstrumentRequest().name("inst-5").identifiers(Map.of("Figi", "BBG000BF4KL1"))
        ));

        return instrumentsResponse
                .getValues()
                .values()
                .stream()
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }
}
