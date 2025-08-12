// SimpleInterest.java
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate (percent per year): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}
