package exercise05;

public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected GioiTinh gioiTinh;

    public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
