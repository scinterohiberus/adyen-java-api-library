/*
 * Adyen Balance Control API
 * The Balance Control API lets you transfer funds between merchant accounts that belong to the same legal entity and are under the same company account.  ## Authentication To connect to the Balance Control API, you must authenticate your requests with an [API key or basic auth username and password](https://docs.adyen.com/development-resources/api-authentication). To learn how you can generate these, see [API credentials](https://docs.adyen.com/development-resources/api-credentials).Here is an example of authenticating a request with an API key:  ``` curl -H \"X-API-Key: Your_API_key\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate API credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Balance Control API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example:  ``` https://pal-test.adyen.com/pal/servlet/BalanceControl/v1/balanceTransfer ``` 
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balancecontrol.BalanceTransferRequest;
import com.adyen.model.balancecontrol.BalanceTransferResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BalanceControlApi extends Service {

    public static final String API_VERSION = "1";

    protected String baseURL;

    /**
    * General constructor in {@link com.adyen.service package}.
    * @param client {@link Client }  (required)
    */
    public BalanceControlApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://pal-test.adyen.com/pal/servlet/BalanceControl/v1");
    }

    /**
    * General constructor in {@link com.adyen.service package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client }  (required)
    * @param baseURL {@link String }  (required)
    */
    public BalanceControlApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Start a balance transfer
    *
    * @param balanceTransferRequest {@link BalanceTransferRequest }  (required)
    * @return {@link BalanceTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public BalanceTransferResponse balanceTransfer(BalanceTransferRequest balanceTransferRequest) throws ApiException, IOException {
        return balanceTransfer(balanceTransferRequest, null);
    }

    /**
    * Start a balance transfer
    *
    * @param balanceTransferRequest {@link BalanceTransferRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalanceTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public BalanceTransferResponse balanceTransfer(BalanceTransferRequest balanceTransferRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = balanceTransferRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/balanceTransfer", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return BalanceTransferResponse.fromJson(jsonResult);
    }
}
