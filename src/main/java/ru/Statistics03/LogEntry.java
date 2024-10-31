package ru.Statistics03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LogEntry {
    private String userAgentString;
    private String ipAddress;
    private int responseCode;
    private String timestamp;
    private String referer;

    public LogEntry(String userAgentString, String ipAddress, int responseCode, String timestamp, String referer) {
        this.userAgentString = userAgentString;
        this.ipAddress = ipAddress;
        this.responseCode = responseCode;
        this.timestamp = timestamp;
        this.referer = referer;
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

    public String getTimestamp() {
        return timestamp;
    }
    public int getSecond() {
        Pattern pattern = Pattern.compile(":\\d{2}:(\\d{2}) ");
        Matcher matcher = pattern.matcher(timestamp);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        throw new IllegalArgumentException("Неверный формат времени: " + timestamp);
    }
    public String getReferer() {
        return referer;
    }
}


