package OOPS.me;

public class DVDs extends LibaryItem implements Reservable{
    private int duration;
    public DVDs(String title, int itemid,int duration) {
        super(title, itemid);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" duration is " + this.duration);
        System.out.println();
    }

    @Override
    public void reverseItem(LibaryItem item) {
        System.out.println(item.getTitle() + " is reserved");
    }
}
