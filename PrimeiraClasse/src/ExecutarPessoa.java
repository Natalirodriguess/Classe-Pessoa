
public class ExecutarPessoa {
	
	public static void main (String [] args) {
		
		Pessoa natali = new Pessoa ();
		natali.nome = "Natalí";
		natali.idade =  22;
		natali.nacionalidade = "brasileira";
		
		natali.mostrarNome();
		natali.mostrarIdade();
		natali.mostrarNacionalidade();
		
		
		Pessoa thomas = new Pessoa();
		thomas.nome = "Thomás";
		thomas.idade = 22;
		thomas.nacionalidade = "brasileiro";
		
		thomas.mostrarNome();
		thomas.mostrarIdade();
		thomas.mostrarNacionalidade();
		
	}

}
