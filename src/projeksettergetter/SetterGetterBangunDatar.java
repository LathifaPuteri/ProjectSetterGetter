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
public class SetterGetterBangunDatar {
    //membuat variabel
    private double alas;
    private double tinggi;
    private double a, b, c, d;
    protected double getAlas;
    protected double getTinggi;
    protected double getA;
    protected double getB;
    protected double getC;
    protected double getD;
    protected double luas;
    protected double keliling;
    
    //membuat scanner
    Scanner input = new Scanner (System.in);
    
    //membuat setter
    public void setAlas(){
       System.out.println("Alas = ");
       alas = input.nextDouble();
    }
    public void setTiggi(){
        System.out.println("Tinggi = ");
        tinggi = input.nextDouble();
    }
    public void setA(){
        System.out.println("Nilai A = ");
        a = input.nextDouble();
    }
    public void setB(){
        System.out.println("Nilai B = ");
        b = input.nextDouble();
    }
    public void setC(){
        System.out.println("Nilai C = ");
        c = input.nextDouble();
    }
    public void setD(){
        System.out.println("Nilai D = ");
        d = input.nextDouble();
    }
    
    //memunculkan getter
    public double getAlas(){
        System.out.println("Nilai Alas = "+alas);
        return alas;
    } 
    public double getTinggi(){
        System.out.println("Nilai Tinggi = "+tinggi);
        return tinggi;
    }
    public double getA(){
        System.out.println("Nilai A = "+a);
        return a;
    }
    public double getB(){
        System.out.println("Nilai B = "+b);
        return b;
    }
    public double getC(){
        System.out.println("Nilai C = "+c);
        return c;
    }
    public double getD(){
        System.out.println("Nilai D = "+d);
        return d;
    }
    
    //mengembalikan nilai dengan rumus
    public double getLuasSegitiga(){
        luas = alas*tinggi/2;
        return luas;
    }
    public double getKelilingSegitiga(){
        keliling = a+b+c;
        return keliling;
    }
    public double getLuasTrapesium(){
        luas = tinggi*(a+b)/2;
        return luas;
    }
    public double getKelilingTrapesium(){
        keliling = a+b+c+d;
        return keliling;
    }
}
