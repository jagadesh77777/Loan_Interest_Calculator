import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal (p): ");
        int p = sc.nextInt();

        System.out.print("Enter rate of interest (r): ");
        float r = sc.nextFloat();

        System.out.print("Enter time (t): ");
        int t = sc.nextInt();

        float si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}