package ru.LogEntry;

public class UserAgent {
    private final String operatingSystem;
    private final String browser;
    public UserAgent(String userAgentString) {
        this.operatingSystem = parseOperatingSystem(userAgentString);
        this.browser = parseBrowser(userAgentString);
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getBrowser() {
        return browser;
    }
    private String parseOperatingSystem(String userAgentString) {
        if (userAgentString.contains("Windows")) {
            return "Windows";
        } else if (userAgentString.contains("Mac OS")) {
            return "macOS";
        } else if (userAgentString.contains("Linux")) {
            return "Linux";
        } else {
            return "Unknown";
        }
    }
    private String parseBrowser(String userAgentString) {
        if (userAgentString.contains("Edge")) {
            return "Edge";
        } else if (userAgentString.contains("Firefox")) {
            return "Firefox";
        } else if (userAgentString.contains("Chrome")) {
            return "Chrome";
        } else if (userAgentString.contains("Opera")) {
            return "Opera";
        } else {
            return "Other";
        }
    }
}







