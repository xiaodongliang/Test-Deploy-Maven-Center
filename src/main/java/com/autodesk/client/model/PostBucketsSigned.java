/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PostBucketsSigned
 */

public class PostBucketsSigned   {
  @JsonProperty("minutesExpiration")
  private Integer minutesExpiration = 60;

  public PostBucketsSigned minutesExpiration(Integer minutesExpiration) {
    this.minutesExpiration = minutesExpiration;
    return this;
  }

   /**
   * Expiration time in minutes Default value: 60 
   * @return minutesExpiration
  **/
  @ApiModelProperty(example = "null", required = true, value = "Expiration time in minutes Default value: 60 ")
  public Integer getMinutesExpiration() {
    return minutesExpiration;
  }

  public void setMinutesExpiration(Integer minutesExpiration) {
    this.minutesExpiration = minutesExpiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBucketsSigned postBucketsSigned = (PostBucketsSigned) o;
    return Objects.equals(this.minutesExpiration, postBucketsSigned.minutesExpiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minutesExpiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBucketsSigned {\n");
    
    sb.append("    minutesExpiration: ").append(toIndentedString(minutesExpiration)).append("\n");
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

