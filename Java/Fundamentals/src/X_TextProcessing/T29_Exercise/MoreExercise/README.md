# More Exercises: Strings and Text Processing

Problems for exercises and homework for the
[<span class="underline">"Programming Fundamentals" course @
SoftUni</span>](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
<span class="underline">[Judge](https://judge.softuni.org/Contests/1674/Text-Processing-More-Exercise).</span>

## Extract Person Information

Write a program that reads **n** lines of strings and extracts the
**name** and **age** of a given person. The person's name will be
**between** "**@**" and "**|**". The person's **age** will be
**between** "**\#**" and "**\***".

**Example:** "**Hello my name is @Peter| and I am \#20\* years old.**"

**For each** found name and age, **print** a line in the following
format **"{name} is {age} years old."**

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
<p>Here is a name @George| and an age #18*</p>
<p>Another name @Billy| #35* is his age</p></td>
<td><p>George is 18 years old.</p>
<p>Billy is 35 years old.</p></td>
</tr>
<tr class="even">
<td><p>3</p>
<p>random name @lilly| random digits #5* age</p>
<p>@Marry| with age #19*</p>
<p>here Comes @Garry| he is #48* years old</p></td>
<td><p>lilly is 5 years old.</p>
<p>Marry is 19 years old.</p>
<p>Garry is 48 years old.</p></td>
</tr>
</tbody>
</table>

## Ascii Sumator

Write a program that prints a **sum of all characters between two given
characters** (their **ASCII code**). In the **first line,** you will get
a **character**. In the **second line,** you get **another character**.
On the **last line,** you get a **random string**. Find all the
characters **between the two given** and **print their ASCII sum**.

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
<td><p>.</p>
<p>@</p>
<p>dsg12gr5653feee5</p></td>
<td>363</td>
</tr>
<tr class="even">
<td><p>?</p>
<p>E</p>
<p>@ABCEF</p></td>
<td>262</td>
</tr>
</tbody>
</table>

## \*\*Treasure Finder

Write a program that **decrypts a message** by a given **key** and
gathers information about the hidden **treasure type** and its
**coordinates.** On the **first line,** you will receive a **key
(sequence of numbers).** On the **next few lines, until you receive
"find",** you will get lines of **strings**. You have to **loop through
every string** and **decrease the ASCII code of each character** with a
**corresponding number of the key** sequence. The way you choose a key
number from the sequence is by just **looping through it**. If the
**length of the key** sequence is **less than the string** sequence, you
start **looping from the beginning of the key.** For more clarification,
see the example below. **After decrypting** the message, you will **get
a type of treasure and its coordinates.** The **type** will be
**between** the symbol "**&**" and the coordinates will be between the
symbols "**\<**" and "**\>**". For each line **print the type and the
coordinates** in format **"Found {type} at {coordinates}".**

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
<td><p>1 2 1 3</p>
<p>ikegfp'jpne)bv=41P83X@</p>
<p>ujfufKt)Tkmyft'duEprsfjqbvfv=53V55XA</p>
<p>find</p></td>
<td><p>Found gold at 10N70W</p>
<p>Found Silver at 32S43W</p></td>
<td><p>We start looping through the first string and the key. When we reach the end of the key, we start looping from the beginning of the key, but we continue looping through the string. (until the string is over)</p>
<p>The first message is: <strong>"hidden&amp;gold&amp;at&lt;10N70W&gt;"</strong> so we print we found gold at the given coordinates</p>
<p>We do the same for the second string</p>
<p><strong>"thereIs&amp;Silver&amp;atCoordinates&lt;32S43W&gt;"</strong>(starting from the beginning of the key and the beginning of the string)</p></td>
</tr>
<tr class="even">
<td><p>1 2 2</p>
<p>nqtf(ujnxft(gtqn&gt;Uphkb@</p>
<p>find</p></td>
<td>Found silver at Sofia</td>
<td></td>
</tr>
</tbody>
</table>

## \*Morse Code Translator

Write a program that translates messages from **Morse code to English**
(**capital letters).** Use
[this](https://morsecode.world/international/morse2.html) page to help
you (**without the numbers**). The words will be separated by a **space
(' ')**. There will be a "**|**" character which you should **replace
with ' '** (space).

### Examples

| **Input**                                                                                | **Output**                   |
| ---------------------------------------------------------------------------------------- | ---------------------------- |
| .. | -- .- -.. . | -.-- --- ..- | .-- .-. .. - . | .- | .-.. --- -. --. | -.-. --- -.. . | I MADE YOU WRITE A LONG CODE |
| .. | .... --- .--. . | -.-- --- ..- | .- .-. . | -. --- - | -- .- -..                    | I HOPE YOU ARE NOT MAD       |

## HTML

You will receive **3 lines** of input. On the **first line,** you will
receive a **title of an article**. On the **next line,** you will
receive the **content of that article**. On the next **n** lines, until
you receive "**end of comments**", you will get the **comments about the
article**. Print the **whole information in HTML format**. The **title**
should be in "**h1**" **tag (\<h1\>\</h1\>);** the **content** in
**article tag (\<article\>\</article\>);** each **comment** should be in
**div tag (\<div\>\</div\>).** For more clarification, see the example
below

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
<td><p>SoftUni Article</p>
<p>Some content of the SoftUni article</p>
<p>some comment</p>
<p>more comment</p>
<p>last comment</p>
<p>end of comments</p></td>
<td><p>&lt;h1&gt;</p>
<p>SoftUni Article</p>
<p>&lt;/h1&gt;</p>
<p>&lt;article&gt;</p>
<p>Some content of the SoftUni article</p>
<p>&lt;/article&gt;</p>
<p>&lt;div&gt;</p>
<p>some comment</p>
<p>&lt;/div&gt;</p>
<p>&lt;div&gt;</p>
<p>more comment</p>
<p>&lt;/div&gt;</p>
<p>&lt;div&gt;</p>
<p>last comment</p>
<p>&lt;/div&gt;</p></td>
</tr>
<tr class="even">
<td><p>The Reckoning</p>
<p>John Grishams The Reckoning is the master storytellers most powerful, surprising, and accomplished novel yet.</p>
<p>some comment1</p>
<p>more comment2</p>
<p>last comment3</p>
<p>end of comments</p></td>
<td><p>&lt;h1&gt;</p>
<p>The Reckoning</p>
<p>&lt;/h1&gt;</p>
<p>&lt;article&gt;</p>
<p>John Grishams The Reckoning is the master storytellers most powerful, surprising, and accomplished novel yet.</p>
<p>&lt;/article&gt;</p>
<p>&lt;div&gt;</p>
<p>some comment1</p>
<p>&lt;/div&gt;</p>
<p>&lt;div&gt;</p>
<p>more comment2</p>
<p>&lt;/div&gt;</p>
<p>&lt;div&gt;</p>
<p>last comment3</p>
<p>&lt;/div&gt;</p></td>
</tr>
</tbody>
</table>
