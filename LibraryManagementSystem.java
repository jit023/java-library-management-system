import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}

// Member Class
class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
}

// Library Class managing Books and Transactions
class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(String bookId, String memberId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Success: Book '" + book.getTitle() + "' borrowed by Member ID: " + memberId);
                    return;
                } else {
                    System.out.println("Notice: Book is already borrowed!");
                    return;
                }
            }
        }
        System.out.println("Error: Book not found!");
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                book.setAvailable(true);
                System.out.println("Success: Book '" + book.getTitle() + "' returned successfully!");
                return;
            }
        }
        System.out.println("Error: Book not found!");
    }
}

// Main Class for Mini Project
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book b1 = new Book("B101", "Java Programming", "John Doe");
        Book b2 = new Book("B102", "Data Structures", "Jane Smith");
        library.addBook(b1);
        library.addBook(b2);

        // Adding members
        Member m1 = new Member("M001", "Alice");
        library.addMember(m1);

        System.out.println("\n--- Borrowing Test ---");
        library.borrowBook("B101", "M001");

        System.out.println("\n--- Returning Test ---");
        library.returnBook("B101");
    }
}