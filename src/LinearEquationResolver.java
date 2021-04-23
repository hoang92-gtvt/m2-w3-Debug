import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println(" Linear Equation Resolver");
        System.out.println("Nhập phương trình ax + b = 0");
        System.out.println("Nhập giá trị của a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập giá trị của b");
        int b = new Scanner(System.in).nextInt();

        if(a!=0){
            double result = -b/a;
            System.out.println(result);

        }


    }
}
