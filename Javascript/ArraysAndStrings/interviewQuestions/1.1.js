/*

Implement an algorithm to determine if a string has unique characters.
* */

var uniqueCharacter = function (word) {

    for (let i = 0; i < word.length; i++) {
        for (let j = i + 1; j < word.length; j++) {
            if (word[i] === word[j]) {
                console.log('No unique strings')
                return false;
            }
        }
    }
    console.log('unique strings');
    return true;
}

uniqueCharacter('Thomas')