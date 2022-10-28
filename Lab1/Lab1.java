 /* 0402
O1 +
C3 = C = 0
O2 = %
C7 = long
*/

public class Lab1 {
	public static void main(String[] args) {
        int a = 2, b = 3;
        long n = 4, m = 6;
        final int C = 0;
        double result = 0;

        if (n < a || m < b) {
            System.out.println("n/m can't be less than a/b");
        }else if(a <= 0 || b <= 0 || n <= 0 || m <= 0){
        	System.out.println("Error invalid number");
        } else  {
            for (long i = a; i <= n; i++) {
                for (long j = b; j <= m; j++) {
                    result += (double)(i%j)/i+C;
                }
            }
            System.out.print("Result: " + result);
        }
    }
}
