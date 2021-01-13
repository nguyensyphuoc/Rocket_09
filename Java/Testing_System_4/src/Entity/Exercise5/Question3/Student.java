package Entity.Exercise5.Question3;

public abstract class Student {
    protected int id;
    protected String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
