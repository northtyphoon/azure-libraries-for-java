/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Triggered Web Job Run Information.
 */
@JsonFlatten
public class TriggeredJobRun extends ProxyOnlyResource {
    /**
     * Job ID.
     */
    @JsonProperty(value = "properties.id")
    private String triggeredJobRunId;

    /**
     * Job name.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String triggeredJobRunName;

    /**
     * Job status. Possible values include: 'Success', 'Failed', 'Error'.
     */
    @JsonProperty(value = "properties.status")
    private TriggeredWebJobStatus status;

    /**
     * Start time.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * End time.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * Job duration.
     */
    @JsonProperty(value = "properties.duration")
    private String duration;

    /**
     * Output URL.
     */
    @JsonProperty(value = "properties.outputUrl")
    private String outputUrl;

    /**
     * Error URL.
     */
    @JsonProperty(value = "properties.errorUrl")
    private String errorUrl;

    /**
     * Job URL.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /**
     * Job name.
     */
    @JsonProperty(value = "properties.jobName")
    private String jobName;

    /**
     * Job trigger.
     */
    @JsonProperty(value = "properties.trigger")
    private String trigger;

    /**
     * Get the triggeredJobRunId value.
     *
     * @return the triggeredJobRunId value
     */
    public String triggeredJobRunId() {
        return this.triggeredJobRunId;
    }

    /**
     * Set the triggeredJobRunId value.
     *
     * @param triggeredJobRunId the triggeredJobRunId value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withTriggeredJobRunId(String triggeredJobRunId) {
        this.triggeredJobRunId = triggeredJobRunId;
        return this;
    }

    /**
     * Get the triggeredJobRunName value.
     *
     * @return the triggeredJobRunName value
     */
    public String triggeredJobRunName() {
        return this.triggeredJobRunName;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public TriggeredWebJobStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStatus(TriggeredWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the duration value.
     *
     * @return the duration value
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration value.
     *
     * @param duration the duration value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the outputUrl value.
     *
     * @return the outputUrl value
     */
    public String outputUrl() {
        return this.outputUrl;
    }

    /**
     * Set the outputUrl value.
     *
     * @param outputUrl the outputUrl value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * Get the errorUrl value.
     *
     * @return the errorUrl value
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set the errorUrl value.
     *
     * @param errorUrl the errorUrl value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
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
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the jobName value.
     *
     * @return the jobName value
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set the jobName value.
     *
     * @param jobName the jobName value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get the trigger value.
     *
     * @return the trigger value
     */
    public String trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger value.
     *
     * @param trigger the trigger value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

}