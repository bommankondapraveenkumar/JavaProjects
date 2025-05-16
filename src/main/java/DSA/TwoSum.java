package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] arr= {1,4,2,3,6,5,3,3,3,8};
        int[] result = twoSum(new int[]{1,2,4,3,32,4,34,32,3},6);
        System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b));
       // System.out.println(Arrays.stream(arr).max(Integer::compareTo));
        System.out.println(result[0] + ", " + result[1]);
    }
}
