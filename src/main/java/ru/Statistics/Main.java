package ru.Statistics;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();
        //Из самого лога не стал брать, прописал просто фактические страницы с кодом ответа для выборки.
        stats.addLogEntry("Mail.ru/index.html", 200, "Windows");
        stats.addLogEntry("Mail.ru/about.html", 404, "Linux");
        stats.addLogEntry("Mail.ru/contact.html", 200, "Windows");
        stats.addLogEntry("Mail.ru/start.html", 500, "Linux");
        stats.addLogEntry("Mail.ru/products.html", 200, "MacOS");
        stats.addLogEntry("Mail.ru/services.html", 200, "Linux");
        stats.addLogEntry("Mail.ru/chat.html", 400, "MacOS");

        System.out.println("Страницы со статусом кода 200: " + stats.getAllExistingPages());

        System.out.println("Статистика ОС: " + stats.getOsStatistics());
    }
}


