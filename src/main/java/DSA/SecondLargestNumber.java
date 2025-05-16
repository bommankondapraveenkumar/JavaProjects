package DSA;

public class SecondLargestNumber {
    public static void main(String[] args){
        System.out.println(secondLarge(new int[]{1,2,4,5,67,8,90,8,7}));
    }
    public static int secondLarge(int[] arr){
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
