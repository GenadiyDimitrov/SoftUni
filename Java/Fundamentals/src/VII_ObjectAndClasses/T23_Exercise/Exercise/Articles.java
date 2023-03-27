package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.Scanner;

/*2.	Articles

Create an article class with the following properties:
•	Title – a string
•	Content – a string
•	Author – a string

The class should have a constructor and the following methods:
•	Edit (new content) – change the old content with the new one
•	ChangeAuthor (new author) – change the author
•	Rename (new title) – change the title of the article
•	override ToString – print the article in the following format:
"{title} - {content}: {author}"

Write a program that reads an article in the following format "{title}, {content}, {author}".

On the next line, you will get the number n.
On the next n lines, you will get one of the following commands:
•	"Edit: {new content}"
•	"ChangeAuthor: {new author}"
•	"Rename: {new title}".

At the end, print the final article.
*/
public class Articles {
    private static class Article {
        String title;
        String author;
        String content;

        public Article(String articleData) {
            String[] data = articleData.split(", ");
            this.title = data[0];
            this.content = data[1];
            this.author = data[2];
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Article article = new Article(sc.nextLine());
        int commandCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < commandCount; i++) {
            String[] command = sc.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    article.edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;
            }
        }
        System.out.println(article);
        sc.close();
    }
}
