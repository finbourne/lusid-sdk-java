package com.finbourne.examples;

// tag::lusid-imports[]
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;
// end::lusid-imports[]

public class HelloWorld {
    public static void main(String[] args) throws IOException, ApiException {
        // tag::create-client-factory[]
        // secrets.json needs to be on your class path
        ApiClient apiClient = new ApiClientBuilder().build("secrets.json");
        // end::create-client-factory[]

        // tag::create-tx-portfolios-api[]
        TransactionPortfoliosApi txPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        // end::create-tx-portfolios-api[]

        // tag::create-portfolio[]
        String scope = "GettingStartedScope";
        UUID guid = UUID.randomUUID();

        CreateTransactionPortfolioRequest portfolioRequest = new CreateTransactionPortfolioRequest();
        portfolioRequest.setDisplayName(String.format("Portfolio-%s", guid));
        portfolioRequest.setCode(String.format("Code-%s", guid));
        portfolioRequest.setBaseCurrency("GBP");
        portfolioRequest.setCreated(OffsetDateTime.of(LocalDateTime.of(2021, 3, 20, 0, 0), ZoneOffset.UTC));

        Portfolio portfolio = txPortfoliosApi.createPortfolio(scope, portfolioRequest);
        String portfolioCode = portfolio.getId().getCode();
        System.out.println("Porfolio Code: " + portfolioCode);
        // end::create-portfolio[]

        // tag::upsert-instruments[]
        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        Map<String, InstrumentDefinition> instrumentsRequest = Collections.singletonMap(
                "BBG000C6K6G9", new InstrumentDefinition()
                        .name("VODAFONE GROUP PLC")
                        .identifiers(Collections.singletonMap("Figi", new InstrumentIdValue().value("BBG000C6K6G9"))));
        instrumentsApi.upsertInstruments(instrumentsRequest);
        // end::upsert-instruments[]

        // tag::get-instruments[]
        GetInstrumentsResponse instrumentsResponse = instrumentsApi.getInstruments(
                "Figi", new ArrayList<>(instrumentsRequest.keySet()), null, null, null
        );

        Set<Map.Entry<String, Instrument>> luidInstrumentEntries = instrumentsResponse.getValues().entrySet();
        Map<String, String> luidToName = luidInstrumentEntries.stream().collect(Collectors.toMap(e -> e.getValue().getLusidInstrumentId(), e -> e.getValue().getName()));
        Map<String, String> nameToLuid = luidInstrumentEntries.stream().collect(Collectors.toMap(e -> e.getValue().getName(), e -> e.getValue().getLusidInstrumentId()));
        // end::get-instruments[]

        // tag::upsert-transactions[]
        txPortfoliosApi.upsertTransactions(scope, portfolioCode, Collections.singletonList(
                new TransactionRequest()
                        .transactionId(String.format("Transaction-%s", UUID.randomUUID()))
                        .transactionDate("2021-03-27")
                        .settlementDate("2021-03-28")
                        .instrumentIdentifiers(Collections.singletonMap(
                                "Instrument/default/LusidInstrumentId",
                                nameToLuid.get("VODAFONE GROUP PLC")))
                        .type("StockIn")
                        .units(100.0)
                        .transactionPrice(new TransactionPrice().price(103.0))
                        .totalConsideration(new CurrencyAndAmount().amount(103 * 100.0).currency("GBP"))
                        .source("Broker")
        ));
        // end::upsert-transactions[]

        // tag::get-holdings[]
        List<PortfolioHolding> holdings = txPortfoliosApi
                .getHoldings(scope, portfolioCode, null, null, null,
                        Collections.singletonList("Instrument/default/Name"), false)
                .getValues();

        for (PortfolioHolding holding : holdings) {
            System.out.printf("%s %s %s",
                    luidToName.get(holding.getInstrumentUid()),
                    holding.getUnits(),
                    holding.getCost().getAmount());
        }
        // end::get-holdings[]
    }
}