package OOPS.me;

abstract class LibaryMember implements Reservable {
    private int memberId;
    private String name;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LibaryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
    abstract void borrowItem(LibaryItem item);

    @Override
    public void reverseItem(LibaryItem item) {
        item.displayInfo();
        System.out.println("is reserved now");
    }
}
