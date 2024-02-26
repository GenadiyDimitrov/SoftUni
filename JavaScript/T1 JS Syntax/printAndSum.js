/*4.	Print and Sum
Write a function that displays numbers from given start to given end and their sum. 
The input comes as two number parameters. Print the result like the examples below:
Examples
Input	Output
5, 10	5 6 7 8 9 10
        Sum: 45
*/
function printSum(a, b) {
    let sum = 0;
    let firstRow = "";
    for (let i = a; i <= b; i++) {
        sum += i;
        firstRow += " " + i;
    }
    console.log(firstRow.trim());
    console.log(`Sum: ${sum}`);
}

printSum(5, 10);