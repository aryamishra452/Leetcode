class Solution {
    public boolean isPalindrome(String s) {
        String s2=\\;
        for(int i=0;i<s.length();i++)
        {   char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)==true)
            {
                s2+=Character.toLowerCase(ch);
            }
        }
        int i=0;
        int j=s2.length()-1;
        while(i<=j)
        {
            if(s2.charAt(i)==s2.charAt(j))
            {   i++;
                j--;
                continue;
            }
            else
            return false;
        }
        return true;
    }
}