/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2;

/**
 *
 * @author Rafsan
 */
public class MakananKhasIndonesia {
    //inisialisasi tipe data variable
    String namaMakanan, ciriKhasMakanan, asalMakanan, berkuah, hargaMakanan;

    //pembuatan constructor dengan parameter sesuai variable yang ada
    public MakananKhasIndonesia(String name, String khas, String asal, String kuah, String harga) {
        this.namaMakanan = name;
        this.ciriKhasMakanan = khas;
        this.asalMakanan = asal;
        this.berkuah = kuah;
        this.hargaMakanan = harga;
    }

    public static void main(String[] args) {
        //memanggil constructor dengan parameter nilai tertentu
        MakananKhasIndonesia soto = new MakananKhasIndonesia("Soto Ayam", "Kuah kuning dengan suwiran ayam", "Jawa", "Berkuah", "25000");
        //menampilkan data dari constructor pada terminal
        System.out.println("Nama Makanan : " + soto.namaMakanan + "\nCiri Khas Makanan : " + soto.ciriKhasMakanan + "\nAsal Makanan : " + soto.asalMakanan + "\nBerkuah : " + soto.berkuah + "\nHarga Makanan : " + soto.hargaMakanan);
    }
}
