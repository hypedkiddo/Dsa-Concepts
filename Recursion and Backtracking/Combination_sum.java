import java.util.*;
public class Combination_sum {
    public static List<List<Integer>>  ans=new ArrayList<>();

    public static void getans(int[] arr,int tar,int idx,int sum,List<Integer> path) {
        if (sum == tar) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (sum > tar || idx >= arr.length) {
            return;
        }
        path.add(arr[idx]);
        getans(arr, tar, idx, sum + arr[idx], path);//allow reusing elements
        path.remove(path.size() - 1);
        getans(arr, tar, idx + 1, sum, path);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        getans(arr,target,0,0,new ArrayList<>());
        return ans;
    }


    public static void main(String[] args) {

    }
}
