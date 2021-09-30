// Tugas Hadiah Praktikum No. 1
// Soal Ganjil
// NIM : 51019015

import java.util.Scanner;
public class hadiah_1 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hadiah Praktikum 3 Nomor 1");
		System.out.println("\n");
		
		double celcius, fahrenheit;
			
		System.out.print("Masukkan Nilai Celcius : ");
		celcius = input.nextDouble();
	
		fahrenheit = ((celcius*9)/5)+32;
		
		System.out.println("Hasil Nilai Fahrenheit : " + fahrenheit);
		
		
	}
	
	
	
	
	
}