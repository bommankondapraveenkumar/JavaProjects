package DSA;

import java.util.Arrays;

public class KthLargest {
    public static int kThLarge(int[] arr, int k) {
        Arrays.sort(arr);
           return arr[arr.length-k];
       // int[] arrStream = {2, 2, 4, 33, 2, 34, 323, 4, 3234, 323, 43, 4, 4, 34, 33, 43, 3, 3, 4};
        //   Arrays.asList(arrStream).stream().map(n->).filter(n%2)
      //  return arrStream;
    }
    public static void main(String[] args){
        System.out.println(kThLarge(new int[]{1, 4, 2, 2, 2, 4, 5, 8, 4, 3, 2, 3, 45}, 1));
    }
}
