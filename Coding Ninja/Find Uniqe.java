import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
      Set<Integer> s=new HashSet<>();
      for(int i:arr){
        if(!s.contains(i)){
          s.add(i);
            }
            else{
              s.remove(i);
            }
          
        }
        for(int j:s){
          return j;
        }
        return -1;
     
		//Your code goes here
    }
}


// Sample Input 1:
// 1
// 7
// 2 3 1 6 3 6 2
// Sample Output 1:
// 1

//Link:https://www.naukri.com/code360/problems/find-unique_625159?interviewProblemRedirection=true&attempt_status=COMPLETED