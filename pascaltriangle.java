import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> s=new ArrayList<>();
				 for(int i=0;i<n;i++){
					 ArrayList<Long> s1=new ArrayList<>();
						 long y=1;
						 for(int j=0;j<=i;j++){
							 s1.add(y);
							 y=y*(i-j)/(j+1);

						 }
						 s.add(s1);
					 }
		     	 return s;			 
	}
}


// Sample Input 1 :
// 3
// 1
// 2
// 3
// Sample Output 1 :
// 1
// 1 
// 1 1 
// 1 
// 1 1 
// 1 2 1

//Link:https://www.naukri.com/code360/problems/pascal-s-triangle_1089580?interviewProblemRedirection=true&page=2&leftPanelTabValue=PROBLEM