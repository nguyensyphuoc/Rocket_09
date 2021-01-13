package entity.Exercise1.Question2;

public class GradeLevel {
    private String tenKhoiThi;
    private String monThi;

    public String getTenKhoi() {
        return tenKhoiThi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoiThi = tenKhoi;
    }

    public String getMonHoc() {
        if (tenKhoiThi.equals("A") || tenKhoiThi.equals("a"))
            return monThi = "Toán, Lý, Hóa";
        if (tenKhoiThi.equals("B") || tenKhoiThi.equals("b"))
            return  monThi = "Toán, Hóa, Sinh";
        if (tenKhoiThi.equals("c") || tenKhoiThi.equals("C"))
            return monThi = "Văn, Sử, Địa";
        return monThi;
    }

    @Override
    public String toString() {
        return "GradeLevel{" +
                "tenKhoiThi='" + tenKhoiThi + '\'' +
                ", monThi='" + monThi + '\'' +
                '}';
    }
}
