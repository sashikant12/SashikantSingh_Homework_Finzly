package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    int ID;
    String Name;
    String Salary;
    String Profile;

    @Id
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String profile) {
        Profile = profile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Salary='" + Salary + '\'' +
                ", Profile='" + Profile + '\'' +
                '}';
    }
}
