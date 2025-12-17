package ProjectEuler.ProblemSix;

public class ProblemSix {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;

        for(int i=1;i<=100;i++){
            j = j + i;
        }

        for (int i=0;i<=100;i++){
            k = k + (i * i);
        }

        int jSquared = j * j;

        int diff = jSquared - k;

        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " + diff);
    }
}
