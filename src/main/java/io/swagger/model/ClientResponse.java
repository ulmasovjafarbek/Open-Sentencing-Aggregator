/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Client;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ClientResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-09-24T19:29:11.667Z")
public class ClientResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("warning")
  private String warning = null;

  @JsonProperty("clients")
  private List<Client> clients = null;

  public ClientResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @JsonProperty("code")
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ClientResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   **/
  @JsonProperty("success")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ClientResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @JsonProperty("error")
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ClientResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * @return warning
   **/
  @JsonProperty("warning")
  @ApiModelProperty(value = "")
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  public ClientResponse clients(List<Client> clients) {
    this.clients = clients;
    return this;
  }

  public ClientResponse addClientsItem(Client clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<Client>();
    }
    this.clients.add(clientsItem);
    return this;
  }

  /**
   * Get clients
   * @return clients
   **/
  @JsonProperty("clients")
  @ApiModelProperty(value = "")
  public List<Client> getClients() {
    return clients;
  }

  public void setClients(List<Client> clients) {
    this.clients = clients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResponse clientResponse = (ClientResponse) o;
    return Objects.equals(this.code, clientResponse.code) &&
        Objects.equals(this.success, clientResponse.success) &&
        Objects.equals(this.error, clientResponse.error) &&
        Objects.equals(this.warning, clientResponse.warning) &&
        Objects.equals(this.clients, clientResponse.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, success, error, warning, clients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
