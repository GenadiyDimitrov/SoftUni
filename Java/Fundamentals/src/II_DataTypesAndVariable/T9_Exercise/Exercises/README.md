# Exercise: Data Types and Variables

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1228)

## Integer Operations

Read **four integer** numbers. Add first to the second, divide (integer)
the sum by the third number, and multiply the result by the fourth
number. Print the result.

### Constraints 

  - The four numbers from the input are in the range **\[-2,147,483,648…
    2,147,483,647\].**

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
<td><p>10</p>
<p>20</p>
<p>3</p>
<p>3</p></td>
<td><strong>30</strong></td>
<td></td>
<td><p><strong>15</strong></p>
<p><strong>14</strong></p>
<p><strong>2</strong></p>
<p><strong>3</strong></p></td>
<td><strong>42</strong></td>
</tr>
</tbody>
</table>

## Sum Digits

You will be given a single **integer**. Your task is to find the **sum
of its digits**.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 245678    | **32**     |
| 97561     | **28**     |
| 543       | **12**     |

## Elevator

Calculate how many courses will be needed to **elevate n persons** by
using an elevator with a **capacity of p persons**.  
The input holds two lines: the **number of people n** and the **capacity
p** of the elevator.

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
<td><p><strong>17</strong></p>
<p><strong>3</strong></p></td>
<td><strong>6</strong></td>
<td><strong>5 courses * 3 people<br />
+ 1 course * 2 persons</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>5</strong></p></td>
<td><strong>1</strong></td>
<td><p><strong>All the people fit inside the elevator.</strong></p>
<p><strong>Only one course is needed.</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>10</strong></p>
<p><strong>5</strong></p></td>
<td><strong>2</strong></td>
<td><strong>2 courses * 5 people</strong></td>
</tr>
</tbody>
</table>

### Hints

  - You should **divide n by p**. This gives you the number of full
    courses (e.g. 17 / 3 = 5).

  - If **n** does not divide **p** without a remainder, you will need
    one additional partially full course (e.g. 17 % 3 = 2).

  - Another approach is to round up **n** **/** **p** to the nearest
    integer (ceiling), e.g. 17/3 = 5.67 -\> rounds up to 6.

  - Sample code for the round-up calculation:

![](media/image1.png)

## Sum of Chars

Write a program that **sums the ASCII codes** of **n** characters. Print
the **sum** on the console.

### Input

  - On the **first** **line**, you will receive **n** – the number of
    **lines** that **follow.**

  - On the next **n lines** – you will receive letters from the
    **Latin** alphabet.

### Output

Print the **total** **sum** in the following format:

"The sum equals: {totalSum}"

### Constraints

  - **n** will be in the interval **\[1…20\]**.

  - The **characters** will always be either **upper** or **lower**-case
    letters from the **English alphabet.**

  - You will always receive **one** **letter** per **line.**

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
<p><strong>A</strong></p>
<p><strong>b</strong></p>
<p><strong>C</strong></p>
<p><strong>d</strong></p>
<p><strong>E</strong></p></td>
<td>The sum equals: 399</td>
<td></td>
<td><p><strong>12</strong></p>
<p><strong>S</strong></p>
<p><strong>o</strong></p>
<p><strong>f</strong></p>
<p><strong>t</strong></p>
<p><strong>U</strong></p>
<p><strong>n</strong></p>
<p><strong>i</strong></p>
<p><strong>R</strong></p>
<p><strong>u</strong></p>
<p><strong>l</strong></p>
<p><strong>z</strong></p>
<p><strong>z</strong></p></td>
<td><strong>The sum equals: 1263</strong></td>
</tr>
</tbody>
</table>

## Print Part of the ASCII Table

Find online more information about [ASCII](http://www.ascii-code.com/)
(American Standard Code for Information Interchange) and write a program
that **prints part of the ASCII table** of characters at the console.  
On the **first line of input,** you will receive **the char index you
should start with,** and on the **second line - the index of the last
character** you should print.

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
<td><p>60</p>
<p>65</p></td>
<td>&lt; = &gt; ? @ A</td>
</tr>
<tr class="even">
<td><p>69</p>
<p>79</p></td>
<td>E F G H I J K L M N O</td>
</tr>
<tr class="odd">
<td><p>97</p>
<p>104</p></td>
<td>a b c d e f g h</td>
</tr>
<tr class="even">
<td><p>40</p>
<p>55</p></td>
<td>( ) * + , - . / 0 1 2 3 4 5 6 7</td>
</tr>
</tbody>
</table>

## Triples of Latin Letters

Write a program to read an integer **n** and print all **triples** of
the first **n small Latin letters**, ordered alphabetically:

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>3</strong></td>
<td><p><strong>aaa</strong></p>
<p><strong>aab</strong></p>
<p><strong>aac</strong></p>
<p><strong>aba</strong></p>
<p><strong>abb</strong></p>
<p><strong>abc</strong></p>
<p><strong>aca</strong></p>
<p><strong>acb</strong></p>
<p><strong>acc</strong></p>
<p><strong>baa</strong></p>
<p><strong>bab</strong></p>
<p><strong>bac</strong></p>
<p><strong>bba</strong></p>
<p><strong>bbb</strong></p>
<p><strong>bbc</strong></p>
<p><strong>bca</strong></p>
<p><strong>bcb</strong></p>
<p><strong>bcc</strong></p>
<p><strong>caa</strong></p>
<p><strong>cab</strong></p>
<p><strong>cac</strong></p>
<p><strong>cba</strong></p>
<p><strong>cbb</strong></p>
<p><strong>cbc</strong></p>
<p><strong>cca</strong></p>
<p><strong>ccb</strong></p>
<p><strong>ccc</strong></p></td>
<td><strong>2</strong></td>
<td>aaa<br />
aab<br />
aba<br />
abb<br />
baa<br />
bab<br />
bba<br />
bbb</td>
</tr>
</tbody>
</table>

### Hints

Perform 3 nested loops from **0** to **n-1**.

![](media/image2.png)

For each iteration, generate new letters.

![](media/image3.png)

Concat all characters in a string and print it. You can use
**String.format()**.

![](media/image4.png)

## Water Overflow

You have a **water** **tank** with a capacity of **255 liters**.  
On the next **n** lines, you will receive **liters of water**, which you
must **pour** into your **tank**.  
If the **capacity** is **not enough**, print "**Insufficient
capacity\!**" and **continue reading** the next line. On the last line,
print the **liters** in the **tank**.

### Input

The **input** will be on two lines:

  - On the **first** **line**, you will receive **n** – the number of
    **lines**, which will **follow**

  - On the next **n lines** – you receive **quantities** of water, which
    you have to **pour** into the **tank**

### Output

Every time you do not have **enough** **capacity** in the tank to pour
the given liters, **print**:

"Insufficient capacity\!".

On the last line, **print** only the **liters** in the **tank**.

### Constraints

  - **n** will be in the interval **\[1…20\].**

  - **liters** will be in the interval **\[1…1000\].**

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
<p>20</p>
<p>100</p>
<p>100</p>
<p>100</p>
<p>20</p></td>
<td><p>Insufficient capacity!</p>
<p>240</p></td>
<td></td>
<td><p><strong>1</strong></p>
<p>1000</p></td>
<td><p>Insufficient capacity!</p>
<p>0</p></td>
</tr>
</tbody>
</table>

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
<td><p><strong>7</strong></p>
<p>10</p>
<p>20</p>
<p>30</p>
<p>10</p>
<p>5</p>
<p>10</p>
<p>20</p></td>
<td>105</td>
<td></td>
<td><p><strong>4</strong></p>
<p>250</p>
<p>10</p>
<p>20</p>
<p>40</p></td>
<td><p>Insufficient capacity!</p>
<p>Insufficient capacity!</p>
<p>Insufficient capacity!</p>
<p>250</p></td>
</tr>
</tbody>
</table>

## Beer Kegs

Write a program that calculates the volume of **n** beer kegs.  
You will receive in total **3 \* n** lines. **Every three lines** will
hold **information** for a **single** keg.  
First up is the **model** of the keg, after that is the **radius** of
the keg, and lastly is the **height** of the keg.

Calculate the volume using the following formula: **π \* r^2 \* h**.

In the end, print the **model** of the **biggest** keg.

### Input

You will receive **3 \* n** lines. Each group of lines will be on a new
line:

  - First – **model** – **string**

  - Second –**radius** – **floating-point** number

  - Third – **height** – **integer** number

### Output

Print the **model** of the **biggest** keg.

### Constraints

  - **n** will be in the interval **\[1…10\].**

  - The **radius** will be a **floating-point number** in the interval
    **\[1…3.402823E+38\].**

  - The **height** will be an **integer** in the interval
    **\[1…2147483647\].**

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
<td><p><strong>3</strong></p>
<p><strong>Keg 1</strong></p>
<p><strong>10</strong></p>
<p><strong>10</strong></p>
<p><strong>Keg 2</strong></p>
<p><strong>20</strong></p>
<p><strong>20</strong></p>
<p><strong>Keg 3</strong></p>
<p><strong>10</strong></p>
<p><strong>30</strong></p></td>
<td>Keg 2</td>
<td></td>
<td><p><strong>2</strong></p>
<p><strong>Smaller Keg</strong></p>
<p><strong>2.41</strong></p>
<p><strong>10</strong></p>
<p><strong>Bigger Keg</strong></p>
<p><strong>5.12</strong></p>
<p><strong>20</strong></p></td>
<td><strong>Bigger Keg</strong></td>
</tr>
</tbody>
</table>

## \*Spice Must Flow 

*Spice is Love, Spice is Life. And most importantly, Spice must flow. It
must be extracted from the scorching sands of Arrakis, under the
constant threat of giant sandworms. The Duke has tasked you with
creating management software to make the work as efficient as possible.*

Write a program that calculates the **total amount** of spice extracted
from a source.  
The source has a **starting yield**, which indicates how much spice can
be mined on the **first day**. After it has been mined for a day, the
**yield drops** by 10, meaning on the second day, it'll produce 10 less
spice than on the first, on the third day 10 less than on the second,
and so on (see examples).  
A source is considered profitable only while its yield is **at least**
100 – when less than 100 spices are expected in a day, abandon the
source.

The mining crew **consumes** 26 spices **every day** at the end of their
shift and **an additional** 26 after the mine has been exhausted. Note
that the workers cannot consume more spice than there is in storage.

When the operation is complete, print on the console on two separate
lines how many days the mine has operated and the total amount of spice
extracted.

### Input 

You will receive a **number** representing the **starting yield** of the
source.

### Output 

Print on the console on **two separate lines** how many **days** the
mine has operated and the **total amount** of spice extracted.

###  Constraints 

  - The starting yield will be a positive **integer** within the range
    **\[0 … 2 147 483 647\].**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Explanation</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>111</td>
<td><p>2</p>
<p>134</p></td>
<td><p><strong>Day 1,</strong> we extract 111 spices, and at the end of the shift, the workers consume 26, leaving 85. The yield drops by 10 to 101.</p>
<p><strong>On day 2,</strong> we extract 101 spices, the workers consume 26, leaving 75. The total is 160, and the yield has dropped to 91.</p>
<p><strong>Since</strong> the expected yield is less than 100, we abandon the source. The workers take another 26, leaving 134. The mine has operated for 2 days.</p></td>
</tr>
<tr class="even">
<td>200</td>
<td><p>11</p>
<p>1338</p></td>
<td></td>
</tr>
</tbody>
</table>

## \*Poke Mon

A Poke Mon is a special type of pokemon which likes to Poke others. But
at the end of the day, the Poke Mon wants to keep statistics about how
many pokes it has managed to make.

The Poke Mon pokes his target and then proceeds to poke another target.
The **distance** between his **targets** **reduces** his **poke power**.

You will be **given** the **poke power** the Poke Mon has, **N** – an
**integer**.

Then you will be **given** the **distance** between the **poke
targets**, **M** – an **integer**.

Then you will be **given** the **exhaustionFactor** **Y** – an
**integer**.

![](media/image5.jpeg)Your task is to start **subtracting** **M** from
**N** until **N** becomes **less than M**, i.e. the Poke Mon does not
have enough power to reach the next target.  
**Every time** you **subtract M** from **N,** that means you've reached
a **target** and poked it successfully. **COUNT** how **many targets**
you've poked – **you'll need** that **count**.

The Poke Mon becomes gradually more exhausted. **IF** **N** **becomes
equal** to **EXACTLY 50 %** of its **original value**, you must
**divide** **N** by **Y**, if it is **POSSIBLE**. **This** **DIVISION**
is between **integers**.

If a division is **not possible**, you should **NOT** do it. Instead,
you should continue **subtracting**.

**After dividing**, you should **continue** subtracting from **N**,
until it becomes **less** than **M**.

When **N** becomes **less** than **M**, you must take **what has
remained** of **N** and the **count** of **targets** you've poked and
print them as output.

**NOTE**: When you are **calculating percentages**, you should be
**PRECISE** at **maximum**.

**Example**: **505** is **NOT EXACTLY 50 %** from **1000**, its **50.5
%**.

### Input

  - The input consists of **3 lines**.

  - On the **first line,** you will receive **N** – an **integer**.

  - On the **second line,** you will receive **M** – an **integer**.

  - On the **third line,** you will receive **Y** – an **integer**.

### Output

  - The output consists of **2 lines**.

  - On the **first line,** print **what has remained** of **N**, after
    **subtracting** from it.

  - On the **second line,** print the **count** of **targets**, you've
    managed to poke.

### Constraints

  - The integer **N** will be in the **range** **\[1, 2.000.000.000\]**.

  - The integer **M** will be in the **range** **\[1, 1.000.000\]**.

  - The integer **Y** will be in the **range** **\[0, 9\]**.

  - Allowed time / memory: **16 MB / 100ms**.

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
<td><p><strong>5</strong></p>
<p><strong>2</strong></p>
<p><strong>3</strong></p></td>
<td><p><strong>1</strong></p>
<p><strong>2</strong></p></td>
<td><p><strong>N = 5, M = 2, Y = 3.</strong></p>
<p><strong>We start subtracting M from N.</strong></p>
<p><strong>N – M = 3. 1 target poked.</strong></p>
<p><strong>N – M = 1. 2 targets poked.</strong></p>
<p><strong>N &lt; M.<br />
We print what has remained of N, which is 1.</strong></p>
<p><strong>We print the count of targets, which is 2.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>10</strong></p>
<p><strong>5</strong></p>
<p><strong>2</strong></p></td>
<td><p><strong>2</strong></p>
<p><strong>1</strong></p></td>
<td><p><strong>N = 10, M = 5, Y = 2.</strong></p>
<p><strong>We start subtracting M from N.</strong></p>
<p><strong>N – M = 5. (N is still not less than M, they are equal).</strong></p>
<p><strong>N became EXACTLY 50 % of its original value.</strong></p>
<p><strong>5 is 50 % from 10. So we divide N by Y.</strong></p>
<p><strong>N / Y = 5 / 2 = 2. (INTEGER DIVISION).</strong></p></td>
</tr>
</tbody>
</table>

## \*Snowballs

Tony and Andi love playing in the snow and having snowball fights, but
they always argue about which makes the best snowballs. They have
decided to involve you in their fray by making you write a program that
calculates snowball data and outputs the best snowball value.

You will receive **N** – an **integer**, the **number** of **snowballs**
being made by Tony and Andi.  
**For each snowball,** you will receive **3 input lines**:

  - On the **first line,** you will get the **snowballSnow** – an
    **integer**.

  - On the **second line,** you will get the **snowballTime** – an
    **integer**.

  - On the **third line,** you will get the **snowballQuality** – an
    **integer**.

**For each snowball,** you must **calculate** its **snowballValue** by
the following formula:

(snowballSnow / snowballTime) ^ snowballQuality

In the end, you must print the **highest** calculated **snowballValue**.

### Input

  - On the **first input line,** you will receive **N** – the **number**
    of **snowballs**.

  - On the **next N \* 3 input lines,** you will receive **data** about
    **snowballs**.

### Output

  - As output, you must print the **highest** calculated
    **snowballValue**, by the formula **specified above**.

  - The output format is:  
    "**{snowballSnow} : {snowballTime} = {snowballValue}
    ({snowballQuality})**"

### Constraints

  - The **number** of **snowballs** (**N**) will be an **integer** in
    the **range \[0, 100\]**.

  - The **snowballSnow** is an **integer** in the **range \[0, 1000\]**.

  - The **snowballTime** is an **integer** in the **range \[1, 500\]**.

  - The **snowballQuality** is an **integer** in the **range \[0,
    100\]**.

<!-- end list -->

  - Allowed working **time** / **memory**: **100ms** / **16MB**.

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
<p>10</p>
<p>2</p>
<p>3</p>
<p>5</p>
<p>5</p>
<p>5</p></td>
<td>10 : 2 = 125 (3)</td>
</tr>
<tr class="even">
<td><p>3</p>
<p>10</p>
<p>5</p>
<p>7</p>
<p>16</p>
<p>4</p>
<p>2</p>
<p>20</p>
<p>2</p>
<p>2</p></td>
<td>10 : 5 = 128 (7)</td>
</tr>
</tbody>
</table>
