package ru.Statistics02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class LogEntry {
    private String userAgentString;
    private String ipAddress;
    private int responseCode;
    private Date timestamp;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z");
    public LogEntry(String userAgentString, String ipAddress, int responseCode, String timestampString) {
        this.userAgentString = userAgentString;
        this.ipAddress = ipAddress;
        this.responseCode = responseCode;
        try {
            this.timestamp = dateFormat.parse(timestampString);
        } catch (ParseException e) {
            this.timestamp = new Date();
        }
    }
    public Date getTimestamp() {
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
