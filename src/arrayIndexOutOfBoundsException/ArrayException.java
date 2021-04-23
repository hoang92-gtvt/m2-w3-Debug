package arrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayException {

    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[]  arraytest = new Integer[rd.nextInt(11)+3];
        for (int i = 0; i < arraytest.length; i++) {
            arraytest[i]= rd.nextInt(101);
//            System.out.println(arraytest[i] + "  ");
        }
        return arraytest;
    }



}
