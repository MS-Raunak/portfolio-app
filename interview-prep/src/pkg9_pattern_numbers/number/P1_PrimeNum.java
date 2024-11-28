package pkg9_pattern_numbers.pattern_number;

import java.util.Scanner;

public class P1_PrimeNum {

    //Check whether the given number is prime or not
    public static boolean isPrime(int n){
        //boolean flag = true;
        for (int i=2; i<=n/2; i++){
            if (n%i==0)
                return false;
        }

        return true;
    }

    //Check prime number between given range
    public static void primeRange(int lb, int ub){ //lowerBound, upperBound
        System.out.printf("Prime Numbers:");
        for (int i=lb; i<=ub; i++){
            if (isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    //Sum of all the prime numbers between range
    public static int sumOfPrimeInRange(int lb, int ub){
        int sum=0;
        for (int i=lb; i<=ub; i++){
            if (isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("enter a number: ");
        //int n = sc.nextInt();
        //System.out.println(isPrime(n));

        //primeRange(1, 50);

        System.out.print(sumOfPrimeInRange(1,5));
    }
}
