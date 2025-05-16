package org.example;

public class MissingNumbers {

    public static void main(String[] args){
        int nums[] ={4,5,6,1,0,3,2,7,9};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =(n * (n + 1)) / 2;
        for (int num : nums) {
            sum -= num;
            System.out.println("Missing number is :: "+sum);
        }
        return sum;
    }
}
