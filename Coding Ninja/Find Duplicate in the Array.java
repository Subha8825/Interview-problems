import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
   HashSet<Integer> s = new HashSet<>();
        
        for (int num : arr) {
            if (s.contains(num)) {
                return num;
            }
            s.add(num);
        }
        return -1;  
    }
}

// Sample Input 1:
// 1
// 3
// 1 1 2
// Sample Output 1:
// 1

//Link:https://www.naukri.com/code360/problems/find-duplicate-in-array_1112602?interviewProblemRedirection=true&attempt_status=COMPLETED