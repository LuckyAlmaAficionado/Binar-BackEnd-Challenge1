import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MainMenu();
    }

    private static void MainMenu() {
        int pilihan = 1; // value defaultnya -1

        // main menu
        while (pilihan != 0) {
            System.out.println("----------------------------------------");
            System.out.println("  Kalkulator Penghitung Luas dan Volum  ");
            System.out.println("----------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Hitung luas bidang");
            System.out.println("2. Hitung Volum");
            System.out.println("0. Tutup Aplikasi");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            // case buat pilihan input main menu
            switch (pilihan) {
                case 1:
                    LuasBidang(); // forward ke void LuasBidang()
                    break;
                case 2:
                    VolumBidang(); // forward ke void VolumBidang()
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan kalkulator!!");
                    System.exit(0);
                default:
                    System.out.println("Inputan tidak valid!"); // output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    public static void teamplateJudul(String namaBangunan) {
        System.out.println("----------------------------------------");
        System.out.println("        ANDA MEMILIH " + namaBangunan + "        ");
        System.out.println("----------------------------------------");
    }

    public static void teamplateHasil(String namaBangunan, double hasil, String luasVolume) {
        System.out.println("processing...\n");
        System.out.println(luasVolume + " dari " + namaBangunan + " adalah " + hasil);
        System.out.println("----------------------------------------");
        System.out.println("Tekan apa saja untuk kembali ke menu");
        String home = input.next();
        if ( luasVolume.contains("luas") ) LuasBidang();
        else VolumBidang();
    }

    private static void LuasBidang() {
        int pilihan = -1;
        double panjang, lebar, sisi, alas, tinggi, jari, hasil; // pake double biar nilainya bisa desimal
        String home;

        while (pilihan != 0) {

            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Persegi Panjang");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    teamplateJudul("PERSEGI");

                    System.out.print("Masukkan sisi : ");sisi = input.nextInt();
                    hasil = sisi + sisi;

                    teamplateHasil("persegi", hasil, "luas");
                    break;
                case 2:
                    teamplateJudul("LINGKARAN");

                    System.out.print("Masukan jari-jari");jari = input.nextDouble();
                    hasil = 3.14 * (jari * jari);

                    teamplateHasil("lingkaran", hasil, "luas");
                    break;
                case 3:
                    teamplateJudul("SEGITIGA");

                    System.out.print("Masukan alas: ");alas = input.nextDouble();
                    System.out.print("Masukan tinggi: ");tinggi = input.nextDouble();
                    hasil = 0.5 * alas * tinggi;

                    teamplateHasil("segitiga", hasil, "luas");
                    break;
                case 4:
                    teamplateJudul("PERSEGI PANJANG");

                    System.out.print("Input panjang persegi panjang: ");panjang = input.nextDouble();
                    System.out.print("Input lebar persegi panjang: ");lebar = input.nextDouble();
                    hasil = panjang * lebar;

                    teamplateHasil("persegi panjang", hasil, "luas");
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama...");
                    MainMenu();
                    break;
                default:
                    System.out.println("Inputan tidak valid!"); // output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    private static void VolumBidang() {
        double sisi, panjang, lebar, tinggi, jari, hasil;
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("----------------------------------------");
            System.out.println("           Hitung volum Bidang          ");
            System.out.println("----------------------------------------");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    teamplateJudul("KUBUS");

                    System.out.print("Masukkan Sisi : ");sisi = input.nextDouble();
                    hasil = sisi * sisi * sisi;
                    
                    teamplateHasil("kubus", hasil, "volume");
                    break;
                case 2:
                    teamplateJudul("BALOK");

                    System.out.println("Masukan Panjang: ");panjang = input.nextDouble();
                    System.out.println("Masukan Lebar: ");lebar = input.nextDouble();
                    System.out.println("Masukan Tinggi: ");tinggi = input.nextDouble();
                    hasil = panjang * lebar * tinggi;

                    teamplateHasil("balok", hasil, "volume");
                    break;
                case 3:
                    teamplateJudul("TABUNG");

                    System.out.print("Masukkan tinggi Tabung: ");tinggi = input.nextDouble();
                    System.out.print("Masukkan jari-jar Tabung: ");jari = input.nextDouble();
                    hasil = 3.14 * tinggi * jari;

                    teamplateHasil("tabung", hasil, "volume");
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama...");
                    MainMenu();
                    break;
                default:
                    System.out.println("Inputan tidak valid!"); // output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }
}