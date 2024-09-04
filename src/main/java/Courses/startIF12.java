package Courses;

public class startIF12 {

    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    public static void main(String[] args) {
        String x1 = "четверг";
        System.out.print("результат: ");
        printDays(x1);

        String x2 = "чт";
        System.out.println("результат: это не день недели");
    }
}