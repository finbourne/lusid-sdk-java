package com.finbourne.lusid.extensions;

import java.util.ArrayList;

public class ConfigurationOptions {
    private Integer totalTimeoutMs;
    private Integer connectTimeoutMs;
    private Integer readTimeoutMs;
    private Integer writeTimeoutMs;
    private Integer rateLimitRetries;

    public ConfigurationOptions() {}

    public ConfigurationOptions(
        Integer totalTimeoutMs,
        Integer connectTimeoutMs,
        Integer readTimeoutMs,
        Integer writeTimeoutMs,
        Integer rateLimitRetries
    ) {
        ArrayList<String> errors = new ArrayList<String>();
        if (totalTimeoutMs != null && totalTimeoutMs < 0) {
            errors.add("totalTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE + ", or null to leave the value unset");
        }
        if (connectTimeoutMs != null && connectTimeoutMs < 0) {
            errors.add("connectTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE + ", or null to leave the value unset");
        }
        if (readTimeoutMs != null && readTimeoutMs < 0) {
            errors.add("readTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE + ", or null to leave the value unset");
        }
        if (writeTimeoutMs != null && writeTimeoutMs < 0) {
            errors.add("writeTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE + ", or null to leave the value unset");
        }
        if (rateLimitRetries != null && rateLimitRetries < 0) {
            errors.add("rateLimitRetries must be a positive integer between 0 and " + Integer.MAX_VALUE + ", or null to leave the value unset");
        }
        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
        this.totalTimeoutMs = totalTimeoutMs;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
        this.writeTimeoutMs = writeTimeoutMs;
        this.rateLimitRetries = rateLimitRetries;
    }

    public Integer getTotalTimeoutMs() {
        return totalTimeoutMs;
    }

    public void setTotalTimeoutMs(Integer totalTimeoutMs) {
        if (totalTimeoutMs < 0) {
            throw new IllegalArgumentException("totalTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE);
        }
        this.totalTimeoutMs = totalTimeoutMs;
    }

    public Integer getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(Integer connectTimeoutMs) {
        if (connectTimeoutMs < 0) {
            throw new IllegalArgumentException("connectTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE);
        }
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public Integer getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(Integer readTimeoutMs) {
        if (readTimeoutMs < 0) {
            throw new IllegalArgumentException("readTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE);
        }
        this.readTimeoutMs = readTimeoutMs;
    }

    public Integer getWriteTimeoutMs() {
        return writeTimeoutMs;
    }

    public void setWriteTimeoutMs(Integer writeTimeoutMs) {
        if (writeTimeoutMs < 0) {
            throw new IllegalArgumentException("writeTimeoutMs must be a positive integer between 0 and " + Integer.MAX_VALUE);
        }
        this.writeTimeoutMs = writeTimeoutMs;
    }

    public Integer getRateLimitRetries() {
        return rateLimitRetries;
    }

    public void setRateLimitRetries(Integer rateLimitRetries) {
        if (rateLimitRetries < 0) {
            throw new IllegalArgumentException("rateLimitRetries must be a positive integer between 0 and " + Integer.MAX_VALUE);
        }
        this.rateLimitRetries = rateLimitRetries;
    }

    public boolean noOptionsSet() {
        return totalTimeoutMs == null && connectTimeoutMs == null && readTimeoutMs == null && writeTimeoutMs == null && rateLimitRetries == null;
    }
}
