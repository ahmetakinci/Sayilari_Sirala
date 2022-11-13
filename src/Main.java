import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        c = scanner.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > c) && (b > a)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (b > a) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }


    }
}
