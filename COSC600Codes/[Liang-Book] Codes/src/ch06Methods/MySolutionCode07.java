package ch06Methods;

public class MySolutionCode07 {
    public static void main(String[] args) {

        printPrime(10);
    }

    public static void printPrime(int number ){
        int counter=0;
        int n=2;
        while (counter<=number){
            if( isPrime(n)) {
                System.out.print(n + " ");
                counter++;
            }
            n++;
        }
        System.out.println();
    }
    public static boolean isPrime(int number){
        for (int i=2;i<=number/2 ; i++){
            if (number%i==0)
                return false;
        }
        return true;
    }
}
