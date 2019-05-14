/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencibilgisistemiv1;

import java.util.Scanner;

/**
 *
 * @author gvn-9
 */
public class Fakülte {  //fakülte işlemlerinin yapılacağı sınıfımız
    
    String fakülte;

    public Fakülte() {
        fakülte = "";
    }

    public Fakülte(String Fakülte) {    //doğrudan oluşturucumuz
        this.fakülte = Fakülte;
    }

    public Fakülte(Fakülte fakülte) {   //fakülte sınıfını parametre alan oluşturucumuz
        this.fakülte = fakülte.fakülte;
    }

    @Override
    public String toString() {  //string oluşturucumuz
        return fakülte;
    }

    public void input() {   //bölüm giridisi almak için kullanılacak metodumuz
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrencinin okuduğu fakülteyi giriniz:");
        fakülte = input.nextLine();
    }
}
