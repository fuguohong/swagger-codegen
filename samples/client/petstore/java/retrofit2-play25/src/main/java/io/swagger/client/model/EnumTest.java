/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.OuterEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EnumTest
 */


public class EnumTest {
  /**
   * Gets or Sets enumString
   */
  public enum EnumStringEnum {
    UPPER("UPPER"),
    LOWER("lower"),
    EMPTY("");

    private String value;

    EnumStringEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EnumStringEnum fromValue(String input) {
      for (EnumStringEnum b : EnumStringEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enum_string")
  private EnumStringEnum enumString = null;

  /**
   * Gets or Sets enumInteger
   */
  public enum EnumIntegerEnum {
    NUMBER_1(1),
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumIntegerEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EnumIntegerEnum fromValue(Integer input) {
      for (EnumIntegerEnum b : EnumIntegerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enum_integer")
  private EnumIntegerEnum enumInteger = null;

  /**
   * Gets or Sets enumNumber
   */
  public enum EnumNumberEnum {
    NUMBER_1_DOT_1(1.1),
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumNumberEnum(Double value) {
      this.value = value;
    }
    @JsonValue
    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EnumNumberEnum fromValue(Double input) {
      for (EnumNumberEnum b : EnumNumberEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enum_number")
  private EnumNumberEnum enumNumber = null;

  @JsonProperty("outerEnum")
  private OuterEnum outerEnum = null;

  public EnumTest enumString(EnumStringEnum enumString) {
    this.enumString = enumString;
    return this;
  }

   /**
   * Get enumString
   * @return enumString
  **/
  @Schema(description = "")
  public EnumStringEnum getEnumString() {
    return enumString;
  }

  public void setEnumString(EnumStringEnum enumString) {
    this.enumString = enumString;
  }

  public EnumTest enumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

   /**
   * Get enumInteger
   * @return enumInteger
  **/
  @Schema(description = "")
  public EnumIntegerEnum getEnumInteger() {
    return enumInteger;
  }

  public void setEnumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
  }

  public EnumTest enumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

   /**
   * Get enumNumber
   * @return enumNumber
  **/
  @Schema(description = "")
  public EnumNumberEnum getEnumNumber() {
    return enumNumber;
  }

  public void setEnumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
  }

  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

   /**
   * Get outerEnum
   * @return outerEnum
  **/
  @Valid
  @Schema(description = "")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return Objects.equals(this.enumString, enumTest.enumString) &&
        Objects.equals(this.enumInteger, enumTest.enumInteger) &&
        Objects.equals(this.enumNumber, enumTest.enumNumber) &&
        Objects.equals(this.outerEnum, enumTest.outerEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumInteger, enumNumber, outerEnum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
