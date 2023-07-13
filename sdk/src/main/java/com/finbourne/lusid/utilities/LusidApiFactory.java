package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class that builds pre configured LUSID API instances to access a LUSID application.
 *
 */
public class LusidApiFactory {


    /**
     * The unique package that hosts all the LUSID API classes
     */
    public static final String LUSID_API_PACKAGE = "com.finbourne.lusid.api";

    private final ApiClient apiClient;
    private final Map<Class, Object> initialisedApis;

    /**
     * Create a LUSID API factory based on an {@link ApiClient}
     *
     * @param apiClient configured to a specific LUSID application
     */
    public LusidApiFactory(ApiClient apiClient) {
        this.apiClient = apiClient;
        initialisedApis = new HashMap<>();
    }

    /**
     * Builds an instance of a LUSID API (e.g. {@link com.finbourne.lusid.api.PortfoliosApi}, {@link com.finbourne.lusid.api.QuotesApi}, etc...)
     *
     * For each instance of an {@link LusidApiFactory} only a singleton instance of each LUSID API class exist. The APIs
     * are lazily initialised on request.
     *
     *
     * @param apiClass - class of the LUSID API to create
     * @param <T> LUSID API type
     * @return instance of the LUSID API type configured as per the {@link ApiClient}
     *
     * @throws UnsupportedOperationException is the apiClass does not belong to the com.finbourne.lusid.api package or
     * if the class has no constructor that accepts an {@link ApiClient} parameter.
     */
    public synchronized <T> T build(Class<T> apiClass) {
        T apiInstance = (T) initialisedApis.get(apiClass);
        if (apiInstance == null) {
            checkIsSupportedApiClass(apiClass);
            Constructor<T> constructor = getApiConstructor(apiClass);
            apiInstance = createInstance(constructor);
            initialisedApis.put(apiClass, apiInstance);
        }
        return apiInstance;
    };

    /*
     * Create an instance of a LUSID API configured by an {@link ApiClient}
     *
     * @throws UnsupportedOperationException on any reflection related issues on constructing the LUSID API object
     */
    private <T> T createInstance(Constructor<T> constructor){
        try {
            return constructor.newInstance(apiClient);
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Construction of " + constructor.getClass().getName() + " failed " +
                    "due to an invalid instantiation call.",e);
        }
    }

    /*
     * Retrieves the constructor for the LUSID API that accepts an {@link ApiClient}
     *
     * @throws UnsupportedOperationException if the class doesn't have a valid constructor that takes
     * an {@link ApiClient} as an argument to ensure proper construction of a LUSID API instance.
     */
    private <T> Constructor<T> getApiConstructor(Class<T> apiClass){
        try {
            return apiClass.getDeclaredConstructor(ApiClient.class);
        } catch (NoSuchMethodException e) {
            throw new UnsupportedOperationException(apiClass.getName() + " has no single argument constructor taking " +
                    "in " + ApiClient.class.getName());
        }
    }

    /*
     * Checks the class lives in the set package for LUSID API classes.
     *
     * @throws UnsupportedOperationException if API class doesn not live in LUSID API package
     */
    private void checkIsSupportedApiClass(Class apiClass){
        if (!isInLusidApiPackage(apiClass)) {
            throw new UnsupportedOperationException(apiClass.getName() + " class is not a supported API class. " +
                    "Supported API classes live in the " + LusidApiFactory.LUSID_API_PACKAGE + " package.");
        }
    }

    private boolean isInLusidApiPackage(Class clazz){
        return LUSID_API_PACKAGE.equals(clazz.getPackage().getName());
    }


}
