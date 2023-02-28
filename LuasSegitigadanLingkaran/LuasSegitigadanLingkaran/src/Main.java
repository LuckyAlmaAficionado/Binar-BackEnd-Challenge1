import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Deklarasi Var
        Scanner scanner = new Scanner(System.in);
        float hasil = 0;

//        Rumus Segitiga
        System.out.print("Masukan alas (segitiga): ");
        float alas = scanner.nextFloat();
        System.out.print("Masukan tinggi (segitiga): ");
        float tinggi = scanner.nextFloat();
        hasil = (float) (0.5 * alas * tinggi);
        System.out.println(hasil);

//        Rumus Lingkaran
        System.out.print("Masukan jari-jari (lingkaran): ");
        float jariJari = scanner.nextFloat();
        hasil = (float) (3.14 * jariJari);
        System.out.println(hasil);

    }
}