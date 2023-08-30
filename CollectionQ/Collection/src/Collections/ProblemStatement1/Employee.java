package Collections.ProblemStatement1;

public class Employee {
    private String employeeName;
    private int ids;
    private String dept;

    public Employee() {
    }

    public Employee(int ids, String employeeName,String dept) {
        this.employeeName = employeeName;
        this.ids = ids;
        this.dept = dept;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return " ID = " + ids + " Employee Name = " + employeeName
                + " Employee Department = " + dept  ;
    }
}
