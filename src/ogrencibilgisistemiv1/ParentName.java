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
public class ParentName {
    
    String isim;

    public ParentName() { //parametresiz oluşturucumuz
        this.isim = "";//sırası ile öğrenci isim ve soyisim değişkenleri başlangıç değerlerinin atama işlemi
        //burada yapılıyor
    }

    public ParentName(String isim) {  //parametreli oluşturucumuz
        this.isim = isim;
        
    }
    
    public ParentName(ParentName öğrenci) { // doğruda İsim sınafı ile calısan olusturucumuz
        this.isim = öğrenci.isim;
        
    }

    @Override
    public String toString() {  //string dönüştürücüsü
        return isim + " ";
    }
    
    public void input(){    //öğrenci girdisi alma metodu
        Scanner input = new Scanner(System.in);
        System.out.print("İsim:");
        isim = input.nextLine();
    }
    
}
