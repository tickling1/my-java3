package nested.test.ex1;


public class Library {

    private Book[] books;
    private int bookCount;

    Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }


    public void addBook(String title, String author) {
        
        // 검증 로직을 다 처리하고
        if (bookCount <= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 정상 로직을 처리
        books[bookCount++] = new Book(title, author);

//        Book book = new Book(title, author);
//        books[bookCount] = book;
//        bookCount++;
    }



    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
//        for (Book book : books) { 빈 값이 들어갈 수 있으므로 돌리면 안됨
//            System.out.println("제목: " + book.title + " 저자: " + book.author);
//        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
