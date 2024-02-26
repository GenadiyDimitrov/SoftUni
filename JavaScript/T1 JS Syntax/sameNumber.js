/* 10.	Same Numbers
Write a function that takes an integer number as an input and check if all the digits in a given number are the same or not.
Print on the console true if all numbers are the same and false if not. On the next line print the sum of all digits.
The input comes as an integer number.
The output should be printed on the console.
Examples
Input	Output
2222222	true
        14
 */
function sameNumber(num) {
    let sum = 0;
    let arr = `${num}`.split('');
    let isSame = true;
    for (i = 0; i < arr.length; i++) {
        sum += Number(arr[i]);
        if (i < arr.length - 1) {
            if (isSame) {
                isSame = arr[i] == arr[i + 1];
            }
        }
    }
    console.log(isSame);
    console.log(sum);
}