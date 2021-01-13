package Entity.Exercise4;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float gpa;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.gpa = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void plusGpa(float gpa) {
        this.gpa += gpa;
    }

    public void printInfoStudent(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Point GPA: ");
        if (this.gpa > 8.0) System.out.println("Giỏi");

        else if (this.gpa > 6.0) System.out.println("Khá");

        else if (this.gpa > 4.0) System.out.println("Trung Bình");

        else System.out.println("Yếu!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
