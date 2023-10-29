package Tugas1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = input.nextInt();
        double hasil;

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        switch (pilihan) {
            case 1:
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Pembagian dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }
    }
}
