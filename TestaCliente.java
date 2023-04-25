package POO;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		// instanciar 2 objetos derivados da Classe 
		
		
		clienteCLASS conta1 = new clienteCLASS("Illumi Zoldyack","mansão dos Zoldyack",
				"illumihunter@gmail.com", 1199999999, 17, 'F', false);	
		
		clienteCLASS conta2 = new clienteCLASS("Hisoka", 29, 'M', true);
		
		
		// utilizar o metodo criado "visualizar" para imprimir as infos dos objetos criados.
		
		System.out.println("Atributos da Primeira Conta: ");
		conta1.visualizarObjeto();
		
		System.out.println("\n\nAtributos da Segunda Conta: ");
		conta2.visualizarObjeto();
		
		
		// fim do programa.

	}

}
