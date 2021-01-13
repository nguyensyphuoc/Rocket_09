package Entity;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private static int count = 0;
    private int score;

    public Student(String name) {
        this.name = name;
        this.id = count;
        count++;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (name.compareTo(student.name) > 0){
            return 0;
        }
        if (name.compareTo(student.name) < 0){
            return -1;
        }
        return 0;
    }
}
