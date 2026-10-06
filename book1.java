public class book1 {
    public static void main(String[] args) {

        PrintedBook Book1 = new PrintedBook("HarryPotter", "J.K.Rowling", 9781408856772L, 500, "Fiction-A3");
        EBook Book2 = new EBook("i-die-with-my-die", "Priyadharshi", 6942014369420L, 1120, 3338.02);
        books[] books = { Book1, Book2 };

        for(books b :books){
            b.Display();
        }
    }
}

class books {
    private String Title;
    private String Author;
    private long ISBN;
    private int Prize;

    books(String title, String author, long isbn, int prize) {
        this.Title = title;
        this.Author = author;
        this.ISBN = isbn;
        this.Prize = prize;
    }

    public void Display() {
        System.out.println("Title:" + Title);
        System.out.println("Author:" + Author);
        System.out.println("ISBN:" + ISBN);
        System.out.println("Prize:" + Prize);

    }

    public String getTitleName() {
        return Title;
    }

    public String getAuthorName() {
        return Author;
    }

    public long getISBNCode() {
        return ISBN;
    }

    public int getPrize() {
        return Prize;
    }
};

class PrintedBook extends books {

    private String ShelfLocation;

    PrintedBook(String title, String author, long isbn, int prize, String shelfLocation) {
        super(title, author, isbn, prize);
        this.ShelfLocation = shelfLocation;
    }

    @Override 
    public void Display(){
        System.out.println("-----------------------------");
        super.Display();
        System.out.println("Shelf Location:" + ShelfLocation);
        System.out.println("------------------------------");
    }

    public String getShelfLocation() {
        return ShelfLocation;
    }
};

class EBook extends books {
    private double fileSizeMB;

    public void Download() {
        System.out.println("Downloading...");
    }

    EBook(String title, String author, long isbn, int prize, double fileSizeMB) {
        super(title, author, isbn, prize);
        this.fileSizeMB = fileSizeMB;
    }
    @Override 
    public void Display(){
        System.out.println("-----------------------------");
        super.Display();
        System.out.println("file Size:" + fileSizeMB);
        System.out.println("-----------------------------");
    }

    public double getFileSize() {
        return fileSizeMB;
    }
};
