import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input= scanner.nextInt();

        if(input%5==0 && input%3==0)
            System.out.println("Fizz buzz");
        else if(input%5==0 )
            System.out.println("Fizz ");
        else if(input%3==0)
            System.out.println(" buzz");

    }
}
