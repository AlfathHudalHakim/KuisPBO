/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner (System.in);
        double struktur, visual, design, jurnal, relevan, solving;
        String nama;
        int pil, usia;
        System.out.println("+-------------------------------------------+");
        System.out.println("|  Pendaftaran Beasiswa PT. Ngantuk Banget  |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Daftar Program Beasiswa                   |");
        System.out.println("| 1. Beasiswa Pelajar                       |");
        System.out.println("| 2. Beasiswa Mahasiswa                     |");
        System.out.println("+-------------------------------------------+");
        System.out.print("Pilihan Program Beasiswa : ");
        pil = masuk.nextInt();
        if (pil == 1) {
            System.out.println(" ### Form Pendaftaran ### ");
            System.out.print("Masukan Nama   : ");
            nama = masuk.nextLine();

            System.out.print("Usia   : ");
            usia = masuk.nextInt();
            do {
                System.out.println(" ### Form Penilaian ### ");
                System.out.println("Ket: Nilai yang Valid antara 1-100");
                System.out.print("Nilai Struktur dan Konten Esai   : ");
                struktur = masuk.nextDouble();
                System.out.print("Nilai Teknik Visualisasi         : ");
                visual = masuk.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking   : ");
                design = masuk.nextDouble();

            } 
            while (struktur > 100 || struktur < 0 || visual > 100 || visual < 0 || design < 0 || design > 100);
            do {
                System.out.println(" ##  Menu  ## ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = masuk.nextInt();
                if (pil == 1) {
                    double hasil2;
                    Seleksi sel;
                    sel = new Seleksi (struktur, visual, design, jurnal, relevan, solving, hasil1, hasil2);
                    hasil2 = sel.hasil2();
                    System.out.println("Nilai Akhir : " + hasil2);
                    if (hasil2 >= 87,5 && usia>=16 && usia <=24) {
                        System.out.println("Keterangan : DITERIMA");
                        System.out.println("SELAMAT! " + nama + "(" + usia + ") dinyatakan diterma pada PROGRAM BEASISWA PELAJAR karena telah memenuhi syarat tahap seleksi!");
                    }
                    else {
                        System.out.println("Keterangan : TIDAK DITERIMA");
                        System.out.println("MOHON MAAF " + nama + "(" + usia + ") dinyatakan tidak diterma pada PROGRAM BEASISWA PELAJAR karena belum memenuhi syarat tahap tahap seleksi!");
                    }
                }
                
                else if (pil == 2) {
                    do {
                        System.out.println(" ### Form Penilaian ### ");
                        System.out.println("Ket: Nilai yang Valid antara 1-100");
                        System.out.print("Nilai Struktur dan Konten Esai   : ");
                        struktur = masuk.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi         : ");
                        visual = masuk.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking   : ");
                        design = masuk.nextDouble();
                    } 
                    while (struktur > 100 || struktur < 0 || visual > 100 || visual < 0 || design < 0 || design > 100);
                }
            } while (pil != 3);

        }
        else if (pil == 2) {
            System.out.println(" ### Form Pendaftaran ### ");
            System.out.print("Masukan Nama   : ");
            nama = masuk.nextLine();

            System.out.print("Usia   : ");
            usia = masuk.nextInt();
            do {
                System.out.println(" ### Form Penilaian ### ");
                System.out.println("Ket: Nilai yang Valid antara 1-100");
                System.out.print("Nilai Struktur dan Konten Jurnal   : ");
                jurnal = masuk.nextDouble();
                System.out.print("Nilai Relevansi Data         : ");
                relevan = masuk.nextDouble();
                System.out.print("Nilai Kemampuan Problem Solving   : ");
                solving = masuk.nextDouble();

            } 
            while (jurnal > 100 || jurnal < 0 || relevan > 100 || relevan < 0 || solving < 0 || solving > 100);
            do {
                System.out.println(" ##  Menu  ## ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = masuk.nextInt();
                if (pil == 1) {
                    double hasil1;
                    Seleksi sel;
                    sel = new Seleksi (struktur, visual, design, jurnal, relevan, solving, hasil1, hasil2);
                    hasil1 = sel.hasil1();
                    System.out.println("Nilai Akhir : " + hasil1);
                    if (hasil1 >= 87,5 && usia>=16 && usia <=24) {
                        System.out.println("Keterangan : DITERIMA");
                        System.out.println("SELAMAT! " + nama + "(" + usia + ") dinyatakan diterma pada PROGRAM BEASISWA PELAJAR karena telah memenuhi syarat tahap seleksi!");
                    }
                    else {
                        System.out.println("Keterangan : TIDAK DITERIMA");
                        System.out.println("MOHON MAAF " + nama + "(" + usia + ") dinyatakan tidak diterma pada PROGRAM BEASISWA PELAJAR karena belum memenuhi syarat tahap tahap seleksi!");
                    }
                }
                else if (pil == 2) {
                    do {
                        System.out.println(" ### Form Penilaian ### ");
                        System.out.println("Ket: Nilai yang Valid antara 1-100");
                        System.out.print("Nilai Struktur dan Konten Jurnal   : ");
                        jurnal = masuk.nextDouble();
                        System.out.print("Nilai Relevansi Data         : ");
                        relevan = masuk.nextDouble();
                        System.out.print("Nilai Kemampuan Problem Solving   : ");
                        solving = masuk.nextDouble();
                    } 
                    while (jurnal > 100 || jurnal < 0 || relevan > 100 || relevan < 0 || solving < 0 || solving > 100);
                }
            } while (pil != 3);
            }
        
    }
    
}
