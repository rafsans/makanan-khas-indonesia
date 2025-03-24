/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author Rafsan
 */
public class MakananKhasYogyakarta extends MakananKhasIndonesia {

    String lauk, sambal, areh;

    public MakananKhasYogyakarta() {
        super("Gudeg", "Nangka muda dimasak dengan santan", "Yogyakarta", "Tidak berkuah", "25000");
        this.lauk = "Ayam";
        this.sambal = "Sambal Bawang";
        this.areh = "Areh Biasa";
    }

    public void LaukTambahan(String lauk, String sambal, String areh) {
        this.lauk = lauk;
        this.sambal = sambal;
        this.areh = areh;
    }
}
