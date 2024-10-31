package ru.Statistics02;

import java.util.*;
import java.util.stream.Collectors;

class Statistics {
    private List<LogEntry> logEntries = new ArrayList<>();
    private int logHours = 1;
    public void addEntry(String userAgentString, String ipAddress, int responseCode) {
        logEntries.add(new LogEntry(userAgentString, ipAddress, responseCode));
    }
    public void setLogHours(int logHours) {
        this.logHours = logHours;
    }
    public double calculateAverageVisitsPerHour() {
        long totalVisits = logEntries.stream()
                .filter(entry -> !entry.getUserAgent().isBot())
                .count();
        return logHours > 0 ? (double) totalVisits / logHours : 0.0;
    }
    public double calculateAverageErrorsPerHour() {
        long errorCount = logEntries.stream()
                .filter(entry -> entry.getResponseCode() >= 400)
                .count();
        return logHours > 0 ? (double) errorCount / logHours : 0.0;
    }
    public double calculateAverageVisitsPerUser() {
        Map<String, Long> uniqueUsersVisits = logEntries.stream()
                .filter(entry -> !entry.getUserAgent().isBot())
                .collect(Collectors.groupingBy(LogEntry::getIpAddress, Collectors.counting()));

        long totalVisits = uniqueUsersVisits.values().stream().mapToLong(Long::longValue).sum();
        return uniqueUsersVisits.size() > 0 ? (double) totalVisits / uniqueUsersVisits.size() : 0.0;
    }
}

