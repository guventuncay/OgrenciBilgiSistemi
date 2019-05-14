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
public class OgrenciBilgiSistemiV1 {

    /**
     * @param args the command line arguments
     */
// öğrenci dizisi oluştur
    static Öğrenci öğrenciler[] = new Öğrenci[100];
    static int öğrenciSayisi;

//ana menümüz
    public static void anaMenü() {

        System.out.println("----------------------");
        System.out.println("Öğrenci Kayıt Sistemi");
        System.out.println("----------------------");
        System.out.println("1-) Yeni öğrenci ekle");
        System.out.println("2-) Tüm öğrencilerin bilgilerini ekrana yazdır");
        System.out.println("3-) Seçilen öğrenci bilgilerini dosayaya yazdır");
        System.out.println("4-) Çık");
    }
    //Menümüyü alma metodu
    // tam sayı okuma

    public static int getMenüSeçeneği() {
        int option = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Kaç numaralı işlemi yapmak istiyorsunuz ?");
        try {
            option = in.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali giriş yaptınız lütfen tekrar deneyiniz.");
            getMenüSeçeneği();
        }
        return option;
    }

    //Tüm kayıtlı öğrencileri yazdırmak icin
    public static void tümünüYazdır() throws IOException {
        for (int i = 0; i < öğrenciSayisi; i++) {
            öğrenciler[i].print();
        }
    }

    public static void öğrenciYazdır() {
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Bilgilerini yazdırmak istediğiniz öğrencinin numarasını giriniz:");
        System.out.print("192168");
        try {
            num = in.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali giriş yaptınız\nLütfen takrar deneyiniz.");
            öğrenciYazdır();
        }
        try {
            öğrenciler[num - 1].printFile();
        } catch (Exception e) {
            System.out.println("Hatalı işlem yaptınız\nLütfen tekrar deneyiniz.");
            öğrenciYazdır();
        }
    }

    public static void yeniÖğrenciEkle() throws IOException { //öğrenci ekleme metodu

        int type = 0;
        System.out.println("Eklemek istediğiniz öğrenci tipini giriniz");
        System.out.println("1-) Bursu Öğrenci, 2-) Normal Öğrenci");
        System.out.println("Ana menü gitmek için 3 tuşlayınız");

        try {
            type = getMenüSeçeneği();
        } catch (Exception e) {
            System.out.println("Hatali giriş yaptınız\nLütfen takrar deneyiniz.");
        }
        switch (type) {
            case 1: //burslu
                öğrenciler[öğrenciSayisi] = new BursluÖğrenci();
                öğrenciler[öğrenciSayisi].input();
                öğrenciSayisi++;
                break;
            case 2: //Burssuz öğrenci
                öğrenciler[öğrenciSayisi] = new Öğrenci();
                öğrenciler[öğrenciSayisi].input();
                öğrenciSayisi++;
            case 3: // ana menü dön
                AnaMenüGit();
            default:
                System.out.println("Hatali giriş yaptınız tekrar deneyiniz");
                yeniÖğrenciEkle();
        }
    }

    public static void main(String[] args) throws IOException {
        // BURSA TEKNİK ÜNİVERSİTESİ ÖĞRENCİ KAYIT SİSTEMİ
        öğrenciSayisi = 0;
        AnaMenüGit();

    }

    public static void AnaMenüGit() throws IOException {
        // Ana döngü
        int op = 0;
        do {
            //menüyü yazdır
            anaMenü();
            //menü seçeneğini al
            op = getMenüSeçeneği();
            switch (op) {
                case 1: //ekle
                    System.out.println("Yeni kayıt oluştur");
                    yeniÖğrenciEkle();
                    break;
                case 2: //hepsini yazdır
                    System.out.println("Tüm öğrenci bilgilerini ekrana yazdır");
                    if (öğrenciSayisi != 0) {
                        tümünüYazdır();
                    } else {
                        System.out.println("Hiçbir kayıtlı öğrenci mevcut değil\n"
                                + "Öğrenci kayıdı eklemek için 1'i tuşayınız.");
                    }
                    break;
                case 3: //seçileni yazdır
                    System.out.println("Öğrenci bilgisini dosyaya yazdır");
                    if (öğrenciSayisi != 0) {
                        öğrenciYazdır();
                    } else {
                        System.out.println("Hiçbir kayıtlı öğrenci mevcut değil\n"
                                + "Öğrenci kayıdı eklemek için 1'i tuşayınız.");
                    }
                    break;
                case 4: //çıkış
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. \nLütfen tekrar deneyiniz");
            }

        } while (op != 4);// 4. seçenek ile çıkış yapsın
    }

}
