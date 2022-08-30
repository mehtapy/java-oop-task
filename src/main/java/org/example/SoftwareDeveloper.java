package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{

    private Manager supervisor;
    private String skills;
    private  int experience;

    //Constructor

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, double salary, String department, Manager supervisor, String skills, int experience) {
        super(id, firstName, lastName, age, salary, department);
        this.supervisor = supervisor;
        this.skills = skills;
        this.experience = experience;
    }


//Getters and setters


    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void writeCode() {
       boolean x = this.getDepartment().contentEquals("Development");
       if (x) {System.out.println("Code has been written by: " + this.getFirstName() +" " + this.getLastName()) ;
       }
        }
    @Override
    public void testCode() {
        boolean x = this.getDepartment().contentEquals("Test");
        if (x) {System.out.println("Code has been tested by: " + this.getFirstName() +" " + this.getLastName()) ;
        }
    }

    @Override
    public void pushChanges() {
        if (this.getDepartment() == "Development"){
            System.out.println("Code has been pushed by:"+ this.getFirstName() +" " + this.getLastName());
        }

    }


    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
}
