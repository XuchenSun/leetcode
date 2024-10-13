/**9 JS toString()： int to string; split(""): string to array；reverse();join("");
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome=function(x){
    var input=x.toString();
    var reverse=x.toString().split("").reverse().join("");
    return input===reverse;
    
    
}
