import java.util.Scanner;

public class isPrime {
    static boolean isPrime(int n){

      if( n<=1) {
          return false;
      }

        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                return false;

    return true;
    }

    public static void main(String [] args){

         try {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the number");
        int input=in.nextInt();


            if (isPrime(input))
                System.out.println(" true");

            else
                System.out.println(" false");
        } 
        catch (Exception e){
            System.out.println("Enter positive numbers only");
        }
        
    }
}
