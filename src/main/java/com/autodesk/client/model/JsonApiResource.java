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

import com.autodesk.client.model.JsonApiAttributes;
import com.autodesk.client.model.JsonApiLinks;
import com.autodesk.client.model.JsonApiMeta;
import com.autodesk.client.model.JsonApiRelationships;
import com.autodesk.client.model.JsonApiTypeId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * JsonApiResource
 */

public class JsonApiResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("attributes")
  private JsonApiAttributes attributes = null;

  @JsonProperty("meta")
  private JsonApiMeta meta = null;

  @JsonProperty("relationships")
  private JsonApiRelationships relationships = null;

  @JsonProperty("links")
  private JsonApiLinks links = null;

  public JsonApiResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * resource id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JsonApiResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * resource type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JsonApiResource attributes(JsonApiAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(JsonApiAttributes attributes) {
    this.attributes = attributes;
  }

  public JsonApiResource meta(JsonApiMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiMeta getMeta() {
    return meta;
  }

  public void setMeta(JsonApiMeta meta) {
    this.meta = meta;
  }

  public JsonApiResource relationships(JsonApiRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(JsonApiRelationships relationships) {
    this.relationships = relationships;
  }

  public JsonApiResource links(JsonApiLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLinks getLinks() {
    return links;
  }

  public void setLinks(JsonApiLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiResource jsonApiResource = (JsonApiResource) o;
    return Objects.equals(this.id, jsonApiResource.id) &&
        Objects.equals(this.type, jsonApiResource.type) &&
        Objects.equals(this.attributes, jsonApiResource.attributes) &&
        Objects.equals(this.meta, jsonApiResource.meta) &&
        Objects.equals(this.relationships, jsonApiResource.relationships) &&
        Objects.equals(this.links, jsonApiResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes, meta, relationships, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

