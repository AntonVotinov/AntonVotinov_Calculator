import java.util.Scanner;
public class view {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition is: " + add(a,b));
        System.out.println("Subtraction is: " + sub(a,b));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
}
