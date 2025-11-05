public class KLTN<T extends Student, V extends Teacher> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String LuanTitle;

    public KLTN(T student, V supervisor, String thesisTitle) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    @Override
    public int compareTo(KLTN<T, V> compare) {
        return this.LuanTitle.compareToIgnoreCase(compare.LuanTitle);
    }

    public void print() {
        System.out.println("KLTN: " + thesisTitle);
        student.printInfo();
        supervisor.printInfo();
        System.out.println();
    }
}
