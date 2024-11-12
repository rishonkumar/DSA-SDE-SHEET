package JavaPractice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPrime(6));
    }

    //
    private void printFunctionalProgram() {
        //Functional style
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int  sumOfSquareOfEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();

        System.out.println(sumOfSquareOfEven);
    }
    //prime number

    private static Boolean isPrime(int number) {

        for(int i = 2 ; i <=  number / 2 ; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }




}
