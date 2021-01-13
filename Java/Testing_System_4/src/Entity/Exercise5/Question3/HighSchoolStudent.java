package Entity.Exercise5.Question3;

public class HighSchoolStudent {
    private int id;
    private String name;
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
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

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }
}
