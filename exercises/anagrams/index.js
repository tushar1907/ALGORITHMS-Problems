// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

function anagrams(stringA, stringB) {

    let strA = stringA.replace(/[^\w]/g,"").toLowerCase();
    let strB = stringB.replace(/[^\w]/g,"").toLowerCase();

    if(strA.length === strB.length){
        for(let char in strA){
            if(charMap(strA)[char]!==charMap(strB)[char]){
                return false
            }
        }
        return true
    }else{
        return false
    }
}

function charMap(str){
    const chars = {};

     for (let char of str){
         chars[char] =  chars[char] + 1 || 1;
     }
     return chars
}

module.exports = anagrams;
