// 2011
class Solution {
    public int finalValueAfterOperations(String[] operations) {
    
        
    int result=0;
        
    for(String operation : operations){//define an value search every item
            if(operation.equals("++X")||operation.equals("X++"))
                result++;
            else 
                result--;
        }
    return result;
    }
}
