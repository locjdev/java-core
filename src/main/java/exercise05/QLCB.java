package exercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private static List<CanBo> dsCanBo = new ArrayList<>();

    public void themCanBo(CanBo canBo) {
        this.dsCanBo.add(canBo);
    }

    public void inDanhSachCanBo() {
        for (CanBo canBo : dsCanBo) {
            System.out.println("Họ tên: " + canBo.getHoTen() + ", Tuổi: " + canBo.getTuoi() + ", Giới tính: " + canBo.getGioiTinh());
            if (canBo instanceof CongNhan) {
                CongNhan congNhan = (CongNhan) canBo;
                System.out.println("Công nhân, Bậc: " + congNhan.getBac());
            } else if (canBo instanceof KySu) {
                KySu kySu = (KySu) canBo;
                System.out.println("Kỹ sư, Ngành đào tạo: " + kySu.getNganhDaoTao());
            } else if (canBo instanceof NhanVien) {
                NhanVien nhanVien = (NhanVien) canBo;
                System.out.println("Nhân viên, Công việc: " + nhanVien.getCongViec());
            }
        }
    }

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập loại cán bộ (1 - Công nhân, 2 - Kỹ sư, 3 - Nhân viên): ");
        int type = scanner.nextInt();
        if (type < 1 || type > 3) return;
        scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Nhập giới tính (NAM, NU, KHAC): ");
        GioiTinh gioiTinh = GioiTinh.valueOf(scanner.next().toUpperCase());


        CanBo canBo = null;
        switch (type) {
            case 1:
                System.out.println("Nhập bậc (1-10): ");
                int bac = scanner.nextInt();
                canBo = new CongNhan(hoTen, tuoi, gioiTinh, bac);
                break;
            case 2:
                System.out.println("Nhập nghành đào tạo: ");
                String nganhDaoTao = scanner.next();
                canBo = new KySu(hoTen, tuoi, gioiTinh, nganhDaoTao);
                break;
            case 3:
                System.out.println("Nhập công việc: ");
                String congViec = scanner.next();
                canBo = new NhanVien(hoTen, tuoi, gioiTinh, congViec);
                break;
        }

        if (canBo != null) {
            qlcb.themCanBo(canBo);
            System.out.println("Đã thêm cán bộ thành công!");
        } else {
            System.out.println("Loại cán bộ không hợp lệ!");
        }
        qlcb.inDanhSachCanBo();
    }
}
