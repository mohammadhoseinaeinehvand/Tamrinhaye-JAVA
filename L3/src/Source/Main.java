package Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        char p;
        try {
            System.out.print("Enter a : ");
            a = sc.nextDouble();
            System.out.print("Enter the proccess you want : ");
            p = sc.next().charAt(0);
            System.out.print("Enter b : ");
            b = sc.nextDouble();
        }
        catch (Exception e){
            System.out.println(e);
            return;
        }

        try {
            System.out.println(Calculator.calculate(a,p,b));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}