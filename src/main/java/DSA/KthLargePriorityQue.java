package DSA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Collectors;

public class KthLargePriorityQue {

    public static int minHeap(int[] arr,int k){
         //   PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());//for smallest
      //  PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);//for largest
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for(int i=0;i<arr.length;i++){
                minHeap.add(arr[i]);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
           int kth= minHeap.peek();
        return kth;
    }
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(10);
        stack.push(11);
        System.out.println(maxStack(stack));
        System.out.println(KthLargePriorityQue.minHeap(new int[]{0,3,4,3,2,5,5,67,7,5,5,6,9,5,6,7},1));
    }


    public static int minheaps(int[] arr,Integer a){

        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(pr.size()>a){
                pr.poll();
            }
        }
        int k=pr.peek();
        return k;
    }

    static int maxStack(Stack n){
        Stack m= new Stack();
        m=n;
        int ret=Integer.MIN_VALUE;
        if(!m.isEmpty()){
            ret= (int) m.peek();
            return ret;
        }
        return 0;
    }
}

