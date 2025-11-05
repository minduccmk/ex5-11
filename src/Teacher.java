public class Teacher {
    private Student stu;
    private String title;

    public Teacher(Student stu, String title) {
        this.stu = stu;
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Teacher: " + title + " " + stu.fullName + " | ID: " + stu.teacherID + " | Email: " + stu.email);
    }
}
