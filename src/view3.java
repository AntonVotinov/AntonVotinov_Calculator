import java.util.Scanner;
public class view3 {
    public static void  main(String[] args){
        int a = scanner();
        int b = scanner();
        System.out.println("Result is: " + add(a,b));
    }
    public static int add (int a, int b){
        return a+b;
    }

    public static int scanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number");
        int scanVar = scanner.nextInt();
        return scanVar;
    }
}