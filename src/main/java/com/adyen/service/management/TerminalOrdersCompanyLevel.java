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
import com.adyen.model.management.BillingEntitiesResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.ShippingLocation;
import com.adyen.model.management.ShippingLocationsResponse;
import com.adyen.model.management.TerminalModelsResponse;
import com.adyen.model.management.TerminalOrder;
import com.adyen.model.management.TerminalOrderRequest;
import com.adyen.model.management.TerminalOrdersResponse;
import com.adyen.model.management.TerminalProductsResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalOrdersCompanyLevel extends ApiKeyAuthenticatedService {
    public TerminalOrdersCompanyLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Get a list of billing entities
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param queryParams  (optional)
     *    name: The name of the billing entity. (optional)<br />
     * @return BillingEntitiesResponse
     * @throws ApiException if fails to make API call
     */
    public BillingEntitiesResponse listBillingEntities(String companyId, Map<String, String> queryParams) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/billingEntities");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return BillingEntitiesResponse.fromJson(jsonResult);
    }
    
    /**
     * Get a list of shipping locations
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param queryParams  (optional)
     *    name: The name of the shipping location. (optional)<br />
     *    offset: The number of locations to skip. (optional)<br />
     *    limit: The number of locations to return. (optional)<br />
     * @return ShippingLocationsResponse
     * @throws ApiException if fails to make API call
     */
    public ShippingLocationsResponse listShippingLocations(String companyId, Map<String, String> queryParams) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/shippingLocations");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ShippingLocationsResponse.fromJson(jsonResult);
    }
    
    /**
     * Get a list of terminal models
     *
     * @param companyId The unique identifier of the company account. (required)
     * @return TerminalModelsResponse
     * @throws ApiException if fails to make API call
     */
    public TerminalModelsResponse listTerminalModels(String companyId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalModels");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalModelsResponse.fromJson(jsonResult);
    }
    
    /**
     * Get a list of orders
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param queryParams  (optional)
     *    customerOrderReference: Your purchase order number. (optional)<br />
     *    status: The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered. (optional)<br />
     *    offset: The number of orders to skip. (optional)<br />
     *    limit: The number of orders to return. (optional)<br />
     * @return TerminalOrdersResponse
     * @throws ApiException if fails to make API call
     */
    public TerminalOrdersResponse listOrders(String companyId, Map<String, String> queryParams) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalOrders");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalOrdersResponse.fromJson(jsonResult);
    }
    
    /**
     * Get an order
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param orderId The unique identifier of the order. (required)
     * @return TerminalOrder
     * @throws ApiException if fails to make API call
     */
    public TerminalOrder getOrder(String companyId, String orderId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("orderId", orderId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalOrders/{orderId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
    
    /**
     * Get a list of terminal products
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param queryParams  (optional)
     *    country: The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** (optional)<br />
     *    terminalModelId: The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminalModels) response. For example, **Verifone.M400** (optional)<br />
     *    offset: The number of products to skip. (optional)<br />
     *    limit: The number of products to return. (optional)<br />
     * @return TerminalProductsResponse
     * @throws ApiException if fails to make API call
     */
    public TerminalProductsResponse listTerminalProducts(String companyId, Map<String, String> queryParams) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalProducts");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalProductsResponse.fromJson(jsonResult);
    }
    
    /**
     * Update an order
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param orderId The unique identifier of the order. (required)
     * @param terminalOrderRequest  (optional)
     * @return TerminalOrder
     * @throws ApiException if fails to make API call
     */
    public TerminalOrder updateOrder(String companyId, String orderId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("orderId", orderId);

        String requestBody = terminalOrderRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalOrders/{orderId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
    
    /**
     * Create a shipping location
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param shippingLocation  (optional)
     * @return ShippingLocation
     * @throws ApiException if fails to make API call
     */
    public ShippingLocation createShippingLocation(String companyId, ShippingLocation shippingLocation) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = shippingLocation.toJson();
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/shippingLocations");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return ShippingLocation.fromJson(jsonResult);
    }
    
    /**
     * Create an order
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param terminalOrderRequest  (optional)
     * @return TerminalOrder
     * @throws ApiException if fails to make API call
     */
    public TerminalOrder createOrder(String companyId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);

        String requestBody = terminalOrderRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalOrders");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
    
    /**
     * Cancel an order
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param orderId The unique identifier of the order. (required)
     * @return TerminalOrder
     * @throws ApiException if fails to make API call
     */
    public TerminalOrder cancelOrder(String companyId, String orderId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("orderId", orderId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/terminalOrders/{orderId}/cancel");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
    
}
