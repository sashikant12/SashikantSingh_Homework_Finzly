package OOPS.me;

public class main {
    public static void main(String[] args) {
//        Books j = new Books("brook",345,"me");
//        DVDs e = new DVDs("vtv",123,2);
////        e.reverseItem(e);
//        StudentMember i = new StudentMember(122,"SAShi");
//        i.borrowItem(j);
//        j.reverseItem(j);
//        FacultyMember d = new FacultyMember(123,"Ramanaidu");
//        d.borrowItem(e);
//        e.reverseItem(e);
        Books b = new Books("BROOKS",69,"SASHI");
        DVDs d = new DVDs("SOLE",96,30);
//        b.displayInfo();
//        d.displayInfo();

        StudentMember s = new StudentMember(23,"SAHID");
        FacultyMember f = new FacultyMember(321,"SK");
        s.reverseItem(b);
        s.borrowItem(b);
        f.reverseItem(d);
        f.borrowItem(d);
    }
}
