import java.util.Scanner;
public class PrimeNumbers {
 
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a number : ");
       
       //Nhập vào số nguyên n
       int n = s.nextInt();
       
       /*Dùng hàm isPrime() để kiểm tra số nguyên tố
        Nếu đúng thì in ra: is a prime number
        Nếu sai thì in ra: is not a prime number
       */
       if (isPrime(n)) {
           System.out.println(n + " is a prime number");
       } else {
           System.out.println(n + " is not a prime number");
       }
   }

   // Hàm kiểm tra số nguyên tố
   public static boolean isPrime(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
    }
}
