import java.util.*;
public class Practise {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
       int n=sc.nextInt();
    }
    //Function to check whether a number is odd or not
    private static Boolean check(int n){
        int ans=n&1;
       if(ans!=0){
           return true;//it is a odd number
       }
       return false;
    }
    //Get ith bit
    private static int getbit(int n,int i){
        int it=1 << i; //Left shift by i places
        int ans=n & it;
        if(ans==0){
            return 0;
        }
        return 1;
    }
    //Set the ith bit
    private static  int setbit(int n,int i){
        int it=1 << i;
        int  ans= n | it;
        return ans;
    }

    //Clear the ith bit
    private static int clearbit(int n,int i){
        int it= ~(1 << i);
        int  ans= n & it;
        return ans;
    }

    //Update the ith bit
    private static int updatebit(int n,int i,int newbit){
        int it= ~(1 << i);
        int  ans= n & it;
        return ans;
    }



    //Function to convert a number to Binary
    private static String toBinary(int n){
        String ans="";
        while(n>0){
            if(n%2==0){
                ans+="0";
            }
            else{
                ans+="1";
            }
            n=n/2;
        }
        String fans= reverse(ans);
        return fans;
    }


    private static String reverse(String ans) {
        String fans="";
        for(int i=ans.length()-1;i>=0;i--){
            fans+=ans.charAt(i);
        }
        return fans;
    }
}
