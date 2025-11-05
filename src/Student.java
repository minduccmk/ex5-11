public class Student    {
    private String fullname;
    private int ID;
    private String email;

    public Student(String fullname, int ID, String email) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Student: " + fullName + " | ID: " + studentID + " | Email: " + email);
    }
}
