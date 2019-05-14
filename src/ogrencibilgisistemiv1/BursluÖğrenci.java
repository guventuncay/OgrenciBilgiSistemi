/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencibilgisistemiv1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gvn-9
 */
public class BursluÖğrenci extends Öğrenci {

    private int burs;

    public BursluÖğrenci() {    //parametresiz kurucumuz
        super();    //miras alınan sınıfın kurucusunu alıyoruz
        this.burs = 0;

    }

    public BursluÖğrenci(int burs, İsim isim, Bölüm bölüm, Fakülte fakülte,MothersName mothersName, FathersName fathersName) {   //parametreli kurucumuz
        super(isim, bölüm, fakülte, mothersName, fathersName);    //miras alınan sınıfın kurucusunu parametreli olarak çağırıyoruz
        this.burs = burs;
    }

    
    @Override
    public void input() {   //burslu öğrenci kayıtı yapma metodu
        Scanner input = new Scanner(System.in);
        System.out.println("Burslu öğrenci");
        super.input();
        System.out.println("Öğrencinin bursu: ");
        try {
            burs = input.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali giriş yaptınız\nLütfen takrar deneyiniz.");
            input();
        }
    }

    
    public void printFile() throws IOException {   //öğrenci bilgilerini yazdırmak için kullanacağımız metod
        System.out.println("Burslu Öğrenci");
        super.printFile();
        System.out.println("Öğrencinin bursu: " + burs + "TL");
    }

    @Override
    public String toString() {  // String dönüştürücü metodumuz
        return "Burslu Öğrenci";
    }

}
