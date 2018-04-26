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

import com.autodesk.client.model.JsonApiRelationshipsLinksInternal;
import com.autodesk.client.model.JsonApiRelationshipsLinksInternalResource;
import com.autodesk.client.model.JsonApiRelationshipsLinksRefs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ItemRelationships
 */

public class ItemRelationships   {
  @JsonProperty("parent")
  private JsonApiRelationshipsLinksInternalResource parent = null;

  @JsonProperty("tip")
  private JsonApiRelationshipsLinksInternalResource tip = null;

  @JsonProperty("versions")
  private JsonApiRelationshipsLinksInternal versions = null;

  @JsonProperty("refs")
  private JsonApiRelationshipsLinksRefs refs = null;

  public ItemRelationships parent(JsonApiRelationshipsLinksInternalResource parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiRelationshipsLinksInternalResource getParent() {
    return parent;
  }

  public void setParent(JsonApiRelationshipsLinksInternalResource parent) {
    this.parent = parent;
  }

  public ItemRelationships tip(JsonApiRelationshipsLinksInternalResource tip) {
    this.tip = tip;
    return this;
  }

   /**
   * Get tip
   * @return tip
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiRelationshipsLinksInternalResource getTip() {
    return tip;
  }

  public void setTip(JsonApiRelationshipsLinksInternalResource tip) {
    this.tip = tip;
  }

  public ItemRelationships versions(JsonApiRelationshipsLinksInternal versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiRelationshipsLinksInternal getVersions() {
    return versions;
  }

  public void setVersions(JsonApiRelationshipsLinksInternal versions) {
    this.versions = versions;
  }

  public ItemRelationships refs(JsonApiRelationshipsLinksRefs refs) {
    this.refs = refs;
    return this;
  }

   /**
   * Get refs
   * @return refs
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiRelationshipsLinksRefs getRefs() {
    return refs;
  }

  public void setRefs(JsonApiRelationshipsLinksRefs refs) {
    this.refs = refs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemRelationships itemRelationships = (ItemRelationships) o;
    return Objects.equals(this.parent, itemRelationships.parent) &&
        Objects.equals(this.tip, itemRelationships.tip) &&
        Objects.equals(this.versions, itemRelationships.versions) &&
        Objects.equals(this.refs, itemRelationships.refs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, tip, versions, refs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRelationships {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
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

