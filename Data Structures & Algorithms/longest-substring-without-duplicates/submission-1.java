/*
I can fix the starting point and create a hashset and store that character and and move my substring ending pointer
 to right and check is it contains or not if not move my pointer and increase my count , if it contains move my starting point to next character and do the same process again 
 bRUTE FORCE -[zxyzxyz] 
 p1-z, p2=x->y->z - maxCount=3 
 p1=x, p2=y->z->x -maxCount=3
 p1=y 
 p1=z 
 TC- O(n2)
  Optimal -
  [zxyzxyz]
  P1=Z,P2=X ->Y->Z store maxCount 
  remove the p1 from set and add new character(p2) to set and move p1 to next character repeat this until p2 is string length
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int maxLength=0;
        int p1=0;
        for(int right=0;right<s.length();right++){
          char c=s.charAt(right);
          while(hs.contains(c)){
            hs.remove(s.charAt(p1));
            p1++;
          }
          hs.add(c);
          maxLength=Math.max(maxLength,right-p1+1);
        }
        return maxLength;
    }
}
/*
zxyzxyz - 
p1=0,p2=1
[z] 
loop - 
p2=1-x, max=2,[z,x] 
p2=2-y,max=3,[z,x,y]
p2=3-z, [x,y], p1=1;
p2=3-z, max=3, [x,y,z], p2=4
p2=4-x, [y,z],p1=2 
p2=4 -x, max=3, [y,z,x] ,p2=5
p2=5 -y [z,x] p1=3 
p2=5-y max=3, [z,x,y] p2=6
p2=6- z ,[x,y] p1=4
p2=6 -z ,max=3,[x,y,z], p2=7 


"xxxx" 
p1=0,p2=1 
[x]
loop -
p2=1-x , [],p1=1 
p2=1-x,max=1, [x],p2=2
p2=2 -x,[],p1=2
p2=2-x,[x],p2=3
p2=3-x,[],p1=3
p2=3-x,[x],p2=4

*/