
import java.util.*;

public class Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int n = sc.nextInt();
    }

    //Function to check whether a number is odd or not
    private static Boolean check(int n) {
        int ans = n & 1;
        if (ans != 0) {
            return true;//it is a odd number
        }
        return false;
    }

    //Get ith bit
    private static int getbit(int n, int i) {
        int it = 1 << i; //Left shift by i places
        int ans = n & it;
        if (ans == 0) {
            return 0;
        }
        return 1;
    }

    //Set the ith bit
    private static int setbit(int n, int i) {
        int it = 1 << i;
        int ans = n | it;
        return ans;
    }

    //Clear the ith bit
    private static int clearbit(int n, int i) {
        int it = ~(1 << i);
        int ans = n & it;
        return ans;
    }

    //Update the ith bit
    private static int updatebit(int n, int i, int newbit) {
        int it = ~(1 << i);
        int ans = n & it;
        return ans;
    }

    //clear last i bits
    public static int clearLastbits(int n, int i) {
        for (int j = 0; j < i; j++) {
            int bitMask = ~(1 << j);
            n = n & bitMask;
        }
        return n;
    }

    //clear range of bits
    public static int clearBitsinrange(int n, int i, int j) {
        //Brute approach
        // for(int k=i;k<=j;k++){
        //     int  bitMask=~(1<<k);
        //     n=n&bitMask;
        // }
        // return n;

        //optimized approach
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b; //Here bitmask is achieved by two operations done simultaneously
        n = n & bitMask;
        return n;
    }

    //Count set bits in a number Important one 
    public static int count(int n, int count) {
        while (n != 0) {
            int bitMask = 1;
            if ((n & bitMask) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


    //Function to convert a number to Binary
    private static String toBinary(int n) {
        String ans = "";
        while (n > 0) {
            if (n % 2 == 0) {
                ans += "0";
            } else {
                ans += "1";
            }
            n = n / 2;
        }
        String fans = reverse(ans);
        return fans;
    }

    private static String reverse(String ans) {
        String fans = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            fans += ans.charAt(i);
        }
        return fans;
    }
}
