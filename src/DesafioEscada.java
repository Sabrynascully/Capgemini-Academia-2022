import java.util.ArrayList;
import java.util.List;

public class DesafioEscada {

	public static void main(String[] args) {
		// inicia a variável numeroDigitado ela contém o tamanho da escada e da base
		// dela
		int numeroDigitado = 6;

		// cria uma lista para armazenar escada as strings impressas
		List<String> escada = new ArrayList<>();

		// laço para repetir o processe de contagem dos caracters da escada
		for (int i = 0; i < numeroDigitado; i++) {
			int subtracao = -1;
			// adiciona a lista invertendo a escada de posição
			escada.add( " ".repeat(numeroDigitado - i - subtracao) +"*".repeat(i + 1));
			// System.out.println(escada);
		}
		// percorre a lista e imprimi no console a escada
		for (String novaLista : escada) {
			System.out.println(novaLista);

		}

	}

}
