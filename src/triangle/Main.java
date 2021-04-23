package triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào cạnh của 3 tam giác");

        try{
            System.out.println("Nhập canh a");
            int canhA = new Scanner(System.in).nextInt();
            System.out.println("tỉ lệ nghịch của a là " +1/canhA);
//            System.out.println("Số căn bậc 2 của a là " + Math.sqrt(canhA));
            checkNumber(canhA);

            System.out.println("Nhập canh b");
            int canhB = new Scanner(System.in).nextInt();
            System.out.println("tỉ lệ nghịch của a là " +1/canhB);
            checkNumber(canhB);

            System.out.println("Nhập canh c");
            int canhC = new Scanner(System.in).nextInt();
            System.out.println("tỉ lệ nghịch của a là " +1/canhB);
            checkNumber(canhC);

            checkLength(canhA, canhB,canhC);


        }
        catch(ArithmeticException e0){
//            e0.printStackTrace();
            System.err.println("Giá trí của cạnh nhập phải khác 0");
            System.err.println("và tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
        catch(InputMismatchException e){
            System.err.println("Giá trị vừa nhập không thuộc số nguyên");
        }
        catch(NegativeArraySizeException e1){
//            e1.printStackTrace();
            System.err.println("Giá trị nhập là số nguyên dương âm");

        }

        catch (Exception e2){
            e2.printStackTrace();
        }


    }
    private static void checkNumber(int index){
        int[] arr = new int[index];
    }

    private static void checkLength(int canhA, int canhB, int canhC){
        int x=1;
        if (canhA+ canhB <=canhC) x=0;
        if (canhB+ canhC <=canhA) x=0;
        if (canhC+ canhA <=canhB) x=0;
        System.out.println(canhA/x);
    }
}
