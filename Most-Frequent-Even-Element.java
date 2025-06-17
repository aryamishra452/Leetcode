class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxcount=0;
        int maxele=-1;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]%2==0)
            {
                if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
                else
                map.put(nums[i],1);
            if(maxcount<map.get(nums[i]))
            {
                maxcount=map.get(nums[i]);
                maxele=nums[i];
            }
            else if(maxcount==map.get(nums[i]) && maxele>nums[i])
                maxele = nums[i];
         }
         }
         return maxele;
    }
}