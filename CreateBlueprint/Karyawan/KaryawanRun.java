public class KaryawanRun {
    public static void main(String[] args){
        // Karyawan objects
        Karyawan karyawan1 = new Karyawan();
        Karyawan karyawan2 = new Karyawan();
        Karyawan karyawan3 = new Karyawan();

        // Invoke Methods on
        // Those objects
        karyawan1.setNama("Miko");
        karyawan1.setJabatan("Supervisor");
        karyawan1.setGaji();
        
        karyawan2.setNama("Cimi");
        karyawan2.setJabatan("Manager");
        karyawan2.setGaji();

        karyawan3.setNama("Jishu");
        karyawan3.setJabatan("Staff");
        karyawan3.setGaji();

        karyawan1.print();
        karyawan2.print();
        karyawan3.print();
    }
}