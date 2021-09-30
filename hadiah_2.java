// Tugas Hadiah Praktikum No. 2
// Soal Ganjil
// NIM : 51019015

import java.util.Scanner;
public class hadiah_2 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		final double nilaipi = 3.14;
		
		
		System.out.println("Hadiah Praktikum 3 Nomor 2");
		System.out.println("\n");
		
		double jari,luas;
		
		System.out.print("Masukkan Nilai Jari-Jari : ");
		jari = input.nextDouble();
		
		luas = nilaipi*jari*jari;
		
		
		System.out.println("Hasil Nilai Luas Lingkaran : " + luas);
		
		
	}
	
	
	
	
	
}