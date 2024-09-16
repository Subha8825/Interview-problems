public class Solution {
    public static int search(int []nums, int target) {
        int s=nums.length;
        int l=0;
        int r=s-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
             
        }
        return -1;
       
        
    }
}


// Sample Input 1:
// 7
// 1 3 7 9 11 12 45
// 3
// Sample Output 1:
// 1

//Link:https://www.naukri.com/code360/problems/binary-search_972?interviewProblemRedirection=true&attempt_status=COMPLETED