Time complexity :O(log n)
Space complexity :O(1)  

import java.util.*;
public class MissingNumberSoultion 
{
 public static int missingNumber(int[] nums) 
{
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
         if(nums[nums.length-1]!=nums.length+1)
             return nums.length+1;
        if(nums[0]!=1)
            return 1;
        while(start!=end-1)
        {
            int mid=start+(end-start)/2;
            if(Math.abs(nums[start]-start)!=Math.abs(nums[mid]-mid))
            {
                end=mid;
            }
            else
            {
                start=mid;
            }
        }
        return nums[start]+1;
 }
public static void main(String[] args)
	{
		int ar[] = { 1, 2, 3, 4, 5, 6, 8 };
		System.out.println("Missing number: "
						+ missingNumber(ar));
	} 
}
