package ru.Statistics404;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Statistics404 {
    private HashSet<String> nonExistingPages;
    private HashMap<String, Integer> browserFrequency;
    private int totalBrowserCount;

    public Statistics404() {
        this.nonExistingPages = new HashSet<>();
        this.browserFrequency = new HashMap<>();
        this.totalBrowserCount = 0;
    }
    public void addLogEntry(String page, int statusCode, String browser) {
        if (statusCode == 404) {
            nonExistingPages.add(page);
        }
        browserFrequency.put(browser, browserFrequency.getOrDefault(browser, 0) + 1);
        totalBrowserCount++;
    }
    public Set<String> getNonExistingPages() {
        return new HashSet<>(nonExistingPages);
    }
    public Map<String, Double> getBrowserStatistics() {
        HashMap<String, Double> browserStatistics = new HashMap<>();
        for (Map.Entry<String, Integer> entry : browserFrequency.entrySet()) {
            double share = (double) entry.getValue() / totalBrowserCount;
            browserStatistics.put(entry.getKey(), share);
        }
        return browserStatistics;
    }
}


