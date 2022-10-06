
public class ExecutarPessoa {
	
	public static void main (String [] args) {
		
		Pessoa natali = new Pessoa ();
		natali.nome = "Natalí";
		natali.idade =  22;
		natali.nacionalidade = "brasileira";
		natali.altura = 1.64;
		
		natali.mostrarNome();
		natali.mostrarIdade();
		natali.mostrarNacionalidade();
		natali.mostrarAltura();
		
		
		Pessoa thomas = new Pessoa();
		thomas.nome = "Thomás";
		thomas.idade = 22;
		thomas.nacionalidade = "brasileiro";
		thomas.altura = 1.72;
		
		thomas.mostrarNome();
		thomas.mostrarIdade();
		thomas.mostrarNacionalidade();
		thomas.mostrarAltura();
		
	}

}
