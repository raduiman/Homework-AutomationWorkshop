package week_4;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private String department;
    private String jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
}
