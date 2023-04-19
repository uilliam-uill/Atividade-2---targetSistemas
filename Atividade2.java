package targetSistemas;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int referencial = 100;
		int fibonacci []  = new int [100];
		 fibonacci[0] = 0;
		 fibonacci[1] = 1; 
			for(int i = 2; i<referencial; i++) {
				fibonacci[i] =fibonacci[i-1] + fibonacci[i - 2];
						}
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite um número para verificar se ele pertence a sequência de fibonacci: ");
		int procurarNumero= scan.nextInt();
		boolean procurar = false;
			for(int i = 0; i< referencial; i++) {
				
				if(fibonacci[i] == procurarNumero) {
				procurar = true;
				break;
				}}
			
				if(procurar) {
					System.out.println("PERTENCE");
			} else {
				System.out.println("NÃO PERTENCE");
			}
			
	}

}