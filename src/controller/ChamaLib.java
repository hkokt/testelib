package contr;

import controller.Ordena;

public class ChamaLib {

	public void ordenaQuick(int vet[]) {
		Ordena ord = new Ordena();
		int result[] = new int[vet.length];
		ord.quickSort(vet, 0, vet.length - 1);
		for (int i = 0; i < vet.length; i++) {
			result[i] = vet[i];
			System.out.println(i + " # " + result[i]);
		}

	}
}
