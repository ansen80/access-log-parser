package ru.Statistics02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

class Statistics {
    private List<LogEntry> logEntries = new ArrayList<>();

    public long calculateLogHours() {
        if (logEntries.isEmpty()) {
            return 0;
        }
        LocalDateTime minTime = logEntries.stream()
                .map(LogEntry::getTimestamp)
                .min(LocalDateTime::compareTo)
                .orElse(LocalDateTime.now());

        LocalDateTime maxTime = logEntries.stream()
                .map(LogEntry::getTimestamp)
                .max(LocalDateTime::compareTo)
                .orElse(LocalDateTime.now());

        Duration duration = Duration.between(minTime, maxTime);
        long durationMillis = duration.toMillis();
        return durationMillis / (1000 * 60 * 60);
    }
    public void addEntry(String userAgentString, String ipAddress, int responseCode, String timestampString) {
        logEntries.add(new LogEntry(userAgentString, ipAddress, responseCode, timestampString));
    }
    public double calculateAverageVisitsPerHour() {
        long totalVisits = logEntries.stream()
                .filter(entry -> !entry.getUserAgent().isBot())
                .count();
        long logHours = calculateLogHours();
        return logHours > 0 ? (double) totalVisits / logHours : 0.0;
    }
    public double calculateAverageErrorsPerHour() {
        long errorCount = logEntries.stream()
                .filter(entry -> entry.getResponseCode() >= 400)
                .count();
        long logHours = calculateLogHours();
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
