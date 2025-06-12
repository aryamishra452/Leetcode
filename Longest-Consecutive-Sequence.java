class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,max=1,count=1;
        if(n==0)
        return 0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            continue;
            else if(nums[i]==nums[i-1]+1)
            count++;
            else
            count=1;
            max=Math.max(max,count);
        }
        return max;
    }
}