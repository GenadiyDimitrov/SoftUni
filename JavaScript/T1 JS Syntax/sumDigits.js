/*6.	Sum Digits
Write a function, which will be given a single number. Your task is to find the sum of its digits.
*/
function sumDigits(num) {
    let sum = 0;
    let arr = `${num}`.split('');
    for (i = 0; i < arr.length; i++) {
        sum += Number(arr[i]);
    }
    console.log(sum);
}