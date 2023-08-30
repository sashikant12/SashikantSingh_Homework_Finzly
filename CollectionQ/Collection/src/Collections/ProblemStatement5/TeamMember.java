package Collections.ProblemStatement5;

public class TeamMember {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public TeamMember() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                '}';
    }
}
