package comparableVsComparator;

public class MaxPalindrome {
        public static String longestPalindrome(String s) {
            int len=s.length();
            String pal="";
            for(int i=0;i<len;i++){
                for(int j=len-1;j>i;j--){
                    if(s.charAt(i)==s.charAt(j)){
                        pal+=s.charAt(i);
                    }
                }
            }
            return pal;
        }
    public static void main(String[] args){
        System.out.println(longestPalindrome("pravvveen"));
    }
}
