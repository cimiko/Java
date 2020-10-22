public class MahasiswaData {
    public static void main(String[] args) {
        
        // Mahasiswa objects
        Mahasiswa siswa1 = new Mahasiswa();
        Mahasiswa siswa2 = new Mahasiswa();

        // Invoke methods on
        // those objects
        // Set Element
        siswa1.setNama("Cimiko");
        siswa1.setKelamin("Laki-Laki");
        siswa1.setUmur(24);

        siswa2.setNama("Kimmy");
        siswa2.setKelamin("Perempuan");
        siswa2.setUmur(19);

        // Get_element
        siswa1.Print();
        siswa2.Print();

    }
}