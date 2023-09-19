import java.util.Scanner;

public class Main {

    public static int discount(int duration, int subject) {
        switch (subject) {
            case 1 -> {
                if (duration < 0 || duration > 40) {
                } else return 0;
            }
            case 2 -> {
                if (duration < 0) {
                } else if (duration < 3) {
                    return 0;
                } else if (duration < 5) {
                    return 10;
                } else if (duration <= 40) {
                    return 15;
                }
            }
            case 3 -> {
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
        System.out.println("1.Binh thuong");
        System.out.println("2.Can ngheo");
        System.out.println("3.Ngheo");
        System.out.print("Choose: ");
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int duration;
//        int subject;
//        int result;
//
//        printSubject();
//        subject = scanner.nextInt();
//        System.out.print("Enter how long you have stayed(year): ");
//        duration = scanner.nextInt();
//
//        if (subject == 1) {
//            result = discount(duration, 1);
//        } else if (subject == 2) {
//            result = discount(duration, 2);
//        } else {
//            result = discount(duration, 3);
//        }
//
//        System.out.println(result);
//    }
}