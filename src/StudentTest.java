public class StudentTest {
    public static void main(String[] args) {
        // Membuat objek mahasiswa dengan konstruktor
        Student student1 = new Student("Iyyan");
        Student student2 = new Student("Nanda");

        // Menambahkan kredit dan poin kualitas untuk mahasiswa pertama
        student1.addkreditAndPoints(3, 3.5);
        student1.addkreditAndPoints(4, 3.0);
        student1.addkreditAndPoints(2, 4.0);

        // Menambahkan kredit dan poin kualitas untuk mahasiswa kedua
        student2.addkreditAndPoints(5, 3.7);
        student2.addkreditAndPoints(3, 3.2);
        student2.addkreditAndPoints(4, 3.9);

        // Mengakses dan mencetak informasi mahasiswa pertama
        String nama1 = student1.getName();
        int kredit1 = student1.getKredit();
        double Ipk = student1.getIpk();

        System.out.println("Informasi Mahasiswa 1:");
        System.out.println("Nama Mahasiswa: " + nama1);
        System.out.println("Total Kredit: " + kredit1);
        System.out.println("IPK Kumulatif: " + Ipk);

        // Mengakses dan mencetak informasi mahasiswa kedua
        String nama2 = student2.getName();
        int kredit2 = student2.getKredit();
        double Ipk2 = student2.getIpk();

        System.out.println("Informasi Mahasiswa 2:");
        System.out.println("Nama Mahasiswa: " + nama2);
        System.out.println("Total Kredit: " + kredit2);
        System.out.println("IPK Kumulatif: " + Ipk2);
    }
}

