/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;
/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 *  Deskripsi : Program ini berisi tentang menampilan RATA-RATA
 */
public class Ratarata {
    private static Scanner Scanner = new Scanner(System.in);
    private static int i, jumlahMahasiswa;
    private static float jumlah, nilaiMahasiswa, ratarata;
    
    private static int inputJumlahMahasiswa(){
     System.out.print("Masukan Banyak Mahasiswa : ");
     jumlahMahasiswa = Scanner.nextInt();
     return jumlahMahasiswa;
     
    }
    
    public static double hitungRataRata(){
        inputJumlahMahasiswa();
        jumlah = 0;
        i=1;
        while(i <= jumlahMahasiswa){
            System.out.print("Nilai mahasiswa ke-"+i+": ");
            nilaiMahasiswa = Scanner.nextFloat();
            jumlah += nilaiMahasiswa;
            i++;
        }
        
     ratarata = jumlah / jumlahMahasiswa;
     return ratarata;
    }
     

    
}
