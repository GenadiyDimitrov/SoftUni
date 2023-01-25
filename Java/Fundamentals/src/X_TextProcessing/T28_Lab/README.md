# Lab: Text Processing

Problems for exercises and homework for the
[<span class="underline">"Programming Fundamentals" course @
SoftUni</span>](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023)

You can check your solutions in
[<span class="underline">Judge.</span>](https://judge.softuni.org/Contests/1669/Text-Processing-Lab)

## Reverse Strings

You will be given a series of strings until you receive an "**end**"
command. Write a program that reverses strings and prints each pair on a
separate line in the format "**{word} = {reversed word}**".

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
<td><p>helLo</p>
<p>Softuni</p>
<p>bottle</p>
<p>end</p></td>
<td><p>helLo = oLleh</p>
<p>Softuni = inutfoS</p>
<p>bottle = elttob</p></td>
</tr>
<tr class="even">
<td><p>Dog</p>
<p>caT</p>
<p>chAir</p>
<p>end</p></td>
<td><p>Dog = goD</p>
<p>caT = Tac</p>
<p>chAir = riAhc</p></td>
</tr>
</tbody>
</table>

### Solution

Use while loop and read strings until you receive "**end**".

![](media/image1.png)

Reverse the String with for loop. Start from the last index and append
each symbol to the new String.

![](media/image2.png)

Print the reversed String in the specified format.

![](media/image3.png)

## Repeat Strings

### Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.

### Examples

| **Input**  | **Output**             |
| ---------- | ---------------------- |
| hi abc add | hihiabcabcabcaddaddadd |
| work       | workworkworkwork       |
| ball       | ballballballball       |

### Solution

Read a **string array**.

![](media/image4.png)

Initialize **StringBuilder**.

![](media/image5.png)

Iterate through elements in the array. Find the length of the word at
each iteration and append it to the **StringBuilder**.

![](media/image6.png)

Print the **StringBuilder**.

## Substring

On the first line, you will receive a string. On the second line, you
will receive a second string. Write a program that removes all of the
occurrences of the first String in the second until there is no match.
At the end, print the remaining String.

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
<td><p>ice</p>
<p>kicegiciceeb</p></td>
<td>kgb</td>
<td><p>We remove ice once, and we get "kgiciceeb"</p>
<p>We match "ice" one more time, and we get "kgiceb"</p>
<p>There is one more match. The final result is "kgb"</p></td>
</tr>
<tr class="even">
<td><p>e</p>
<p>fixture</p></td>
<td>fixtur</td>
<td></td>
</tr>
</tbody>
</table>

### Hints

  - Read the input.

  - Find the first index where the key appears.
    
      - Use the built-in method **indexOf()**

  - Remove the match.
    
      - Use the built-in method **replace(String oldValue, String
        newValue)**

  - Repeat it until the text doesn't contain the key anymore.

## Text Filter

Write a program that takes a **text** and a **string of banned words**.
All words included in the ban list should be replaced with **asterisks**
"**\***", equal to the word's length. The entries in the ban list will
be separated by a **comma** and **space** "**,** ".

The ban list should be entered on the first input line and the text on
the second input line.

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
<td><p>Linux, Windows</p>
<p>It is not <strong>Linux</strong>, it is GNU/<strong>Linux</strong>. <strong>Linux</strong> is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/<strong>Linux</strong>! Sincerely, a <strong>Windows</strong> client</p></td>
<td>It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client</td>
</tr>
<tr class="even">
<td><p>computer, programming, set</p>
<p>In <strong>computer</strong> <strong>programming</strong>, an application <strong>programming</strong> interface (API) is a <strong>set</strong> of subroutine definitions, communication protocols, and tools for building software.</p></td>
<td>In ******** ***********, an application *********** interface (API) is a *** of subroutine definitions, communication protocols, and tools for building software.</td>
</tr>
</tbody>
</table>

### Hints

  - Read the input.

  - Replace all ban words in the text with an asterisk (\*).
    
      - Use the built-in method **replace(banWord, replacement)**.

## Digits, Letters and Other

Write a program that receives a single string and on the first line
prints all the digits, on the second – all the letters, and on the third
– all the other characters. There will always be at least one digit, one
letter, and another character.

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
<td>Agd#53Dfg^&amp;4F53</td>
<td><p>53453</p>
<p>AgdDfgF</p>
<p>#^&amp;</p></td>
</tr>
<tr class="even">
<td>a1!</td>
<td><p>1</p>
<p>a</p>
<p>!</p></td>
</tr>
</tbody>
</table>

### Hints

  - Read the input.

  - Use a loop to iterate through all characters in the text. If the
    char is a digit, print it, otherwise, ignore it.
    
      - Use **Character.isDigit(char symbol)**

  - Do the same for the letters and other chars.
    
      - Find something like **isDigit** method for the letters.
