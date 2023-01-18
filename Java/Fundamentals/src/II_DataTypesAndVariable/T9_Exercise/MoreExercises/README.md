# More Exercise: Data Types and Variables

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1270)

## Data Type Finder

You will receive input until you receive "**END**". Find what **data
type** is the input. Possible data types are:

  - Integer

  - Floating point

  - Characters

  - Boolean

  - Strings

Print the result in the following format: "**{input} is {data type}
type**".

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
<p>2.5</p>
<p>true</p>
<p>END</p></td>
<td><p>5 is integer type</p>
<p>2.5 is floating point type</p>
<p>true is boolean type</p></td>
</tr>
<tr class="even">
<td><p>a</p>
<p>asd</p>
<p>-5</p>
<p>END</p></td>
<td><p>a is character type</p>
<p>asd is string type</p>
<p>-5 is integer type</p></td>
</tr>
</tbody>
</table>

## From Left to the Right

You will receive a number representing how many lines we will get as
input. On the next N lines, you will receive a string with 2 numbers
separated by a single space. You need to compare them. If the left
number is greater than the right number, you need to print the sum of
all digits in the left number, otherwise, print the sum of all digits in
the right number.

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
<p>1000 2000</p>
<p>2000 1000</p></td>
<td><p>2</p>
<p>2</p></td>
</tr>
<tr class="even">
<td><p>4</p>
<p>123456 2147483647</p>
<p>5000000 -500000</p>
<p>97766554 97766554</p>
<p>9999999999 8888888888</p></td>
<td><p>46</p>
<p><strong>5</strong></p>
<p><strong>49</strong></p>
<p><strong>90</strong></p></td>
</tr>
</tbody>
</table>

## Floating Equality

Write a program that safely compares floating-point numbers (double)
with precision eps = 0.000001. Note that we cannot directly compare two
floating-point numbers **a** and **b** by a==b because of the nature of
the floating-point arithmetic. Therefore, we assume two numbers are
equal if they are closer to each other than some fixed constant eps.

You will receive two lines, each containing a floating-point number.
Your task is to compare the values of the two numbers.

### Examples

| **Number a** | **Number b** | **Equal (with precision eps=0.000001)** | **Explanation**                                                                      |
| ------------ | ------------ | --------------------------------------- | ------------------------------------------------------------------------------------ |
| 5.3          | 6.01         | False                                   | The difference of 0.71 is too big (\> eps)                                           |
| 5.00000001   | 5.00000003   | True                                    | The difference 0.00000002 \< eps                                                     |
| 5.00000005   | 5.00000001   | True                                    | The difference 0.00000004 \< eps                                                     |
| \-0.0000007  | 0.00000007   | True                                    | The difference 0.00000077 \< eps                                                     |
| \-4.999999   | \-4.999998   | False                                   | Border case. The difference 0.0000001== eps. We consider the numbers are different.  |
| 4.999999     | 4.999998     | False                                   | Border case. The difference 0.0000001 == eps. We consider the numbers are different. |

## 4\. Refactoring: Prime Checker

You are given a program that checks if numbers in a given range
\[2...N\] are prime. For each number is printed "**{number} -\> {true or
false}**". The code, however, is not very well written. Your job is to
modify it in a way that is easy to read and understand.

### Code

<table>
<thead>
<tr class="header">
<th><strong>Sample Code</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>Scanner chetec = <strong>new</strong> Scanner(System.<em><strong>in</strong></em>);<br />
<br />
<strong>int</strong> ___Do___ = Integer.<em>parseInt</em>(chetec.nextLine());<br />
<strong>for</strong> (<strong>int</strong> takoa = 2; takoa &lt;= ___Do___; takoa++) {<br />
<strong>boolean</strong> takovalie = <strong>true</strong>;<br />
<strong>for</strong> (<strong>int</strong> cepitel = 2; cepitel &lt; takoa; cepitel++) {<br />
<strong>if</strong> (takoa % cepitel == 0) {<br />
takovalie = <strong>false</strong>;<br />
<strong>break</strong>;<br />
}<br />
}<br />
System.<em><strong>out</strong></em>.printf(<strong>"%d -&gt; %b%n"</strong>, takoa, takovalie);<br />
}</td>
</tr>
</tbody>
</table>

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
<td>5</td>
<td><p>2 -&gt; true</p>
<p>3 -&gt; true</p>
<p>4 -&gt; false</p>
<p>5 -&gt; true</p></td>
</tr>
<tr class="even">
<td>7</td>
<td><p>2 -&gt; true</p>
<p>3 -&gt; true</p>
<p>4 -&gt; false</p>
<p>5 -&gt; true</p>
<p>6 -&gt; false</p>
<p>7 -&gt; true</p></td>
</tr>
</tbody>
</table>

## 5\. Decrypting Messages

You will receive a **key** (**integer**) and **n** characters afterward.
Add the key to each character and append them to the **message**. In the
end, print the message, which you decrypted.

### Input

  - On the **first line**, you will receive the **key.**

  - On the **second line**, you will receive **n** – the number of
    **lines** that will **follow.**

  - On the next **n lines** – you will receive **lower** and
    **uppercase** characters from the **Latin** alphabet.

### Output

Print the **decrypted message**.

### Constraints

  - The **key** will be in the interval **\[0…20\].**

  - **n** will be in the interval **\[1…20\].**

  - The **characters** will always be **upper** or **lower**-case
    letters from the **English alphabet.**

  - You will receive **one** **letter** per **line.**

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
<p><strong>7</strong></p>
<p><strong>P</strong></p>
<p><strong>l</strong></p>
<p><strong>c</strong></p>
<p><strong>q</strong></p>
<p><strong>R</strong></p>
<p><strong>k</strong></p>
<p><strong>f</strong></p></td>
<td>SoftUni</td>
<td></td>
<td><p><strong>1</strong></p>
<p><strong>7</strong></p>
<p><strong>C</strong></p>
<p><strong>d</strong></p>
<p><strong>b</strong></p>
<p><strong>q</strong></p>
<p><strong>x</strong></p>
<p><strong>o</strong></p>
<p><strong>s</strong></p></td>
<td><strong>Decrypt</strong></td>
</tr>
</tbody>
</table>

## Balanced Brackets

You will receive **n** lines. On **those** **lines**, you will receive
**one** of the following:

  - Opening bracket – "**(**"

  - Closing bracket – "**)**"

  - **Random string**

Your task is to find out if the **brackets** are **balanced**. That
means after every **closing** bracket should follow an **opening** one.
Nested parentheses are **not valid**, and if **two** **consecutive
opening brackets** exist, the expression should be marked as
**unbalanced**.

### Input

  - On the **first line**, you will receive **n** – the number of lines
    that will follow.

  - On the next **n** lines, you will receive "**(**", "**)**" or
    **another** string.

### Output

You must print "**BALANCED**" if the parentheses are balanced and
"**UNBALANCED**" otherwise.

### Constraints

  - **n** will be in the interval **\[1…20\].**

  - The length of the stings will be between **\[1…100\]** characters.

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
<td><p><strong>8</strong></p>
<p><strong>(</strong></p>
<p><strong>5 + 10</strong></p>
<p><strong>)</strong></p>
<p><strong>* 2 +</strong></p>
<p><strong>(</strong></p>
<p><strong>5</strong></p>
<p><strong>)</strong></p>
<p><strong>-12</strong></p></td>
<td><strong>BALANCED</strong></td>
<td></td>
<td><p><strong>6</strong></p>
<p><strong>12 *</strong></p>
<p><strong>)</strong></p>
<p><strong>10 + 2 -</strong></p>
<p><strong>(</strong></p>
<p><strong>5 + 10</strong></p>
<p><strong>)</strong></p></td>
<td><strong>UNBALANCED</strong></td>
</tr>
</tbody>
</table>
