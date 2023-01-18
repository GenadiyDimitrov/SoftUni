# More Exercise: **Basic Syntax, Conditional Statements and Loops**

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[Judge](https://judge.softuni.org/Contests/1461/).

## Sort Numbers

Read three real numbers and sort them in descending order. Print each
number on a new line.

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
<p>1</p>
<p>3</p></td>
<td><p><strong>3</strong></p>
<p><strong>2</strong></p>
<p><strong>1</strong></p></td>
</tr>
<tr class="even">
<td><p>-2</p>
<p>1</p>
<p>3</p></td>
<td><p><strong>3</strong></p>
<p><strong>1</strong></p>
<p><strong>-2</strong></p></td>
</tr>
<tr class="odd">
<td><p>0</p>
<p>0</p>
<p>2</p></td>
<td><p><strong>2</strong></p>
<p><strong>0</strong></p>
<p><strong>0</strong></p></td>
</tr>
</tbody>
</table>

## English Name of the Last Digit

Write a **method** that returns the **English name** of the last digit
of a given number. Write a program that reads an integer and prints the
returned value from this method.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 512       | two        |
| 1         | one        |
| 1643      | three      |

## Gaming Store

Write a program that helps you buy the games. The **valid games** are
the following games in this table:

| **Name**                   | **Price** |
| -------------------------- | --------- |
| OutFall 4                  | $39.99    |
| CS: OG                     | $15.99    |
| Zplinter Zell              | $19.99    |
| Honored 2                  | $59.99    |
| RoverWatch                 | $29.99    |
| RoverWatch Origins Edition | $39.99    |

On the first line, you will receive your **current balance** – a
**floating-point** number in the range **\[0.00…5000.00\]**.

Until you receive the command "**Game Time**", you have to keep **buying
games**. When a **game** is **bought**, the user's **balance** decreases
by the **price** of the game.

Additionally, the program should obey the following conditions:

  - If a game the user is trying to buy is **not present** in the table
    above, print "**Not Found**" and **read the next line**.

  - If at any point, the user has **$0** left, print "**Out of
    money\!**" and **end the program**.

  - Alternatively, if the user is trying to buy a game that they **can't
    afford**, print "**Too Expensive**" and **read the next line**.

When you receive "**Game Time**", **print** the user's **remaining
money** and **total spent on games**, **rounded** to the
**2<sup>nd</sup> decimal place**.

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
<td><p>120</p>
<p>RoverWatch</p>
<p>Honored 2</p>
<p>Game Time</p></td>
<td><p>Bought RoverWatch</p>
<p>Bought Honored 2</p>
<p>Total spent: $89.98. Remaining: $30.02</p></td>
</tr>
<tr class="even">
<td><p>19.99</p>
<p>Reimen origin</p>
<p>RoverWatch</p>
<p>Zplinter Zell</p>
<p>Game Time</p></td>
<td><p>Not Found</p>
<p>Too Expensive</p>
<p>Bought Zplinter Zell</p>
<p>Out of mo-ney!</p></td>
</tr>
<tr class="odd">
<td><p>79.99</p>
<p>OutFall 4</p>
<p>RoverWatch Origins Edition</p>
<p>Game Time</p></td>
<td><p>Bought OutFall 4</p>
<p>Bought RoverWatch Origins Edition</p>
<p>Total spent: $79.98. Remaining: $0.01</p></td>
</tr>
</tbody>
</table>

##  Reverse String

Write a program that reverses a string and prints it on the console.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| Hello     | olleH      |
| SoftUni   | inUtfoS    |
| 1234      | 54321      |

## Messages

Write a program that emulates **typing an SMS**, following this guide:

<table>
<thead>
<tr class="header">
<th><strong>1</strong></th>
<th><p><strong>2</strong></p>
<p>abc</p></th>
<th><p><strong>3</strong></p>
<p>def</p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>4</strong></p>
<p>ghi</p></td>
<td><p><strong>5</strong></p>
<p>jkl</p></td>
<td><p><strong>6</strong></p>
<p>mno</p></td>
</tr>
<tr class="even">
<td><p><strong>7</strong></p>
<p>pqrs</p></td>
<td><p><strong>8</strong></p>
<p>tuv</p></td>
<td><p><strong>9</strong></p>
<p>wxyz</p></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong>0</strong></p>
<p>space</p></td>
<td></td>
</tr>
</tbody>
</table>

Following the guide, **2** becomes "**a**", **22** becomes "**b**" and
so on.

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
<td><p>5</p>
<p>44</p>
<p>33</p>
<p>555</p>
<p>555</p>
<p>666</p></td>
<td>hello</td>
<td></td>
<td><p>9</p>
<p>44</p>
<p>33</p>
<p>999</p>
<p>0</p>
<p>8</p>
<p>44</p>
<p>33</p>
<p>777</p>
<p>33</p></td>
<td>hey there</td>
<td></td>
<td><p>7</p>
<p>6</p>
<p>33</p>
<p>33</p>
<p>8</p>
<p>0</p>
<p>6</p>
<p>33</p></td>
<td>meet me</td>
</tr>
</tbody>
</table>

### Hints

  - A native approach would be just putting all the possible
    combinations of digits in a giant **switch** statement.

  - A cleverer approach would be to come up with a **mathematical
    formula** that **converts** a **number** to its **alphabet**
    representation:

<table>
<thead>
<tr class="header">
<th><strong>Digit</strong></th>
<th>2</th>
<th>3</th>
<th>4</th>
<th>5</th>
<th>6</th>
<th>7</th>
<th>8</th>
<th>9</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><ul>
<li><p><strong>Index</strong></p></li>
</ul></td>
<td><ul>
<li><p>0 1 2</p></li>
</ul></td>
<td><ul>
<li><p>3 4 5</p></li>
</ul></td>
<td><ul>
<li><p>6 7 8</p></li>
</ul></td>
<td><ul>
<li><p>9 10 11</p></li>
</ul></td>
<td><ul>
<li><p>12 13 14</p></li>
</ul></td>
<td><ul>
<li><p>15 16 17 18</p></li>
</ul></td>
<td><ul>
<li><p>19 20 21</p></li>
</ul></td>
<td><ul>
<li><p>22 23 24 25</p></li>
</ul></td>
</tr>
<tr class="even">
<td><ul>
<li><p><strong>Letter</strong></p></li>
</ul></td>
<td><ul>
<li><p>a b c</p></li>
</ul></td>
<td><ul>
<li><p>d e f</p></li>
</ul></td>
<td><ul>
<li><p>g h i</p></li>
</ul></td>
<td><ul>
<li><p>j k l</p></li>
</ul></td>
<td><ul>
<li><p>m n o</p></li>
</ul></td>
<td><ul>
<li><p>p q r s</p></li>
</ul></td>
<td><ul>
<li><p>t u v</p></li>
</ul></td>
<td><ul>
<li><p>w x y z</p></li>
</ul></td>
</tr>
</tbody>
</table>

  - Let's take the number **222** (**c**), for example. Our algorithm
    would look like this:
    
      - Find the **number of digits** the number has "e.g. **222** -\>
        **3 digits**"
    
      - Find the **main digit** of the number "e.g. **222** -\> **2**"
    
      - Find the **offset** of the number. To do that, you can use the
        formula: **(main digit - 2) \* 3**
    
      - If the main digit is **8 or 9**, we need to **add 1** to the
        **offset** since the digits **7** and **9** have **4 letters
        each**
    
      - Finally, find the **letter index** (a -\> 0, c -\> 2, etc.). To
        do that, we can use the following formula: **(offset + digit
        length - 1)**.
    
      - After we've found the **letter index**, we can just add that to
        **the ASCII code** of the lowercase letter "**a**" (97)
