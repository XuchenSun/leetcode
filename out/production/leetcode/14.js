/**14
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
     if (!strs.length) return "";

     let longest = "";
     let firstWord = strs[0];

     for (let i = 0; i < firstWord.length; i++) {
         let char = firstWord[i];

         for (let j = 1; j < strs.length; j++) {
             let otherWord = strs[j]
             let otherChar = otherWord[i];
             if (char !== otherChar || !otherChar)                      return longest;
         }

         longest += char;
     }

     return longest;
};
