//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phanso[] P = new Phanso[10];
        P[0] = new Phanso(1,2);
        P[1] = new Phanso(1,4);
        P[2] = new Phanso(1,6);
        P[3] = new Phanso(1,8);
        P[4] = new Phanso(1,10);
        P[5] = new Phanso(1,12);
        P[6] = new Phanso(1,14);
        P[7] = new Phanso(1,16);
        P[8] = new Phanso(1,18);
        P[9] = new Phanso(1,20);
        System.out.println("=== DANH SÁCH PHÂN SỐ ===");
        for (int i = 0; i < P.length; i++) {
            System.out.print(P[i] + "  ");
        }
        System.out.println("\n----------------------------------------");

        //Tìm phân số lớn nhất trong mảng
        Phanso max = P[0];
        for (int i = 0; i < P.length; i++) {
            if (P[i].soSanh(max) > 0) {
                max = P[i];
            }
        }
        System.out.println("Phân số lớn nhất là: " + max);

        //Tính tổng các phân số trong mảng
        Phanso tong = new Phanso(0, 1);
        for (int i = 0; i < P.length; i++) {
            tong = tong.cong(tong, P[i]);
        }
        System.out.println("Tổng các phân số là: " + tong);

        //Xác định các phân số không phải số nguyên
        System.out.println("Các phân số không phải số nguyên là:");
        boolean coPhanSoKhongNguyen = false;
        for (int i = 0; i < P.length; i++) {
            if (!P[i].laSoNguyen()) {
                System.out.println("- " + P[i]);
                coPhanSoKhongNguyen = true;
            }
        }
        if (!coPhanSoKhongNguyen) {
            System.out.println("Không có phân số nào.");
        }
    }
}
