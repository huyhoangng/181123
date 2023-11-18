package demo2;

import java.util.Scanner;

public class Show {

    public static void main(String[] args) {
        // Tạo một đối tượng PhanSo và hiển thị giá trị ban đầu
        Phanso phanSo1 = new Phanso();
        System.out.println("Phân số 1: " + phanSo1.getTuSo() + "/" + phanSo1.getMauSo());

        // Tạo một đối tượng PhanSo với giá trị khác và hiển thị
        Phanso phanSo2 = new Phanso(3, 4);
        System.out.println("Phân số 2: " + phanSo2.getTuSo() + "/" + phanSo2.getMauSo());

        // Sử dụng setter để thay đổi giá trị của tử số và mẫu số
        phanSo1.setTuSo(5);
        phanSo1.setMauSo(2);

        // Hiển thị giá trị mới
        System.out.println("Phân số 1 sau khi thay đổi: " + phanSo1.getTuSo() + "/" + phanSo1.getMauSo());

        Phanso ps1 = new Phanso(2,5);
        Phanso ps2 = new Phanso(5, 10);

        System.out.println("Phân số 1 sau khi thay đổi lần 2:");
        ps1.inPhanSo();

        System.out.println("Phân số 2 sau khi thay đổi lần 2:");
        ps2.inPhanSo();

        // Thực hiện các phép toán
        Phanso tong = ps1.add(ps2);
        Phanso hieu = ps1.sub(ps2);
        Phanso tich = ps1.mul(ps2);
        Phanso thuong = ps1.div(ps2);
        System.out.println("Tổng: ");
        tong.inPhanSo();

        System.out.println("Hiệu: ");
        hieu.inPhanSo();

        System.out.println("Tích: ");
        tich.inPhanSo();

        System.out.println("Thương: ");
        if (thuong != null) {
            thuong.inPhanSo();
        }
        Phanso ps = new Phanso(5, 9);

        System.out.println("Phân số trước khi nghịch đảo:");
        ps.inPhanSo();

        // Thực hiện nghịch đảo
        ps.nghichDao();

        System.out.println("Phân số sau khi nghịch đảo:");
        ps.inPhanSo();
    }




}
