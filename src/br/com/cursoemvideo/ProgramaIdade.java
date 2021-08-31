package br.com.cursoemvideo;
import java.util.Scanner;
public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Em que ano voce nasceu?");
		int nasc=s.nextInt();
		int i=2021-nasc;
		System.out.println("A sua idade é "+i);
		if(i>=18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
			
		

	}

}
