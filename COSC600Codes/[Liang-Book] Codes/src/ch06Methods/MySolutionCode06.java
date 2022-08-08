package ch06Methods;

public class MySolutionCode06 {
    public static void main(String[] args) {
        System.out.println(gcd(12,15));
        System.out.println(gcd(45,75));
    }

    public static int gcd(int input1,int input2){
        int gcd=0;
        for(int i=1 ; i<=input1 && i<=input2; i++){
            if((input1%i==0) && (input2%i==0))
                gcd=i;
        }
        return gcd;
    }

    public static class code07PrimeNumberMethod {
      public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
      }

      public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
          // Print the prime number and increase the count
          if (isPrime(number)) {
            count++; // Increase the count

            if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
              // Print the number and advance to the new line
              System.out.printf("%-5s\n", number);
            }
            else
              System.out.printf("%-5s", number);
          }

          // Check if the next number is prime
          number++;
        }
      }

      /** Check whether number is prime */
      public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
          if (number % divisor == 0) { // If true, number is not prime
            return false; // number is not a prime
          }
        }

        return true; // number is prime
      }
    }
}
