/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author Rafsan
 */
public class MakananKhasMalang extends MakananKhasIndonesia {

    String pentol, tahu, pangsitGoreng, siomay, mie;

    public MakananKhasMalang() {
        super("Bakso", "Kuah kaldu dengan tulang sapi", "Malang", "Berkuah", "30000");
        this.pentol = "2";
        this.tahu = "3";
        this.pangsitGoreng = "2";
        this.siomay = "1";
        this.mie = "2";
    }

    public void Bakso(String pentol, String tahu, String pangsitGoreng, String siomay, String mie) {
        this.pentol = pentol;
        this.tahu = tahu;
        this.pangsitGoreng = pangsitGoreng;
        this.siomay = siomay;
        this.mie = mie; 
    }

}
