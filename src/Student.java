public class Student {
    private String nama;
    private int kredit;
    private double Ipk;
    private double Points;

    // Constructor
    public Student(String Nama) {
        this.nama = nama;
        this.kredit = 0;
        this.Ipk = 0.0;
        this.Points = 0.0;
    }
    public double Ipk() {
        if (kredit == 0) {
            return 0.0;
        }
        return Points / kredit;
    }
    public void addkreditAndPoints(int kreditEarned, double gradePointsEarned) {
        // Menambahkan kredit
        this.kredit += kreditEarned;

        // Menghitung poin kualitas untuk kredit yang baru ditambahkan
        double Points = kreditEarned * gradePointsEarned;

        // Menambahkan poin kualitas baru ke poin kualitas yang ada
        this.Points += Points;

        // Memperbarui nilai kumulatif IPK
        this.Ipk = Ipk();
    }

    // Getter untuk nama mahasiswa
    public String getName() {
        return nama;
    }

    // Getter untuk kredit
    public int getKredit() {
        return kredit;
    }

    // Getter untuk nilai kumulatif IPK
    public double getIpk() {
        return Ipk;
    }
}
