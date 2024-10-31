package ru.Statistics02;

class UserAgent {
    private String userAgentString;
    public UserAgent(String userAgentString) {
        this.userAgentString = userAgentString;
    }
    public boolean isBot() {
        return userAgentString.toLowerCase().contains("bot");
    }
}