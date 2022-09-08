package controller;

public class ChamaLib {

	public void ordenaQuick(int vet[]) {
		Ordena o = new Ordena();
		int[] mostra = o.quickSort(vet, 0, vet.length - 1);
		for (int i = 0; i < mostra.length; i++) {
			System.out.println(i + 1 + "#  " + mostra[i]);
		}
	}

}
