package Entity.Exercise5.Question1;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String name, int age, Gender gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }

    public NhanVien() {

    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
