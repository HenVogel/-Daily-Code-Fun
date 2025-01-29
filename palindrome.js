// Write a function that checks if a string input by the user is a palindrome.

// Programs to check if the string is palindrome or not

function checkPalindrome(string) {

    // Finds the length of a string
    const len = string.length;

    // Loops through half of the string
    for (let i = 0; i < len / 2; i++) {

        // Checks if first and last string are same
        if (string[i] !== string[len - 1 - i]) {
            return 'It is not a palindrome';
        }
    }
    return 'It is a palindrome';
}

// Takes input
const string = prompt('Enter a string: ');

// Calls the function
const value = checkPalindrome(string);

// Logs yeah im done commenting
console.log(value);