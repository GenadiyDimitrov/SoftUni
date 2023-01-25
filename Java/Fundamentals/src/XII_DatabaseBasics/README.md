# Lab: Database Basics MySQL Queries

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3835/programming-fundamentals-september-2022).

Submit your solutions (source code) of all below described problems in
the [Judge.](https://judge.softuni.bg/Contests/1551/Database-Basics-Lab)

## Create New Database

First start **HeidiSQL**. Then write a query that will create the
"**softuni**" database.

Queries are written in the "Query" tab:

![](media/image1.png)

When we create a database, we specify the database we want to use. This
is done by using the "**USE**" clause:

![](media/image2.png)

## Create Table

**Submit your solutions in JUDGE without the** "**USE {database name}**"
**row**:

Using **HeidiSQL** in database **"softuni"** create table
**"students"**. You should specify five columns:

  - Name: **id**, Datatype: **INT**, **Autoincrement**, **Primary**
    **Key**

  - Name: **first\_name**, Datatype: **VARCHAR**, Max Length: **50**,
    Allow **NULL**: true

  - Name: **last\_name**, Datatype: **VARCHAR**, Max Length: **50**,
    Allow **NULL**: true

  - Name: **age**, Datatype: **INT**, Allow **NULL**: true

  - Name **grade**, Datatype: **DOUBLE**, Allow **NULL**: true

## Insert Data

Insert 6 recordings in the **"students"** table.

### Example

| **Id** | **first\_name** | **last\_name** | **age** | **grade** |
| ------ | --------------- | -------------- | ------- | --------- |
| 1      | Guy             | Gilbert        | 15      | 4.5       |
| 2      | Kevin           | Brown          | 17      | 5.4       |
| 3      | Roberto         | Tamburello     | 19      | 6         |
| 4      | Linda           | Smith          | 18      | 5         |
| 5      | John            | Stones         | 16      | 4.25      |
| 6      | Nicole          | Nelson         | 17      | 5.50      |

## Find All Records

Write a query to find all records.

## Find Last Name, Age and Grade

Write a query to find the last name, age, and grade of each student.

| **last\_name** | **age** | **grade** |
| -------------- | ------- | --------- |
| Gilbert        | 15      | 4.5       |
| Brown          | 17      | 5.4       |
| Tamburello     | 19      | 6         |
| Smith          | 18      | 5         |
| Stones         | 16      | 4.25      |
| Nelson         | 17      | 5.50      |

## Find First 5 Records

Write a query to find the first 5 records.

| **Id** | **first\_name** | **last\_name** | **age** | **grade** |
| ------ | --------------- | -------------- | ------- | --------- |
| 1      | Guy             | Gilbert        | 15      | 4.5       |
| 2      | Kevin           | Brown          | 17      | 5.4       |
| 3      | Roberto         | Tamburello     | 19      | 6         |
| 4      | Linda           | Smith          | 18      | 5         |
| 5      | John            | Stones         | 16      | 4.25      |

## Find First 5 Last Name and Grade

Write a query to find the top 5 records. Select only last name and
grade.

| **last\_name** | **grade** |
| -------------- | --------- |
| Gilbert        | 4.5       |
| Brown          | 5.4       |
| Tamburello     | 6         |
| Smith          | 5         |
| Stones         | 4.25      |

## Truncate Table

Remove all records in **"students"** table.

## Drop Table

Drop table **"students"**.

## Drop Database

Drop database **"softuni"**.
