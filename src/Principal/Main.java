package Principal;

import contr.ChamaLib;

public class Main {
	public static void main(String[] args) {
		ChamaLib chama = new ChamaLib();
		int vetor[] = { 89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75 };
		chama.ordenaQuick(vetor);
	}
}
