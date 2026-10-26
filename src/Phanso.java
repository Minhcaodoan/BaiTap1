public class Phanso {
    private int T;
    private int M;

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }
    public Phanso(){

    }
    public Phanso(int T,int M){
        if (M == 0) {
            System.out.println("Mẫu số không được bằng 0!");
        }
        this.T = T;
        this.M = M;
    }
    @Override
    public String toString() {
        return T+"/"+M;
    }

    public Phanso cong(Phanso P1, Phanso P2) {
        int T = ( P1.getT() * P2.getM() ) + (P1.getM() * P2.getT());
        int M = P1.getM() * P2.getM();
        Phanso ketQua = new Phanso(T, M);
        return ketQua;
    }

    public Phanso tru(Phanso P1, Phanso P2) {
        int T = (P1.getT() * P2.getM()) - (P1.getM() * P2.getT());
        int M = P1.getM() * P2.getM();
        return new Phanso(T, M);
    }

    public Phanso nhan(Phanso P1, Phanso P2) {
        int T = P1.getT() * P2.getT();
        int M = P1.getM() * P2.getM();
        return new Phanso(T, M);
    }

    public Phanso chia(Phanso P1, Phanso P2) {
        int T = P1.getT() * P2.getM();
        int M = P1.getM() * P2.getT();
        return new Phanso(T, M);
    }

    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 0 ? 1 : a;
    }

    public void rutGon() {
        int u = ucln(this.T, this.M);
        this.T /= u;
        this.M /= u;
    }

    public int soSanh(Phanso P) {
        double val1 = (double) this.T / this.M;
        double val2 = (double) P.getT() / P.getM();
        return Double.compare(val1, val2);
    }

    public boolean laSoNguyen() {
        return this.M != 0 && this.T % this.M == 0;
    }
}
