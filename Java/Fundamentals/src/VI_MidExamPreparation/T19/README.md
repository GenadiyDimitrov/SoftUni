# Mid Exam Preparation – 13 February 2023

## Counter Strike

**Link: <https://judge.softuni.org/Contests/Practice/Index/2305#0>**

Write a program that **keeps track of every won** battle against an
**enemy**. You will receive **initial energy**. Afterward, you will
start receiving the **distance** you need **to reach an enemy** until
the **"End of battle"** command is given, or you **run out of energy.**

The **energy** you need for reaching an enemy is **equal to the distance
you receive**. Each time you reach an enemy, you **win** a battle, and
your **energy is reduced. Otherwise,** if you don't have **enough
energy** to reach an enemy, **end the program and** **print**: **"Not
enough energy\! Game ends with {count} won battles and {energy}
energy"**.

Every **third won battle** increases **your energy with the value of
your current count of won battles**.

Upon receiving the **"End of battle"** command**,** print the **count of
won battles** in the following format:

"Won battles: {count}. Energy left: {energy}"

### Input / Constraints

  - On the **first line,** you will receive **initial energy** – an
    **integer \[1-10000\]**.

  - On the **following lines,** you will be receiving the **distance**
    of an enemy – an **integer** **\[1-10000\]**

### Output

  - The description contains the proper output messages for each case
    and the format they should be printed.

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
<td><p><strong>100</strong></p>
<p><strong>10</strong></p>
<p><strong>10</strong></p>
<p><strong>10</strong></p>
<p><strong>1</strong></p>
<p><strong>2</strong></p>
<p><strong>3</strong></p>
<p><strong>73</strong></p>
<p><strong>10</strong></p></td>
<td><strong>Not enough energy! Game ends with 7 won battles and 0 energy</strong></td>
<td><p><strong>The initial energy is 100. The first distance is 10, so we subtract 10 from 100, and we consider this a won battle. We are left with 90 energy. Next distance – 10, and 80 energy left.</strong></p>
<p><strong>Next distance – 10, 3 won battles and 70 energy, but since we have 3 won battles, we increase the energy with the current count of won battles, in this case – 3, and it becomes 73.</strong></p>
<p><strong>The last distance we receive – 10 is unreachable since we have 0 energy, so we print the appropriate message, and the program ends.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>200</strong></p>
<p><strong>54</strong></p>
<p><strong>14</strong></p>
<p><strong>28</strong></p>
<p><strong>13</strong></p>
<p><strong>End of battle</strong></p></td>
<td><strong>Won battles: 4. Energy left: 94</strong></td>
<td></td>
</tr>
</tbody>
</table>

## Treasure Hunt

**Link: <https://judge.softuni.org/Contests/Practice/Index/1773#1>**

*The pirates need to carry a treasure chest safely back to the ship,
looting along the way.*

Create a program that **manages** the **state** of the **treasure
chest** along the way. On the **first line,** you will receive the
**initial loot** of the treasure chest, which is a **string** of
**items** separated by a **"|"**.

**"{loot<sub>1</sub>}|{loot<sub>2</sub>}|{loot<sub>3</sub>} …
{loot<sub>n</sub>}"**

The following lines represent commands **until** **"Yohoho\!"** which
ends the treasure hunt:

  - **"Loot {item<sub>1</sub>} {item<sub>2</sub>}…{item<sub>n</sub>}":**
    
      - Pick up treasure loot along the way. Insert the items at the
        **beginning** of the chest.
    
      - If an item is **already** contained, **don't** insert it.

  - **"Drop {index}":**
    
      - **Remove** the loot at the given **position** and **add** it at
        the **end** of the treasure chest.
    
      - If the index is **invalid,** skip the command.

  - > **"Steal {count}":**
    
      - > Someone steals the **last count** loot items. If there are
        > **fewer items** than the given count, **remove as much** as
        > there are.
    
      - > Print the stolen items separated by **", "**:

**"{item<sub>1</sub>}, {item<sub>2</sub>}, {item<sub>3</sub>} …
{item<sub>n</sub>}"**

In the end, output the **average treasure gain,** which is the **sum**
of all treasure items **length** divided by the **count** of all items
inside the chest **formatted** to the **second decimal** point:

**"Average treasure gain: {averageGain} pirate credits."**

If the chest is **empty,** print the following message:

**"Failed treasure hunt."**

### Input

  - On the **1<sup>st</sup> line,** you are going to receive the
    **initial treasure chest (loot separated by "|")**

  - On the following **lines**, until **"Yohoho\!"**, you will be
    receiving commands.

### Output

  - Print the output in the **format** **described** **above**.

### Constraints

  - The **loot items** will be strings containing any ASCII code.

  - The **indexes** will be integers in the range \[**-200**…**200**\]

  - The **count** will be an integer in the range \[**1**….**100**\]

### Examples

<table>
<tbody>
<tr class="odd">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="even">
<td><p>Gold|Silver|Bronze|Medallion|Cup</p>
<p>Loot Wood Gold Coins</p>
<p>Loot Silver Pistol</p>
<p>Drop 3</p>
<p>Steal 3</p>
<p>Yohoho!</p></td>
<td><p>Medallion, Cup, Gold</p>
<p>Average treasure gain: 5.40 pirate credits.</p></td>
</tr>
<tr class="odd">
<td><strong>Comments</strong></td>
<td></td>
</tr>
<tr class="even">
<td><p>The first command <strong>"Loot Wood Gold Coins"</strong> adds <strong>Wood</strong> and <strong>Coins</strong> to the chest but <strong>omits</strong> Gold since it is already contained. The chest now has the following items:</p>
<p><strong>Coins Wood Gold Silver Bronze Medallion Cup</strong></p>
<p>The <strong>second</strong> command adds <strong>only Pistol</strong> to the chest</p>
<p>The <strong>third</strong> command <strong>"Drop 3"</strong> removes the <strong>Gold</strong> from the chest, but immediately adds it at the <strong>end</strong>:</p>
<p><strong>Pistol Coins Wood Silver Bronze Medallion Cup Gold</strong></p>
<p>The <strong>fourth</strong> command <strong>"Steal 3"</strong> removes the <strong>last 3</strong> items <strong>Medallion</strong>, <strong>Cup</strong>, <strong>Gold</strong> from the chest and prints them.</p>
<p>In the end calculate the average treasure gain which is the sum of all items length Pistol(<strong>6</strong>) + Coins(<strong>5</strong>) + Wood(<strong>4</strong>) + Silver(<strong>6</strong>) + Bronze(<strong>6</strong>) = <strong>27</strong> and <strong>divide</strong> it by the count 27 / 5 = <strong>5.4</strong> and format it to the <strong>second decimal</strong> point.</p></td>
<td></td>
</tr>
<tr class="odd">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="even">
<td><p>Diamonds|Silver|Shotgun|Gold</p>
<p>Loot Silver Medals Coal</p>
<p>Drop -1</p>
<p>Drop 1</p>
<p>Steal 6</p>
<p>Yohoho!</p></td>
<td><p>Coal, Diamonds, Silver, Shotgun, Gold, Medals</p>
<p>Failed treasure hunt.</p></td>
</tr>
</tbody>
</table>

## Memory Game

**Link: <https://judge.softuni.org/Contests/Practice/Index/2517#2>**

Write a program that recreates the **Memory game**.

On the first line, you will **receive a sequence of elements**. Each
element in the sequence **will have a** **twin**. Until the player
receives **"end"** from the console, you will receive **strings with two
integers** separated by a space, representing **the indexes** of
elements in the sequence.

If the player **tries to cheat** and enters **two equal indexes** or
indexes which are **out of bounds of the sequence**, you should **add**
two matching elements at the middle of the sequence in the following
format:

**"-{number of moves until now}a"**

Then print this message on the console:

**"Invalid input\! Adding additional elements to the board"**

### Input

  - **On the first line, you will receive a sequence of elements.**

  - **On the following lines, you will receive integers until the
    command "end".**

### Output

  - Every time the player hit **two matching elements**, you should
    **remove** them from the sequence and **print** on the console the
    following message:

**"Congrats\! You have found matching elements - ${element}\!"**

  - If the player hit **two different elements**, you should **print**
    on the console the following message:

**"Try again\!"**

  - If the player hit **all matching elements** before he receives
    **"end"** from the console, you should **print** on the console the
    following message:

**"You have won in {number of moves until now} turns\!"**

  - If the player receives **"end"** **before** **he hits all matching
    elements**, you should **print** on the console the following
    message:

**"Sorry you lose :(**

**{the current sequence's state}"**

### Constraints

  - **All elements in the sequence will always have a matching
    element.**

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
<td><p><strong>1 1 2 2 3 3 4 4 5 5</strong></p>
<p><strong>1 0</strong></p>
<p><strong>-1 0</strong></p>
<p><strong>1 0</strong></p>
<p><strong>1 0</strong></p>
<p><strong>1 0</strong></p>
<p><strong>end</strong></p></td>
<td><p><strong>Congrats! You have found matching elements - 1!</strong></p>
<p><strong>Invalid input! Adding additional elements to the board</strong></p>
<p><strong>Congrats! You have found matching elements - 2!</strong></p>
<p><strong>Congrats! You have found matching elements - 3!</strong></p>
<p><strong>Congrats! You have found matching elements - -2a!</strong></p>
<p><strong>Sorry you lose :(</strong></p>
<p><strong>4 4 5 5</strong></p></td>
</tr>
<tr class="even">
<td><strong>Comment</strong></td>
<td></td>
</tr>
<tr class="odd">
<td><p><strong>1)</strong></p>
<p><strong>1 0</strong></p>
<p><strong>1 1 2 2 3 3 4 4 5 5 –&gt; 1 = 1, equal elements, so remove them. Moves: 1</strong></p>
<p><strong>2)</strong></p>
<p><strong>-1 0</strong></p>
<p><strong>-1 is invalid index so we add additional elements</strong></p>
<p><strong>2 2 3 3 -2а -2а 4 4 5 5, Moves: 2</strong></p>
<p><strong>3)</strong></p>
<p><strong>1 0</strong></p>
<p><strong>2 2 3 3 -2а -2а 4 4 5 5 -&gt; 2 = 2, equal elements, so remove them. Moves: 3</strong></p>
<p><strong>4)</strong></p>
<p><strong>1 0</strong></p>
<p><strong>3 3 -2а -2а 4 4 5 5 -&gt; 3 = 3, equal elements, so remove them. Moves: 4</strong></p>
<p><strong>5)</strong></p>
<p><strong>1 0</strong></p>
<p><strong>-2а -2а 4 4 5 5 -&gt; -2а = -2а, equal elements, so remove them. Moves: 5</strong></p>
<p><strong>6)</strong></p>
<p><strong>You receive the end command.</strong></p>
<p><strong>There are still elements in the sequence, so the player loses the game.</strong></p>
<p><strong>Final state - 4 4 5 5</strong></p></td>
<td></td>
</tr>
<tr class="even">
<td><p><strong>a 2 4 a 2 4</strong></p>
<p><strong>0 3</strong></p>
<p><strong>0 2</strong></p>
<p><strong>0 1</strong></p>
<p><strong>0 1</strong></p>
<p><strong>end</strong></p></td>
<td><p><strong>Congrats! You have found matching elements - a!</strong></p>
<p><strong>Congrats! You have found matching elements - 2!</strong></p>
<p><strong>Congrats! You have found matching elements - 4!</strong></p>
<p><strong>You have won in 3 turns!</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>a 2 4 a 2 4</strong></p>
<p><strong>4 0</strong></p>
<p><strong>0 2</strong></p>
<p><strong>0 1</strong></p>
<p><strong>0 1</strong></p>
<p><strong>end</strong></p></td>
<td><p><strong>Try again!</strong></p>
<p><strong>Try again!</strong></p>
<p><strong>Try again!</strong></p>
<p><strong>Try again!</strong></p>
<p><strong>Sorry you lose :(</strong></p>
<p><strong>a 2 4 a 2 4</strong></p></td>
</tr>
</tbody>
</table>
