package exercise05;

public class CongNhan extends CanBo {
    protected int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, int bac) {
        super(hoTen, tuoi, gioiTinh);
        bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
