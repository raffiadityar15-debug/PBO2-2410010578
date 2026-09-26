package id.ac.uniska.pbo2.p01;

public class KartuMahasiswa {

    public static void main(String[] args) {

        // Data mahasiswa
        String nama = "Raffi Aditya Rahman";
        String npm = "2410010578";
        String prodi = "Teknik Informatika";
        int semester = 5;
        String alasan = "Ingin memahami pemrograman lebih dalam ";

        // Menampilkan kartu mahasiswa
        System.out.println("================================");
        System.out.println("     KARTU MAHASISWA PBO 2");
        System.out.println("================================");
        System.out.println("Nama      : " + nama);
        System.out.println("NPM       : " + npm);
        System.out.println("Prodi     : " + prodi);
        System.out.println("Semester  : " + semester);
        System.out.println("Alasan    : " + alasan);
        System.out.println("================================");
    }
}