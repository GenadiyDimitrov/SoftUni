# More Exercise: Arrays

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[Judge](https://judge.softuni.org/Contests/1279).

## Encrypt, Sort and Print Array

Write a program that reads a **sequence of strings** from the console.
Encrypt every string by summing:

  - The code of **each vowel multiplied by the string length.**

  - The code of **each consonant is divided by the string length.**

**Sort** the **number** sequence in ascending order and print it on the
console.

On the first line, you will always receive the number of strings you
must read.

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
<td><p><strong>4</strong></p>
<p><strong>Peter</strong></p>
<p><strong>Maria</strong></p>
<p><strong>Katya</strong></p>
<p><strong>Todor</strong></p></td>
<td><p><strong>1032</strong></p>
<p><strong>1071</strong></p>
<p><strong>1168</strong></p>
<p><strong>1532</strong></p></td>
<td><p><strong>Peter = 1071</strong></p>
<p><strong>Maria = 1532</strong></p>
<p><strong>Katya = 1032</strong></p>
<p><strong>Todor = 1168</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>3</strong></p>
<p><strong>Sofia</strong></p>
<p><strong>London</strong></p>
<p><strong>Washington</strong></p></td>
<td><p><strong>1396</strong></p>
<p><strong>1601</strong></p>
<p><strong>3202</strong></p></td>
<td><p><strong>Sofia = 1601</strong></p>
<p><strong>London = 1396</strong></p>
<p><strong>Washington = 3202</strong></p></td>
</tr>
</tbody>
</table>

## Pascal Triangle

The triangle may be constructed in the following manner: In row 0 (the
topmost row), there is a unique nonzero entry 1. Each entry of each
subsequent row is constructed by adding the number above and to the left
with the number above and to the right, treating blank entries as 0. For
example, the initial number in the first (or any other) row is 1 (the
sum of 0 and 1), whereas the numbers 1 and 3 in the third row are added
to produce the number 4 in the fourth row.

If you want more info about it:
<https://en.wikipedia.org/wiki/Pascal's_triangle>

Print each row element, separated with whitespace.

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
<td><em>4</em></td>
<td><p><em>1</em></p>
<p><em>1 1</em></p>
<p><em>1 2 1</em></p>
<p><em>1 3 3 1</em></p></td>
</tr>
<tr class="even">
<td><em>13</em></td>
<td><p><em>1</em></p>
<p><em>1 1</em></p>
<p><em>1 2 1</em></p>
<p><em>1 3 3 1</em></p>
<p><em>1 4 6 4 1</em></p>
<p><em>1 5 10 10 5 1</em></p>
<p><em>1 6 15 20 15 6 1</em></p>
<p><em>1 7 21 35 35 21 7 1</em></p>
<p><em>1 8 28 56 70 56 28 8 1</em></p>
<p><em>1 9 36 84 126 126 84 36 9 1</em></p>
<p><em>1 10 45 120 210 252 210 120 45 10 1</em></p>
<p><em>1 11 55 165 330 462 462 330 165 55 11 1</em></p>
<p><em>1 12 66 220 495 792 924 792 495 220 66 12 1</em></p></td>
</tr>
</tbody>
</table>

### Hints

  - The input number **n** will be **1 \<= n \<= 60.**

  - Think about the proper **type** for elements in an array.

  - Don't be scared to use **more and more arrays.**

## Recursive Fibonacci

The Fibonacci sequence is quite a famous sequence of numbers. Each
sequence member is calculated from the sum of the two previous elements.
The **first two** elements are 1, 1. Therefore the sequence goes like 1,
1, 2, 3, 5, 8, 13, 21, 34…  
The following sequence can be generated with an array, but that's easy,
so your task is to implement it recursively.

So if the function **GetFibonacci(n)** returns the n’th Fibonacci number
we can express it using **GetFibonacci(n) = GetFibonacci(n-1) +
GetFibonacci(n-2).**

However, this will never end and in a few seconds, a StackOverflow
Exception is thrown. For the recursion to stop, it has to have a
"**bottom**". At the bottom of the recursion is **GetFibonacci(2)**
should return 1, and **GetFibonacci(1)** should return 1.

### Input

  - The user should enter the wanted Fibonacci number on the only line
    in the input.

### Output

  - The output should be the n'th Fibonacci number counting from 1.

### Constraints

  - 1 ≤ N ≤ 50

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 5         | 5          |
| 10        | 55         |
| 21        | 10946      |

For the Nth Fibonacci number, we calculate the N-1th and the N-2th
number, but for the calculation of the N-1th number, we calculate the
N-1-1th(N-2th) and the N-1-2th number, so we have a lot of repeated
calculations.

![](media/image1.png)

If you want to figure out how to skip those unnecessary calculations,
you can search for a technique called
[<span class="underline">memoization</span>](https://en.wikipedia.org/wiki/Memoization).

## Longest Increasing Subsequence (LIS)

Read a **list of integers** and find the **longest increasing
subsequence** (LIS). If several such exist, print the **leftmost**.

### Examples

| **Input**                               | **Output**         |
| --------------------------------------- | ------------------ |
| **1**                                   | **1**              |
| **7 3 5 8 -1 0 6 7**                    | **3 5 6 7**        |
| **1 2 5 3 5 2 4 1**                     | **1 2 3 5**        |
| **0 10 20 30 30 40 1 50 2 3 4 5 6**     | **0 1 2 3 4 5 6**  |
| **11 12 13 3 14 4 15 5 6 7 8 7 16 9 8** | **3 4 5 6 7 8 16** |
| **3 14 5 12 15 7 8 9 11 10 1**          | **3 5 7 8 9 11**   |

### Hints

  - Assume we have **n** numbers in an array **nums\[0…n-1\]**.

  - Let **len\[p\]** hold the length of the longest increasing
    subsequence (LIS) ending at position **p**.

  - In a for loop, we shall calculate **len\[p\]** for **p** = **0** …
    **n-1** as follows:
    
      - Let **left** be the leftmost position on the left of **p**
        (**left** \< **p**), such that **len\[left\]** is the largest
        possible.
    
      - Then, **len\[p\]** = **1** + **len\[left\]**. If **left** does
        not exist, **len\[p\]** = **1**.
    
      - Also, save **prev\[p\]** = **left** (we hold if **prev\[\]** the
        previous position, used to obtain the best length for position
        **p**).

  - Once the values for **len\[0**…**n-1\]** are calculated, restore the
    LIS starting from position **p** such that **len\[p\]** is maximal
    and go back and back through **p** = **prev\[p\]**.

  - The table below illustrates these computations:

| index    | 0     | 1      | 2     | 3        | 4           | 5       | 6         | 7           | 8              | 9              | 10    |
| -------- | ----- | ------ | ----- | -------- | ----------- | ------- | --------- | ----------- | -------------- | -------------- | ----- |
| nums\[\] | **3** | **14** | **5** | **12**   | **15**      | **7**   | **8**     | **9**       | **11**         | **10**         | **1** |
| len\[\]  | 1     | 2      | 2     | 3        | 4           | 3       | 4         | 5           | 6              | 6              | 1     |
| prev\[\] | \-1   | 0      | 0     | 2        | 3           | 2       | 5         | 6           | 7              | 7              | \-1   |
| LIS      | {3}   | {3,14} | {3,5} | {3,5,12} | {3,5,12,15} | {3,5,7} | {3,5,7,8} | {3,5,7,8,9} | {3,5,7,8,9,11} | {3,5,7,8,9,10} | {1}   |

## Kamino Factory

The clone factory in Kamino got another order to clone troops. But this
time, you are tasked to find **the best DNA** sequence to use in the
production.

You will receive the **DNA length,** and until you receive the command
**"Clone them\!"** you will be receiving **DNA sequences of ones and
zeroes, split by "\!"** **(one or several).**

You should select the sequence with the **longest subsequence of ones**.
If there are several sequences with the **same length of** a
**subsequence of ones**, print the one with the **leftmost** **starting
index**, if there are several sequences with the same **length and
starting index**, select the sequence with the **greater sum** of its
elements.

After you receive the last command **"Clone them\!",** you should print
the collected information in the following format:

"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."

"{DNA sequence, joined by space}"

### Input / Constraints

  - The **first line** holds the **length** of the **sequences** –
    **integer in the range \[1…100\].**

  - On the next lines, until you receive **"Clone them\!"** you will be
    receiving sequences (at least one) of ones and zeroes, **split by
    "\!"** (one or several).

###  Output

The output should be printed on the console and consists of two lines in
the following format:

"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."

"{DNA sequence, joined by space}"

###  Examples

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
<td><p>5</p>
<p>1!0!<strong>1!1</strong>!0</p>
<p>0!<strong>1!1</strong>!0!0</p>
<p>Clone them!</p></td>
<td><p>Best DNA sample 2 with sum: 2.</p>
<p>0 1 1 0 0</p></td>
<td>We receive 2 sequences with the <strong>same length</strong> <strong>of a subsequence of ones</strong>, but the second is printed because its subsequence starts at <strong>index[1].</strong></td>
</tr>
<tr class="even">
<td><p>4</p>
<p><strong>1!1</strong>!0!<strong>1</strong></p>
<p>1!0!0!1</p>
<p><strong>1!1</strong>!0!0</p>
<p>Clone them!</p></td>
<td><p>Best DNA sample 1 with sum: 3.</p>
<p>1 1 0 1</p></td>
<td>We receive 3 sequences. Both 1 and 3 <strong>have the same length</strong> of a subsequence of ones -&gt; 2, <strong>and both start from the index[0]</strong>, but the first is printed because its <strong>sum is greater.</strong></td>
</tr>
</tbody>
</table>

## LadyBugs

You are **given a field size** and the **indexes of ladybugs** inside
the field. After that, on every new line, **until the "end" command** is
given, a ladybug changes its position to its left or **right** **by a
given fly length**.

A **command to a ladybug** looks like this: "**0 right 1**". This means
that the little insect placed on index 0 should fly one index to its
right. If the ladybug **lands on a fellow ladybug**, it **continues to
fly** in the same direction **by the same fly length**. If the ladybug
**flies out of the field, it is gone**.

For example, imagine you are given a field with size 3 and ladybugs on
indexes 0 and 1. If the ladybug on index 0 needs to fly to its right by
the length of 1 (0 right 1) it will attempt to land on index 1, but as
there is another ladybug there, it will continue further to the right by
an additional length of 1, landing on index 2. After that, if the same
ladybug needs to fly to its right by the length of 1 (2 right 1), it
will land somewhere outside of the field, so it flies away:

![](media/image2.png)

If you are given a ladybug index that does not have a ladybug there,
nothing happens. If you are given a ladybug index that is outside the
field, nothing happens.

Your job is to create the program, simulating the ladybugs flying around
doing nothing. In the end, **print all cells in the field separated by
blank spaces**. For each cell that has a ladybug on it print '**1**' and
for each empty cell print '**0**'. For the example above, the output
should be **'0 1 0'**.

### Input

  - On the first line, you will receive an integer - the size of the
    field.

  - On the second line, you will receive the initial **indexes** of all
    ladybugs separated by a blank space. **The given indexes** may or
    may not be inside the field range.

  - On the next lines, until you get the "**end**" command you will
    receive commands in the format: "**{ladybug index} {direction} {fly
    length}**".

### Output

  - Print the **all cells within the field in format: "{cell} {cell} …
    {cell}"**
    
      - If a cell has a ladybug in it, print **'1'.**
    
      - If a cell is empty, print **'0'** .

### Constraints

  - The size of the field will be in the range **\[0 … 1000\].**

  - The ladybug indexes will be in the range **\[-2,147,483,647 …
    2,147,483,647\].**

  - The number of commands will be in the range **\[0 … 100\]**.

  - The fly length will be in the range **\[-2,147,483,647 …
    2,147,483,647\].**

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
<td><p><strong>3</strong></p>
<p><strong>0 1</strong></p>
<p><strong>0 right 1</strong></p>
<p><strong>2 right 1</strong></p>
<p><strong>end</strong></p></td>
<td><strong>0 1 0</strong></td>
<td><p><strong>1 1 0 - Initial field</strong></p>
<p><strong>0 1 1 - field after "0 right 1"</strong></p>
<p><strong>0 1 0 - field after "2 right 1"</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>3</strong></p>
<p><strong>0 1 2</strong></p>
<p><strong>0 right 1</strong></p>
<p><strong>1 right 1</strong></p>
<p><strong>2 right 1</strong></p>
<p><strong>end</strong></p></td>
<td><strong>0 0 0</strong></td>
<td></td>
</tr>
<tr class="odd">
<td><p><strong>5</strong></p>
<p><strong>3</strong></p>
<p><strong>3 left 2</strong></p>
<p><strong>1 left -2</strong></p>
<p><strong>end</strong></p></td>
<td><strong>0 0 0 1 0</strong></td>
<td></td>
</tr>
</tbody>
</table>
