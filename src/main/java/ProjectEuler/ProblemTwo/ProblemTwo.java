package ProjectEuler.ProblemTwo;

import java.lang.reflect.Array;

public class ProblemTwo {
    public static void main(String[] args) {

        int a = 1;

        int b = 2;

        int c = a + b;

        int j = b;

        while(a < 4000000 && b < 4000000 && c < 4000000){

            a = b + c;

            if (a >= 4000000){
                break;
            }
            if (a % 2 == 0){
                j = j + a;
            }


            b = a + c;

            if (b % 2 == 0){
                j = j + b;
            }
            if (b >= 4000000){
                break;
            }


            c = a + b;
            if(c % 2 == 0){
                j = j + c;
            }
        }

        System.out.println("the sum of all the even numbers is " + j);

    }
}
