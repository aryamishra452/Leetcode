class Solution {
    public int majorityElement(int[] nums) {
        int count=0,ele=nums[0];
        for(int i:nums)
        {
            if(i==ele)
            count++;
            else if(count==0)
            ele=i;
            else
            count--;
        } 
        return ele;
    }
}