package ru.Statistics02;

class LogEntry {
    private String userAgentString;
    private String ipAddress;
    private int responseCode;

    public LogEntry(String userAgentString, String ipAddress, int responseCode) {
        this.userAgentString = userAgentString;
        this.ipAddress = ipAddress;
        this.responseCode = responseCode;
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