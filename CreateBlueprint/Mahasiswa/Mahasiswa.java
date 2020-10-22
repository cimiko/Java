public class Mahasiswa {
    // Attribute_declaration
    String nama;
    String jenis_kelamin;
    int umur;

    
    // Modifier_declaration
    public void setNama(String newName){
        nama = newName;
    }

    public void setKelamin(String newGender){
        jenis_kelamin = newGender;
    }

    public void setUmur(int newOld){
        umur = newOld;
    }
    
    public String getNama(){
        return nama;
    }

    public String getKelamin(){
        return jenis_kelamin;
    }

    public int getUmur(){
        return umur;
    }

    void Print(){
        System.out.println("Nama: " + nama +
        " Kelamin: " + jenis_kelamin + 
        " Umur: " + umur + " Tahun.");
    }
}