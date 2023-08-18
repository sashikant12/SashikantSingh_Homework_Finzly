package OOPS.me;

public class FacultyMember extends LibaryMember{

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowItem(LibaryItem item) {
        item.displayInfo();
        System.out.println("the item is borrowed by " + super.getName());
    }
}
