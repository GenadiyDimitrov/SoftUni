# Exercise: Basic Syntax, Conditional Statements and Loops

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[Judge](https://judge.softuni.org/Contests/1226).

## Ages

Write a program that determines whether a person is based on the given
age: baby, child, teenager, adult, or elder. The bounders are:

  - **0-2 – baby;**

  - **3-13 – child;**

  - **14-19 – teenager;**

  - **20-65 – adult;**

  - **\>=66 – elder;**

  - All the values are **inclusive**.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 20        | **adult**  |
| 1         | **baby**   |
| 100       | **elder**  |

## Division

You will be given an integer, and you have to print on the console
whether that number is divisible by the following numbers: 2, 3, 6, 7,
10. You should **always take the bigger division**. If the number is
divisible by both **2** and **3** it is also divisible by **6**, and you
should print only the division by 6. If a number is divisible by **2**
it is sometimes also divisible by **10**, and you should print the
division by 10. If the number is not divisible by any given number,
print "**Not divisible**"**.** Otherwise, print "**The number is
divisible by {number}**".

### Examples

| **Input** | **Output**                    |
| --------- | ----------------------------- |
| 30        | The number is divisible by 10 |
| 15        | The number is divisible by 3  |
| 12        | The number is divisible by 6  |
| 1643      | Not divisible                 |

## Vacation

You are given a group of people, type of the group, on which day of the
week they will stay. Based on that information, calculate how much they
must pay and print that price on the console. Use the table below. In
each cell is the price for a **single person**. The output should look
like that: "**Total price: {price}**". The price should be formatted to
the second decimal point.

|              | **Friday** | **Saturday** | **Sunday** |
| ------------ | ---------- | ------------ | ---------- |
| **Students** | 8.45       | 9.80         | 10.46      |
| **Business** | 10.90      | 15.60        | 16         |
| **Regular**  | 15         | 20           | 22.50      |

There are also discounts based on some conditions:

  - **Students –** if the group is bigger than or equal to 30 people,
    you should reduce the **total** price by 15%

  - **Business –** if the group is bigger than or equal to 100 people
    **10** of them can stay **for free.**

  - **Regular –** if the group is bigger than or equal to 10 and less
    than or equal to 20 reduce the **total** price by 5%

**You should reduce the prices in that EXACT order.**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>30</p>
<p>Students</p>
<p>Sunday</p></td>
<td>Total price: 266.73</td>
</tr>
<tr class="even">
<td><p>40</p>
<p>Regular</p>
<p>Saturday</p></td>
<td>Total price: 800.00</td>
</tr>
<tr class="odd">
<td><p>50</p>
<p>Business</p>
<p>Friday</p></td>
<td>Total price: 545.00</td>
</tr>
</tbody>
</table>

## Print and Sum

Write a program to display numbers from given start to given end and
their sum. All the numbers will be integers. On the first line, you will
receive the start number, on the second the end number.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>5</p>
<p>10</p></td>
<td><p>5 6 7 8 9 10</p>
<p>Sum: 45</p></td>
</tr>
<tr class="even">
<td><p>0</p>
<p>26</p></td>
<td><p>0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26</p>
<p>Sum: 351</p></td>
</tr>
<tr class="odd">
<td><p>50</p>
<p>60</p></td>
<td><p>50 51 52 53 54 55 56 57 58 59 60</p>
<p>Sum: 605</p></td>
</tr>
</tbody>
</table>

## Login

You will be given a string representing a username. The password will be
that username reversed. Until you receive the correct password, print on
the console "**Incorrect password. Try again.**". When you receive the
correct password, print "**User {username} logged in.**" However, on the
fourth try, if the password is still not correct, print "**User
{username} blocked\!**" and end the program.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Acer</p>
<p>login</p>
<p>go</p>
<p>let me in</p>
<p>recA</p></td>
<td><p>Incorrect password. Try again.</p>
<p>Incorrect password. Try again.</p>
<p>Incorrect password. Try again.</p>
<p>User Acer logged in.</p></td>
</tr>
<tr class="even">
<td><p>momo</p>
<p>omom</p></td>
<td>User momo logged in.</td>
</tr>
<tr class="odd">
<td><p>sunny</p>
<p>rainy</p>
<p>cloudy</p>
<p>sunny</p>
<p>not sunny</p></td>
<td><p>Incorrect password. Try again.</p>
<p>Incorrect password. Try again.</p>
<p>Incorrect password. Try again.</p>
<p>User sunny blocked!</p></td>
</tr>
</tbody>
</table>

## Strong Number

Write a program to check whether or not a given number is strong. A
number is strong if the sum of the Factorial of each digit is equal to
the number. For example 145 is a strong number, because **1\! + 4\! +
5\! = 145.** Print "**yes**" if the number is strong and "**no**" if the
number is not strong.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 2         | yes        |
| 3451      | no         |
| 40585     | yes        |

## Vending Machine

Your task is to calculate the total purchase price from a vending
machine. Until you receive "**Start**" you will be given different coins
that are being inserted into the machine. You have to sum them to have
the total money inserted. There is a problem though. Your vending
machine only works with **0.1**, **0.2**, **0.5, 1, and 2** coins. If
someone tries to insert some other coins, you have to display "**Cannot
accept {money}**", where the value is **formatted to the second digit
after the decimal point** and **not** add it to the total money. On the
next few lines until you receive "**End**" you will be given products to
purchase. Your machine has, however, only "**Nuts**", "**Water**",
"**Crisps**", "**Soda**", "**Coke**". The prices are: **2.0**, **0.7**,
**1.5**, **0.8**, **1.0** respectively. If the person tries to purchase
a not existing product, print "**Invalid product**". Be careful that the
person may try to purchase a product for which he doesn't have money. In
that case, print "**Sorry, not enough money**". If the person purchases
a product successfully print "**Purchased {product name}**". After the
"**End**" command, print the money that is left formatted to the second
decimal point in the format "**Change: {money left}**".

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>1</p>
<p>1</p>
<p>0.5</p>
<p>0.6</p>
<p>Start</p>
<p>Coke</p>
<p>Soda</p>
<p>Crisps</p>
<p>End</p></td>
<td><p>Cannot accept 0.60</p>
<p>Purchased Coke</p>
<p>Purchased Soda</p>
<p>Sorry, not enough money</p>
<p>Change: 0.70</p></td>
</tr>
<tr class="even">
<td><p>1</p>
<p>Start</p>
<p>Nuts</p>
<p>Coke</p>
<p>End</p></td>
<td><p>Sorry, not enough money</p>
<p>Purchased Coke</p>
<p>Change: 0.00</p></td>
</tr>
</tbody>
</table>

## Triangle of Numbers

Write a program that receives a number – **n** and prints a triangle
from **1 to n** as in the examples.

### Constraints

  - **n** will be in the interval **\[1...20\]**.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>3</td>
<td><p>1</p>
<p>2 2</p>
<p>3 3 3</p></td>
<td></td>
<td>5</td>
<td><p>1</p>
<p>2 2</p>
<p>3 3 3</p>
<p>4 4 4 4</p>
<p>5 5 5 5 5</p></td>
<td></td>
<td>6</td>
<td><p>1</p>
<p>2 2</p>
<p>3 3 3</p>
<p>4 4 4 4</p>
<p>5 5 5 5 5</p>
<p>6 6 6 6 6 6</p></td>
</tr>
</tbody>
</table>

## Orders

We are placing **N** orders at a time. You need to calculate the price
on the following formula:

((daysInMonth \* capsulesCount) \* pricePerCapsule)

### Input / Constraints

  - On the first line, you will receive integer **N** – the count of
    orders the shop will receive.

  - For each order, you will receive the following information:
    
      - Price per capsule - **floating-point number in the range
        \[0.00…1000.00\].**
    
      - Days – **integer** in the range **\[1…31\].**
    
      - Capsules count - **integer in the range \[0…2000\].**

The input will be in the described format, there is no need to check it
explicitly.

### Output

The output should consist of **N + 1** line. For each order, you must
print a single line in the following format:

  - **"The price for the coffee is: ${price}"**

On the last line, you need to print the total price in the following
format:

  - **"Total: ${totalPrice}"**

The **price must be formatted** to 2 decimal places.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Comments</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>1</p>
<p>1.53</p>
<p>30</p>
<p>8</p></td>
<td><p>The price for the coffee is: $367.20</p>
<p>Total: $367.20</p></td>
<td><p>We are given only 1 order. Then we use the formulas:</p>
<p><strong>orderPrice</strong> = 30 * 8 * 1.53 = 367.20</p></td>
</tr>
<tr class="even">
<td><p>2</p>
<p>4.99</p>
<p>31</p>
<p>3</p>
<p>0.35</p>
<p>31</p>
<p>5</p></td>
<td><p>The price for the coffee is: $464.07</p>
<p>The price for the coffee is: $54.25</p>
<p>Total: $518.32</p></td>
<td></td>
</tr>
</tbody>
</table>

## \*Padawan Equipment

Yoda is starting his newly created Jedi academy. So, he asked Master
George Lucas to **buy** the **needed equipment**. The number of
**items** depends on **how many students will sign up**. The equipment
for the Padawan contains **lightsabers, belts, and robes**.

You will be given **the amount of money George Lucas has**, the **number
of students,** and the **prices of each item**. You have to help George
Lucas **calculate** if the **money** he has is **enough to buy all of
the equipment** or how much more money he needs.  
Because the lightsabers sometimes break, George Lucas should **buy 10%
more**, **rounded up** to the next integer. Also, every **sixth belt is
free**.

### Input / Constraints

The input data should be read from the console. It will consist of
**exactly 5 lines**:

  - > The **amount of money** George Lucas has – the **floating-point
    > number** in the **range \[0.00…1,000.00\].**

  - > The **count of students – integer in the range \[0…100\].**

  - > The **price of lightsabers** for a **single saber – the
    > floating-point number** in the **range \[0.00…100.00\].**

  - > The **price of robes** for a **single robe – the floating-point
    > number** in the **range \[0.00…100.00\].**

  - > The **price of belts** for a **single** **belt – the
    > floating-point number** in the **range \[0.00…100.00\].**

The **input data will always be valid**. **There is no need to check it
explicitly**.

### Output

The output should be printed on the console.

  - **If the calculated price of the equipment is less or equal to the
    money George Lucas has:**

> "**The money is enough - it would cost {the cost of the
> equipment}lv.**"

  - **If the calculated price of the equipment is more than the money
    George Lucas has:**

> "**George Lucas will need {neededMoney}lv more.**"

  - **All prices** must be **rounded to two digits after the decimal
    point.**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Comments</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>100</p>
<p>2</p>
<p>1.0</p>
<p>2.0</p>
<p>3.0</p></td>
<td>The money is enough - it would cost 13.00lv.</td>
<td><p>Needed equipment for <strong>2</strong> padawans:</p>
<p><strong>sabresPrice</strong> * (<strong>studentsCount</strong> + 10%) + <strong>robesPrice</strong> * (<strong>studentsCount</strong>) + <strong>beltsPrice</strong> * (<strong>studentsCount - freeBelts</strong>)</p>
<p>1*(3) + 2*(2) + 3*(2) = 13.00</p>
<p>13.00 &lt;= 100 – the money will be enough.</p></td>
</tr>
<tr class="even">
<td><p>100</p>
<p>42</p>
<p>12.0</p>
<p>4.0</p>
<p>3.0</p></td>
<td>George Lucas will need 737.00lv more.</td>
<td><p>Needed equipment for <strong>42</strong> padawans:</p>
<p>12*47 + 4*42 + 3*35 = 837.00</p>
<p>837 &gt; 100 – need 737.00 lv. more.</p></td>
</tr>
</tbody>
</table>

## \*Rage Expenses

As a MOBA challenger player, Peter has the bad habit of trashing his PC
when he loses a game and rage quits. His gaming setup consists of a
**headset, mouse, keyboard, and display**. You will receive Peter's
**lost games count**.

Every **second** lost game, Peter trashes his **headset.**

Every **third** lost game, Peter trashes his **mouse**.

When Peter trashes **both** **his mouse and headset** in the **same**
lost game, he also trashes his **keyboard**.

**Every** **second time when he trashes his keyboard**, he also trashes
his **display**.

You will receive the price of each item in his gaming setup. Calculate
his rage expenses for renewing his gaming equipment.

### Input / Constraints

  - On the first input line - **lost games count** – integer in the
    range **\[0, 1000\]**.

  - On the second line – **headset price** - the floating-point number
    in the range **\[0, 1000\]**.

  - On the third line – **mouse price** - the floating-point number in
    the range **\[0, 1000\]**.

  - On the fourth line – **keyboard price** - the floating-point number
    in the range **\[0, 1000\]**.

  - On the fifth line – **display price** - the floating-point number in
    the range **\[0, 1000\]**.

### Output

  - As output you must print Peter's total expenses: **"Rage expenses:
    {expenses} lv."**

<!-- end list -->

  - Allowed working **time** / **memory**: **100ms** / **16MB**.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Comment</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>7</p>
<p>2</p>
<p>3</p>
<p>4</p>
<p>5</p></td>
<td>Rage expenses: 16.00 lv.</td>
<td>Trashed headset -&gt; 3 times<br />
Trashed mouse -&gt; 2 times<br />
Trashed keyboard -&gt; 1 time<br />
Total: 6 + 6 + 4 = 16.00 lv;</td>
</tr>
<tr class="even">
<td><p>23</p>
<p>12.50</p>
<p>21.50</p>
<p>40</p>
<p>200</p></td>
<td>Rage expenses: 608.00 lv.</td>
<td></td>
</tr>
</tbody>
</table>
