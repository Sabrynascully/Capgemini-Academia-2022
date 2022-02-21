import java.util.ArrayList;
import java.util.List;

public class DesafioEscada {

	public static void main(String[] args) {
		// inicia a vari�vel numeroDigitado ela cont�m o tamanho da escada e da base
		// dela
		int numeroDigitado = 6;

		// cria uma lista para armazenar escada as strings impressas
		List<String> escada = new ArrayList<>();

		// la�o para repetir o processe de contagem dos caracters da escada
		for (int i = 0; i < numeroDigitado; i++) {
			int subtracao = -1;
			// adiciona a lista invertendo a escada de posi��o
			escada.add( " ".repeat(numeroDigitado - i - subtracao) +"*".repeat(i + 1));
			// System.out.println(escada);
		}
		// percorre a lista e imprimi no console a escada
		for (String novaLista : escada) {
			System.out.println(novaLista);

		}

	}

}
