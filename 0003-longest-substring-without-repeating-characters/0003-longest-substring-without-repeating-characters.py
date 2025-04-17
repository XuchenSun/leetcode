class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        sub=''
        length=0
        for i in s:
            if i not in sub:
                sub+=i
            else:
                if length<len(sub):
                    length=len(sub)
                
                sub=sub[sub.index(i)+1:]+i
            
        return max(length,len(sub))
        
        
