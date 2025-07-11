/*
 * LUSID API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.lusid.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * See https://wiki.finbourne.com/information/domain-model-properties     Each domain refers to a logical set of properties which reside within it.
 */
@JsonAdapter(PropertyDomain.Adapter.class)
public enum PropertyDomain {
  
  NOTDEFINED("NotDefined"),
  
  TRANSACTION("Transaction"),
  
  PORTFOLIO("Portfolio"),
  
  HOLDING("Holding"),
  
  REFERENCEHOLDING("ReferenceHolding"),
  
  TRANSACTIONCONFIGURATION("TransactionConfiguration"),
  
  INSTRUMENT("Instrument"),
  
  CUTLABELDEFINITION("CutLabelDefinition"),
  
  ANALYTIC("Analytic"),
  
  PORTFOLIOGROUP("PortfolioGroup"),
  
  PERSON("Person"),
  
  ACCESSMETADATA("AccessMetadata"),
  
  ORDER("Order"),
  
  UNITRESULT("UnitResult"),
  
  MARKETDATA("MarketData"),
  
  CONFIGURATIONRECIPE("ConfigurationRecipe"),
  
  ALLOCATION("Allocation"),
  
  CALENDAR("Calendar"),
  
  LEGALENTITY("LegalEntity"),
  
  INVESTORRECORD("InvestorRecord"),
  
  INVESTMENTACCOUNT("InvestmentAccount"),
  
  PLACEMENT("Placement"),
  
  EXECUTION("Execution"),
  
  BLOCK("Block"),
  
  PARTICIPATION("Participation"),
  
  PACKAGE("Package"),
  
  ORDERINSTRUCTION("OrderInstruction"),
  
  NEXTBESTACTION("NextBestAction"),
  
  CUSTOMENTITY("CustomEntity"),
  
  INSTRUMENTEVENT("InstrumentEvent"),
  
  ACCOUNT("Account"),
  
  CHARTOFACCOUNTS("ChartOfAccounts"),
  
  CUSTODIANACCOUNT("CustodianAccount"),
  
  CHECKDEFINITION("CheckDefinition"),
  
  ABOR("Abor"),
  
  ABORCONFIGURATION("AborConfiguration"),
  
  FUND("Fund"),
  
  FUNDCONFIGURATION("FundConfiguration"),
  
  FEE("Fee"),
  
  RECONCILIATION("Reconciliation"),
  
  PROPERTYDEFINITION("PropertyDefinition"),
  
  COMPLIANCE("Compliance"),
  
  DIARYENTRY("DiaryEntry"),
  
  LEG("Leg"),
  
  DERIVEDVALUATION("DerivedValuation"),
  
  TIMELINE("Timeline"),
  
  CLOSEDPERIOD("ClosedPeriod"),
  
  ADDRESSKEYDEFINITION("AddressKeyDefinition"),
  
  AMORTISATIONRULESET("AmortisationRuleSet"),
  
  ANALYTICSSETINVENTORY("AnalyticsSetInventory"),
  
  ATOMUNITRESULT("AtomUnitResult"),
  
  CLEARDOWNMODULE("CleardownModule"),
  
  COMPLEXMARKETDATA("ComplexMarketData"),
  
  COMPLIANCERUNSUMMARY("ComplianceRunSummary"),
  
  COMPLIANCERULE("ComplianceRule"),
  
  COMPLIANCERUNINFO("ComplianceRunInfo"),
  
  CORPORATEACTIONSOURCE("CorporateActionSource"),
  
  COUNTERPARTYAGREEMENT("CounterpartyAgreement"),
  
  CUSTOMENTITYDEFINITION("CustomEntityDefinition"),
  
  DATATYPE("DataType"),
  
  DIALECT("Dialect"),
  
  EVENTHANDLER("EventHandler"),
  
  GENERALLEDGERPROFILE("GeneralLedgerProfile"),
  
  POSTINGMODULE("PostingModule"),
  
  QUOTE("Quote"),
  
  RECIPECOMPOSER("RecipeComposer"),
  
  RECONCILIATIONRUNBREAK("ReconciliationRunBreak"),
  
  REFERENCELIST("ReferenceList"),
  
  RELATIONDEFINITION("RelationDefinition"),
  
  RETURNBLOCKINDEX("ReturnBlockIndex"),
  
  SRSDOCUMENT("SRSDocument"),
  
  SRSINDEX("SRSIndex"),
  
  TRANSACTIONTEMPLATE("TransactionTemplate"),
  
  TRANSACTIONTEMPLATESCOPE("TransactionTemplateScope"),
  
  TRANSACTIONTYPE("TransactionType"),
  
  TRANSACTIONTYPECONFIG("TransactionTypeConfig"),
  
  TRANSLATIONSCRIPT("TranslationScript"),
  
  TASKDEFINITION("TaskDefinition"),
  
  TASKINSTANCE("TaskInstance"),
  
  WORKER("Worker"),
  
  STAGINGRULESET("StagingRuleSet"),
  
  IDENTIFIERDEFINITION("IdentifierDefinition");

  private String value;

  PropertyDomain(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PropertyDomain fromValue(String value) {
    for (PropertyDomain b : PropertyDomain.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PropertyDomain> {
    @Override
    public void write(final JsonWriter jsonWriter, final PropertyDomain enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PropertyDomain read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PropertyDomain.fromValue(value);
    }
  }
}

