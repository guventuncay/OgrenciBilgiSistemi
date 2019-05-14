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
public class İsim { //öğrenci isim işlemleri için kullanılacak sınıf
    
    String isim;
    String soyisim;

    public İsim() { //parametresiz oluşturucumuz
        this.isim = "";//sırası ile öğrenci isim ve soyisim değişkenleri başlangıç değerlerinin atama işlemi
        this.soyisim = "";//burada yapılıyor
    }

    public İsim(String isim, String soyisim) {  //parametreli oluşturucumuz
        this.isim = isim;
        this.soyisim = soyisim;
    }
    
    public İsim(İsim öğrenci) { // doğruda İsim sınafı ile calısan olusturucumuz
        this.isim = öğrenci.isim;
        this.soyisim = öğrenci.soyisim;
    }

    @Override
    public String toString() {  //string dönüştürücüsü
        return isim + " " + soyisim;
    }
    
    public void input(){    //öğrenci girdisi alma metodu
        Scanner input = new Scanner(System.in);
        System.out.print("İsim:");
        isim = input.nextLine();
        System.out.print("Soyisim:");
        soyisim = input.nextLine();
    
    
    }
}
