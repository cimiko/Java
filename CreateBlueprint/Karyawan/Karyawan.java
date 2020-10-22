public class Karyawan {
    //Attribute_declaration
    String nama;
    String jabatan;
    int gaji = 0;
    
    public void setNama(String newName){
        nama = newName;
    }

    public void setJabatan(String newJob){
        jabatan = newJob;
    }

    public void setGaji(){
        if( jabatan == "manager" || jabatan == "Manager"){
            gaji = 10000000;
        }else if( jabatan == "supervisor" || jabatan == "Supervisor" ){
            gaji = 7000000;
        }else if( jabatan == "staff" || jabatan == "Staff"){
            gaji = 5000000;
        }else{
            gaji = 10;
        }
    }

    public String getNama(){
        return nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public int getGaji(){
        return gaji;
    }

    void print(){
        System.out.println("Nama: " + nama +
        " Jabatan: " + jabatan + 
        " Gaji: Rp" + gaji);
    }
}