package ru.Courses.If.Mass.For;

public class ugadaika {

        public static void guessGame() {
            int randomNum = 3;
            int attempts = 0;
            java.util.Scanner sc = new java.util.Scanner(System.in);

            while (true) {
                System.out.println("What number am I thinking (0 to 9)? :");
                int x = sc.nextInt();
                attempts++;
                if (x != randomNum) {
                    System.out.println("No, try again");
                } else {
                    System.out.println("Yes, it's " + randomNum);
                    System.out.println("You guessed it in " + attempts + " attempts.");
                    break;
                }
            }
        }

        public static void main(String[] args) {
            guessGame();
        }
    }
