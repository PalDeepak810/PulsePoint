package com.pulse.core.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;




public class AlertRequest {
    @NotBlank(message="Source is required")
    private String source;
    @NotBlank(message="Message is required")
    @Size(max=200,message="Message cannot exceed 200 characters")
    private String message;
    private String severity="Info";

    public AlertRequest(String source, String message, String severity) {
        this.source = source;
        this.message = message;
        this.severity = severity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
