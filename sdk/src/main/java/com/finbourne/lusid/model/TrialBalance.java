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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.MultiCurrencyAmounts;
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.lusid.JSON;

/**
 * A TrialBalance entity.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialBalance {
  public static final String SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT_CODE = "generalLedgerAccountCode";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT_CODE)
  private String generalLedgerAccountCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LEVELS = "levels";
  @SerializedName(SERIALIZED_NAME_LEVELS)
  private List<String> levels = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_LOCAL_CURRENCY = "localCurrency";
  @SerializedName(SERIALIZED_NAME_LOCAL_CURRENCY)
  private String localCurrency;

  public static final String SERIALIZED_NAME_OPENING = "opening";
  @SerializedName(SERIALIZED_NAME_OPENING)
  private MultiCurrencyAmounts opening;

  public static final String SERIALIZED_NAME_CLOSING = "closing";
  @SerializedName(SERIALIZED_NAME_CLOSING)
  private MultiCurrencyAmounts closing;

  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private MultiCurrencyAmounts debit;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private MultiCurrencyAmounts credit;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public TrialBalance() {
  }

  public TrialBalance generalLedgerAccountCode(String generalLedgerAccountCode) {
    
    this.generalLedgerAccountCode = generalLedgerAccountCode;
    return this;
  }

   /**
   * The Account code that the trial balance results have been grouped against.
   * @return generalLedgerAccountCode
  **/
  @jakarta.annotation.Nonnull
  public String getGeneralLedgerAccountCode() {
    return generalLedgerAccountCode;
  }


  public void setGeneralLedgerAccountCode(String generalLedgerAccountCode) {
    this.generalLedgerAccountCode = generalLedgerAccountCode;
  }


  public TrialBalance description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the record.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TrialBalance levels(List<String> levels) {
    
    this.levels = levels;
    return this;
  }

  public TrialBalance addLevelsItem(String levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * The levels that have been derived from the specified General Ledger Profile.
   * @return levels
  **/
  @jakarta.annotation.Nonnull
  public List<String> getLevels() {
    return levels;
  }


  public void setLevels(List<String> levels) {
    this.levels = levels;
  }


  public TrialBalance accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The account type attributed to the record.
   * @return accountType
  **/
  @jakarta.annotation.Nonnull
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public TrialBalance localCurrency(String localCurrency) {
    
    this.localCurrency = localCurrency;
    return this;
  }

   /**
   * The local currency for the amounts specified. Defaults to base currency if multiple different currencies present in the grouped line.
   * @return localCurrency
  **/
  @jakarta.annotation.Nonnull
  public String getLocalCurrency() {
    return localCurrency;
  }


  public void setLocalCurrency(String localCurrency) {
    this.localCurrency = localCurrency;
  }


  public TrialBalance opening(MultiCurrencyAmounts opening) {
    
    this.opening = opening;
    return this;
  }

   /**
   * Get opening
   * @return opening
  **/
  @jakarta.annotation.Nonnull
  public MultiCurrencyAmounts getOpening() {
    return opening;
  }


  public void setOpening(MultiCurrencyAmounts opening) {
    this.opening = opening;
  }


  public TrialBalance closing(MultiCurrencyAmounts closing) {
    
    this.closing = closing;
    return this;
  }

   /**
   * Get closing
   * @return closing
  **/
  @jakarta.annotation.Nonnull
  public MultiCurrencyAmounts getClosing() {
    return closing;
  }


  public void setClosing(MultiCurrencyAmounts closing) {
    this.closing = closing;
  }


  public TrialBalance debit(MultiCurrencyAmounts debit) {
    
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @jakarta.annotation.Nonnull
  public MultiCurrencyAmounts getDebit() {
    return debit;
  }


  public void setDebit(MultiCurrencyAmounts debit) {
    this.debit = debit;
  }


  public TrialBalance credit(MultiCurrencyAmounts credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @jakarta.annotation.Nonnull
  public MultiCurrencyAmounts getCredit() {
    return credit;
  }


  public void setCredit(MultiCurrencyAmounts credit) {
    this.credit = credit;
  }


  public TrialBalance properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public TrialBalance putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties found on the mapped &#39;Account&#39;, as specified in request.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public TrialBalance links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public TrialBalance addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBalance trialBalance = (TrialBalance) o;
    return Objects.equals(this.generalLedgerAccountCode, trialBalance.generalLedgerAccountCode) &&
        Objects.equals(this.description, trialBalance.description) &&
        Objects.equals(this.levels, trialBalance.levels) &&
        Objects.equals(this.accountType, trialBalance.accountType) &&
        Objects.equals(this.localCurrency, trialBalance.localCurrency) &&
        Objects.equals(this.opening, trialBalance.opening) &&
        Objects.equals(this.closing, trialBalance.closing) &&
        Objects.equals(this.debit, trialBalance.debit) &&
        Objects.equals(this.credit, trialBalance.credit) &&
        Objects.equals(this.properties, trialBalance.properties) &&
        Objects.equals(this.links, trialBalance.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalLedgerAccountCode, description, levels, accountType, localCurrency, opening, closing, debit, credit, properties, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBalance {\n");
    sb.append("    generalLedgerAccountCode: ").append(toIndentedString(generalLedgerAccountCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    localCurrency: ").append(toIndentedString(localCurrency)).append("\n");
    sb.append("    opening: ").append(toIndentedString(opening)).append("\n");
    sb.append("    closing: ").append(toIndentedString(closing)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("generalLedgerAccountCode");
    openapiFields.add("description");
    openapiFields.add("levels");
    openapiFields.add("accountType");
    openapiFields.add("localCurrency");
    openapiFields.add("opening");
    openapiFields.add("closing");
    openapiFields.add("debit");
    openapiFields.add("credit");
    openapiFields.add("properties");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("generalLedgerAccountCode");
    openapiRequiredFields.add("levels");
    openapiRequiredFields.add("accountType");
    openapiRequiredFields.add("localCurrency");
    openapiRequiredFields.add("opening");
    openapiRequiredFields.add("closing");
    openapiRequiredFields.add("debit");
    openapiRequiredFields.add("credit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TrialBalance
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrialBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrialBalance is not found in the empty JSON string", TrialBalance.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrialBalance.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("generalLedgerAccountCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generalLedgerAccountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generalLedgerAccountCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("levels") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("levels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `levels` to be an array in the JSON string but got `%s`", jsonObj.get("levels").toString()));
      }
      if (!jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if (!jsonObj.get("localCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localCurrency").toString()));
      }
      // validate the required field `opening`
      MultiCurrencyAmounts.validateJsonElement(jsonObj.get("opening"));
      // validate the required field `closing`
      MultiCurrencyAmounts.validateJsonElement(jsonObj.get("closing"));
      // validate the required field `debit`
      MultiCurrencyAmounts.validateJsonElement(jsonObj.get("debit"));
      // validate the required field `credit`
      MultiCurrencyAmounts.validateJsonElement(jsonObj.get("credit"));
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrialBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrialBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrialBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrialBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<TrialBalance>() {
           @Override
           public void write(JsonWriter out, TrialBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrialBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrialBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrialBalance
  * @throws IOException if the JSON string is invalid with respect to TrialBalance
  */
  public static TrialBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrialBalance.class);
  }

 /**
  * Convert an instance of TrialBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
