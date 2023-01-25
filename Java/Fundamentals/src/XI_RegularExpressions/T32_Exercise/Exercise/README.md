# Exercise: Regular Expressions

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1673/Regular-Expressions-Exercises)

## Furniture

Write a program to calculate the total cost of different types of
furniture. You will be given some lines of input until you receive the
line "**Purchase**". For the line to be valid, it should be in the
following format:

"**\>\>{furniture name}\<\<{price}\!{quantity}**"

The price can be a floating-point number or a whole number. Store the
names of the furniture and the total price. In the end, print each
bought furniture on a separate line in the format:

"**Bought furniture:**

**{1<sup>st</sup> name}**

**{2<sup>nd</sup> name}**

**…**"

And on the last line, print the following: "**Total money spend: {spend
money}**", formatted to the second decimal point.

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
<td><p>&gt;&gt;Sofa&lt;&lt;312.23!3</p>
<p>&gt;&gt;TV&lt;&lt;300!5</p>
<p>&gt;Invalid&lt;&lt;!5</p>
<p>Purchase</p></td>
<td><p>Bought furniture:</p>
<p>Sofa</p>
<p>TV</p>
<p>Total money spend: 2436.69</p></td>
<td>Only the Sofa and the TV are valid, for each of them we multiply the price by the quantity and print the result.</td>
</tr>
<tr class="even">
<td><p>&gt;&gt;TV&lt;&lt;312.23!3</p>
<p>&gt;&gt;Monitor&lt;&lt;300!5</p>
<p>&gt;&gt;Invalid&lt;&lt;&lt;&lt;!5</p>
<p>&gt;&gt;Sink&lt;&lt;220!10</p>
<p>&gt;&gt;&gt;&gt;&gt;&gt;Invalid&lt;&lt;!5</p>
<p>Purchase</p></td>
<td><p>Bought furniture:</p>
<p>TV</p>
<p>Monitor</p>
<p>Sink</p>
<p>Total money spend: 4636.69</p></td>
<td></td>
</tr>
</tbody>
</table>

## Race

Write a program that processes information about a race. On the **first
line,** you will be given a **list of participants** **separated by**
"**,** ". On the next few lines, until you receive the line "**end of
race**" you will be given some info which will be some **alphanumeric
characters**. In between them, you could have some **extra characters
which you should ignore**. For example: "**G\!32e%o7r\#32g$235@\!2e**".
The **letters are the name** of the person, and the **sum of the digits
is the distance** he ran. So here we have **George,** who ran **29 km**.
Store the information about the person only **if the list of racers
contains the name of the person**. If you receive the **same person more
than once add the distance to his old distance**. Finally, print the
racers in the order they are given, in the format:

"**1st place: {first racer}**

**2nd place: {second racer}**

**3rd place: {third racer}**"

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
<td><p>George, Peter, Bill, Tom</p>
<p>G4e@55or%6g6!68e!!@</p>
<p>R1@!3a$y4456@</p>
<p>B5@i@#123ll</p>
<p>G@e54o$r6ge#</p>
<p>7P%et^#e5346r</p>
<p>T$o553m&amp;6</p>
<p>end of race</p></td>
<td><p>1st place: George</p>
<p>2nd place: Peter</p>
<p>3rd place: Bill</p></td>
<td>On the 3<sup>rd</sup> input line, we have Ray. He is not on the list, so we do not count his result. The other ones are valid. We need to arrange them in the way they are given by the input.</td>
</tr>
<tr class="even">
<td><p>Joro, George, Georgi, Stamat</p>
<p>^&amp;^%^232St#$ama&amp;&amp;^^t</p>
<p>^&amp;^%^232St#$ama&amp;&amp;^^t</p>
<p>G7667eorge&amp;^^&amp;^</p>
<p>&amp;^&amp;&amp;&amp;J99999oro&amp;^^57</p>
<p>end of race</p></td>
<td><p>1st place: Joro</p>
<p>2nd place: George</p>
<p>3rd place: Georgi</p></td>
<td></td>
</tr>
</tbody>
</table>

## \*SoftUni Bar Income

**Let's take** a break and visit the game bar at SoftUni. It is about
time for the people behind the bar to go home, and you are the person
who has to draw the line and calculate the money from the products that
were sold throughout the day. Until you receive a line with the text
"**end of shift**", you will be given lines of input. But before
processing that line, you have to do some validations first.

**Each valid order should have a customer, product, count, and price:**

  - > Valid customer's name should be **surrounded by** '**%**' and must
    > **start with a capital letter**, followed by **lower-case
    > letters.**

  - > **Valid product contains any word character and must be surrounded
    > by** '**\<**' **and** '**\>**'**.**

  - > The valid count is an **integer** **surrounded by** '**|**'.

  - > **The valid price is any real number followed by** '**$**'.

The parts of a valid order should appear in the order given: **customer,
product, count, and price.**

Between each part there can be other symbols, except ('**|**'**,**
'**$**'**,** '**%**' **and** '**.** ')

For each valid line print on the console: "**{customerName}: {product} -
{totalPrice}**"

When you receive "**end of shift**", print the total amount of money for
the day **rounded to 2 decimal places** in the following format:
"**Total income: {income}**"**.**

### Input / Constraints

  - > Strings must be processed until you receive the text "**end of
    > shift**".

### Output

  - Print all the valid lines in the format "**{customerName}: {product}
    - {totalPrice}**".

  - After receiving "**end of shift**" print the total amount of money
    for the day rounded to 2 decimal places in the following format:
    "**Total income: {income}**".

  - Allowed working **time** / **memory**: **100ms** / **16MB**.

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
<td><p>%George%&lt;Croissant&gt;|2|10.3$</p>
<p>%Peter%&lt;Gum&gt;|1|1.3$</p>
<p>%Maria%&lt;Cola&gt;|1|2.4$</p>
<p>end of shift</p></td>
<td><p>George: Croissant - 20.60</p>
<p>Peter: Gum - 1.30</p>
<p>Maria: Cola - 2.40</p>
<p>Total income: 24.30</p></td>
<td><p>Each line is valid, so we print each order, calculating the total price of the product bought.</p>
<p>In the end, we print the total income for the day</p></td>
</tr>
<tr class="even">
<td><p>%InvalidName%&lt;Croissant&gt;|2|10.3$</p>
<p>%Peter%&lt;Gum&gt;1.3$</p>
<p>%Maria%&lt;Cola&gt;|1|2.4</p>
<p>%Valid%&lt;Valid&gt;valid|10|valid20$</p>
<p>end of shift</p></td>
<td><p>Valid: Valid - 200.00</p>
<p>Total income: 200.00</p></td>
<td><p>On the first line, the customer name isn't valid, so we skip that line.<br />
The second line is missing product count.</p>
<p>The third line doesn't have a valid price.</p>
<p>And only the fourth line is valid</p></td>
</tr>
</tbody>
</table>

## \*Star Enigma

The war is at its peak, but you, young Padawan, can turn the tides with
your programming skills. You are tasked to create a program to
**decrypt** the messages of The Order and prevent the death of hundreds
of lives.

You will receive several messages, which are **encrypted** using the
legendary star enigma. You should **decrypt the messages** following
these rules:

To properly decrypt a message, you should **count all the letters**
**\[s, t, a, r\]** – **case insensitive** and **remove** the count from
the **current ASCII value of each symbol** of the encrypted message.

After decryption:

Each message should have a **planet name, population, attack type ('A',
as an attack or 'D', as destruction), and soldier count.**

The planet's name **starts after** **'@'** and contains **only letters
from the Latin alphabet**.

The planet population **starts after ':'** and is an **Integer**;

The attack type may be **"A"(attack) or "D"(destruction)** and must be
**surrounded by "\!"** (Exclamation mark).

The **soldier count** starts after **"-\>"** and should be an Integer.

The order in the message should be: **planet name -\> planet population
-\> attack type -\> soldier count.** Each part can be separated from the
others by **any character except: '@', '-', '\!', ':' and '\>'.**

### Input / Constraints

  - The **first line** **holds n** – the number of **messages** –
    **integer in the range \[1…100\].**

  - On the next **n** lines, you will be receiving encrypted messages.

### Output

After decrypting all messages, you should print the decrypted
information in the following format:

First print the attacked planets, then the destroyed planets.  
"**Attacked planets: {attackedPlanetsCount}**"**  
**"**-\> {planetName}**"**  
**"**Destroyed planets: {destroyedPlanetsCount}**"**  
**"**-\> {planetName}**"

The planets should be **ordered by name** **alphabetically.**

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
<td><p>2</p>
<p><strong>ST</strong>CDoghudd4=63333$D$0<strong>A</strong>53333</p>
<p>EHf<strong>s</strong>y<strong>ts</strong>nhf?8555&amp;I&amp;2C9555<strong>SR</strong></p></td>
<td><p>Attacked planets: 1</p>
<p>-&gt; Alderaa</p>
<p>Destroyed planets: 1</p>
<p>-&gt; Cantonica</p></td>
<td><p>We receive two messages, and to decrypt them, we calculate the key:</p>
<p>The first message has decryption key 3. So we subtract from each character's code 3.</p>
<p><strong>PQ@Alderaa1:30000!A!-&gt;20000</strong></p>
<p>The second message has key 5.</p>
<p><strong>@Cantonica:3000!D!-&gt;4000NM</strong></p>
<p><strong>Both messages are valid and</strong> contain planet, population, attack type, and soldier count.</p>
<p>After decrypting all messages, we print each planet according to the format given.</p></td>
</tr>
<tr class="even">
<td><p>3</p>
<p><strong>tt</strong>(''DG<strong>s</strong>vywge<strong>r</strong>x&gt;6444444444%H%1B9444</p>
<p>GQh<strong>rr</strong>|<strong>A</strong>977777(H(<strong>TTTT</strong></p>
<p>EHf<strong>s</strong>y<strong>ts</strong>nhf?8555&amp;I&amp;2C9555<strong>SR</strong></p></td>
<td><p>Attacked planets: 0</p>
<p>Destroyed planets: 2</p>
<p>-&gt; Cantonica</p>
<p>-&gt; Coruscant</p></td>
<td><p>We receive three messages.</p>
<p>Message one is decrypted with key 4:</p>
<p><strong>pp$##@Coruscant:2000000000!D!-&gt;5000</strong></p>
<p>Message two is decrypted with key 7:</p>
<p><strong>@Jakku:200000!A!MMMM</strong></p>
<p>This is the <strong>invalid message</strong>, missing soldier count, so we continue.</p>
<p>The third message has key 5.</p>
<p><strong>@Cantonica:3000!D!-&gt;4000NM</strong></p></td>
</tr>
</tbody>
</table>

## \*Nether Realms

A mighty battle is coming. In the stormy nether realms, demons fight
against each other for supremacy in a duel from which only one will
survive.

Your job, however, is not so exciting. You must **sign in all the
participants** in the nether realm's mighty battle's demon book.

A demon's **name contains his health and his damage**.

The **sum of the asci codes** of **all characters** (excluding numbers
(0-9), arithmetic symbols (**'+', '-', '\*', '/'**) and delimiter dot
(**'.'**)) gives a **demon's total health**.

**The sum of all numbers** in his name forms his base damage. Note that
you should consider the plus **'+'** and minus **'-'** signs (e.g.,
**+10 is 10** and **-10 is -10**). However, there are some symbols
(**'\*'** and **'/'**) that can further **alter the base damage by
multiplying or dividing it by 2** (e.g. in the name
"m**15**\*/c**-5.0**", the base damage is **15 + (-5.0) = 10** and then
you need to multiply it by 2 (e.g. 10 \* 2 = 20) and then divide it by 2
(e.g. 20 / 2 = 10)).

So, **multiplication and division** are applied **only after all numbers
are included** in the calculation and **the order they appear in the
name**.

### Input

The input will be read from the console. The input consists of a
**single line** containing all demon names **separated by commas and
zero or more spaces** in the format: **"{demon name}, {demon name}, …
{demon name}"**

### Output

Print all demons, each on a separate line in the format:

  - **"{demon name} - {health points} health, {damage points} damage"**

### Constraints

  - > A demon's name will contain **at least one character.**

  - > A demon's name **cannot contain** blank spaces ' ' or commas ','.

  - A **floating-point number will always have digits before and after
    its decimal separator.**

  - **The number** in a demon's name **is considere**d everything that
    is a valid integer or floating point number (with a dot '.' used as
    separator). For example, all these are valid numbers: '4', '+4',
    '-4', '3.5', '+3.5', '-3.5'.

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
<td>M3ph-0.5s-0.5t0.0**</td>
<td>M3ph-0.5s-0.5t0.0** - 524 health, 8.00 damage</td>
<td><p>M3ph-0.5s-0.5t0.0**:</p>
<p>Health = 'M' + 'p' + 'h' + 's' + 't' = 524 health.</p>
<p>Damage = (3 + (-0.5) + (-0.5) + 0.0) * 2 * 2 = 8 damage.</p></td>
</tr>
<tr class="even">
<td>M3ph1st0**, Azazel</td>
<td><p>M3ph1st0** - 524 health, 16.00 damage</p>
<p>Azazel - 615 health, 0.00 damage</p></td>
<td><p>M3ph1st0**:</p>
<p>Health - 'M' + 'p' + 'h' + 's' + 't' = 524 health.</p>
<p>Damage - (3 + 1 + 0) * 2 * 2 = 16 damage.</p>
<p>Azazel:</p>
<p>Health - 'A' + 'z' + 'a' + 'z' + 'e' + 'l' = 615 health. Damage - no digits = 0 damage.</p></td>
</tr>
<tr class="odd">
<td>Gos/ho</td>
<td>Gos/ho - 512 health, 0.00 damage</td>
<td></td>
</tr>
</tbody>
</table>

## \*Extract Emails

Write a program to **extract all email addresses from a given text**.
The text comes at the only input line. Print the emails on the console,
each at a separate line. Emails are considered to be in format
**\<user\>@\<host\>**, where:

  - **\<user\>** is a sequence of **letters** and **digits**, where
    '**.**', '**-**' and '**\_**' can appear between them.
    
      - Examples of valid users: "**stephan**", "**mike03**",
        "**s.johnson**", "**st\_steward**", "**softuni-bulgaria**",
        "**12345**".
    
      - Examples of invalid users: ''**--123**", "**.....**",
        "**nakov\_-**", "**\_steve**", "**.info**".

  - **\<host\>** is a sequence of at least two words, separated by dots
    '**.**'. Each word is a sequence of letters and can have hyphens
    '**-**' between the letters.
    
      - Examples of hosts: "**softuni.bg**",
        "**software-university.com**", "**intoprogramming.info**",
        "**mail.softuni.org**".
    
      - Examples of invalid hosts: "**helloworld**",
        "**.unknown.soft.**", "**invalid-host-**", "**invalid-**".

  - Examples of **valid emails**: "**info@softuni-bulgaria.org**",
    "**kiki@hotmail.co.uk**", "**no-reply@github.com**",
    "**s.peterson@mail.uu.net**",
    "**<span class="underline">info-bg@software-university.software.academy</span>**".

  - Examples of **invalid emails**:
    "**<span class="underline">--123@gmail.com</span>**",
    "**…@mail.bg**",
    "**<span class="underline">.info@info.info</span>**",
    "**<span class="underline">\_steve@yahoo.cn</span>**",
    "**mike@helloworld**",
    "**<span class="underline">mike@.unknown.soft</span>.** ",
    "**s.johnson@invalid-**".

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
<td>Please contact us at: support@github.com.</td>
<td>support@github.com</td>
</tr>
<tr class="even">
<td>Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information.</td>
<td><p>s.miller@mit.edu</p>
<p>j.hopking@york.ac.uk</p></td>
</tr>
</tbody>
</table>
