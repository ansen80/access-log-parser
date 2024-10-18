package ru.OOP_Courses.Geometry;
import java.io.*;

public class Exception_Handling {
    public static void main(String[] args) {
        String path = "C:/_git/AccessLogParser/access.log";
        int totalLines = 0;
        int googlebotRequests = 0;
        int yandexBotRequests = 0;

        try {
            File file = new File(path);
            if (!file.exists() || !file.isFile()) {
                throw new FileNotFoundException("Указанный файл не существует или это не файл");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                /*if (length > maxLength) {
                    maxLength = length;
                }
                if (length < minLength) {
                    minLength = length;
                }*/
                if (line.length() > 1024) {
                    reader.close();
                    throw new LineTooLongException("В файле найдена строка длиннее 1024 символов.");
                }
                String[] parts = line.split("\"");
                if (parts.length >= 6) {
                    String userAgent = parts[parts.length - 1].trim();
                    if (userAgent.contains("Googlebot")) {
                        googlebotRequests++;
                    } else if (userAgent.contains("YandexBot")) {
                        yandexBotRequests++;
                    }
                }
            }
            reader.close();
            System.out.println("Общее количество строк в файле: " + totalLines);
            /*System.out.println("Длина самой длинной строки в файле: " + maxLength);
            System.out.println("Длина самой короткой строки в файле: " + minLength);
            */
            System.out.println("Запросы от Googlebot: " + googlebotRequests);
            System.out.println("Запросы от YandexBot: " + yandexBotRequests);
            System.out.println("Доля запросов от Googlebot: " + (googlebotRequests * 100.0 / totalLines) + "%");
            System.out.println("Доля запросов от YandexBot: " + (yandexBotRequests * 100.0 / totalLines) + "%");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class LineTooLongException extends RuntimeException {
    public LineTooLongException(String message) {
        super(message);
    }
}