# More Exercises: Methods

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1294)

## Data Types

Write a program that, depending on the first line of the input, reads an
**int**, **double,** or **string**.

  - If the data type is **int**, multiply the number by 2.

  - If the data type is **real**, multiply the number by 1.5 and format
    it to the second decimal point.

  - If the data type is a **string**, surround the input with "$".

Print the result on the console.

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
<td><p>int</p>
<p>5</p></td>
<td>10</td>
</tr>
<tr class="even">
<td><p>real</p>
<p>2</p></td>
<td>3.00</td>
</tr>
<tr class="odd">
<td><p>string</p>
<p>hello</p></td>
<td>$hello$</td>
</tr>
</tbody>
</table>

### Hint

Try to solve the problem using only one method with different overloads.

## Center Point

You are given the coordinates of two points on a [Cartesian coordinate
system](https://en.wikipedia.org/wiki/Cartesian_coordinate_system) - X1,
Y1, X2, and Y2. **Create a method** that prints the point that is
closest to the center of the coordinate system (0, 0) in the format (X,
Y). If the points are at the same distance from the center, print only
the first one.

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
<td><p><strong>2</strong></p>
<p><strong>4</strong></p>
<p><strong>-1</strong></p>
<p><strong>2</strong></p></td>
<td><strong>(-1, 2)</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>-2</strong></p>
<p><strong>5</strong></p>
<p><strong>1</strong></p></td>
<td><strong>(4, -2)</strong></td>
</tr>
</tbody>
</table>

## Longer Line

You are given the coordinates of four points in the 2D plane. The first
and the second pair of points form two different lines. Print the longer
line in the format "**(X1, Y1)(X2, Y2)**" starting with the point that
is closer to the center of the coordinate system (0, 0) (You can reuse
the method that you wrote for the previous problem). If the lines are of
equal length, print only the first one.

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
<td><p><strong>2</strong></p>
<p><strong>4</strong></p>
<p><strong>-1</strong></p>
<p><strong>2</strong></p>
<p><strong>-5</strong></p>
<p><strong>-5</strong></p>
<p><strong>4</strong></p>
<p><strong>-3</strong></p></td>
<td><strong>(4, -3)(-5, -5)</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>6</strong></p>
<p><strong>-2</strong></p>
<p><strong>-1</strong></p>
<p><strong>2</strong></p>
<p><strong>4</strong></p>
<p><strong>7</strong></p>
<p><strong>3</strong></p></td>
<td><strong>(-2, -1)(4, 6)</strong></td>
</tr>
</tbody>
</table>

## Tribonacci Sequence

In the **"Tribonacci" sequence**, every number is formed by the **sum of
the previous 3**.

You are given a number **num**. Write a program that prints **num**
numbers from the Tribonacci sequence, each on a new line, starting from
1. The input comes as a parameter named **num**. The value **num** will
always be a positive integer.

### Examples

| **Input** | **Output** |  | **Input** | **Output**         |
| --------- | ---------- |  | --------- | ------------------ |
| 4         | 1 1 2 4    |  | 8         | 1 1 2 4 7 13 24 44 |

## Multiplication Sign

You are given a number **num1**, **num2,** and **num3**. Write a program
that finds if **num1 \* num2 \* num3** (the product) is **negative**,
**positive, or zero**. Try to do this **WITHOUT** multiplying the 3
numbers.

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
<td><p>2</p>
<p>3</p>
<p>-1</p></td>
<td>negative</td>
<td></td>
<td><p>2</p>
<p>3</p>
<p>1</p></td>
<td>positive</td>
</tr>
</tbody>
</table>

## Array Manipulator

Trifon has finally become a junior developer and has received his first
task. It's about manipulating an array of integers. He is not quite
happy about it, since he hates manipulating arrays. They will pay him a
lot of money, though, and he is willing to give somebody half of it if
to help him do his job. You, on the other hand, love arrays (and money)
so you decide to try your luck.

The array may be manipulated by one of the following commands:

  - **exchange {index}** – splits the array **after** the given index
    and exchanges the places of the two resulting subarrays. E.g. \[1,
    2, 3, 4, 5\] -\> **exchange 2** -\> result: **\[4, 5, 1, 2, 3\]**
    
      - If the index is outside the boundaries of the array, print
        "**Invalid index**".

  - **max** **even/odd** – returns the **INDEX** of the max even/odd
    element -\> \[1, 4, 8, 2, 3\] -\> **max odd** -\> print **4**

  - **min** **even/odd** – returns the **INDEX** of the min even/odd
    element -\> \[1, 4, 8, 2, 3\] -\> **min even** \> print **3**
    
      - If there are two or more equal **min/max** elements, return the
        index of the **rightmost** one.
    
      - If a **min/max even/odd** element **cannot** be found, print
        **"No matches"**.

  - **first {count}** **even/odd** – returns the first {count} elements
    -\> \[1, 8, 2, 3\] -\> **first 2 even** -\> print **\[8, 2\]**

  - **last {count}** **even/odd** – returns the last {count} elements
    -\> \[1, 8, 2, 3\] -\> **last 2 odd** -\> print **\[1, 3\]**
    
      - If the count is greater than the array length, print "**Invalid
        count**".
    
      - If there are **not** **enough** elements to satisfy the count,
        print as many as you can. If there are **zero** **even/odd**
        elements, print an empty array **"\[\]"**.

  - **end** – stop taking input and print the final state of the array.

### Input

  - The input data should be read from the console.

  - On the first line, the initial array is received as a line of
    integers, separated by a single space.

  - On the next lines, until the command "**end**" is received, you will
    receive the array manipulation commands.

  - The input data will always be valid and in the format described.
    There is no need to check it explicitly.

### Output

  - The output should be printed on the console.

  - On a separate line, print the output of the corresponding command.

  - On the last line, print the final array in **square brackets** with
    its elements separated by a comma and a space.

  - See the examples below to get a better understanding of your task.

### Constraints

  - The **number of input lines** will be in the range \[2 … 50\].

  - The **array elements** will be integers in the range \[0 … 1000\].

  - The **number of elements** will be in the range \[1 ... 50\].

  - The **split index** will be an integer in the range
    \[-2<sup>31</sup> … 2<sup>31</sup> – 1\].

  - **The first/last count** will be an integer in the range \[1 …
    2<sup>31</sup> – 1\].

  - There will **not** be redundant whitespace anywhere in the input.

  - Allowed working time for your program: 0.1 seconds. Allowed memory:
    16 MB.

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
<td><p>1 3 5 7 9</p>
<p>exchange 1</p>
<p>max odd</p>
<p>min even</p>
<p>first 2 odd</p>
<p>last 2 even</p>
<p>exchange 3</p>
<p>end</p></td>
<td><p>2</p>
<p>No matches</p>
<p>[5, 7]</p>
<p>[]</p>
<p>[3, 5, 7, 9, 1]</p></td>
</tr>
<tr class="even">
<td><p>1 10 100 1000</p>
<p>max even</p>
<p>first 5 even</p>
<p>exchange 10</p>
<p>min odd</p>
<p>exchange 0</p>
<p>max even</p>
<p>min even</p>
<p>end</p></td>
<td><p>3</p>
<p>Invalid count</p>
<p>Invalid index</p>
<p>0</p>
<p>2</p>
<p>0</p>
<p>[10, 100, 1000, 1]</p></td>
</tr>
<tr class="odd">
<td><p>1 10 100 1000</p>
<p>exchange 3</p>
<p>first 2 odd</p>
<p>last 4 odd</p>
<p>end</p></td>
<td><p>[1]</p>
<p>[1]</p>
<p>[1, 10, 100, 1000]</p></td>
</tr>
</tbody>
</table>
