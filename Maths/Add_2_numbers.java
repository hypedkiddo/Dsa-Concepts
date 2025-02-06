import java.util.ArrayList;
import java.util.List;

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
                arr.add(n/i);
                arr.add(0);
            }
        }
        return arr;
    }


    public static void main(String[] args) {

    }
}
