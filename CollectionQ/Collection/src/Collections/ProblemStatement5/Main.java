package Collections.ProblemStatement5;

import java.util.*;

public class Main {
    static int i=0;
    public static void main(String[] args) {
        List<Project>projects= new ArrayList<>();
        HashMap<TeamMember,Project> detail = new HashMap<>();
        Scanner sc = new Scanner(System.in);

      while(true){
        System.out.println("1 add project");
        System.out.println("2 assign team");
        System.out.println("3 project detail");
        System.out.println("4 list of all project ");
          System.out.println("5 exit");
        int c= sc.nextInt();
        sc.nextLine();
        switch (c){
            case 1:
                System.out.println("Enter project name");
                String name = sc.nextLine();
                System.out.println("requirment");
                String req = sc.nextLine();
                System.out.println("day to complete");
                int days= sc.nextInt();
                Project project = new Project(name,req,days);
               projects.add(project);
                break;
            case 2:
                if(i<=projects.size()) {
                    System.out.println("enter team name");
                    String team = sc.nextLine();
                    TeamMember teamMember = new TeamMember(team);
                    detail.put(teamMember, projects.get(i));
                    i++;
                    System.out.println(i);
                }
                else {
                    System.out.println("no project");
                }
                break;
            case 3:
                for (Project p :projects) {
                    System.out.println(p.toString());
                }
               break;
            case 4:
                for (Map.Entry<TeamMember,Project> entry : detail.entrySet()){
                    System.out.println("Project team = " + entry.getKey() +
                            ", project detail = " + entry.getValue());
                }
                break;
            case 5 :
                System.out.println("exit");
                System.exit(0);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
}
