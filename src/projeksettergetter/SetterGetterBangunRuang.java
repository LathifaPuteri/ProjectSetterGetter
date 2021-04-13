/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeksettergetter;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class SetterGetterBangunRuang {
     //membuat variabel
    private double sisi;
    private double tinggi;
    private double panjang;
    private double lebar;
    protected double luas;
    protected double volume;
    
    //membuat scanner
    Scanner input = new Scanner(System.in);
    
    //membuat setter
    public void setSisi(){
        System.out.println("Sisi = ");
        sisi = input.nextDouble();
    }
    public void setTiggi(){
        System.out.println("Tinggi = ");
        tinggi = input.nextDouble();
    }
    public void setPanjang(){
        System.out.println("Panjang = ");
        panjang = input.nextDouble();
    }
    public void setLebar(){
        System.out.println("Lebar = ");
        lebar = input.nextDouble();
    }
    
    //memunculkan getter
    public double getSisi(){
        System.out.println("Nilai Sisi = "+sisi);
        return sisi;
    }
    public double getTinggi(){
        System.out.println("Nilai Tinggi = "+tinggi);
        return tinggi;
    }
    public double getPanjang(){
        System.out.println("Nilai Panjang = "+panjang);
        return panjang;
    }
    public double getLebar(){
        System.out.println("Nilai Lebar = "+lebar);
        return lebar;
    }
    
    //mengembalikan nilai dengan rumus
    public double getLuasKubus(){
        luas = 6*sisi*sisi;
        return luas;
    }
    public double getVolumeKubus(){
        volume = sisi*sisi*sisi;
        return volume;
    }
    public double getLuasPermukaanBalok(){
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        return luas;
    }
    public double getVolumeBalok(){
        volume = panjang*lebar*tinggi;
        return volume;
    }
}
