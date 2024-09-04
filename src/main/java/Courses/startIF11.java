package Courses;

public class startIF11 {

    public static String day(int x) {
        String result;
        switch (x) {
            case 1:
                result = "\"понедельник\"";
                break;
            case 2:
                result = "\"вторник\"";
                break;
            case 3:
                result = "\"среда\"";
                break;
            case 4:
                result = "\"четверг\"";
                break;
            case 5:
                result = "\"пятница\"";
                break;
            case 6:
                result = "\"суббота\"";
                break;
            case 7:
                result = "\"воскресенье\"";
                break;
            default:
                result = "\"это не день недели\"";
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        int x1 = 5;
        System.out.println("результат 5: " + day(x1));

        int x2 = 10;
        System.out.println("результат 10: " + day(x2));
    }
}