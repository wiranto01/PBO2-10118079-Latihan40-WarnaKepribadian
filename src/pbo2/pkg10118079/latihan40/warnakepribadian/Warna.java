/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan40.warnakepribadian;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author  
 * NAMA     : Wiarnto
 * KELAS    : IF-2
 * NIM      : 10118079
 */
public class Warna {
    // ANSI Colors
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // ANSI Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    
    private final Map<String, String> kepribadian;
    
    public Warna() {
        this.kepribadian = new HashMap<>();
        setKepribadian();
    }

    public void tampilkanKepribadian(String warna) {
        if(kepribadian.containsKey(warna)) {
            System.out.println("Warna Favoritmu Adalah " + 
            getColor(warna) + warna + RESET);
            System.out.println(kepribadian.get(warna));
        } else {
            System.out.println("Ooops.. Belum teridentifikasi");
        }
    }
    
    private String getColor(String color) {
        String result = "";
        
        switch(color) {
            case "MERAH": result = RED; break;
            case "HIJAU": result = GREEN; break;
            case "KUNING":result = YELLOW; break;
            case "BIRU": result = BLUE; break;
            case "UNGU": result = MAGENTA; break;
        }
        
        return result;
    }

    private void setKepribadian() {
        kepribadian.put(
            "MERAH",
            "1. Periang,\n2. Pemberani,\n3. Berani mengambil"
            + " resiko dalam setiap langkah,\n4. Menyukai tantangan,"
            + "\n5. Kurang sabar,\n6. Dapat menahan marah namun jika"
            + " sudah tahap puncak toleransi kemarahannya akan sulit "
            + "dikontrol,\n7. Memiliki energi kehangatan dan cinta."
        );
        
        kepribadian.put(
            "HIJAU",
            "1. Romantis,\n2. Menyukai hal yang berbau alami dan"
            + " keindahan,\n3. Teguh pada prinsip,\n4. Menginginkan"
            + " kesempuranaan,\n5. Mudah cemburu,\n6. Mudah merasa iri,"
            + "\n7. Menjunjung tinggi suatu nilai toleransi"
            + " dan kepercayaan."
        );
        
        kepribadian.put(
            "KUNING",
            "1. Optimis,\n2. Suka bergaul,\n3. Periang,\n4. Senang"
            + " menolong,\n5. Lincah dan aktif,\n6. Tidak suka meremehkan"
            + " kekurangan orang lain,\n7. Loyal,\n8. Hangat,\n9."
            + " Meskipun karakternya optimis dan idealis, seringkali goyah"
            + " dan tidak stabil,\n10. Cenderung Penakut."
        );
        
        kepribadian.put(
            "BIRU",
            "1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang"
            + " saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,"
            + "\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan"
            + " banyak orang,\n8. Menyembunyikan perasaan karena"
            + " karakternya yang cenderung mencari jalan damai."
        );
        
        kepribadian.put(
            "UNGU",
            "1. Optimis,\n2. Tidak pernah ragu,\n3. Menurutnya"
            + " pasangan yang ideal adalah yang memiliki mental yang"
            + " kuat,\n4. Memiliki ambisi yang besar,\n5. Memiliki"
            + " empati yang besar,\n6. Memiliki sisi misterius sebab"
            + " seringkali menutupi perasaannya,\n7. Terkadang bersikap"
            + " keras kepala dan angkuh."
        );
    }
}
