import java.util.Scanner;

public class DesafioSenha {
	public static String mensageDesuc = "";

	public static void main(String[] args) {

		cadastroSenha();

	}

	public static void cadastroSenha() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("------------------------------------------------------------");
		System.out.println("Entre com a sua senha :" + "\n" + "* A senha precisa ter 6 digitos ou mais." + "\n"
				+ "* conter um digito." + "\n" + "* conter uma letra em maiúsculo." + "\n"
				+ "* conter uma letra em minúsculo." + "\n" + "* conter esses caracteres em especial (!@#$%^&*()-+).");

		System.out.print("Digite a senha: ");
		String senha = entrada.nextLine();

		ValidatePassword(senha);

		entrada.close();
	}

	public static void ValidatePassword(String senha) {

		int validarChar = 0;

		if (senha.length() < 6) {
			validarChar = 6 - senha.length();
		} else {

			if (!senha.matches("(.*)[0-9](.*)")) {
				validarChar++;
			}
			if (!senha.matches("(.*)[a-z](.*)")) {
				validarChar++;
			}
			if (!senha.matches("(.*)[A-Z](.*)")) {
				validarChar++;
			}
			if (!senha.matches("(.*)[!@#$%^&*()-+](.*)")) {
				validarChar++;
			}
		}

		System.out.printf("\n  Caracteres restantes para sua senha requisitos de segurança :  faltam  %s Caracteres ",
				validarChar);

		System.out.println(" ");

		if (validarChar > 0) {
			cadastroSenha();
		} else {
			System.out.println(mensageDesuc = "Registrado com sucesso");
		}

	}

}
