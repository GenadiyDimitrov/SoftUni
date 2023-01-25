# More Exercise: Objects and Classes

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.org/Contests/1328)

## Company Roster

Define a class **Employee** with the following information: **name,
salary, position, department, email,** and **age**. The **name,
salary**, **position,** and **department** are **mandatory,** while the
rest are **optional**.

Your task is to write a program that takes **N** lines of employees from
the console and calculates the department with the highest average
salary, and prints for each employee in that department his **name,
salary, email, and age** – **sorted by salary in descending order**. If
an employee **doesn't have** an **email** – in place of that field, you
should print "**n/a**" instead, if he doesn't have an **age** – print
"**-1**" instead. The **salary** should be printed to **two decimal
places** after the separator.

**Hint**: you can define a **Department** class with a list of
employees.

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
<td><p>4</p>
<p>Peter 120.00 Dev Development peter@abv.bg 28</p>
<p>Todor 333.33 Manager Marketing 33</p>
<p>Itan 840.20 ProjectLeader Development itan@itan.com</p>
<p>George 0.20 Freeloader Nowhere 18</p></td>
<td><p><strong>Highest Average Salary: Development</strong></p>
<p><strong>Itan 840.20 itan@itan.com -1</strong></p>
<p><strong>Peter 120.00 peter@abv.bg 28</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>6</strong></p>
<p><strong>Stan 496.37 Temp Coding stan@yahoo.com</strong></p>
<p><strong>Yana 610.13 Manager Sales</strong></p>
<p><strong>Todor 609.99 Manager Sales todor@abv.bg 44</strong></p>
<p><strong>Venecia 0.02 Director BeerDrinking beer@beer.br 23</strong></p>
<p><strong>Andrey 700.00 Director Coding</strong></p>
<p><strong>Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey</strong></p></td>
<td><p><strong>Highest Average Salary: Sales</strong></p>
<p><strong>Yana 610.13 n/a -1</strong></p>
<p><strong>Todor 609.99 todor@abv.bg 44</strong></p></td>
</tr>
</tbody>
</table>

## Raw Data

You are the owner of a courier company and want to make a system for
tracking your cars and their cargo. Define a class **Car** that holds
information about the **model, engine, cargo,** and a **collection of
exactly 4 tires**. The engine, cargo, and tire **should be separate
classes**, and create a constructor that receives all information about
the Car and creates and initializes its inner components (engine, cargo,
and tires).

On the first line of input you will receive a number **N** - the number
of cars you have, on each of the next **N** lines you will receive
information about a car in the format

"**{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
{Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure}
{Tire3Age} {Tire4Pressure} {Tire4Age}**", where the speed, power, weight
and tire age are **integers**, tire pressure is a **double.**

After the **N** lines, you will receive a single line with one of 2
commands "**fragile**" or "**flamable**", if the command is
"**fragile**" print all cars whose **Cargo Type is** "**fragile**" with
a **tire** whose **pressure is** **\< 1** if the command is
"**flamable**" print all cars whose **Cargo Type is** "**flamable**" and
have **Engine Power \> 250**. The cars should be printed in order to
appear in the input.

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
<p><strong>ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4</strong></p>
<p><strong>Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1</strong></p>
<p><strong>fragile</strong></p></td>
<td><strong>Citroen2CV</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1</strong></p>
<p><strong>ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1</strong></p>
<p><strong>DaciaDokker 230 275 1400 flamable 2.2 1 2.3 1 2.4 1 2 1</strong></p>
<p><strong>Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2</strong></p>
<p><strong>flamable</strong></p></td>
<td><p><strong>ChevroletExpress</strong></p>
<p><strong>DaciaDokker</strong></p></td>
</tr>
</tbody>
</table>

## Car Salesman

Define two classes **Car** and **Engine.** A **Car** has a **model,
engine, weight,** and **color**. An Engine has a **model**, **power,
displacement,** and **efficiency**. A Car's **weight** and **color** and
its Engine's **displacements** and **efficiency** are **optional**.

On the first line, you will read a number **N** which will specify how
many lines of engines you will receive, on each of the next **N** lines,
you will receive information about an **Engine** in the following format
"**{Model} {Power} {Displacement} {Efficiency}**". After the lines with
engines, on the next line, you will receive a number **M** – specifying
the number of Cars that will follow, on each of the next **M** lines,
information about a **Car** will follow in the following format
"**{Model} {Engine} {Weight} {Color}**", where the engine in the format
will be the **model of an existing** **Engine**. When creating the
object for a **Car**, you should keep a **reference to the real engine**
in it, instead of just the engine's model, note that the optional
properties **might be missing** from the formats.

Your task is to print each car (in the order you received them) and its
information in the format defined below, if any of the optional fields
have not been given, print "**n/a**" in its place instead:

"**{CarModel}:  
{EngineModel}:  
Power: {EnginePower}  
Displacement: {EngineDisplacement}  
Efficiency: {EngineEfficiency}  
Weight: {CarWeight}  
Color: {CarColor}**"

### Optional

Override the classes' **ToString()** methods to have a reusable way of
displaying the objects.

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
<p><strong>V8-101 220 50</strong></p>
<p><strong>V4-33 140 28 B</strong></p>
<p><strong>3</strong></p>
<p><strong>FordFocus V4-33 1300 Silver</strong></p>
<p><strong>FordMustang V8-101</strong></p>
<p><strong>VolkswagenGolf V4-33 Orange</strong></p></td>
<td><p><strong>FordFocus:</strong></p>
<p><strong>V4-33:</strong></p>
<p><strong>Power: 140</strong></p>
<p><strong>Displacement: 28</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: 1300</strong></p>
<p><strong>Color: Silver</strong></p>
<p><strong>FordMustang:</strong></p>
<p><strong>V8-101:</strong></p>
<p><strong>Power: 220</strong></p>
<p><strong>Displacement: 50</strong></p>
<p><strong>Efficiency: n/a</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: n/a</strong></p>
<p><strong>VolkswagenGolf:</strong></p>
<p><strong>V4-33:</strong></p>
<p><strong>Power: 140</strong></p>
<p><strong>Displacement: 28</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: Orange</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>DSL-10 280 B</strong></p>
<p><strong>V7-55 200 35</strong></p>
<p><strong>DSL-13 305 55 A+</strong></p>
<p><strong>V7-54 190 30 D</strong></p>
<p><strong>4</strong></p>
<p><strong>FordMondeo DSL-13 Purple</strong></p>
<p><strong>VolkswagenPolo V7-54 1200 Yellow</strong></p>
<p><strong>VolkswagenPassat DSL-10 1375 Blue</strong></p>
<p><strong>FordFusion DSL-13</strong></p></td>
<td><p><strong>FordMondeo:</strong></p>
<p><strong>DSL-13:</strong></p>
<p><strong>Power: 305</strong></p>
<p><strong>Displacement: 55</strong></p>
<p><strong>Efficiency: A+</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: Purple</strong></p>
<p><strong>VolkswagenPolo:</strong></p>
<p><strong>V7-54:</strong></p>
<p><strong>Power: 190</strong></p>
<p><strong>Displacement: 30</strong></p>
<p><strong>Efficiency: D</strong></p>
<p><strong>Weight: 1200</strong></p>
<p><strong>Color: Yellow</strong></p>
<p><strong>VolkswagenPassat:</strong></p>
<p><strong>DSL-10:</strong></p>
<p><strong>Power: 280</strong></p>
<p><strong>Displacement: n/a</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: 1375</strong></p>
<p><strong>Color: Blue</strong></p>
<p><strong>FordFusion:</strong></p>
<p><strong>DSL-13:</strong></p>
<p><strong>Power: 305</strong></p>
<p><strong>Displacement: 55</strong></p>
<p><strong>Efficiency: A+</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: n/a</strong></p></td>
</tr>
</tbody>
</table>

## Teamwork Projects

It's time for teamwork projects, and you are responsible for making the
teams. First, you will receive an integer - the **count** of the teams
you will have to **register**. You will be given a **user** and a
**team** (separated with "**-**"). The user is the **creator** of that
team.

For every newly created team, you should **print** a message:

"**Team {team Name} has been created by {user}\!**"

Next, you will receive a user with the team (separated with "*-\>*")
which means that the user wants to **join** that **team**. Upon
receiving the command: "**end of assignment**", you should print **every
team**, **ordered** by the **count** of its **members** (**descending**)
and then by **name** (**ascending**). For each team (disband teams as
well), you have to print its members **sorted** by name (**ascending**).
However, there are several **rules**:

  - If a user tries to **create** a team more than once, a message
    should be displayed:  
    "**Team {teamName} was already created\!**"

  - The creator of a team cannot **create** another team - the message
    should be thrown:  
    "**{user} cannot create another team\!**"

  - If a user tries to **join** a currently non-existing team, a message
    should be displayed:  
    "**Team {teamName} does not exist\!**"

  - A Member of a team cannot **join** another team - the message should
    be thrown:  
    "**Member {user} cannot join team {team Name}\!**"

  - At the **end** (*after teams' report*), teams with **zero** members
    (with **only a creator**) should **disband, ordered by name in
    ascending other**.

  - Every **valid** team should be printed ordered by **name**
    (ascending) in this format:

"**{teamName}:  
\- {create}  
\-- {member}...**"

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
<td><p><strong>2</strong></p>
<p><strong>Didy-PowerPuffsCoders</strong></p>
<p><strong>Tony-Tony is the best</strong></p>
<p><strong>Petya-&gt;PowerPuffsCoders</strong></p>
<p><strong>Tony-&gt;Tony is the best</strong></p>
<p><strong>end of assignment</strong></p></td>
<td><p>Team PowerPuffsCoders has been created by Didy!</p>
<p>Team Tony is the best has been created by Tony!</p>
<p>Member Tony cannot join team Tony is the best!</p>
<p>PowerPuffsCoders</p>
<p>- Didy</p>
<p>-- Petya</p>
<p>Teams to disband:</p>
<p>Tony is the best</p></td>
<td>Tony created a team that he tried later to join. So the message was shown. Since no one is trying to join his team, the team has to <strong>disband</strong>.</td>
</tr>
<tr class="even">
<td><p><strong>3</strong></p>
<p><strong>Tatyana-CloneClub</strong></p>
<p><strong>Helena-CloneClub</strong></p>
<p><strong>Trifon-BRBClub</strong></p>
<p><strong>Peter-&gt;bRBClub</strong></p>
<p><strong>Peter-&gt;BRBClub</strong></p>
<p><strong>Tatyana-&gt;Leda</strong></p>
<p><strong>Petter-&gt;BRBClub</strong></p>
<p><strong>Cossima-&gt;CloneClub</strong></p>
<p><strong>end of assignment</strong></p></td>
<td><p>Team CloneClub has been created by Tatyana!</p>
<p>Team CloneClub was already created!</p>
<p>Team BRBClub has been created by Trifon!</p>
<p>Team bRBClub does not exist!</p>
<p>Team Leda does not exist!</p>
<p>BRBClub</p>
<p>- Trifon</p>
<p>-- Peter</p>
<p>-- Petter</p>
<p>CloneClub</p>
<p>- Tatyana</p>
<p>-- Cossima</p>
<p>Teams to disband:</p></td>
<td><p>Note that when you join a team, you should check <strong>first</strong> if it exists, <strong>then</strong> check if the user is already in a team:</p>
<p>Tatyana has created CloneClub, and then she tries to join a non-existing team – so a message for the non-existing team is shown.</p></td>
</tr>
</tbody>
</table>
