package com.adyen;

import com.adyen.enums.Environment;
import com.adyen.enums.Region;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.security.KeyStore;

public class ClientTest {

    @Mock
    private KeyStore trustStore;

    @Mock
    private KeyStore clientKeyStore;

    @Mock
    private String clientKeyStorePassword;

    @Mock
    private String apiKey;

    @Test
    public void testConfigTestClient() {
        Config config = new Config();
        config.setEnvironment(Environment.TEST);
        config.setApiKey(apiKey);
        Client client = new Client(config);

        Assert.assertEquals(Environment.TEST, client.getConfig().getEnvironment());
    }

    @Test
    public void testConfigLiveClient() {
        Config config = new Config();
        config.setEnvironment(Environment.LIVE);
        config.setLiveEndpointUrlPrefix("prefix");
        config.setApiKey(apiKey);
        Client client = new Client(config);
        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
    }

    @Test
    public void testClientCertificateAuth() {
        Client client = new Client(trustStore, clientKeyStore, clientKeyStorePassword, apiKey, null);
        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
    }

    @Test
    public void testClientCertificateAuth_AU() {
        Client client = new Client(trustStore, clientKeyStore, clientKeyStorePassword, apiKey, Region.AU);

        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
        assertCommonEndpoints(client.getConfig());
    }

    @Test
    public void testClientCertificateAuth_US() {
        Client client = new Client(trustStore, clientKeyStore, clientKeyStorePassword, apiKey, Region.US);

        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
        assertCommonEndpoints(client.getConfig());
    }

    private void assertCommonEndpoints(Config config) {
        Assert.assertEquals(Client.TERMINAL_API_ENDPOINT_LIVE, config.getTerminalApiCloudEndpoint());
    }
}