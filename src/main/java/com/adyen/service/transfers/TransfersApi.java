/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.transfers;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.transfers.RestServiceError;
import com.adyen.model.transfers.ReturnTransferRequest;
import com.adyen.model.transfers.ReturnTransferResponse;
import com.adyen.model.transfers.ServiceError;
import com.adyen.model.transfers.Transfer;
import com.adyen.model.transfers.TransferInfo;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransfersApi extends Service {

    public static final String API_VERSION = "4";

    protected String baseURL;

    /**
    * Transfers constructor in {@link com.adyen.service.transfers package}.
    * @param client {@link Client } (required)
    */
    public TransfersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/btl/v4");
    }

    /**
    * Transfers constructor in {@link com.adyen.service.transfers package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TransfersApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Transfer funds
    *
    * @param transferInfo {@link TransferInfo }  (required)
    * @return {@link Transfer }
    * @throws ApiException if fails to make API call
    */
    public Transfer transferFunds(TransferInfo transferInfo) throws ApiException, IOException {
        return transferFunds(transferInfo, null);
    }

    /**
    * Transfer funds
    *
    * @param transferInfo {@link TransferInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Transfer }
    * @throws ApiException if fails to make API call
    */
    public Transfer transferFunds(TransferInfo transferInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = transferInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return Transfer.fromJson(jsonResult);
    }

    /**
    * Return a transfer
    *
    * @param id {@link String } The unique identifier of the transfer to be returned. (required)
    * @param returnTransferRequest {@link ReturnTransferRequest }  (required)
    * @return {@link ReturnTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public ReturnTransferResponse returnTransfer(String id, ReturnTransferRequest returnTransferRequest) throws ApiException, IOException {
        return returnTransfer(id, returnTransferRequest, null);
    }

    /**
    * Return a transfer
    *
    * @param id {@link String } The unique identifier of the transfer to be returned. (required)
    * @param returnTransferRequest {@link ReturnTransferRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ReturnTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public ReturnTransferResponse returnTransfer(String id, ReturnTransferRequest returnTransferRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = returnTransferRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers/{id}/returns", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return ReturnTransferResponse.fromJson(jsonResult);
    }
}
