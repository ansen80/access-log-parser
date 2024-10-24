package ru.Statistics404;

public class Main {
    public static void main(String[] args) {
        Statistics404 stats = new Statistics404();

        stats.addLogEntry("Mail.ru/index.html", 200, "Chrome");
        stats.addLogEntry("Mail.ru/about.html", 404, "Firefox");
        stats.addLogEntry("Mail.ru/contact.html", 200, "Safari");
        stats.addLogEntry("Mail.ru/products.html", 404, "Chrome");
        stats.addLogEntry("Mail.ru/services.html", 200, "Edge");
        stats.addLogEntry("Mail.ru/index.html", 200, "Chrome");
        stats.addLogEntry("Mail.ru/about.html", 404, "Firefox");
        stats.addLogEntry("Mail.ru/contact.html", 200, "Chrome");
        stats.addLogEntry("Mail.ru/start.html", 404, "Firefox");
        stats.addLogEntry("Mail.ru/products.html", 200, "Safari");
        stats.addLogEntry("Mail.ru/services.html", 404, "Firefox");
        stats.addLogEntry("Mail.ru/chat.html", 404, "Safari");

        System.out.println("Страницы со статусом кода 404: " + stats.getNonExistingPages());
        System.out.println("Статистика по Браузерам: " + stats.getBrowserStatistics());
    }
}
