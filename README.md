# AutocompleteAndTemplates

Program ini adalah contoh implementasi fitur autocomplete dan custom live template dalam Java menggunakan IntelliJ IDEA. Program ini merupakan program kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian pada dua angka yang dimasukkan.

## Cara Menjalankan Program

1. Buka proyek dalam IntelliJ IDEA.
2. Buka file `Main.java` dan jalankan program.
3. Untuk melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian, digunakan kelas `Kalkulator`. Jalankan `main` dengan user menginputkan dua bilangan yang akan dioperasikan.

## Tentang Program

Program ini mencakup fitur-fitur seperti:

- Autocomplete dalam kode Java.
- Custom live template untuk kalkulator sederhana.
- Kelas `Kalkulator` untuk melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian.

## Fungsi Program

Program tersebut adalah sebuah kalkulator sederhana yang memungkinkan pengguna untuk memilih operasi matematika (penjumlahan, pengurangan, perkalian, atau pembagian) dan menghitung hasil dari operasi tersebut. Berikut adalah fungsi-fungsi utama dari program tersebut:

1. Meminta Input dari Pengguna: Program ini menggunakan Scanner untuk meminta input dari pengguna. Pengguna diminta untuk memilih operasi matematika dengan memasukkan angka dari 1 hingga 4, dan juga diminta untuk memasukkan dua bilangan (bilangan pertama dan bilangan kedua) yang akan digunakan dalam operasi tersebut.

2. Pemrosesan Operasi: Program ini menggunakan pernyataan switch untuk memproses pilihan pengguna. Bergantung pada pilihan pengguna, program akan melakukan salah satu dari empat operasi matematika yang telah disebutkan: penjumlahan, pengurangan, perkalian, atau pembagian. Hasil dari operasi tersebut dihitung dan disimpan dalam variabel hasil.

3. Pengecekan Pembagian dengan Nol: Saat pengguna memilih operasi pembagian, program memeriksa apakah bilangan kedua tidak sama dengan nol. Jika bilangan kedua adalah nol, program akan memberikan pesan bahwa pembagian dengan nol tidak diizinkan dan tidak akan menghitung hasil pembagian.

4. Pesan Hasil: Program mencetak hasil operasi matematika ke layar bersama dengan pesan yang sesuai, seperti "Hasil penjumlahan:", "Hasil pengurangan:", dll.

5. Penanganan Kesalahan: Program ini juga memiliki penanganan kesalahan sederhana jika pengguna memasukkan pilihan yang tidak valid.

Jadi, program ini bertindak sebagai kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar dan memberikan hasilnya.
