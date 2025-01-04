public class Basic_Recursion {
    public static void main(String[] args) {
    //   printreverse(10);
    //   System.out.println(factorial(5));
            System.out.println(fib(7));
    }
    //print nos from n to 1
    public static void printreverse(int n){
        //base case
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printreverse(n-1);
    }
    //find factorial of n
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    //print sum of n natural numbers
    public static int sum(int n){
        if(n==0 ||n==1){
            return n;
        }
        return n+sum(n-1);
    }
    //print Nth Fibonacci number
    public  static int  fib(int n){
        if(n==0 ||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}



