package projectscanner;
import java.util.Scanner;
public class pengecekansuhuruangan_clophyll_2466 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pilihan;
		double suhu;
		
		do {
			System.out.println("=== SISTEM PENGECEKAN SUHU RUANGAN===");
			
			for (int i = 1; i <= 1; i++) {
				System.out.print("Masukan suhu ruangan (°C):");
				suhu = input.nextDouble();
				
				if (suhu < 18) {
					System.out.println("Kondisi: DINGIN");
					
					if (suhu < 10) {
						System.out.println("Saran :  Suhu sangat dingin, gunakan jaket tebal.");
					} else {
						System.out.println("Saran :  Gunakan jaket atau matikan AC.");
					}
				} else if (suhu<= 26) {
					System.out.println("kondisi : PANAS");
					System.out.println("Saran : Suhu nyaman untuk beraktivitas.");
				} else {
					System.out.println("Kondisi : PANAS");
					
					if (suhu > 35) {
						System.out.println("Saran : Suhu sangat panas segera nyalakan AC.");
					} else {
						System.out.println("Saran : Gunakan kipas angin.");
					}
				}			
			}
			
			System.out.println("MENU:");
			System.out.println("1. Cek suhu lagi");
			System.out.println("2. Keluar");
			pilihan = input.nextInt();
			
			switch (pilihan) {
			case 1:
				System.out.println("Mengulang pengecekan");
				break;
			case 2:
				System.out.println("Terimakasih telah menggunakan program");
				break;
			default:
				System.out.println("Plihan tidak valid, pilihan ulang");
			}
		} while (pilihan !=2);
		
		input.close();
	}

}
