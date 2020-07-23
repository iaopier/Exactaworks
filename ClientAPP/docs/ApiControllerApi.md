# ApiControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**criarGastoUsingPOST**](ApiControllerApi.md#criarGastoUsingPOST) | **POST** /api/v1/gastos/criarGasto | criarGasto
[**listarGastoUsingGET**](ApiControllerApi.md#listarGastoUsingGET) | **GET** /api/v1/gastos/listarGasto/{id} | listarGasto
[**listarGastosUsingGET**](ApiControllerApi.md#listarGastosUsingGET) | **GET** /api/v1/gastos/listarGastos | listarGastos


<a name="criarGastoUsingPOST"></a>
# **criarGastoUsingPOST**
> Object criarGastoUsingPOST(gasto)

criarGasto

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiControllerApi;


ApiControllerApi apiInstance = new ApiControllerApi();
Gasto gasto = new Gasto(); // Gasto | gasto
try {
    Object result = apiInstance.criarGastoUsingPOST(gasto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiControllerApi#criarGastoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gasto** | [**Gasto**](Gasto.md)| gasto |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listarGastoUsingGET"></a>
# **listarGastoUsingGET**
> Object listarGastoUsingGET(id)

listarGasto

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiControllerApi;


ApiControllerApi apiInstance = new ApiControllerApi();
Long id = 789L; // Long | id
try {
    Object result = apiInstance.listarGastoUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiControllerApi#listarGastoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listarGastosUsingGET"></a>
# **listarGastosUsingGET**
> Object listarGastosUsingGET()

listarGastos

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiControllerApi;


ApiControllerApi apiInstance = new ApiControllerApi();
try {
    Object result = apiInstance.listarGastosUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiControllerApi#listarGastosUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

