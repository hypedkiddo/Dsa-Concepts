
import java.util.*;
public class Add_2_numbers {

    //add 2 numbers without actually dividing them
    public static int divide(int x,int y){
      //Handling the finest Edge case
        if(x==y){
            return 1;
        }
        //handling negative numbers
        boolean sign=false;
        if(x>0 && y<0) sign=true;
        if(x<0 && y>0) sign=true;

        int n=Math.abs(x);
        int d=Math.abs(y);
        int ans=0;
        while(n>=d){
            int cnt=0;
            while(n >= (d << (cnt+1))){
               ans=ans+(1<<cnt) ;
               n=n-(d*(1<<cnt));
            }
        }
        if(sign){
            return -1*ans;
        }
        return ans;

    }

    //Print all divisors of a number
    //Brute force is Checking all nos from 1 to n
    //Optimised is all divisors exists in pairs so no
    //need to check all numbers only check upto root(n)
    public static ArrayList<Integer> print_all_divisors(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                arr.add(i);
                if((n/i)!=i) { //To prevent duplicate Entries
                    arr.add(n / i);
                }
            }
        }
        return arr;
    }

    //check if a number is Prime or not
    //TC:-Sqrt(n)
    public  static boolean isPrime(int n){
        int cnt=0;
        n=(int)(Math.sqrt(n));
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
            if((n/i)!=i){
                cnt++;
            }
        }
        return cnt == 2; //advanced condensation of if statement
    }

    //Print Prime Factors of a number
    //Approach 1:-O(Sqrt(n)*2*Sqrt(n))
    public static ArrayList<Integer> prime_factors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        n = (int) (Math.sqrt(n));
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                arr.add(i);
            }
            if ((n / i) != 0 && isPrime(n / i)) {
                arr.add(n / i);
            }
        }
        return  arr;
    }

    //Approach 2:-O(Log(n))
    public static ArrayList<Integer> prime_factors1(int n) {
        n = (int) (Math.sqrt(n));
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                arr.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {

    }
}
