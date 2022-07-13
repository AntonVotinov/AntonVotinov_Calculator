import java.util.Scanner;

public class view2 {
    public static void main(String[] args){
        float a = getNum();
        float b = getNum();
        float c = getNum();
        float d = getNum();
        float add = addM(a,b,c,d);
        float ave = aveM(a,b,c,d);
        System.out.println("Add is:"+add+"\n"+"Ave is:"+ave);
        }
    public static float getNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number?");
        float scanVar = scan.nextFloat();
        return scanVar;
    }
    public static float addM (float a, float b, float c, float d){
        return a+b+c+d;
    }
    public static float aveM (float a, float b, float c, float d){
        return (a+b+c+d)/4;
    }
}





/*
import java.util.Scanner;
public class interview2 {
    public static void main(String[] args) {
        float num1 = getNum();
        float num2 = getNum();
        float num3 = getNum();
        float num4 = getNum();

        float resultOfAdd = add(num1,num2,num3,num4);
        float resultOfAverage = ave(num1,num2,num3,num4);
        System.out.println("Addition is: " + resultOfAdd);
        System.out.println("Average is: " + resultOfAverage);
    }
    public static float add(float a,float b,float c,float d){
        return a+b+c+d;
    }
    public static float ave(float a,float b,float c,float d){
        return (a+b+c+d)/4;
    }
    public static float getNum(){
        Scanner scannerMethod = new Scanner(System.in);
        System.out.println("Please write down following number:");
        float variable1 = scannerMethod.nextFloat();
        return variable1;
    }
}*/
