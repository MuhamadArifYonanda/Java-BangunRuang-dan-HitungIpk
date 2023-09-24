public class TesBangunRuang {
        public static void main(String[] args) {

            BangunRuang balok = new BangunRuang(5, 3, 4);

            int panjang = balok.getPanjang();
            int lebar = balok.getLebar();
            int tinggi = balok.getTinggi();

            System.out.println("Volume Bangun Ruang: " + panjang * lebar * tinggi);
        }
    }

