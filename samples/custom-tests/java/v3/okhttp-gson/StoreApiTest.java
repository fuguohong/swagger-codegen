/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import java.net.HttpURLConnection;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
/**
 * API tests for StoreApi
 */
public class StoreApiTest {

    private final StoreApi api = new StoreApi();
    private static WireMockServer wireMockServer;

    public StoreApiTest() {
        api.getApiClient().setBasePath("http://localhost:" + wireMockServer.port());
    }

    @BeforeClass
    public static void setUp() {
        wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig().dynamicPort());
        wireMockServer.start();

        configureFor(wireMockServer.port());

        stubFor(delete(urlPathMatching("/store/order/10"))
                .willReturn(aResponse()
                        .withStatus(HttpURLConnection.HTTP_OK)));

        stubFor(get(urlPathMatching("/store/inventory"))
                .willReturn(aResponse()
                        .withStatus(HttpURLConnection.HTTP_OK)
                        .withBody("{\"id\":10}")));

        stubFor(get(urlPathMatching("/store/order/10"))
                .willReturn(aResponse()
                        .withStatus(HttpURLConnection.HTTP_OK)
                        .withBody("{\"id\":10, \"petId\":10, \"quantity\":1, \"status\":\"approved\", \"complete\": true}")));

        stubFor(post(urlPathMatching("/store/order"))
                .willReturn(aResponse()
                        .withStatus(HttpURLConnection.HTTP_OK)
                        .withBody("{\"id\":10, \"petId\":10, \"quantity\":1, \"status\":\"approved\", \"complete\": true}")));

    }

    @AfterClass
    public static void tearDown() {
        wireMockServer.stop();
    }


    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws Exception {
        Long orderId = 10L;
        api.deleteOrder(orderId);

        verify(exactly(1), deleteRequestedFor(urlEqualTo("/store/order/10")));
    }

    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws Exception {
        Map<String, Integer> response = api.getInventory();

        Assert.assertNotNull(response);
        Assert.assertFalse(response.isEmpty());

        verify(exactly(1), getRequestedFor(urlEqualTo("/store/inventory")));
    }

    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws Exception {
        Long orderId = 10L;
        Order response = api.getOrderById(orderId);
        Assert.assertNotNull(response);
        Assert.assertEquals(10L, response.getId().longValue());
        Assert.assertEquals(10L, response.getPetId().longValue());
        Assert.assertEquals(1, response.getQuantity().intValue());

        verify(exactly(1), getRequestedFor(urlEqualTo("/store/order/10")));
    }

    /**
     * Place an order for a pet
     *
     *
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws Exception {
        Order body = new Order().id(10L)
                .petId(10L)
                .complete(false)
                .status(Order.StatusEnum.PLACED)
                .quantity(1);
        Order response = api.placeOrder(body);

        Assert.assertEquals(10L, response.getId().longValue());
        Assert.assertEquals(10L, response.getPetId().longValue());
        Assert.assertEquals(1, response.getQuantity().intValue());
        Assert.assertEquals(true, response.isComplete());
        Assert.assertEquals(Order.StatusEnum.APPROVED, response.getStatus());

        verify(exactly(1), postRequestedFor(urlEqualTo("/store/order")));
    }
}
