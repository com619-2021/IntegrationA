/*
 * Smart Port API
 * Solent university devops https://github.com/com619-2021
 *
 * OpenAPI spec version: v1
 * Contact: craig.gallen@solent.ac.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package solent.ac.uk.devops.traffic.client.swagger.invoker.auth;

import solent.ac.uk.devops.traffic.client.swagger.invoker.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T14:34:17.894448800Z[Europe/London]")public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
