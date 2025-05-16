package comparableVsComparator;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static String slidingSubString(String s){
        int left = 0,max=0;
        Set<Character> sets= new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(sets.contains(s.charAt(right))){
                sets.remove(s.charAt(left));
                left++;
            }
            sets.add(s.charAt(right));
            max=Math.max(max,right-left+1);//for counting the longest substring return int max
        }
        return sets.toString();
    }
    public static void main(String []args){
        System.out.println(slidingSubString("abccba"));
    }
}
