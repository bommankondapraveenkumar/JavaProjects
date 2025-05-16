package comparableVsComparator;

import java.util.HashMap;

class Solution {
    /*
     **  Find the best average grade.
     */
    public static int bestAverageGrade(String[][] scores) {

        HashMap<String,int[]> map = new HashMap<>();
        if(scores==null|| scores.length==0){
            return 0;
        }
        for(String[] entry :scores){
            String name=entry[0];
            Integer score =Integer.parseInt(entry[1]);
            if(!map.containsKey(name)){
                map.put(name,new int[]{score,1});
            }else{
                int[] current =  map.get(name);
                current[0]+=score;
                current[1]+=1;
                map.put(name,current);
            }
        }
        int avg2=Integer.MIN_VALUE;
        for(int[] value: map.values()){
            int total=value[0];
            int count =value[1];
            int avg= (int) Math.floor((double) total/count);
            avg2=Math.max(avg2,avg);
        }
        return avg2;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass() {
        // TODO: implement more test cases
        String[][] tc1 = {
                {"Bobby", "-99"},
                {"Charles", "-77"},
                {"Eric", "-64"}};
//         [["Bobby", "87"],
//  **   ["Charles", "100"],
//  **   ["Eric", "64"],
//  **   ["Charles", "22"]].

        return bestAverageGrade(tc1) == 0;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args) {
        // Run the tests
        if (doTestsPass()) {
            System.out.println("All tests pass");
        }
        else {
            System.out.println("Tests fail.");
        }
    }
}