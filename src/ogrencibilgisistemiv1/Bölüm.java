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
public class Bölüm {    //öğrenci bölümü için kullanılan sınıfımız

    String bölüm;

    public Bölüm() {
        bölüm = "";
    }

    public Bölüm(String Bölüm) {    //parametreli oluşturucumuz
        this.bölüm = Bölüm;
    }

    public Bölüm(Bölüm bölüm) { // doğrudan bölüm sınıfı ile çalışan oluşturucumuz
        this.bölüm = bölüm.bölüm;
    }

    @Override
    public String toString() {  //string oluşturucu metodumuz
        return bölüm;
    }

    public void input() {   //bölüm girdisi almak için kullanılan metodumuz
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrencinin okuduğu bölümü giriniz:");
        bölüm = input.nextLine();
    }
}
