package demo2;

import java.util.Scanner;

public class Phanso {
    private int tuSo;
    private int mauSo;
    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        int tuSo = scanner.nextInt();
        System.out.print("Nhập mẫu số: ");
        int mauSo = scanner.nextInt();
        this.setTuSo(tuSo);
        this.setMauSo(mauSo);
    }

    public Phanso() {
        this.tuSo = 5;
        this.mauSo = 6;
    }


    public Phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;

        this.mauSo = (mauSo != 0) ? mauSo : 1;
    }


    public void inPhanSo() {
        System.out.println(this.getTuSo() + "/" + this.getMauSo());
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }


    public int getMauSo() {
        return mauSo;
    }


    public void setMauSo(int mauSo) {
        // Kiểm tra nếu mẫu số bằng 0 thì gán mẫu số là 1 để tránh lỗi chia cho 0
        this.mauSo = (mauSo != 0) ? mauSo : 1;
    }
    public void rutGon() {
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }
    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void nghichDao() {
        int temp = this.tuSo;
        this.tuSo = this.mauSo;
        this.mauSo = temp;
    }
    public Phanso add(Phanso ps) {
        int newTu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int newMau = this.mauSo * ps.mauSo;
        return new Phanso(newTu, newMau);
    }

    // Phương thức trừ hai phân số
    public Phanso sub(Phanso ps) {
        int newTu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int newMau = this.mauSo * ps.mauSo;
        return new Phanso(newTu, newMau);
    }

    // Phương thức nhân hai phân số
    public Phanso mul(Phanso ps) {
        int newTu = this.tuSo * ps.tuSo;
        int newMau = this.mauSo * ps.mauSo;
        return new Phanso(newTu, newMau);
    }

    // Phương thức chia hai phân số
    public Phanso div(Phanso ps) {
        if (ps.tuSo != 0) {
            int newTu = this.tuSo * ps.mauSo;
            int newMau = this.mauSo * ps.tuSo;
            return new Phanso(newTu, newMau);
        } else {
            System.out.println("Không thể chia cho 0.");
            return null;
        }
    }



}
