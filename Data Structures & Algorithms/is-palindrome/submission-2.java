class Solution {
    public boolean isPalindrome(String s) {
        int p1=0,p2=s.length()-1;
        while(p1<p2){
                while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
                 }

        while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2))) {
            p2--;
             }
            if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                System.out.println(p1+"->"+s.charAt(p1)+" - "+p2+"->"+s.charAt(p2));
                 return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
// "No lemon, no melon"
/* p1=0,p2=18 - match
p1=1,p2=17 - (o,o)- match
p1=2-3,p2=16 - (l,l) - match
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18
p1=0,p2=18

*/