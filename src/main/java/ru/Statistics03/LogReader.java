package ru.Statistics03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogReader {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        String logFilePath = "C:/_git/AccessLogParser/access.log";
        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            String regex = "^(\\S+) \\S+ \\S+ \\[(.*?)\\] \"[^\"]*\" (\\d{3}) \\d+ \"([^\"]*)\" \"([^\"]*)\"$";
            Pattern pattern = Pattern.compile(regex);

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String ipAddress = matcher.group(1);
                    String timestamp = matcher.group(2);
                    int responseCode = Integer.parseInt(matcher.group(3));
                    String referer = matcher.group(4);
                    String userAgent = matcher.group(5);
                    statistics.addEntry(userAgent, ipAddress, responseCode, timestamp, referer);
                } else {
                    System.out.println("Не удалось разобрать строку: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        System.out.println("Пиковое количество посещений в секунду: " + statistics.calculatePeakVisitsPerSecond());
        System.out.println("Реферер домены: " + statistics.getRefererDomains());
        System.out.println("Максимальное количество посещений на пользователя: " + statistics.calculateMaxVisitsPerUser());
    }
}
