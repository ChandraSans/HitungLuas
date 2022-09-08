/**
* Credit by : ChandraSans
* Github : https://github.com/ChandraSans
* IG : @rafiadichandra_
*/

import java.util.Scanner;

public class HitungLuas {
  public static void main(String[] args) {
    new HitungLuas();
  }

  // Fungsi Hitung Luas
  public HitungLuas() {
    clearScreen();
    
    // Baca Input
    Scanner input = new Scanner(System.in);
    
    // Daftar Menu 
    System.out.println("DAFTAR MENU :");
    System.out.println("1. Persegi");
    System.out.println("2. Persegi Panjang");
    System.out.println("3. Segitiga");
    System.out.println("4. Lingkaran");
    System.out.println("0. Tutup");
    
    // Pilih Menu 
    System.out.println("\nMasukkan pilihan :");
    int menu = input.nextInt();
    
    // Periksa Menu
    if(menu == 1){
      persegi();
    } else if(menu == 2){
      persegipanjang();
    } else if(menu == 3){
      segitiga();
    } else if(menu == 4){
      lingkaran ();
    } else if(menu == 0){
      System.out.println("Goodbye! :)");
      System.exit(0);
    } else{
      System.out.println("Menu tidak ditemukan!");
      display_menu();
    }
  }
  
  public void display_menu() {
    
    // Jeda 
    try{
      System.in.read();
    } catch(Exception e) {}
    
    // Panggil Fungsi HitungLuas()
    new HitungLuas();
  }
  
  public void clearScreen() {
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }
  
  public void persegi() {
    Scanner input = new Scanner(System.in);
    clearScreen();
    
    System.out.println("- HITUNG LUAS PERSEGI -");
    
    // Input User 
    System.out.println("Masukkan panjang sisi :");
    int sisi = input.nextInt();
    
    // Proses Hitung Persegi
    int luas_persegi = sisi * sisi;
    
    // Output Persegi
    System.out.println("Hasilnya adalah " + luas_persegi);
    
    // Kembali
    display_menu();
  }

  public void persegipanjang() {
    Scanner input = new Scanner(System.in);
    clearScreen();
    
    System.out.println("- HITUNG LUAS PERSEGI PANJANG -");
    
    // Input User 
    System.out.println("Masukkan panjang sisi :");
    int panjang_sisi = input.nextInt();
    System.out.println("Masukkan lebar sisi :");
    int lebar_sisi = input.nextInt();
    
    // Proses Hitung Persegi Panjang
    int luas_persegipanjang = panjang_sisi * lebar_sisi;
    
    // Output Persegi Panjang
    System.out.println("Hasilnya adalah " + luas_persegipanjang);
    
    // Kembali
    display_menu();
  }

  public void segitiga() {
    Scanner input = new Scanner(System.in);
    clearScreen();
    
    System.out.println("- HITUNG LUAS SEGITIGA -");
    
    // Input User 
    System.out.println("Masukkan alas sisi :");
    int alas_sisi = input.nextInt();
    System.out.println("Masukkan tinggi sisi :");
    int tinggi_sisi = input.nextInt();
    
    // Proses Hitung Segitiga
    int luas_segitiga = alas_sisi * tinggi_sisi;
    
    // Output Segitiga
    System.out.println("Hasilnya adalah " + luas_segitiga);
    
    // Kembali
    display_menu();
  }

  public void lingkaran() {
    Scanner input = new Scanner(System.in);
    clearScreen();
    
    System.out.println("- HITUNG LUAS LINGKARAN -");
    
    // Input User 
    System.out.println("Masukkan panjang jari-jari :");
    int jari = input.nextInt();
    
    // Proses Hitung Lingkaran 
    int luas_lingkaran = jari * jari * 22 / 7;
    
    // Output Lingkaran
    System.out.println("Hasilnya adalah " + luas_lingkaran);
    
    // Kembali
    display_menu();
  }
}
