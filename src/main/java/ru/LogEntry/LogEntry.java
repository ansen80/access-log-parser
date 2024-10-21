package ru.LogEntry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogEntry {
    private final String ipAddress;
    private final LocalDateTime dateTime;
    private final HttpMethod method;
    private final String requestPath;
    private final int responseCode;
    private final int dataSize;
    private final String referer;
    private final UserAgent userAgent;

    public enum HttpMethod {
        GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD, UNKNOWN
    }

    public LogEntry(String logLine) {
        String[] parts = logLine.split("\"");
        String[] firstPart = parts[0].split(" ");
        this.ipAddress = firstPart[0];

        String dateTimeString = firstPart[3].substring(1, firstPart[3].length() - 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss Z");
        this.dateTime = LocalDateTime.parse(dateTimeString, formatter);

        String[] requestParts = parts[1].split(" ");
        this.method = parseHttpMethod(requestParts[0]);
        this.requestPath = requestParts[1];

        String[] secondPart = parts[2].trim().split(" ");
        this.responseCode = Integer.parseInt(secondPart[0]);
        this.dataSize = Integer.parseInt(secondPart[1]);
        this.referer = parts[3].equals("-") ? null : parts[3];
        this.userAgent = new UserAgent(parts[5]);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public int getDataSize() {
        return dataSize;
    }

    public String getReferer() {
        return referer;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    private HttpMethod parseHttpMethod(String method) {
        try {
            return HttpMethod.valueOf(method.toUpperCase());
        } catch (IllegalArgumentException e) {
            return HttpMethod.UNKNOWN;
        }
    }
}
