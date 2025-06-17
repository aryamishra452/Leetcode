class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int c1=0,c2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1)
            c1++;
            else if(nums[i]==ele2)
            c2++;
            else if(c1==0 && nums[i]!=ele2)
            {
                c1=1;
                ele1=nums[i];
            }
            else if(c2==0 && nums[i]!=ele1)
            {
            c2=1;
            ele2=nums[i];
            }
            else
            {
                c1--;
                c2--;
            }
        }  
        int c11=0,c22=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1)
            c11++;
            else if(nums[i]==ele2)
            c22++;
        }
        if(c11>n/3)
        list.add(ele1);
        if(c22>n/3)
        list.add(ele2);
        return list;
    }
}