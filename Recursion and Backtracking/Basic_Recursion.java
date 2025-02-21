
public class Basic_Recursion {

    public static void main(String[] args) {
        //   printreverse(10);
        //   System.out.println(factorial(5));
        System.out.println(expo(2, 4));
    }

    //print nos from n to 1
    public static void printreverse(int n) {
        //base case
        if (n == 1) {
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printreverse(n - 1);
    }

    //find factorial of n
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //print sum of n natural numbers
    public static int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    //print Nth Fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //check if array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        //Base case
        if (i == arr.length - 1) {
            return true;
        }
        //Kaam
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        //Call to the function
        return isSorted(arr, i + 1);
    }
    //WAF to find the first occurence of an element in the array

    public static int findFirst(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        } else {
            return findFirst(arr, i + 1, key);
        }
    }

    //WAF to find the Last occurence of an element in the array
    public static int findLast(int arr[], int i, int key) {
        //Base Case
        if (i == arr.length) {
            return -1;
        }
        //Here first travel to the end of the array
        int isFound = findLast(arr, i + 1, key);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    //Print x to the power of n
    public static int expo(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * expo(base, power - 1);
    }
    //Optimized way

    // Optimized way log(n)
    public static int optimizedExpo(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (power % 2 == 0) {
            return optimizedExpo(base * base, power / 2);
        } else {
            return base * optimizedExpo(base * base, (power - 1) / 2);
        }
    }

}
