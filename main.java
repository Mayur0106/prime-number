import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner gh = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = gh.nextInt();

        boolean checker = false;
        if(num==1)
        {
            System.out.println("1 is not prime nor even number : ");
        }
        else {
            for (int i = 2; i < num; i++  ) {
                if (num % i == 0) {
                    break;
                } else {
                    checker = true ;
                }
            }


            if (checker) {
                System.out.printf("The Given Number %d is prime ", num);
            } else {
                System.out.printf("The Given Number %d is not prime ", num);
            }
        }
    }
}
