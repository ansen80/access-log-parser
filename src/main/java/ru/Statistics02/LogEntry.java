package ru.Statistics02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class LogEntry {
    private String userAgentString;
    private String ipAddress;
    private int responseCode;
    private LocalDateTime timestamp;

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);
    public LogEntry(String userAgentString, String ipAddress, int responseCode, String timestampString) {
        this.userAgentString = userAgentString;
        this.ipAddress = ipAddress;
        this.responseCode = responseCode;
        try {
            this.timestamp = LocalDateTime.parse(timestampString, dateFormat);
        } catch (Exception e) {
            this.timestamp = LocalDateTime.now();
        }
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public UserAgent getUserAgent() {
        return new UserAgent(userAgentString);
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public int getResponseCode() {
        return responseCode;
    }
}
