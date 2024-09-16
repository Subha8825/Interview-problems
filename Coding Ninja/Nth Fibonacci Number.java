import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int n=1;
		int n2=1;
		int n3=0;
		ArrayList<Integer> s=new ArrayList<>();
		s.add(n);
		s.add(n2);
		for(int i=2;i<a;i++){
			n3=n+n2;
			s.add(n3);
			n=n2;
			n2=n3;
		}
		System.out.print(s.get(a-1));
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}

// Sample Input 1:
// 6


// Sample Output 1:
// 8

//Link:https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?interviewProblemRedirection=true&attempt_status=COMPLETED