public class Fibonacci{
    public static void main(String[] args) {
        System.out.println(fibonaci(6));
        System.out.println(factorial(6));

    }


    public static int fibonaci(int n){
        if(n <= 1){
            return n;
        }else{
            return (fibonaci(n-1) + fibonaci(n-2));
        }
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }




}