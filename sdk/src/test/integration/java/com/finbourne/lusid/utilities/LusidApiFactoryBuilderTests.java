package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.ResourceListOfInstrumentIdTypeDescriptor;
import com.finbourne.lusid.utilities.auth.LusidTokenException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

public class LusidApiFactoryBuilderTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void build_WithExistingConfigurationFile_ShouldReturnFactory() throws ApiException, ApiConfigurationException, LusidTokenException {
        LusidApiFactory lusidApiFactory = LusidApiFactoryBuilder.build(CredentialsSource.credentialsFile);
        assertThat(lusidApiFactory, is(notNullValue()));
        assertThatFactoryBuiltApiCanMakeLUSIDCalls(lusidApiFactory);
    }

    private static void assertThatFactoryBuiltApiCanMakeLUSIDCalls(LusidApiFactory lusidApiFactory) throws ApiException {
        InstrumentsApi instrumentsApi = lusidApiFactory.build(InstrumentsApi.class);
        ResourceListOfInstrumentIdTypeDescriptor instrumentIdTypeDescriptor = instrumentsApi.getInstrumentIdentifierTypes();
        assertThat("Instruments API created by factory should have returned instrument identifier types"
                , instrumentIdTypeDescriptor, is(notNullValue()));
        assertThat("Instrument identifier types returned by the Instrument API should not be empty",
                instrumentIdTypeDescriptor.getValues(), not(empty()));
    }

}
