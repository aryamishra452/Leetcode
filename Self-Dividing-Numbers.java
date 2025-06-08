class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {boolean b=true;
            int num=i;
            while(num>0)
            {
                int d=num%10;
                if(d==0||i%d!=0)
                {b=false;break;}
                num/=10;
            }
            if(b==true)
            list.add(i);
        }
        return list;
    }
}