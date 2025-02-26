import java.util.Arrays;

import java.util.*;
public class Advanced_Recursion {
    public static void main(String[] args) {
//       String ans="";
//        int lp=-1;
//        int n=3;
//        printBinary(ans, n, lp);
//        String ans=Movex("axbcxxd","",0,0);
//        System.out.println(ans);
        Subseq("abc","",0);
//        String digits="23";
//        ArrayList<String> ans = new ArrayList<>(); // Create a new list for each call
//        printCombo(digits, 0, "", ans);
//        System.out.println(ans);
    }
    
    //Tilling Problem (Amazon) 
        //Given a "2*n" floor and tiles of size "2*1" count the no of ways to tile the given floor using the 2*1 tiles
        //(A tile can either be placed horizontally or vertically)
    public static int TP(int n){
        if(n==0 || n==1){
            return 1;
        }
        //Adding tile vertically
        int n1=TP(n-1);
        //Adding tile horizontally
        int n2=TP(n-2);
        return n1+n2;
    }

       // Length of a String using Recursion
    public static int len(String str, int i, int length) {
        if (i == str.length()) {
            return length;
        }
        return len(str, i + 1, length + 1);
    }

    //Remove Duplicates from  a String
    public static  void  rmdup(String s,String ans,int i,boolean[] arr){
        //base case
        if(s.length()==i){
            System.out.println(ans);
            return;
        }
        //kaam
        if(!arr[s.charAt(i)-'a']){
            ans+=s.charAt(i);
            arr[s.charAt(i)-'a']=true;
        }
        //Recursion
         rmdup(s,ans,i+1,arr);
    }

    //Friends pairing Problem
    //Given n friends ,each one can remain single or canbe paired up with some other friend .Each friend can 
    //friend can be paired only once.Find out the total number of ways in which friends can remain single or can be paired up
    public static int pair(int n){
        //base case
       if (n==0 || n==1) {
           return 1;
       }
        //kaam
        //choice to remain single
        int ans1=pair(n-1);
        //choice to pair up
        int ans2=(pair(n-2)) * (n-1);
        //Recursive call
        return ans1+ans2;
    }
    
    //Print all binary strings of size N without consecutive ones
    public static void printBinary(String ans, int n, int lp) {
    // base case
    if (ans.length() == n) {
        System.out.println(ans);
        return;
    }
    // choice to place 0
    //This ans+'0' means tereko agle wale level pare add karna hai!!
    printBinary(ans + '0', n, 0);
    // choice to place 1
    if (lp != 1) {
        printBinary(ans + '1', n, 1);
    }
}

    //Classic tower of Hanoi Problem
    public static void Hanoi(int n,char A,char C,char B){

    }

    //print String in Reveres order
    public static String reverse(String p,String up,int i){
        //Base case
        if(p.length()==i){
            return up;
        }
         return reverse(p,p.charAt(i)+up,i+1);
    }
    // Move all x to the end of the String
    public static String Movex(String p,String up,int i,int count){
        if(i==p.length()){
            for(int j=1;j<=count;j++){
                up=up+'x';
            }
            return up;
        }
        if(p.charAt(i)!='x'){
            up=up+p.charAt(i);
        }
        else{
            count++;
        }
        return Movex(p,up,i+1,count);
    }

    //print all the subsequences of a String
    public static void Subseq(String p,String up,int i){
        if(p.length()==i){
            System.out.println(up);
            return;
        }
        //take it
        Subseq(p,up+p.charAt(i),i+1);
        //Leave it
        Subseq(p,up,i+1);
    }
    //Letter combination of Phone number
    public static String[] keypad={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void printCombo(String digits,int idx,String combo, ArrayList<String> ans){
        if(idx==digits.length()){
            ans.add(combo);
            return;
        }
        char currChar=digits.charAt(idx);
        String mapping=keypad[currChar-'2']; //this will give the current ascii value of that character
        for(int i=0;i<mapping.length();i++){
            printCombo(digits, idx+1, combo + mapping.charAt(i), ans);
        }
    }



}
