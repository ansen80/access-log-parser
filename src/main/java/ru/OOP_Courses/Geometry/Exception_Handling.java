package ru.OOP_Courses.Geometry;
import java.io.*;

public class Exception_Handling {
    public static void main(String[] args) {
        String path = "C:/_git/AccessLogParser/access.log";
        int totalLines = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        try {
            File file = new File(path);
            if (!file.exists() || !file.isFile()) {
                throw new FileNotFoundException("Указанный файл не существует или это не файл.");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                int length = line.length();
                totalLines++;
                if (length > maxLength) {
                    maxLength = length;
                }
                if (length < minLength) {
                    minLength = length;
                }
                if (length > 1024) {
                    reader.close();
                    throw new LineTooLongException("В файле найдена строка длиннее 1024 символов.");
                }
            }
            reader.close();
            System.out.println("Общее количество строк в файле: " + totalLines);
            System.out.println("Длина самой длинной строки в файле: " + maxLength);
            System.out.println("Длина самой короткой строки в файле: " + minLength);
        } catch (LineTooLongException e) {
            System.err.println(e.getMessage());
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