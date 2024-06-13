package exercise05;

public class NhanVien extends CanBo{
    protected String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String congViec) {
        super(hoTen, tuoi, gioiTinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
