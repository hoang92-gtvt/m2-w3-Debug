package arrayIndexOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayException exception1 = new ArrayException();
        Integer[] arr = exception1.creatRandom();

        System.out.println("Nhập vị trí phần tử muốn lấy");
        int index;
        do{
            try{
                index = new Scanner(System.in).nextInt();
                System.out.println(arr[index]);
                break;

            }catch(InputMismatchException e1){
                System.err.println("Giá trị nhập không thuộc số nguyên");
                System.out.println("Mời bạn nhập lại");

            }
            catch(IndexOutOfBoundsException e2){
                e2.printStackTrace();
                System.err.println("Giá trị index của mảng ko tồn tại");
                System.out.println("Mời bạn nhập lại");
            }
        }while(true);
        System.out.println(index);
    }
}
