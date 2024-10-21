package ru.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogParser {

    private final String path;

    public LogParser(String path) {
        this.path = path;
    }

    public List<LogEntry> parseLogs() {
        List<LogEntry> logEntries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                LogEntry logEntry = new LogEntry(line); // Создание объекта LogEntry из строки
                logEntries.add(logEntry); // Добавление записи в список
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return logEntries; // Возвращаем список записей
    }
}
