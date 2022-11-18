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
import com.adyen.model.management.GenerateClientKeyResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClientKeyMerchantLevel extends ApiKeyAuthenticatedService {
    public ClientKeyMerchantLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Generate new client key
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @return GenerateClientKeyResponse
     * @throws ApiException if fails to make API call
     */
    public GenerateClientKeyResponse generateNewClientKey(String merchantId, String apiCredentialId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateClientKey");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateClientKeyResponse.fromJson(jsonResult);
    }
    
}
