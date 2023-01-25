# More Exercises: Associative Arrays, Lambda and Stream API

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1313)

## Ranking

Here comes the final and the most interesting part - the Final ranking
of the candidate interns. The final ranking is determined by the points
of the interview tasks and from the exams in SoftUni. Here is your final
task. You will receive some lines of input in the format
"**{contest}:{password for contest}**" until you receive "**end of
contests**". Save that data because **you will need it later**. After
that, you will receive another type of input in the format
"**{contest}=\>{password}=\>{username}=\>{points}**" until you receive
"**end of submissions**". Here is what you need to do:

  - Check if the **contest is valid (if you received it in the first
    type of input);**

  - Check if the **password is correct for the given contest;**

  - Save the user with the contest they take part in **(a user can take
    part in many contests)** and the points the user has in the given
    contest. If you receive the **same contest and the same user, update
    the points only if the new ones are more than the older ones.**

In the end, you have to print the info for the user with the **most
points** in the format **"Best candidate is {user} with total {total
points} points."**. After that, print **all students ordered by their
names**. **For each user, print each contest with the points in
descending order**. See the examples.

### Input

  - Strings in format "**{contest}:{password for contest}**" until the
    "**end of contests**" command. There will be no case with two equal
    contests.

  - Strings in format
    "**{contest}=\>{password}=\>{username}=\>{points}**" until the
    "**end of submissions**" command.

  - **There will be no case with 2 or more users with the same total
    points\!**

### Output

  - On the first line, print the best user in a format:  
    "**Best candidate is {user} with total {total points}
    points.**"**.**

  - Then print all students ordered as mentioned above in format:

> "**{user1 name}**
> 
> **\# {contest1} -\> {points}**
> 
> **\# {contest2} -\> {points}**"

### Constraints

  - The strings may contain any ASCII character except **(:, =, \>).**

  - The numbers will be in the range **\[0 - 10000\].**

  - The second input is always valid.

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
<td><p>Part One Interview:success</p>
<p>Js Fundamentals:Pesho</p>
<p>C# Fundamentals:fundPass</p>
<p>Algorithms:fun</p>
<p>end of contests</p>
<p>C# Fundamentals=&gt;fundPass=&gt;Tanya=&gt;350</p>
<p>Algorithms=&gt;fun=&gt;Tanya=&gt;380</p>
<p>Part One Interview=&gt;success=&gt;Nikola=&gt;120</p>
<p>Java Basics Exam=&gt;pesho=&gt;Petkan=&gt;400</p>
<p>Part One Interview=&gt;success=&gt;Tanya=&gt;220</p>
<p>OOP Advanced=&gt;password123=&gt;BaiIvan=&gt;231</p>
<p>C# Fundamentals=&gt;fundPass=&gt;Tanya=&gt;250</p>
<p>C# Fundamentals=&gt;fundPass=&gt;Nikola=&gt;200</p>
<p>Js Fundamentals=&gt;Pesho=&gt;Tanya=&gt;400</p>
<p>end of submissions</p></td>
<td><p>Best candidate is Tanya with total 1350 points.</p>
<p>Ranking:</p>
<p>Nikola</p>
<p># C# Fundamentals -&gt; 200</p>
<p># Part One Interview -&gt; 120</p>
<p>Tanya</p>
<p># Js Fundamentals -&gt; 400</p>
<p># Algorithms -&gt; 380</p>
<p># C# Fundamentals -&gt; 350</p>
<p># Part One Interview -&gt; 220</p></td>
</tr>
<tr class="even">
<td><p>Java Advanced:funpass</p>
<p>Part Two Interview:success</p>
<p>Math Concept:asdasd</p>
<p>Java Web Basics:forrF</p>
<p>end of contests</p>
<p>Math Concept=&gt;ispass=&gt;Monika=&gt;290</p>
<p>Java Advanced=&gt;funpass=&gt;Simona=&gt;400</p>
<p>Part Two Interview=&gt;success=&gt;Drago=&gt;120</p>
<p>Java Advanced=&gt;funpass=&gt;Petyr=&gt;90</p>
<p>Java Web Basics=&gt;forrF=&gt;Simona=&gt;280</p>
<p>Part Two Interview=&gt;success=&gt;Petyr=&gt;0</p>
<p>Math Concept=&gt;asdasd=&gt;Drago=&gt;250</p>
<p>Part Two Interview=&gt;success=&gt;Simona=&gt;200</p>
<p>end of submissions</p></td>
<td><p>Best candidate is Simona with total 880 points.</p>
<p>Ranking:</p>
<p>Drago</p>
<p># Math Concept -&gt; 250</p>
<p># Part Two Interview -&gt; 120</p>
<p>Petyr</p>
<p># Java Advanced -&gt; 90</p>
<p># Part Two Interview -&gt; 0</p>
<p>Simona</p>
<p># Java Advanced -&gt; 400</p>
<p># Java Web Basics -&gt; 280</p>
<p># Part Two Interview -&gt; 200</p></td>
</tr>
</tbody>
</table>

## Judge

You know the Judge system, right?\! Your job is to create a program
similar to the Judge system.

You will receive **several input lines** in the following format:

"{username} -\> {contest} -\> {points}"

The **constestName and username** are strings. The given **points** will
be an integer number. You need to keep track of **every contest** and
**individual statistics of every user**. You should **check if such a
contest already exists**, and if not, add it, otherwise, **check if the
current user is participating in the contest**. If he is participating,
**take the higher score**, otherwise, just **add it**.

Also, you need to keep **individual statistics** for each **user -** the
**total points of all contests**.

You should end your program when you receive the command "**no more
time**". At that point, you should print each contest in **order of
input**. For each contest, print the participants **ordered by points in
descending order and then by name in ascending order**. After that, you
should print **individual statistics for every participant** ordered by
**total points** in **descending** **order** and **then by alphabetical
order**.

### Input / Constraints

  - The input comes in the form of commands in the format specified
    above.

  - Username and contest name **always will be one word.**

  - Points will be an **integer** in the **range \[0, 1000\].**

  - There will be **no invalid** input lines.

  - If **all sorting criteria fail**, the order should be by **order**
    of **input.**

  - The input ends when you receive the command "**no more time**".

### Output

  - The output format for the contests is:

> "{constestName}: {participants.Count} participants

{position}. {username} **\<::\> {points}**"

  - After you print all contests, print the **individual statistics for
    every participant.**

  - The output format is:

> "Individual standings:
> 
> {position}. {username} -\> {totalPoints}"

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
<td><p><strong>Peter -&gt; Algo -&gt; 400</strong></p>
<p><strong>George -&gt; Algo -&gt; 300</strong></p>
<p><strong>Sam -&gt; Algo -&gt; 200</strong></p>
<p><strong>Peter -&gt; DS -&gt; 150</strong></p>
<p><strong>Maria -&gt; DS -&gt; 600</strong></p>
<p><strong>no more time</strong></p></td>
<td><p><strong>Algo: 3 participants</strong></p>
<p><strong>1. Peter &lt;::&gt; 400</strong></p>
<p><strong>2. George &lt;::&gt; 300</strong></p>
<p><strong>3. Sam &lt;::&gt; 200</strong></p>
<p><strong>DS: 2 participants</strong></p>
<p><strong>1. Maria &lt;::&gt; 600</strong></p>
<p><strong>2. Peter &lt;::&gt; 150</strong></p>
<p><strong>Individual standings:</strong></p>
<p><strong>1. Maria -&gt; 600</strong></p>
<p><strong>2. Peter -&gt; 550</strong></p>
<p><strong>3. George -&gt; 300</strong></p>
<p><strong>4. Sam -&gt; 200</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>Peter -&gt; OOP -&gt; 350</strong></p>
<p><strong>George -&gt; OOP -&gt; 250</strong></p>
<p><strong>Sam -&gt; Advanced -&gt; 600</strong></p>
<p><strong>George -&gt; OOP -&gt; 300</strong></p>
<p><strong>Pitter -&gt; OOP -&gt; 300</strong></p>
<p><strong>Pitter -&gt; Advanced -&gt; 250</strong></p>
<p><strong>Anna -&gt; JSCore -&gt; 400</strong></p>
<p><strong>no more time</strong></p></td>
<td><p><strong>OOP: 3 participants</strong></p>
<p><strong>1. Peter &lt;::&gt; 350</strong></p>
<p><strong>2. George &lt;::&gt; 300</strong></p>
<p><strong>3. Pitter &lt;::&gt; 300</strong></p>
<p><strong>Advanced: 2 participants</strong></p>
<p><strong>1. Sam &lt;::&gt; 600</strong></p>
<p><strong>2. Pitter &lt;::&gt; 250</strong></p>
<p><strong>JSCore: 1 participants</strong></p>
<p><strong>1. Anna &lt;::&gt; 400</strong></p>
<p><strong>Individual standings:</strong></p>
<p><strong>1. Sam -&gt; 600</strong></p>
<p><strong>2. Pitter -&gt; 550</strong></p>
<p><strong>3. Anna -&gt; 400</strong></p>
<p><strong>4. Peter -&gt; 350</strong></p>
<p><strong>5. George -&gt; 300</strong></p></td>
</tr>
</tbody>
</table>

## MOBA Challenger

Peter is a pro MOBA player. He is struggling to become a master of the
Challenger tier. So he watches the statistics in the tier carefully.

You will receive **several input lines** in one of the following
formats:

"{player} -\> {position} -\> {skill}"

"{player} vs {player}"

The **player and position** are strings. The given **skill** will be an
integer number. You need to keep track of **every player**.

When you receive a **player and his position and skill**, add him to the
player pool. If he isn't present, **else add** his position and skill
**or update** his skill, **only if** the current position skill is lower
than the new value.

If you receive "**{player} vs {player}**" and **both players exist** in
the tier, **they duel** with the following rules:

Compare their positions, **if they got at least one in common**, the
player with better **total skill points** wins, and the other is
**demoted** from the tier -\> remove him. If they have the same total
skill points, **the duel is a tie,** and they both continue in the
Season.

If they don't have positions in common, **the duel isn't happening,**
and both continue in the Season.

You should end your program when you receive the command "**Season
end**". At that point, you should print the players, **ordered by total
skill in descending order, then ordered by player name in ascending
order**. **For each** player print, their position and skill are
**ordered descending by skill and then by position name in ascending
order.**

### Input / Constraints

  - The input comes in the form of commands in one of the formats
    specified above.

  - Player and position **will always be one-word string, containing no
    whitespaces.**

  - Skill will be an **integer** in the **range \[0, 1000\].**

  - There will be **no invalid** input lines.

  - The program ends when you receive the command "**Season end**"**.**

### Output

  - The output format for each player is:

> "{player}: {totalSkill} skill

\- {position} **\<::\> {skill}**"

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
<td><p><strong>Peter -&gt; Adc -&gt; 400</strong></p>
<p><strong>George -&gt; Jungle -&gt; 300</strong></p>
<p><strong>Sam -&gt; Mid -&gt; 200</strong></p>
<p><strong>Sam -&gt; Support -&gt; 250</strong></p>
<p><strong>Season end</strong></p></td>
<td><p><strong>Sam: 450 skill</strong></p>
<p><strong>- Support &lt;::&gt; 250</strong></p>
<p><strong>- Mid &lt;::&gt; 200</strong></p>
<p><strong>Peter: 400 skill</strong></p>
<p><strong>- Adc &lt;::&gt; 400</strong></p>
<p><strong>George: 300 skill</strong></p>
<p><strong>- Jungle &lt;::&gt; 300</strong></p></td>
<td><strong>We order the players by total skill points descending, then by name. We print every position along its skill ordered descending by skill, then by position name.</strong></td>
</tr>
<tr class="even">
<td><p><strong>Peter -&gt; Adc -&gt; 400</strong></p>
<p><strong>Bush -&gt; Tank -&gt; 150</strong></p>
<p><strong>Faker -&gt; Mid -&gt; 200</strong></p>
<p><strong>Faker -&gt; Support -&gt; 250</strong></p>
<p><strong>Faker -&gt; Tank -&gt; 250</strong></p>
<p><strong>Peter vs Faker</strong></p>
<p><strong>Faker vs Bush</strong></p>
<p><strong>Faker vs Hide</strong></p>
<p><strong>Season end</strong></p></td>
<td><p><strong>Faker: 700 skill</strong></p>
<p><strong>- Support &lt;::&gt; 250</strong></p>
<p><strong>- Tank &lt;::&gt; 250</strong></p>
<p><strong>- Mid &lt;::&gt; 200</strong></p>
<p><strong>Peter: 400 skill</strong></p>
<p><strong>- Adc &lt;::&gt; 400</strong></p></td>
<td><p><strong>Faker and Peter don't have a common position, so the duel isn't valid.</strong></p>
<p><strong>Faker wins vs Bush /common position: "Tank". Bush is demoted.</strong></p>
<p><strong>Hide doesn't exist, so the duel isn't valid.</strong></p>
<p><strong>We print every player left in the tier.</strong></p></td>
</tr>
</tbody>
</table>

## Snowwhite

Snow White loves her dwarfs, but there are so many, and she doesn't know
how to order them. Does she order them by name? Or by the color of their
hat? Or by physics? She can't decide, so it's up to you to write a
program that does it for her.

You will be receiving **several input lines** which contain **data**
about **dwarfs** in the following format:

"{dwarfName} \<:\> {dwarfHatColor} \<:\> {dwarfPhysics}"

The **dwarfName** and the **dwarfHatColor** are **strings**. The
**dwarfPhysics** is an **integer**.

You must **store** the **dwarfs** in your program. There are several
rules, though:

  - If **2 dwarfs** have the **same name** but **different hat colors**,
    they should be **considered different dwarfs**, and you should store
    **both** of them.

  - If **2 dwarfs** have the **same name** and the **same hat color**,
    **store** the **one** with the **higher physics**.

When you receive the command "**Once upon a time**", the input ends. You
must **order** the **dwarfs** by **physics** in **descending order** and
then by the **total** **count** of **dwarfs** with the **same hat
color** in **descending order**.  
Then you must print them all.

### Input

  - The input will consist of **several input lines** containing **dwarf
    data** in the format specified above.

  - The input **ends** when you receive the command "**Once upon a
    time".**

### Output

  - As output, you must print the **dwarfs** **ordered** as specified
    above.

  - The output format is: "**({hatColor}) {name} \<-\> {physics}**".

### Constraints

  - The **dwarfName** will be a **string** that may contain **any
    ASCII** character except ' ' (**space**), '**\<**', '**:**',
    '**\>**'.

  - The **dwarfHatColor** will be a **string** which may contain **any
    ASCII** character except ' ' (**space**), '**\<**', '**:**',
    '**\>**'.

  - The **dwarfPhysics** will be an **integer** in the **range \[0,
    2<sup>31</sup> - 1\].**

  - There will be **no invalid** input lines.

  - If **all sorting criteria fail**, the order should be by **order**
    of **input.**

<!-- end list -->

  - It allowed working **time**/**memory**: **100ms**/**16MB.**

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
<td><p>Peter &lt;:&gt; Red &lt;:&gt; 2000</p>
<p>Todor &lt;:&gt; Blue &lt;:&gt; 1000</p>
<p>George &lt;:&gt; Green &lt;:&gt; 1000</p>
<p>Smith &lt;:&gt; Yellow &lt;:&gt; 4500</p>
<p>Premis &lt;:&gt; Sam &lt;:&gt; 1000</p>
<p>Once upon a time</p></td>
<td><p>(Yellow) Smith &lt;-&gt; 4500</p>
<p>(Red) Peter &lt;-&gt; 2000</p>
<p>(Blue) Todor &lt;-&gt; 1000</p>
<p>(Green) George &lt;-&gt; 1000</p>
<p>(Sam) Premis &lt;-&gt; 1000</p></td>
</tr>
<tr class="even">
<td><p>Peter &lt;:&gt; Red &lt;:&gt; 5000</p>
<p>Peter &lt;:&gt; Blue &lt;:&gt; 10000</p>
<p>Peter &lt;:&gt; Red &lt;:&gt; 10000</p>
<p>George &lt;:&gt; Blue &lt;:&gt; 10000</p>
<p>Once upon a time</p></td>
<td><p>(Blue) Peter &lt;-&gt; 10000</p>
<p>(Blue) George &lt;-&gt; 10000</p>
<p>(Red) Peter &lt;-&gt; 10000</p></td>
</tr>
</tbody>
</table>

## Dragon Army

Heroes III is the best game ever. Everyone loves it, and everyone plays
it all the time. John is not an exclusion from this rule. His favorite
units in the game are all **types** of dragons - black, red, gold,
azure, etc. He likes them so much that he gives them **names** and keeps
logs of their **stats**: **damage, health,** and **armor**. The process
of aggregating all the data is quite tedious, so he would like to have a
program doing it. Since he is no programmer, it's your task to help him.

You need to categorize dragons by their **type**. For each dragon,
identified by **name,** keep information about his **stats.** Type is
**preserved** as in the input order, but dragons are **sorted**
alphabetically by name. For each type, you should also print the average
**damage**, **health,** and **armor** of the dragons. For each dragon,
print his stats.

There **may** be **missing** stats in the input, though. If a stat is
missing, you should assign its default values. Default values are as
follows: health **250**, damage **45,** and armor **10**. Missing stat
will be marked by **null**.

The input is in the following format "**{type} {name} {damage} {health}
{armor}**"**.** Any of the integers may be assigned a null value. See
the examples below for a better understanding of your task.

If the same dragon is added a second time, the new stats should
**overwrite** the previous ones. Two dragons are considered **equal** if
they match by **both** name and type.

### Input

  - On the first line, you are given the number **N** - the number of
    dragons to follow.

  - On the next **N** lines, you are given input in the format described
    above. There will be a **single space** separating each element.

### Output

  - > Print the aggregated data on the console.

  - > For each type print average stats of its dragons in format
    > "**{Type}::({damage}/{health}/{armor})**"**.**

  - > Damage, health, and armor should be **rounded** to two digits
    > after the decimal separator.

  - > For each dragon, print its stats in the format:  
    > "**-{Name} -\> damage: {damage}, health: {health}, armor:
    > {armor}**"

### Constraints

  - > **N** is in the range **\[1…100\].**

  - > The dragon type and name are one word only, starting with a
    > capital letter.

  - > Damage, health, and armor are integers in the range **\[0 …
    > 100000\]** or **null.**

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
<p>Red Bazgargal 100 2500 25</p>
<p>Black Dargonax 200 3500 18</p>
<p>Red Obsidion 220 2200 35</p>
<p>Blue Kerizsa 60 2100 20</p>
<p>Blue Algordox 65 1800 50</p></td>
<td><p>Red::(160.00/2350.00/30.00)</p>
<p>-Bazgargal -&gt; damage: 100, health: 2500, armor: 25</p>
<p>-Obsidion -&gt; damage: 220, health: 2200, armor: 35</p>
<p>Black::(200.00/3500.00/18.00)</p>
<p>-Dargonax -&gt; damage: 200, health: 3500, armor: 18</p>
<p>Blue::(62.50/1950.00/35.00)</p>
<p>-Algordox -&gt; damage: 65, health: 1800, armor: 50</p>
<p>-Kerizsa -&gt; damage: 60, health: 2100, armor: 20</p></td>
</tr>
<tr class="even">
<td><p>4</p>
<p>Gold Zzazx null 1000 10</p>
<p>Gold Traxx 500 null 0</p>
<p>Gold Xaarxx 250 1000 null</p>
<p>Gold Ardrax 100 1055 50</p></td>
<td><p>Gold::(223.75/826.25/17.50)</p>
<p>-Ardrax -&gt; damage: 100, health: 1055, armor: 50</p>
<p>-Traxx -&gt; damage: 500, health: 250, armor: 0</p>
<p>-Xaarxx -&gt; damage: 250, health: 1000, armor: 10</p>
<p>-Zzazx -&gt; damage: 45, health: 1000, armor: 10</p></td>
</tr>
</tbody>
</table>
