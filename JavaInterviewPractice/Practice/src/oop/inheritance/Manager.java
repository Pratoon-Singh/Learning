package oop.inheritance;

public class Manager extends Employee{

    private int teamSize;
    public Manager(String name, int employeeId, double salary ,int teamSize) {
        super(name, employeeId, salary);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Managing the team");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
