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
     * Get the semantic version of the remote application submitting the log.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the semantic version of the remote application submitting the log.
     *
     * @param version the version value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the url of the resource from which the message originated.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url of the resource from which the message originated.
     *
     * @param url the url value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the body of the message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the body of the message.
     *
     * @param message the message value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get context as to the occurance of the message.
     *
     * @return the context value
     */
    public String context() {
        return this.context;
    }

    /**
     * Set context as to the occurance of the message.
     *
     * @param context the context value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the severity of the message. Possible values include: 'Warn', 'Error'.
     *
     * @return the severity value
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set the severity of the message. Possible values include: 'Warn', 'Error'.
     *
     * @param severity the severity value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get any stacktrace that may be relavent.
     *
     * @return the stacktrace value
     */
    public String stacktrace() {
        return this.stacktrace;
    }

    /**
     * Set any stacktrace that may be relavent.
     *
     * @param stacktrace the stacktrace value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
        return this;
    }

    /**
     * Get any browser/user-agent/os related context.
     *
     * @return the browser value
     */
    public String browser() {
        return this.browser;
    }

    /**
     * Set any browser/user-agent/os related context.
     *
     * @param browser the browser value to set
     * @return the WebLogMessage object itself.
     */
    public WebLogMessage withBrowser(String browser) {
        this.browser = browser;
        return this;
    }

}
