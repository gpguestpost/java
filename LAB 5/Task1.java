class Book {

    String title;
    String author;
    boolean isAvailable;


    Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        isAvailable = true; 
    }


    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }


    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {

        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");


        b1.displayBookDetails();
        System.out.println();
        
        b1.borrowBook();  // Borrowing the book
        b1.displayBookDetails();
        System.out.println();

        b1.borrowBook(); // Borrow again...
        System.out.println();

        b1.returnBook();  
        b1.displayBookDetails();
    }
}

