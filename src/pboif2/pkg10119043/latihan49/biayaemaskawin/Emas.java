/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan49.biayaemaskawin;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung biaya emas kawin
 */
public class Emas {
    private String nama;
    private double berat;
    private double hargaSatuan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getNama() {
        return nama;
    }

    public double getBerat() {
        return berat;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }
    
    public double hargaTotal(double berat) {
        return berat * hargaSatuan;
    }
}
