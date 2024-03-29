# Exercise: Text Processing

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1670/Text-Processing-Exercise)

## Valid Usernames

Write a program that reads user names on a single line (joined by "**,**
") and prints all valid usernames.

A valid username is:

  - Has a **length** of between 3 and 16 characters.

  - **It contains** only letters, numbers, hyphens, and underscores.

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
<td><strong>sh, too_long_username, !lleg@l ch@rs, jeffbutt</strong></td>
<td><strong>jeffbutt</strong></td>
</tr>
<tr class="even">
<td><strong>Jeff, john45, ab, cd, peter-ivanov, @smith</strong></td>
<td><p><strong>Jeff</strong></p>
<p><strong>John45</strong></p>
<p><strong>peter-ivanov</strong></p></td>
</tr>
</tbody>
</table>

## Character Multiplier

Create a **method** that takes two strings as arguments and returns the
sum of their character codes multiplied (multiply str1\[0\] with
str2\[0\] and add to the total sum). Then continue with the next two
characters. If one of the strings is longer than the other, add the
remaining character codes to the total sum without multiplication.

### Examples

| **Input**    | **Output** |
| ------------ | ---------- |
| George Peter | 52114      |
| 123 522      | 7647       |
| love SoftUni | 45337      |

## Extract File

Write a program that reads the path to a file and subtracts the file
name and its extension.

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
<td>C:\Internal\training-internal\Template.pptx</td>
<td><p>File name: Template</p>
<p>File extension: pptx</p></td>
</tr>
<tr class="even">
<td>C:\Projects\Data-Structures\LinkedList.cs</td>
<td><p>File name: LinkedList</p>
<p>File extension: cs</p></td>
</tr>
</tbody>
</table>

## Caesar Cipher

Write a program that returns an encrypted version of the same text.
Encrypt the text by shifting each character with three positions
forward. For example, A would be replaced by D, B would become E, and so
on. Print the encrypted text.

### Examples

| **Input**              | **Output**                 |
| ---------------------- | -------------------------- |
| Programming is cool\!  | Surjudpplqj\#lv\#frro$     |
| One year has 365 days. | Rqh\#|hdu\#kdv\#698\#gd|v1 |

## Multiply Big Number

You are given two lines – the first one can be a really big number (0 to
10<sup>50</sup>). The second one will be a single-digit number (0 to 9).
You must display the product of these numbers.

Note: do not use the **BigInteger** class.

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
<td><p>23</p>
<p>2</p></td>
<td>46</td>
<td></td>
<td><p>9999</p>
<p>9</p></td>
<td>89991</td>
<td></td>
<td><p>923847238931983192462832102</p>
<p>4</p></td>
<td>3695388955727932769851328408</td>
</tr>
</tbody>
</table>

## Replace Repeating Chars

Write a program that reads a string from the console and replaces any
sequence of the same letters with a single corresponding letter.

### Examples

| **Input**               | **Output** |
| ----------------------- | ---------- |
| aaaaabbbbbcdddeeeedssaa | abcdedsa   |
| qqqwerqwecccwd          | qwerqwecwd |

## String Explosion

Explosions are marked with "**\>**". Immediately after the mark, there
will be an **integer**, which signifies the **strength** of the
explosion.

You should **remove x characters** (where **x** is the **strength** of
the explosion), **starting after** the punched **character** ("**\>**").

If you find **another** explosion mark ("**\>**") while you're deleting
characters, you should **add** the **strength** to your **previous**
**explosion**.

When all characters are processed, **print** the string **without** the
**deleted** **characters**.

You should **not** delete the **explosion** character – "**\>**", but
you should **delete** the **integers**, which represent the
**strength**.

### Input

You will receive a **single** **line** with the string.

### Output

Print what is left from the string after explosions.

### Constraints

  - > You will **always** receive **strength** for the punches.

  - > The path will consist only of letters from the **Latin**
    > **alphabet**, **integers,** and the char "**\>**".

  - > The strength of the punches will be in the interval **\[0…9\].**

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
<td><strong>abv&gt;1&gt;1&gt;2&gt;2asdasd</strong></td>
<td><strong>abv&gt;&gt;&gt;&gt;dasd</strong></td>
<td><p><strong>1<sup>st</sup> explosion is at index 3 and it is with a strength of 1. We delete only the digit after the explosion character. The string will look like this: abv&gt;&gt;1&gt;2&gt;2asdasd</strong></p>
<p><strong>2<sup>nd</sup> explosion is with strength one, and the string transforms to this: abv&gt;&gt;&gt;2&gt;2asdasd</strong></p>
<p><strong>3<sup>rd</sup> explosion is now with a strength of 2. We delete the digit, and we find another explosion. At this point, the string looks like this: abv&gt;&gt;&gt;&gt;2asdasd.</strong></p>
<p><strong>4<sup>th</sup> explosion is with strength 2. We have 1 strength left from the previous explosion, we add the strength of the current explosion to what is left, and that adds up to a total strength of 3. We delete the next three characters, and we receive the string abv&gt;&gt;&gt;&gt;dasd</strong></p>
<p><strong>We do not have any more explosions, and we print the result: abv&gt;&gt;&gt;&gt;dasd</strong></p></td>
</tr>
<tr class="even">
<td><strong>peter&gt;2sis&gt;1a&gt;2akarate&gt;4hexmaster</strong></td>
<td><strong>peter&gt;is&gt;a&gt;karate&gt;master</strong></td>
<td></td>
</tr>
</tbody>
</table>

## \*Letters Change Numbers

Nakov likes Math. But he also likes the English alphabet a lot. He
invented a game with numbers and letters from the **English** alphabet.
The game was simple. You get a string consisting of a **number between
two letters**. Whether the letter was in front of the number or after
it, you would perform different mathematical operations on the number to
achieve the result.

**First,** you start with the letter **before** the number.

  - If it's **uppercase,** you **divide** the number by the letter's
    **position** in the alphabet.

  - If it's **lowercase,** you **multiply** the number with the letter's
    **position** in the alphabet.

**Then** you move to the **letter after** the number.

  - If it's **uppercase,** you **subtract** its position from the
    resulted number.

  - If it's **lowercase,** you **add** its position to the resulted
    number.

But the game became too easy for Nakov was really quick. He complicated
it a bit by doing the same but with **multiple** strings keeping track
of only the **total sum** of all results. Once he started to solve this
with more strings and bigger numbers, it became quite hard to do it only
in his mind. So he kindly asks you to write a program that **calculates
the sum of all numbers after the operations on each number have been
done**.

**For example**, you are given the sequence "**A12b s17G**":

We have two strings – **"A12b"** and **"s17G"**. We do the operations on
each and sum them. We start with the letter before the number on the
first string. **A is Uppercase,** and its position in the alphabet is
**1**. So we divide the number 12 by position 1 (**12/1 = 12**). Then we
move to the letter after the number. **b is lowercase,** and its
position is 2. So we add 2 to the resulting number (**12+2=14**).
Similarly, for the second string **s is lowercase,** and its position is
19, so we multiply it with the number (**17\*19 = 323**). Then we have
Uppercase G with position 7, subtracting it from the resulting
number (**323 – 7 = 316**). Finally, we sum the 2 results and get **14
+ 316=330**.

### Input

The input comes from the console as a **single line, holding the
sequence of strings**. Strings are separated by **one or more white
spaces**.

The input data will always be valid and in the format described. There
is no need to check it explicitly.

### Output

Print a single number at the console: the total sum of all processed
numbers rounded to **two digits** after the decimal separator.

### Constraints

  - The **count** of the strings will be in the range **\[1 … 10\].**

  - The numbers between the letters will be integers in the range **\[1
    … 2 147 483 647\].**

  - > Time limit: 0.3 sec. Memory limit: **16MB**.

### Examples

| **Input**            | **Output** | **Comment**                                             |
| -------------------- | ---------- | ------------------------------------------------------- |
| A12b s17G            | 330.00     | 12/1=12, 12+2=14, 17\*19=323, 323–7=316, **14+316=330** |
| P34562Z q2576f H456z | 46015.13   |                                                         |
| a1A                  | 0.00       |                                                         |
