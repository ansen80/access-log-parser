package ru.Statistics03;

class UserAgent {
    private String userAgentString;
    public UserAgent(String userAgentString) {
        this.userAgentString = userAgentString;
    }
    public boolean isBot() {
        return userAgentString.toLowerCase().contains("bot");
    }
    public String getUserAgentString() {
        return userAgentString;
    }
}

