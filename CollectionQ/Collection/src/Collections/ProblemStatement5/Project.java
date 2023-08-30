package Collections.ProblemStatement5;

public class Project {
    private String name;
    private String requirment;
    private int daysToComplete;

    public Project() {
    }

    public Project(String name, String requirment, int daysToComplete) {
        this.name = name;
        this.requirment = requirment;
        this.daysToComplete = daysToComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequirment() {
        return requirment;
    }

    public void setRequirment(String requirment) {
        this.requirment = requirment;
    }

    public int getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(int daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", requirment='" + requirment + '\'' +
                ", daysToComplete=" + daysToComplete +
                '}';
    }
}
