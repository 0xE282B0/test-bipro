package eu.fincon.biproadapter.provider.norm426.customertemplate.application;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import java.io.IOException;

import org.apache.cxf.helpers.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import eu.fincon.biproadapter.provider.common.genericstandardadapter.GenericStandardAdapterProperties;
import eu.fincon.biproadapter.provider.common.genericstandardadapter.profile.Environment;
import eu.fincon.biproadapter.provider.norm426.product.standardadapter.Norm426Application;

@SpringBootTest(
        webEnvironment = RANDOM_PORT,
        classes = {Norm426Application.class, GenericStandardAdapterProperties.class})
@ActiveProfiles(value={Environment.TEST})
@DisplayName("WsdlSchemaLocationInterceptor tests")
public class WsdlSchemaLocationInterceptorTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(WsdlSchemaLocationInterceptorTest.class);

    @Autowired
    GenericStandardAdapterProperties genericStandardAdapterProperties;

    @LocalServerPort
    private int port;

    @Test
    @DisplayName("Test - loads context")
    public void testLoadsContext() {

    }

    @Test
    @DisplayName("Test - Actuator available")
    public void testActuatorAvailable() throws IOException{
        LOGGER.info("{}",port);
        HttpResponse httpResponse = Request.Get("http://localhost:"+port+"/actuator/health").execute().returnResponse();

        Assertions.assertEquals(200,httpResponse.getStatusLine().getStatusCode());
    }

    //@Test
    @DisplayName("Test - Schema Location")
    public void testWsdlChangeHttp() throws IOException {
        String expectedSchemaLocation = "schemaLocation=\"" + genericStandardAdapterProperties.getSchemaLocationUrl();
        LOGGER.info("Expected SchemaLocation: {}", expectedSchemaLocation);
        String wsdlUrl = "http://localhost:"+port+"/soap-api/GewerbeService_"+genericStandardAdapterProperties.getBiproVersion()+"?wsdl";
        LOGGER.info("Calling WSDL-Url: {}", wsdlUrl);

        Response wsdlResponse = Request.Get(wsdlUrl).execute();
        HttpResponse httpResponse = wsdlResponse.returnResponse();
        String wsdl = IOUtils.toString(httpResponse.getEntity().getContent());

        Assertions.assertEquals(200,httpResponse.getStatusLine().getStatusCode());
        Assertions.assertTrue(wsdl.contains(genericStandardAdapterProperties.getExternalStsUrl()));
        Assertions.assertTrue(wsdl.contains(expectedSchemaLocation));
    }
}
