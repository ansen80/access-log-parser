package ru.Statistics03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Statistics {
    private List<LogEntry> logEntries = new ArrayList<>();
    private Map<Integer, Integer> visitsPerSecond = new HashMap<>();

    public void addEntry(String userAgentString, String ipAddress, int responseCode, String timestamp, String referer) {
        logEntries.add(new LogEntry(userAgentString, ipAddress, responseCode, timestamp, referer));
    }
    public int calculatePeakVisitsPerSecond() {
        visitsPerSecond = logEntries.stream()
                .filter(entry -> !entry.getUserAgent().isBot())
                .collect(Collectors.toMap(
                        entry -> entry.getSecond(),
                        entry -> 1,
                        Integer::sum
                ));
        return visitsPerSecond.values().stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
    public Set<String> getRefererDomains() {
        Pattern domainPattern = Pattern.compile("^(?:https?://)?([^/]+)");

        return logEntries.stream()
                .map(LogEntry::getReferer)
                .filter(referer -> referer != null && !referer.isEmpty())
                .map(referer -> {
                    Matcher matcher = domainPattern.matcher(referer);
                    return matcher.find() ? matcher.group(1) : null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }
    public int calculateMaxVisitsPerUser() {
        return logEntries.stream()
                .filter(entry -> !entry.getUserAgent().isBot())
                .collect(Collectors.groupingBy(LogEntry::getIpAddress, Collectors.counting()))
                .values().stream()
                .max(Long::compareTo)
                .orElse(0L)
                .intValue();
    }
}

