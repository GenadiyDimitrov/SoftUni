/* 9.	Fruit
Write a function that calculates how much money you need to buy fruit. 
You will receive a string for the type of fruit you want to buy, 
a number for weight in grams, 
and another number for the price per kilogram. 
Print the following text on the console:  
`I need ${money} to buy {weight} kilograms {fruit}.`
Print the weight and the money rounded to two decimal places.
The input comes as three arguments passed to your function.
The output should be printed on the console.
Examples
Input	Output
'orange', 2500, 1.80	I need $4.50 to buy 2.50 kilograms orange.

Input	Output
'apple', 1563, 2.35	I need $3.67 to buy 1.56 kilograms apple.
 */
function calculate(fruit, weight, pricePerKilo) {
    let weightInKg = weight / 1000;
    let money = weightInKg * pricePerKilo;
    console.log(`I need $${money.toFixed(2)} to buy ${weightInKg.toFixed(2)} kilograms ${fruit}.`);
}
calculate('orange', 2500, 1.80);