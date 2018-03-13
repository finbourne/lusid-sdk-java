/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A log message structured for provision by a web project.
 */
public class WebLogMessage {
    /**
     * The semantic version of the remote application submitting the log.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * The url of the resource from which the message originated.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The body of the message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Context as to the occurance of the message.
     */
    @JsonProperty(value = "context")
    private String context;

    /**
     * The severity of the message. Possible values include: 'Warn', 'Error'.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /**
     * Any stacktrace that may be relavent.
     */
    @JsonProperty(value = "stacktrace")
    private String stacktrace;

    /**
     * Any browser/user-agent/os related context.
     */
    @JsonProperty(value = "browser")
    private String browser;

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the context value.
     *
     * @return the context value
     */
    public String context() {
        return this.context;
    }

    /**
     * Set the context value.
     *
     * @param context the context value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the severity value.
     *
     * @return the severity value
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set the severity value.
     *
     * @param severity the severity value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the stacktrace value.
     *
     * @return the stacktrace value
     */
    public String stacktrace() {
        return this.stacktrace;
    }

    /**
     * Set the stacktrace value.
     *
     * @param stacktrace the stacktrace value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
        return this;
    }

    /**
     * Get the browser value.
     *
     * @return the browser value
     */
    public String browser() {
        return this.browser;
    }

    /**
     * Set the browser value.
     *
     * @param browser the browser value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withBrowser(String browser) {
        this.browser = browser;
        return this;
    }

}
