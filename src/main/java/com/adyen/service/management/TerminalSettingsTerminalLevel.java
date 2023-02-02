/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.service.management;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.JSON;
import com.adyen.model.management.Logo;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.TerminalSettings;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalSettingsTerminalLevel extends ApiKeyAuthenticatedService {
    public TerminalSettingsTerminalLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Get the terminal logo
     *
     * @param terminalId The unique identifier of the payment terminal. (required)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo getTheTerminalLogo(String terminalId) throws ApiException, IOException {
        if (terminalId == null) {
            throw new ApiException("Missing the required parameter 'terminalId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("terminalId", terminalId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/terminals/{terminalId}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Get terminal settings
     *
     * @param terminalId The unique identifier of the payment terminal. (required)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings getTerminalSettings(String terminalId) throws ApiException, IOException {
        if (terminalId == null) {
            throw new ApiException("Missing the required parameter 'terminalId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("terminalId", terminalId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/terminals/{terminalId}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
    /**
     * Update the logo
     *
     * @param terminalId The unique identifier of the payment terminal. (required)
     * @param logo  (optional)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo updateTheLogo(String terminalId, Logo logo) throws ApiException, IOException {
        if (terminalId == null) {
            throw new ApiException("Missing the required parameter 'terminalId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("terminalId", terminalId);

        String requestBody = logo.toJson();
        ManagementResource resource = new ManagementResource(this, "/terminals/{terminalId}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Update terminal settings
     *
     * @param terminalId The unique identifier of the payment terminal. (required)
     * @param terminalSettings  (optional)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings updateTerminalSettings(String terminalId, TerminalSettings terminalSettings) throws ApiException, IOException {
        if (terminalId == null) {
            throw new ApiException("Missing the required parameter 'terminalId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("terminalId", terminalId);

        String requestBody = terminalSettings.toJson();
        ManagementResource resource = new ManagementResource(this, "/terminals/{terminalId}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
}
