/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeksettergetter;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //judul 1
        System.out.println ("==============="
                           + " Kalkulator Sederhana "
                           + "================");
        
        //membuat objek baru dari StterGetterBangunDatar
        SetterGetterBangunDatar segitiga = new SetterGetterBangunDatar();
        SetterGetterBangunDatar trapesium = new SetterGetterBangunDatar();
        
        //membuat objek baru dari SetterGetterBangunRuang
        SetterGetterBangunRuang kubus = new SetterGetterBangunRuang();
        SetterGetterBangunRuang balok = new SetterGetterBangunRuang();
        
        //judul 2
        System.out.println("\n"+"****** Menghitung Luas dan Keliling Segitiga ******"+"\n");
        
        //memberikan nilai dari setter yang sudah dibuat (Segitiga)
        segitiga.setAlas();
        segitiga.setTiggi();
        segitiga.setA();
        segitiga.setB();
        segitiga.setC();
        System.out.println("-------------------");
        
        //menampilkan getter dari setter input
        segitiga.getAlas();
        segitiga.getTinggi();
        segitiga.getA();
        segitiga.getB();
        segitiga.getC();
        System.out.println("");
        
        //menampilkan getter rumus segitiga
        System.out.println("Luas Segitiga = "+segitiga.getLuasSegitiga());
        System.out.println("Keliling Segitiga = "+segitiga.getKelilingSegitiga());
        
        //judul 3
        System.out.println("\n"+"****** Menghitung Luas dan Keliling Trapesium ******"+"\n");
        
        //memberikan nilai dari setter yang sudah dibuat (Trapesium)
        trapesium.setA();
        trapesium.setB();
        trapesium.setC();
        trapesium.setD();
        trapesium.setTiggi();
        System.out.println("-------------------");
        
        //menampilkan getter dari setter input
        trapesium.getA();
        trapesium.getB();
        trapesium.getC();
        trapesium.getD();
        trapesium.getTinggi();
        System.out.println("");
        
        //menampilkan getter rumus trapeium
        System.out.println("Luas Trapesium = "+trapesium.getLuasTrapesium());
        System.out.println("Keliling Trapesium = "+trapesium.getKelilingTrapesium());
        
        //judul 4
        System.out.println("\n"+"****** Menghitung Luas Permukaan dan Volume Kubus ******"+"\n");
        
        //memberikan nilai dari setter yang sudah dibuat (Kubus)
        kubus.setSisi();
        System.out.println("-------------------");
        
        //menampilkan getter dari setter input
        kubus.getSisi();
        System.out.println("");
        
        //menapilkan getter kubus
        System.out.println("Luas Permukaan Kubus = "+kubus.getLuasKubus());
        System.out.println("Volume Kubus = "+kubus.getVolumeKubus());
        
        //judul 5
        System.out.println("\n"+"****** Menghitung Luas Permukaan dan Volume Balok ******"+"\n");
        
        //memberikan nilai dari setter yang sudah dibuat (Balok)
        balok.setTiggi();
        balok.setLebar();
        balok.setPanjang();
        System.out.println("-------------------");
        
        //menampilkan getter dari setter input
        balok.getTinggi();
        balok.getLebar();
        balok.getPanjang();
        System.out.println("");
        
        //menampilkan getter balok
        System.out.println("Luas Permukaan Balok = "+balok.getLuasPermukaanBalok());
        System.out.println("Volume Balok = "+balok.getVolumeBalok());
    }
    
}
