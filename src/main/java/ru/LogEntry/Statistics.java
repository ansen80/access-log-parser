package ru.LogEntry;

import java.time.LocalDateTime;
import java.time.Duration;

public class Statistics {
    private int totalTraffic = 0;
    private LocalDateTime minTime = null;
    private LocalDateTime maxTime = null;
    public void addEntry(LogEntry entry) {
        totalTraffic += entry.getDataSize();

        LocalDateTime entryTime = entry.getDateTime();
        if (minTime == null || entryTime.isBefore(minTime)) {
            minTime = entryTime;
        }
        if (maxTime == null || entryTime.isAfter(maxTime)) {
            maxTime = entryTime;
        }
    }
    public double getTrafficRate() {
        if (minTime == null || maxTime == null) {
            return 0.0;
        }
        Duration duration = Duration.between(minTime, maxTime);
        long hours = Math.max(duration.toHours(), 1);
        return totalTraffic / (double) hours;
    }
}

