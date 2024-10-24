package ru.Statistics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Statistics {
    private HashSet<String> existingPages;
    private HashMap<String, Integer> osFrequency;
    private int totalOsCount;

    public Statistics() {
        this.existingPages = new HashSet<>();
        this.osFrequency = new HashMap<>();
        this.totalOsCount = 0;
    }
    public void addLogEntry(String page, int statusCode, String os) {
        if (statusCode == 200) {
            existingPages.add(page);
        }
        osFrequency.put(os, osFrequency.getOrDefault(os, 0) + 1);
        totalOsCount++;
    }
    public Set<String> getAllExistingPages() {
        return new HashSet<>(existingPages);
    }
    public Map<String, Double> getOsStatistics() {
        HashMap<String, Double> osStatistics = new HashMap<>();
        for (Map.Entry<String, Integer> entry : osFrequency.entrySet()) {
            double share = (double) entry.getValue() / totalOsCount;
            osStatistics.put(entry.getKey(), share);
        }
        return osStatistics;
    }
}

