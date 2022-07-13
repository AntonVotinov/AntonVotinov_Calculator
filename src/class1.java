import java.util.Scanner;

public class class1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write down number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Addition result is: " + add(a,b));

    }
    public static int add (int a, int b){
        return a+b;
    }
}