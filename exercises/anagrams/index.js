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

        let strA = stringA.replace(/[^\w]/g,"").toLowerCase().split('').sort().join('');
        let strB = stringB.replace(/[^\w]/g,"").toLowerCase().split('').sort().join('');

        if(strA == strB){
            return true;
        }else{
            return false;
        }
}



module.exports = anagrams;


// function anagrams(stringA, stringB) {

//     let strA = charMap(stringA)
//     let strB = charMap(stringB)

//     if(Object.keys(strA).length !== Object.keys(strB).length){
//         return false;
//     }

//     for(let char in strA){
//         if(strA[char] !== strB[char]){
//             return false;
//         }
//     }
//     return true;
// }

// function charMap(str){
//     const chars = {};

//      for (let char of str.replace(/[^\w]/g,"").toLowerCase()){
//          chars[char] =  chars[char] + 1 || 1;
//      }
//      return chars
// }