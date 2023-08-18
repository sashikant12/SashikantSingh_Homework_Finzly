package OOPS.me;

public class Books extends LibaryItem implements Reservable{
    private String author;

    public String getAuthor() {
        return author;
    }

    public Books(String title, int itemid, String author) {
        super(title, itemid);
        this.author= author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo() ;
        System.out.print(" author is " + this.author);
        System.out.println();
    }

    @Override
        public void reverseItem(LibaryItem item) {
            System.out.println(item.getTitle() + " is reserved");
        }
    }

