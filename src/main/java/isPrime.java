import java.util.Scanner;

public class isPrime {
    static boolean isPrime(int n){

      if( n<=1) {
          return false;
      }

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

    return true;
    }

    public static void main(String [] args){

        Scanner in=new Scanner(System.in);
        System.out.println("please enter the number");
        int input=in.nextInt();
    }
}
