# Exercises: Methods

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1286)

## Smallest of Three Numbers

Write a method to print the smallest of three integer numbers. Use an
appropriate name for the method.

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
<td><p>2</p>
<p>5</p>
<p>3</p></td>
<td><strong>2</strong></td>
</tr>
<tr class="even">
<td><p>600</p>
<p>342</p>
<p>123</p></td>
<td><strong>123</strong></td>
</tr>
<tr class="odd">
<td><p>25</p>
<p>-21</p>
<p>4</p></td>
<td><strong>-21</strong></td>
</tr>
</tbody>
</table>

## Vowels Count

Write a method that receives a single string and prints the count of the
vowels. Use an appropriate name for the method.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| SoftUni   | 3          |
| Cats      | 1          |
| JS        | 0          |

## Characters in Range

Write a method that receives two characters and prints all the
characters in between them on a single line according to ASCII.

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
<td><p>a</p>
<p>d</p></td>
<td>b c</td>
</tr>
<tr class="even">
<td><p>#</p>
<p>:</p></td>
<td>$ % &amp; ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9</td>
</tr>
<tr class="odd">
<td><p>C</p>
<p>#</p></td>
<td>$ % &amp; ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; &lt; = &gt; ? @ A B</td>
</tr>
</tbody>
</table>

## Password Validator

Write a program that checks if a given password is valid. Password rules
are:

  - 6 – 10 characters **(inclusive)**;

  - Consists only of **letters** and **digits**;

  - Have at least **2** digits.

If a password is valid, print **"Password is valid"**. If it is not
valid, for every unfulfilled rule, print a message:

  - **"Password must be between 6 and 10 characters"**;

  - **"Password must consist only of letters and digits";**

  - **"Password must have at least 2 digits"**.

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
<td>logIn</td>
<td><p>Password must be between 6 and 10 characters</p>
<p>Password must have at least 2 digits</p></td>
</tr>
<tr class="even">
<td>MyPass123</td>
<td>Password is valid</td>
</tr>
<tr class="odd">
<td>Pa$s$s</td>
<td><p>Password must consist only of letters and digits</p>
<p>Password must have at least 2 digits</p></td>
</tr>
</tbody>
</table>

### Hints

Write a method for each rule.

## Add and Subtract

You will receive 3 **integers.** Write a method **sum** to get the sum
of the first two integers and **subtract** the method that subtracts the
third integer from the result from the sum method.

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
<td><p>23</p>
<p>6</p>
<p>10</p></td>
<td>19</td>
</tr>
<tr class="even">
<td><p>1</p>
<p>17</p>
<p>30</p></td>
<td>-12</td>
</tr>
<tr class="odd">
<td><p>42</p>
<p>58</p>
<p>100</p></td>
<td>0</td>
</tr>
</tbody>
</table>

## Middle Characters

You will receive a single string. Write a method that prints the middle
character. If the length of the string is even, there are two middle
characters.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| aString   | r          |
| someText  | eT         |
| 3245      | 24         |

## NxN Matrix

Write a method that receives a single integer **n** and prints an
**nxn** matrix with that number.

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
<td>3</td>
<td><p>3 3 3</p>
<p>3 3 3</p>
<p>3 3 3</p></td>
</tr>
<tr class="even">
<td>7</td>
<td><p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p>
<p>7 7 7 7 7 7 7</p></td>
</tr>
<tr class="odd">
<td>2</td>
<td><p>2 2</p>
<p>2 2</p></td>
</tr>
</tbody>
</table>

## Factorial Division

Read two integer numbers. Calculate the
[factorial](https://en.wikipedia.org/wiki/Factorial) of each number.
Divide the first result by the second and print the division formatted
to the second decimal point.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>5</strong></p>
<p><strong>2</strong></p></td>
<td><strong>60.00</strong></td>
<td></td>
<td><p><strong>6</strong></p>
<p><strong>2</strong></p></td>
<td><strong>360.00</strong></td>
</tr>
</tbody>
</table>

## Palindrome Integers

A **palindrome** is a number that reads the same backward as forward,
such as 323 or 1001. Write a program that reads a positive integer
number until you receive "**END**". For each numbered print, whether the
number is palindrome or not.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>123</strong></p>
<p><strong>323</strong></p>
<p><strong>421</strong></p>
<p><strong>121</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>false</strong></p>
<p><strong>true</strong></p>
<p><strong>false</strong></p>
<p><strong>true</strong></p></td>
<td></td>
<td><p><strong>32</strong></p>
<p><strong>2</strong></p>
<p><strong>232</strong></p>
<p><strong>1010</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>false</strong></p>
<p><strong>true</strong></p>
<p><strong>true</strong></p>
<p><strong>false</strong></p></td>
</tr>
</tbody>
</table>

## Top Number

Read an **integer** n from the console. Find all top numbers in the
range **\[1 … n\]** and print them. A top number holds the following
properties:

  - Its **sum of digits is divisible by 8**, e.g. 8, 16, 88.

  - Holds at least **one odd digit**, e.g. 232, 707, 87578.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>50</strong></td>
<td><p><strong>17</strong></p>
<p><strong>35</strong></p></td>
<td></td>
<td><strong>100</strong></td>
<td><p><strong>17</strong></p>
<p><strong>35</strong></p>
<p><strong>53</strong></p>
<p><strong>71</strong></p>
<p><strong>79</strong></p>
<p><strong>97</strong></p></td>
</tr>
</tbody>
</table>

##
