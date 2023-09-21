import java.util.Scanner;

public class Main {

    public static int discount(int duration, String subject) {
        subject = subject.toLowerCase();
        switch (subject) {
            case "normal" -> {
                if (duration < 0 || duration > 40) {
                } else return 0;
            }
            case "nearpoor" -> {
                if (duration < 0) {
                } else if (duration < 3) {
                    return 0;
                } else if (duration < 5) {
                    return 10;
                } else if (duration <= 40) {
                    return 15;
                }
            }
            case "poor" -> {
                if (duration < 0) {
                } else if (duration < 1) {
                    return 0;
                } else if (duration < 3) {
                    return 10;
                } else if (duration < 5) {
                    return 15;
                } else if (duration <= 40) {
                    return 20;
                }
            }
        }
        return -1;
    }

    public static void printSubject() {
        System.out.println("Type of household?");
        System.out.print("Enter your type (normal/nearpoor/poor): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration;
        String subject;
        int result;

        printSubject();
        subject = scanner.next();
        System.out.print("Enter how long you have stayed(year): ");
        duration = scanner.nextInt();

        result = discount(duration, subject);

        System.out.println(result);
    }
}