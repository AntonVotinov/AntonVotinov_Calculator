import java.util.Scanner;
public class view1 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write 3 numbers below:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Addition of 3 numbers is: " + addition(num1,num2,num3));
        System.out.println("Average of 3 numbers is: " + average(num1,num2,num3));
    }
    public static int addition(int a, int b, int c) {
        return a+b+c;
    }
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
}
