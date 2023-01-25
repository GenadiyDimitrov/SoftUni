# Mid Exam Preparation – 15 February 2023

## Black Flag

**Link: <https://judge.softuni.org/Contests/Practice/Index/1773#0>**

*Pirates are invading the sea, and you're tasked to help them plunder*

Create a program that checks if **target plunder** is **reached**.
First, you will receive how many **days** the pirating lasts. Then you
will receive how much the pirates **plunder for a day**. Last you will
receive the **expected plunder** at the end.

Calculate how much **plunder** the pirates manage to **gather**. Each
**day** they gather the **plunder**. Keep in mind that they attack more
ships every third day and add additional plunder to their total gain,
which is **50% of the daily plunder**. Every **fifth day** the pirates
encounter a warship, and after the battle, they **lose 30%** of their
**total plunder**.

If the gained plunder is **more or equal** to the target, print the
following:

**"Ahoy\! {totalPlunder} plunder gained."**

If the gained plunder is **less** than the target. Calculate the
**percentage left** and print the following:

**"Collected only {percentage}% of the plunder."**

Both numbers should be **formatted** to the **2<sup>nd</sup> decimal
place**.

### Input

  - On the **1<sup>st</sup> line,** you will receive the **days of the
    plunder** – an **integer number** in the range \[0…100000\].

  - On the **2<sup>nd</sup> line,** you will receive the **daily
    plunder** – an **integer number** in the range \[0…50\].

  - On the **3<sup>rd</sup> line,** you will receive the **expected
    plunder** – a **real number** in the range \[0.0…10000.0\].

### Output

  - In the end, print whether the plunder **was successful** or **not,**
    following the format **described above**.

### Examples

<table>
<tbody>
<tr class="odd">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="even">
<td>5<br />
40<br />
100</td>
<td>Ahoy! 154.00 plunder gained.</td>
</tr>
<tr class="odd">
<td><strong>Comments</strong></td>
<td></td>
</tr>
<tr class="even">
<td>The days are 5, and the daily plunder is 40. On the third day, the total plunder is 120, and since it is a third day, they gain an additional 50% from the daily plunder, which adds up to 140. On the fifth day, the plunder is 220, but they battle with a warship and lose 30% of the collected cargo, and the total becomes 154. That is more than expected.</td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
</tr>
<tr class="even">
<td><p>10</p>
<p>20</p>
<p>380</p></td>
<td>Collected only 36.29% of the plunder.</td>
</tr>
</tbody>
</table>

## The Lift

**Link: <https://judge.softuni.org/Contests/Practice/Index/2517#1>**

Write a program that **finds a place for the tourist on a lift. **

Every wagon should have **a maximum of 4 people on it**. If a wagon is
full, you should direct the people to **the next one with space**
available.

### Input

  - **On the first line,** you will receive **how many people** are
    waiting to get **on the lift**

  - **On the second line**, you will receive the **current state of the
    lift separated by a single space:** **" "**.

### Output

**When there is no more available space left on the lift**, or there are
**no more people in the queue**, you should print on the console the
final state of the lift's wagons separated by **" "** and one of the
following messages:

  - If there are no more people and the lift have empty spots, you
    should print:

> **"The lift has empty spots\!**
> 
> **{wagons separated by ' '}"**

  - If there are still people in the queue and no more available space,
    you should print:

> **"There isn't enough space\! {people} people in a queue\!**
> 
> **{wagons separated by ' '}"**

  - If the lift is full and there are no more people in the queue, you
    should print only the wagons separated by **" "**

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
<td><p><strong>15</strong></p>
<p><strong>0 0 0 0</strong></p></td>
<td><p><strong>The lift has empty spots!</strong></p>
<p><strong>4 4 4 3</strong></p></td>
</tr>
<tr class="even">
<td><strong>Comment</strong></td>
<td></td>
</tr>
<tr class="odd">
<td><p><strong>First state - 4 0 0 0 -&gt; 11 people left</strong></p>
<p><strong>Second state – 4 4 0 0 -&gt; 7 people left</strong></p>
<p><strong>Third state – 4 4 4 0 -&gt; 3</strong> people <strong>left</strong></p></td>
<td></td>
</tr>
<tr class="even">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="odd">
<td><p><strong>20</strong></p>
<p><strong>0 2 0</strong></p></td>
<td><p><strong>There isn't enough space! 10 people in a queue!</strong></p>
<p><strong>4 4 4</strong></p></td>
</tr>
<tr class="even">
<td><strong>Comment</strong></td>
<td></td>
</tr>
<tr class="odd">
<td><p><strong>First state - 4 2 0 -&gt; 16 people left</strong></p>
<p><strong>Second state – 4 4 0 -&gt; 14 people left</strong></p>
<p><strong>Third state – 4 4 4 -&gt; 10</strong> people <strong>left, but there're no more wagons.</strong></p></td>
<td></td>
</tr>
</tbody>
</table>

## Numbers

**Link: <https://judge.softuni.org/Contests/Practice/Index/2474#2>**

Write a program to **read a sequence of integers** and find and print
the **top 5** numbers **greater than the average** value in the
sequence, sorted in descending order.

### Input

  - Read from the console a single line holding **space-separated
    integers**.

### Output

  - Print the above-described numbers on a single line, space-separated.

  - If **less than 5 numbers** hold the property mentioned above,
    **print less** than 5 numbers.

  - Print **"No"** if no numbers hold the above property.

### Constraints

  - All input **numbers** are integers in the **range** \[-1 000 000 …
    1 000 000\].

  - The **count of numbers** is in the **range** \[1…10 000\].

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
<td><strong>10 20 30 40 50</strong></td>
<td><strong>50 40</strong></td>
<td><p><strong>Average number = 30.</strong></p>
<p><strong>Numbers greater than 30 are: {40, 50}.</strong></p>
<p><strong>The top 5 numbers among them in descending order are: {50, 40}.</strong></p>
<p><strong>Note that we have only 2 numbers, so all of them are included in the top 5.</strong></p></td>
</tr>
<tr class="even">
<td><strong>5 2 3 4 -10 30 40 50 20 50 60 60 51</strong></td>
<td><strong>60 60 51 50 50</strong></td>
<td><p><strong>Average number = 28.08.</strong></p>
<p><strong>Numbers greater than 28.08 are:<br />
{30, 40, 50, 50, 60, 60, 51}.</strong></p>
<p><strong>The top 5 numbers among them in descending order are: {60, 60, 51, 50, 50}.</strong></p></td>
</tr>
<tr class="odd">
<td><strong>1</strong></td>
<td><strong>No</strong></td>
<td><p><strong>Average number = 1.</strong></p>
<p><strong>There are no numbers greater than 1.</strong></p></td>
</tr>
<tr class="even">
<td><strong>-1 -2 -3 -4 -5 -6</strong></td>
<td><strong>-1 -2 -3</strong></td>
<td><p><strong>Average number = -3.5.</strong></p>
<p><strong>Numbers greater than -3.5 are: {-1, -2, -3}.</strong></p>
<p><strong>The top 5 numbers among them in descending order are: {-1, -2, -3}.</strong></p></td>
</tr>
</tbody>
</table>
