package ProjectEuler;

public class ProblemOne {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        while(x != 1000){
            if (x % 3 == 0 || x % 5 == 0){
                y = y + x;
            }
            x++;
        }

        System.out.println("the sum of all the multiples of 3 or 5 below 1000 is " + y);
    }
}
