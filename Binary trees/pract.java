
import java.util.*;

class pract {

    public static void main(String[] args) {
        int num=26;
        //Prime ---> True;
        //NotPrime --> False;

        int count=0;

        for(int i=1;i<=num;i++){

            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }

}
