package OOPS.me;

abstract class LibaryItem{
    private String title;
    private int itemid;

    public LibaryItem(String title, int itemid) {
        this.title = title;
        this.itemid = itemid;
    }

    public String getTitle() {
        return title;
    }

    public int getItemid() {
        return itemid;
    }
    public  void displayInfo(){
        System.out.print("the name "+ getTitle() + " id is " +getItemid());
    }
}
