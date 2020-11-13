/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan49.biayaemaskawin;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung biaya emas kawin
 * 
 */
public class PBOIF210119043Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        Scanner scanner = new Scanner(System.in);
        Emas emas = new Emas();
        System.out.println("====Program Hitung Emas Kawin====");
        System.out.print("Masukan Nama : ");
        String nama = scanner.nextLine();
        emas.setNama(nama);
        
        System.out.print("Berat Emas (gram): ");
        double berat = scanner.nextDouble();
        emas.setBerat(berat);
        emas.setHargaSatuan(570000);
        
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("Nama : " + emas.getNama());
        System.out.println("Berat Emas (gram) : " + emas.getBerat());
        System.out.println("Harga Satuan (1 gram) : Rp. " + emas.getHargaSatuan());
        System.out.printf("Total Harga :  Rp. %s %n", kursIndonesia.format(emas.hargaTotal(emas.getBerat())));
        //Rp. %s %n", kursIndonesia.format(emas.hargaTotal(emas.getBerat()))
        
    }
    
}
