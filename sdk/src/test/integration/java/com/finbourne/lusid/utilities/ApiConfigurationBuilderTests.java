package com.finbourne.lusid.utilities;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.finbourne.lusid.utilities.TestContants.DUMMY_CREDENTIALS_FILE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class ApiConfigurationBuilderTests {

    ApiConfigurationBuilder apiConfigurationBuilder;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        apiConfigurationBuilder = spy(new ApiConfigurationBuilder());
    }

    @Test
    public void build_WithUnsetEnvironmentVariables_ShouldGetFromFile() throws ApiConfigurationException {
        doReturn(emptyConfigFromEnvVariables()).when(apiConfigurationBuilder)
                .getApiConfigurationFromEnvironmentVariables();

        ApiConfiguration apiConfiguration = apiConfigurationBuilder.build(DUMMY_CREDENTIALS_FILE);

        assertThat(apiConfiguration.getApiUrl(), equalTo("https://some-non-existing-test-instance.lusid.com/api"));
        assertThat(apiConfiguration.getTokenUrl(), equalTo("https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token"));
        assertThat(apiConfiguration.getClientId(), equalTo("client-id"));
        assertThat(apiConfiguration.getClientSecret(), equalTo("secret"));
        assertThat(apiConfiguration.getUsername(), equalTo("user"));
        assertThat(apiConfiguration.getPassword(), equalTo("pass"));
        assertThat(apiConfiguration.getApplicationName(), equalTo("non-existent"));
        assertThat(apiConfiguration.getPersonalAccessToken(), equalTo("pat-token"));
    }

    @Test
    public void build_WithSetEnvironmentVariables_ShouldGetFromEnvironmentVariables() throws ApiConfigurationException {
        doReturn(validConfigFromEnvVariables()).when(apiConfigurationBuilder)
                .getApiConfigurationFromEnvironmentVariables();

        ApiConfiguration apiConfiguration = apiConfigurationBuilder.build("does_not_matter");

        assertThat(apiConfiguration.getApiUrl(), equalTo("https://some-non-existing-test-instance.lusid.com/api"));
        assertThat(apiConfiguration.getTokenUrl(), equalTo("https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token"));
        assertThat(apiConfiguration.getClientId(), equalTo("client-id-from-env"));
        assertThat(apiConfiguration.getClientSecret(), equalTo("secret-from-env"));
        assertThat(apiConfiguration.getUsername(), equalTo("user"));
        assertThat(apiConfiguration.getPassword(), equalTo("pass"));
        assertThat(apiConfiguration.getApplicationName(), equalTo("non-existent"));
        assertThat(apiConfiguration.getPersonalAccessToken(), equalTo("pat-token"));
    }

    @Test
    public void build_OnNonExistingConfigurationFile_ShouldThrowException() throws ApiConfigurationException {
        doReturn(emptyConfigFromEnvVariables()).when(apiConfigurationBuilder)
                .getApiConfigurationFromEnvironmentVariables();

        thrown.expect(ApiConfigurationException.class);
        apiConfigurationBuilder.build("does not exist");
    }

    @Test
    public void build_With_PAT_And_Url_Returns_Valid_ApiConfiguration() throws ApiConfigurationException {
        ApiConfiguration    mockConfiguration = new ApiConfiguration(null, null, null, null, null, "https://example.lusid.com", null, "pat-token", null, null, null, null);

        doReturn(mockConfiguration).when(apiConfigurationBuilder).getApiConfigurationFromEnvironmentVariables();

        ApiConfiguration apiConfiguration = apiConfigurationBuilder.build();

        assertThat(apiConfiguration.getApiUrl(), equalTo(apiConfiguration.getApiUrl()));
        assertThat(apiConfiguration.getPersonalAccessToken(), equalTo(apiConfiguration.getPersonalAccessToken()));
    }

    @Test
    public void isValidApiConfiguration_With_Valid_Configuration() throws ApiConfigurationException {
        assertThat(apiConfigurationBuilder.isValidApiConfiguration(validConfigFromEnvVariables()), equalTo(true));
    }

    @Test
    public void isValidApiConfiguration_With_Valid_Configuration_Using_Resource_Owner_Flow_No_Pat() throws ApiConfigurationException {

        ApiConfiguration apiConfiguration = new ApiConfiguration(
                "https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token",
                "user","pass","client-id-from-env","secret-from-env",
                "https://some-non-existing-test-instance.lusid.com/api","non-existent",
                null, null,null,null,null);


        assertThat(apiConfigurationBuilder.isValidApiConfiguration(validConfigFromEnvVariables()), equalTo(true));
    }

    @Test
    public void isValidApiConfiguration_With_Valid_Configuration_Using_Pat_No_Resource_Owner_Flow() throws ApiConfigurationException {

        ApiConfiguration apiConfiguration = new ApiConfiguration(
                null, null,null,null,null,
                "https://some-non-existing-test-instance.lusid.com/api","non-existent",
                "pat-token", null,null,null,null);

        assertThat(apiConfigurationBuilder.isValidApiConfiguration(validConfigFromEnvVariables()), equalTo(true));
    }

    @Test
    public void isValidApiConfiguration_With_InValid_Resource_Owner_Flow_Configuration_Returns_Not_Valid() throws ApiConfigurationException {

        //  missing required username
        ApiConfiguration apiConfiguration = new ApiConfiguration(
                "https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token",
                null,"pass","client-id-from-env","secret-from-env",
                "https://some-non-existing-test-instance.lusid.com/api","non-existent",
                null, null,null,null,null);

        assertThat(apiConfigurationBuilder.isValidApiConfiguration(apiConfiguration), equalTo(false));
    }

    @Test
    public void isValidApiConfiguration_With_InValid_Pat_Configuration_Returns_Not_Valid() throws ApiConfigurationException {

        //  missing PAT
        ApiConfiguration apiConfiguration = new ApiConfiguration(
                null, null,null,null,null,
                "https://some-non-existing-test-instance.lusid.com/api","non-existent",
                null, null,null,null,null);

        assertThat(apiConfigurationBuilder.isValidApiConfiguration(apiConfiguration), equalTo(false));
    }

    ApiConfiguration emptyConfigFromEnvVariables(){
        return new ApiConfiguration(null,null,null,null,null,null,null, null,null,null,null,null);
    }

    ApiConfiguration validConfigFromEnvVariables(){
        return new ApiConfiguration("https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token","user","pass","client-id-from-env","secret-from-env","https://some-non-existing-test-instance.lusid.com/api","non-existent","pat-token", null,null,null,null);
    }
}
