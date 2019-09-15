package Library;

public class Employees extends People {

    private int Salary;
    private String jobTitle;
    private int securityLevel;

    public Employees(String ID, String firstName, String lastName, String email,
                     String postCode, String phoneNum, int age, int salary,
                     String jobTitle, int securityLevel) {
        super(ID, firstName, lastName, email, postCode, phoneNum, age);
        Salary = salary;
        this.jobTitle = jobTitle;
        this.securityLevel = securityLevel;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

}
