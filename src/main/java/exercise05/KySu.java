package exercise05;

public class KySu extends CanBo{
    protected String nganhDaoTao;

    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
