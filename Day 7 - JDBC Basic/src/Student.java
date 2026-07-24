public class Student {

    private int roll_no;
    private String name;
    private int age;
    private String branch;

    public Student() {
    }

    public Student(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public Student(int roll_no, String name, int age, String branch) {

        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}