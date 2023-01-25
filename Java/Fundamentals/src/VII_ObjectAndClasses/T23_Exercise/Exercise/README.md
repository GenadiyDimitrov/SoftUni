# Exercise: Objects and Classes

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1327)

## Advertisement Message

Write a program that **generates random fake advertisement messages** to
extol some product. The messages must consist of 4 parts: **laudatory**
**phrase** + **event** + **author** + **city**. Use the following
predefined parts:

  - Phrases 
    
      - "**Excellent product.**"
    
      - "**Such a great product.**"
    
      - "**I always use that product**."
    
      - "**Best product of its category.**"
    
      - "**Exceptional product.**"
    
      - "**I can’t live without this product.**"

  - Events
    
      - "**Now I feel good.**"
    
      - "**I have succeeded with this product.**"
    
      - "**Makes miracles. I am happy of the results\!**"
    
      - "**I cannot believe but now I feel awesome.**"
    
      - "**Try it yourself, I am very satisfied.**"
    
      - "**I feel great\!**"

  - Authors
    
      - "**Diana**"
    
      - "**Petya**"
    
      - "**Stella**"
    
      - "**Elena**"
    
      - "**Katya**"
    
      - "**Iva**"
    
      - "**Annie**"
    
      - "**Eva**"

  - Cities
    
      - "**Burgas**"
    
      - "**Sofia**"
    
      - "**Plovdiv**"
    
      - "**Varna**"
    
      - "**Ruse**"

The format of the output message is: "**{phrase} {event} {author} –
{city}**".

As an input, you take the **number of messages** to be generated. Print
each random message on a separate line.

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
<td><strong>3</strong></td>
<td><p>Such a great product. Now I feel good. Elena – Ruse</p>
<p>Excelent product. Makes miracles. I am happy of the results! Katya – Varna</p>
<p>Best product of its category. That makes miracles. Eva – Sofia</p></td>
</tr>
<tr class="even">
<td><strong>4</strong></td>
<td><p>I always use that product. Makes miracles. I am happy of the results! Iva - Ruse</p>
<p>I can’t live without this product. I cannot believe but now I feel awesome. Katya - Burgas</p>
<p>Such a great product. Try it yourself, I am very satisfied. Iva - Varna</p>
<p>Best product of its category. I cannot believe but now I feel awesome. Eva - Ruse</p></td>
</tr>
</tbody>
</table>

## Articles

Create an article class with the following properties:

  - **Title** – a string

  - **Content** – a string

  - **Author** – a string

The class should have a constructor and the following methods:

  - **Edit (new content)** – change the old content with the new one

  - **ChangeAuthor (new author)** – change the author

  - **Rename (new title)** – change the title of the article

  - override **ToString** – print the article in the following format:

**"{title} - {content}: {author}"**

Write a program that reads an article in the following format
**"{title}, {content}, {author}"**. On the next line, you will get the
number **n**. On the next **n lines,** you will get one of the following
commands:

  - **"Edit: {new content}"**

  - **"ChangeAuthor: {new author}"**

  - **"Rename: {new title}"**.

At the end, print the final article.

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
<td><p>some title, some content, some author</p>
<p>3</p>
<p>Edit: better content</p>
<p>ChangeAuthor: better author</p>
<p>Rename: better title</p></td>
<td>better title - better content: better author</td>
</tr>
<tr class="even">
<td><p>Holy Ghost, content, John Sandford</p>
<p>3</p>
<p>ChangeAuthor: Mitch Albom</p>
<p>ChangeAuthor: better author</p>
<p>ChangeAuthor: Kim Heacox</p></td>
<td>Holy Ghost - content: Kim Heacox</td>
</tr>
</tbody>
</table>

## Opinion Poll

Using the Person class, write a program that reads from the console
**N** lines of personal information and then prints all people whose
**age** is **more than 30** years.

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
<td><p><strong>3</strong></p>
<p><strong>Peter 12</strong></p>
<p><strong>Sam 31</strong></p>
<p><strong>Itan 48</strong></p></td>
<td><strong>Sam – 31<br />
Itan - 48</strong></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>Niko 33</strong></p>
<p><strong>Yana 88</strong></p>
<p><strong>Todor 22</strong></p>
<p><strong>Lisa 44</strong></p>
<p><strong>Sam 11</strong></p></td>
<td><p><strong>Niko - 33</strong></p>
<p><strong>Yana - 88</strong></p>
<p><strong>Lisa - 44</strong></p></td>
</tr>
</tbody>
</table>

## Students

Write a program that receives **n count of students** and **orders them
by grade** (in **descending**). Each student should have a **first
name** (string), **last name** (string), and **grade** (a floating-point
number).

### Input

  - First-line will be a number **n.**

  - Next **n** lines you will get a student info in the format **"{first
    name} {second name} {grade}".**

### Output

  - Print each student in the following format **"{first name} {second
    name}: {grade}".**

### Example

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
<p>Lakia Eason 3.90</p>
<p>Prince Messing 5.49</p>
<p>Akiko Segers 4.85</p>
<p>Rocco Erben 6.00</p></td>
<td><p>Rocco Erben: 6.00</p>
<p>Prince Messing: 5.49</p>
<p>Akiko Segers: 4.85</p>
<p>Lakia Eason: 3.90</p></td>
</tr>
<tr class="even">
<td><p>4</p>
<p>Sydnie Britton 5.79</p>
<p>Amias Mathews 2.30</p>
<p>Mora Tod 2.78</p>
<p>Pete Kendrick 2.61</p></td>
<td><p>Sydnie Britton: 5.79</p>
<p>Mora Tod: 2.78</p>
<p>Pete Kendrick: 2.61</p>
<p>Amias Mathews: 2.30</p></td>
</tr>
</tbody>
</table>

## Vehicle Catalogue

You have to make a catalog for vehicles. You will receive two types of
vehicles - a **car** or a **truck**.

Until you receive the command "**End**" you will receive **lines** of
**input** in the format:

|                                                |
| ---------------------------------------------- |
| "{typeOfVehicle} {model} {color} {horsepower}" |

After the "**End**" command, you will start receiving **models** of
**vehicles**. Print for every received vehicle its **data** in the
format:

<table>
<tbody>
<tr class="odd">
<td><p>Type: {typeOfVehicle}</p>
<p>Model: {modelOfVehicle}</p>
<p>Color: {colorOfVehicle}</p>
<p>Horsepower: {horsepowerOfVehicle}</p></td>
</tr>
</tbody>
</table>

When you receive the command "**Close the Catalogue**", stop receiving
input and print the **average** **horsepower** for the **cars** and the
**trucks** in the format:

"{typeOfVehicles} have average horsepower of {averageHorsepower}."

The **average** **horsepower** is calculated by **dividing** the **sum**
of **horsepower** for **all** vehicles of the type by the **total**
**count** of **vehicles** from the **same** **type**.

Format the answer to the **2<sup>nd</sup> decimal point**.

### Constraints

  - The type of vehicle will always be a **car** or **truck.**

  - You will not receive the **same** **model** **twice.**

  - The received horsepower will be an integer in the interval
    **\[1…1000\].**

  - You will receive at most **50** vehicles.

  - **Single** whitespace will be used for the **separator.**

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
<td><p><strong>truck Man red 200</strong></p>
<p><strong>truck Mercedes blue 300</strong></p>
<p><strong>car Ford green 120</strong></p>
<p><strong>car Ferrari red 550</strong></p>
<p><strong>car Lamborghini orange 570</strong></p>
<p><strong>End</strong></p>
<p><strong>Ferrari</strong></p>
<p><strong>Ford</strong></p>
<p><strong>Man</strong></p>
<p><strong>Close the Catalogue</strong></p></td>
<td><p><strong>Type: Car</strong></p>
<p><strong>Model: Ferrari</strong></p>
<p><strong>Color: red</strong></p>
<p><strong>Horsepower: 550</strong></p>
<p><strong>Type: Car</strong></p>
<p><strong>Model: Ford</strong></p>
<p><strong>Color: green</strong></p>
<p><strong>Horsepower: 120</strong></p>
<p><strong>Type: Truck</strong></p>
<p><strong>Model: Man</strong></p>
<p><strong>Color: red</strong></p>
<p><strong>Horsepower: 200</strong></p>
<p><strong>Cars have average horsepower of: 413.33.</strong></p>
<p><strong>Trucks have average horsepower of: 250.00.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>car Opel green 736</strong></p>
<p><strong>End</strong></p>
<p><strong>Close the Catalogue</strong></p></td>
<td><p><strong>Cars have average horsepower of: 736.00.</strong></p>
<p><strong>Trucks have average horsepower of: 0.00.</strong></p></td>
</tr>
</tbody>
</table>

## Order by Age

You will receive an **unknown** number of lines. On each line, you will
receive an array with **3** elements. **The first** element will be a
**string** and represents the **name** of the person. **The second**
element will be a **string** and will represent the **ID** of the
person. **The last** element will be an **integer** which represents the
**age** of the person.

When you receive the command "**End**", stop taking input and print
**all the** **people**, **ordered** by **age**.

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
<td><p><strong>George 123456 20</strong></p>
<p><strong>Peter 78911 15</strong></p>
<p><strong>Stephan 524244 10</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Stephan with ID: 524244 is 10 years old.</strong></p>
<p><strong>Peter with ID: 78911 is 15 years old.</strong></p>
<p><strong>George with ID: 123456 is 20 years old.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>Cindy 88611 2</strong></p>
<p><strong>Kaloyan 13967 3</strong></p>
<p><strong>Simona 53316 11</strong></p>
<p><strong>Gil 31837 72</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Cindy with ID: 88611 is 2 years old.</strong></p>
<p><strong>Kaloyan with ID: 13967 is 3 years old.</strong></p>
<p><strong>Simona with ID: 53316 is 11 years old.</strong></p>
<p><strong>Gil with ID: 31837 is 72 years old.</strong></p></td>
</tr>
</tbody>
</table>

## \*Grooming Salon

### Preparation

Download the skeleton provided in Judge. **Do not** change the
**packages**\!

**Pay attention to the name of the package groomingSalon, all the
classes, their fields, and methods the same way they are presented in
the following document. It is also important to keep the project
structure as described.**

## Problem description

Your task is to create a repository, which stores items by creating the
classes described below.

First, write a Java class **Pet** with the following fields:

  - **name: String**

  - **age: int**

  - **owner: String**

The class **constructor** should receive **all fields.** You need to
create the appropriate **getters and setters**. **T**he class should
override the **toString()** method in the following format:

**"{name} {age} - ({owner})"**

**Next**, write a Java class **GroomingSalon** that has **data** (a
collection, which stores the Pets). All entities inside the repository
have the **same fields**. Also, the **GroomingSalon** class should have
those fields:

  - **capacity: int**

The class **constructor** should receive **capacity**, also it should
initialize the **data** with a new instance of the collection**.**
Implement the following features:

  - Field **data** – **List** that holds added pets

  - Method **add(Pet pet)** – **adds** an **entity** to the data **if**
    **there** **is** an **empty place** in the grooming salon for the
    pet.

  - Method **remove(String name)** – removes the pet by **given name,**
    if such **exists**, and **returns boolean**.

  - Method **getPet(String name, String owner)** – returns the pet with
    the **given name and owner or null if no such pet exists**.

  - Getter **getCount** – **returns** the **number** of pets.

  - **getStatistics()** – **returns** a **String** in the following
    **format**:
    
      - **"** **The grooming salon has the following clients:  
        {name} {owner}  
        {name} {owner}**

> **(…)**"

## Constraints

  - The **combinations** of **names** and **owners** will **always be
    unique**.

  - The **age** of the pets will always be **positive**.

## Examples

This is an example of how the **GroomingSalon** class is **intended to
be used**.

<table>
<thead>
<tr class="header">
<th>Sample code usage</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>// Initialize the repository</p>
<p>GroomingSalon salon = new GroomingSalon(20);</p>
<p>// Initialize entity</p>
<p>Pet dog = new Pet("Ellias", 5, "Tim");</p>
<p>// Print Pet</p>
<p>System.out.println(dog); // Ellias 5 - (Tim)</p>
<p>// Add Pet</p>
<p>salon.add(dog);</p>
<p>// Remove Pet</p>
<p>System.out.println(salon.remove("Ellias")); // true</p>
<p>System.out.println(salon.remove("Pufa")); // false</p>
<p>Pet cat = new Pet("Bella", 2, "Mia");</p>
<p>Pet bunny = new Pet("Zak", 4, "Jon");</p>
<p>salon.add(cat);</p>
<p>salon.add(bunny);</p>
<p>// Get Pet</p>
<p>Pet pet = salon.getPet("Bella", "Mia");</p>
<p>System.out.println(pet); // Bella 2 - (Mia)</p>
<p>// Count</p>
<p>System.out.println(salon.getCount()); // 2</p>
<p>// Get Statistics</p>
<p>System.out.println(salon.getStatistics());</p>
<p>// The grooming salon has the following clients:</p>
<p>//Bella Mia</p>
<p>//Zak Jon</p></td>
</tr>
</tbody>
</table>

## Submission

Zip all the files in the project folder except the **bin** and **obj**
folders.

Submit a **single .zip file**, containing **groomingSalon package, with
the classes inside (Pet, GroomingSalon, and the Main class)**, there is
no specific content required inside the Main class e. g. you can do any
kind of local testing of your program there. However, there should be a
**main(String\[\] args)** method inside.
