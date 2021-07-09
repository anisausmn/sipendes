/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipendes.model;

/**
 *
 * @author sulthonuladib
 */
public class Penduduk {
    public int idPenduduk;
    public String nama, alamat, tempatLahir, tanggalLahir, nomorKK, NIK;
    public boolean isLakiLaki;
    
    public Penduduk() {
        
    }
    
    public Penduduk(String nama, String alamat, boolean isLakiLaki, String tempatLahir, String tanggalLahir, String nomorKK, String NIK) {
        this.nama = nama;
        this.alamat = alamat;
        this.isLakiLaki = isLakiLaki;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.nomorKK = nomorKK;
        this.NIK = NIK;
    }
    
    public int getIdPenduduk () {
        return this.idPenduduk;
    }
    
    public void setIdPenduduk(int newIdPenduduk) {
        this.idPenduduk = newIdPenduduk;
    }
    
    public String getNamaPenduduk() {
        return this.nama;
    }
    
    public void setNamaPenduduk(String newNamaPenduduk) {
        this.nama = newNamaPenduduk;
    }
    
    public String getAlamatPenduduk() {
        return this.alamat;
    }
    
    public void setAlamatPenduduk(String newAlamatPenduduk) {
        this.alamat = newAlamatPenduduk;
    }
    
    public String getJenisKelamin() {
        if (this.isLakiLaki == true) {
            return "Laki-Laki";
        } else if (this.isLakiLaki == false) {
            return "Perempuan";
        } else {
            return "Jenis kelamin belum di set";
        }
    }
    
    public void setJenisKelamin(boolean isLakiLaki) {
        this.isLakiLaki = isLakiLaki;
    }
    
    public String getTempatTanggalLahir() {
        String tempatTanggalLahir = this.tempatLahir + " " + this.tanggalLahir;
        return tempatTanggalLahir;
    }
    
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String getNomorKK() {
        return this.nomorKK;
    }
    
    public void setNomorKK(String nomorKK) {
        this.nomorKK = nomorKK;
    }
    
    public String getNIK() {
        return this.NIK;
    }
    
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
}
