import java.util.Scanner; 
 
class BookDetails {
    int bookId; 
    String title; 
    String author;
    String category;     
    boolean isAvailable;     
    
    BookDetails(int bookId, String title, String author, String category, boolean isAvailable) { 
    this.bookId = bookId;         
    this.title = title;         
    this.author = author;         
    this.category = category;         
    this.isAvailable = isAvailable; 
    } 
 
    void displayBookDetails() { 
        System.out.println("Book ID : " + bookId); 
        System.out.println("Title : " + title); 
        System.out.println("Author : " + author); 
        System.out.println("Category : " + category); 
        System.out.println("Availability : " + (isAvailable ? "Available" : "Not Available")); 
    } 
} 
 
class MemberDetails {     
    int memberId; 
    String name;     
    String department;     
    int maxBooksAllowed; 
 
    MemberDetails(int memberId, String name, String department, int maxBooksAllowed) { 
        this.memberId = memberId;
        this.name = name;         
        this.department = department;         
        this.maxBooksAllowed = maxBooksAllowed; 
    } 
 
    void displayMemberDetails() { 
        System.out.println("Member ID : " + memberId); 
        System.out.println("Member Name : " + name); 
        System.out.println("Department : " + department); 
        System.out.println("Max Books Allowed : " + maxBooksAllowed); 
    } 
} 
 
class IssueDetails {     
    int issuedBooks;     
    int returnedBooks; 
 
    IssueDetails(int issuedBooks, int returnedBooks) {         
        this.issuedBooks = issuedBooks;         
        this.returnedBooks = returnedBooks; 
    } 
 
    void displayIssueDetails() { 
        System.out.println("Books Issued : " + issuedBooks); 
        System.out.println("Books Returned : " + returnedBooks); 
        System.out.println("Currently Holding : " + (issuedBooks - returnedBooks)); 
    } 
} 
 
public class LibraryManagementSystem {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter Book ID:");         
        int bookId = sc.nextInt();         
        sc.nextLine(); 
 
        System.out.println("Enter Title:"); 
        String title = sc.nextLine(); 
 
        System.out.println("Enter Author:"); 
        String author = sc.nextLine(); 
 
        System.out.println("Enter Category:"); 
        String category = sc.nextLine(); 
 
        System.out.println("Is Available (true/false):");         
        boolean isAvailable = sc.nextBoolean(); 
 
        BookDetails book = new BookDetails(bookId, title, author, category, isAvailable); 
 
        System.out.println("Enter Member ID:");         
        int memberId = sc.nextInt();         
        sc.nextLine(); 
 
        System.out.println("Enter Name:"); 
        String name = sc.nextLine(); 
 
        System.out.println("Enter Department:"); 
        String department = sc.nextLine(); 
 
        System.out.println("Enter Max Books Allowed:");         
        int maxBooks = sc.nextInt(); 
 
        MemberDetails member = new MemberDetails(memberId, name, department, maxBooks); 
 
        System.out.println("Enter Issued Books:");         
        int issued = sc.nextInt(); 
 
        System.out.println("Enter Returned Books:");         
        int returned = sc.nextInt(); 
 
        IssueDetails issue = new IssueDetails(issued, returned); 
 
        System.out.println("\nLIBRARY REPORT");         
        book.displayBookDetails();         
        member.displayMemberDetails();         
        issue.displayIssueDetails(); 
 
        sc.close(); 
    } 
} 

    

