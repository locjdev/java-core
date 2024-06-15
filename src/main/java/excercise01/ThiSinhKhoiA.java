package excercise01;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return "Toán, Lý, Hóa";
    }
}
