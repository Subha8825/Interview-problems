
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int y=arr.size();
        int j=1;
        for(int i=m+1;i<(m+1+(y-(m+1))/2);i++){
            int temp=arr.get(i);
            arr.set(i,arr.get(y-j));
            arr.set(y-j,temp);
            j++;
        }
        
    }
}

// Sample Input 1:
// 2
// 6 3
// 1 2 3 4 5 6
// 5 2
// 10 9 8 7 6
// Sample Output 1:
// 1 2 3 4 6 5
// 10 9 8 6 7


//Link:https://www.naukri.com/code360/problems/reverse-the-array_1262298?interviewProblemRedirection=true&attempt_status=COMPLETED
