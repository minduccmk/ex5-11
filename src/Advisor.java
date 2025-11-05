public class Advisor {
    private String fullname;
    private String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Advisor: " + fullName + " | Email: " + email);
    }
}
