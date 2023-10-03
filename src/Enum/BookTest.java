package Enum;

public class BookTest {
    public static void main(String[] args) {
        for ( Book book : Book.values()){
            System.out.printf( "%-12s%-50s%s%n", book, book.getTitle(), book.getCopyWriteYear());

        }
    }
}