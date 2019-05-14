/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencibilgisistemiv1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author gvn-9
 */
public class Öğrenci {

    //Öğrenci temel kayıt sınıfı
    private İsim isim;
    private MothersName mothername;
    private FathersName fathername;
    private Fakülte fakülte;
    private Bölüm bölüm;
    private static int öğrenciNumarasıSayacı = 1921680000;    //her yeni kayıtta artacak şekilde programlamıştır
    private int öğrenciNumarası;

    public Öğrenci(İsim isim, Bölüm bölüm, Fakülte fakülte, MothersName mothername, FathersName fathername) {   //parametreli oluşturucumuz
        this.isim = new İsim(isim);
        this.fathername = new FathersName(fathername);
        this.mothername = new MothersName(mothername);

        this.bölüm = new Bölüm(bölüm);
        this.fakülte = new Fakülte(fakülte);
        öğrenciNumarasıSayacı += 1;   //Öğrenci Numarası arttırma işlemi
        öğrenciNumarası = öğrenciNumarasıSayacı;
    }

    public Öğrenci() {  //parametresiz oluşturucumuz
        this.isim = new İsim();
        this.fathername = new FathersName();
        this.mothername = new MothersName();

        this.bölüm = new Bölüm();
        this.fakülte = new Fakülte();
        öğrenciNumarasıSayacı += 1;
        öğrenciNumarası = öğrenciNumarasıSayacı;
    }

    @Override
    public String toString() {  //string dönüştürücüsü
        return "Öğrenci adı: " + isim + "Numarası: " + öğrenciNumarası;
    }

    public void input() {   //öğrenci kayıtı yapma metodu
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci bilgisini giriniz");
        isim.input();   //Sırası ile isim baba ismo anne ismi fakülte ve bölüm sınıflarından öğrenci giridisini alma bölümü
        fathername.input();
        mothername.input();
        fakülte.input();
        bölüm.input();
    }

    public void printFile() throws IOException {    //öğrenci bilgilerini yazdırma metodu
        try {
            File myObj = new File("ogrenci.txt");
            if (myObj.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + myObj.getName());
            } else {
                
            }
        } catch (IOException e) {
            System.out.println("Hatalı işlem meydana geldi lütfen tekrar deneyiniz.");
        }

        File file = new File("ogrenci.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("Öğrenci bilgileri");
        output.println("Öğrenci adı: " + isim);
        output.println("Öğrencinin babasının adı: " + fathername);
        output.println("Öğrencinin annesinin adı: " + mothername);
        output.println("Öğrencinin okuduğu fakülte: " + fakülte);
        output.println("Öğrencinin okuduğu bölüm: " + bölüm);
        output.println("Öğrenci Numarası: " + öğrenciNumarası);
        output.close();
    }

    public void print(){
        System.out.println("Öğrenci bilgileri");
        System.out.println("Öğrenci adı: " + isim);
        System.out.println("Öğrencinin babasının adı: " + fathername);
        System.out.println("Öğrencinin annesinin adı: " + mothername);
        System.out.println("Öğrencinin okuduğu fakülte: " + fakülte);
        System.out.println("Öğrencinin okuduğu bölüm: " + bölüm);
        System.out.println("Öğrenci Numarası: " + öğrenciNumarası);
    
    
    
    
    
    
    
    
    
    }
}
