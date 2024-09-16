import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> o=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    int p[]=new int[2];
                    p[0]=Math.min(arr[i],arr[j]);
                    p[1]=Math.max(arr[i],arr[j]);
                    o.add(p);
                }
            }
        }
        o.sort((a,b)->{if (a[0]!=b[0]) return a[0]-b[0] ;
        else return a[1]-b[1];
        });
        return o;
        // Write your code here.
    }
}

// Sample Input 1:
// 5 5
// 1 2 3 4 5
// Sample Output 1:
// 1 4
// 2 3

//Link:https://www.naukri.com/code360/problems/pair-sum_697295?interviewProblemRedirection=true&attempt_status=COMPLETED