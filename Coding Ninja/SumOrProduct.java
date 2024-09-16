import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

		// Write your code here
        long y=1;
        for(long i=2;i<=n;i++)
            {
            if(q==1)
                {
                y+=i;
                }
            else
                {
                y=(y*i)%1000000007;
                }
            }
        return y;       
                
                
	}
}

// Sample Input 1 :
// 2
// 4 1 
// 4 2
// Sample Output 1 :
// 10
// 24 

//Link:https://www.naukri.com/code360/problems/sum-or-product_920478?interviewProblemRedirection=true&attempt_status=COMPLETED