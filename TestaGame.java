package POO;

public class TestaGame {

	public static void main(String[] args) {
		
		System.out.println("\t|Welcome to HxH Games| ");
		System.out.println("\tlist of available games below :) ");
		
		//instanciar o objeto vetor
		
		gameCLASS [] jogosPS = new gameCLASS[4];
		
		jogosPS [0] = new gameCLASS("Shadow Of Colossos", "", "", "");
		jogosPS [1] = new gameCLASS("God Of War", null, null, null);
		jogosPS [2] = new gameCLASS("NiEr Automata", null, null, null);
		jogosPS [3] = new gameCLASS("Stray", null, null, null);
		
		
		System.out.println("\n\nJogos para Playstation: ");
		for (gameCLASS roda:jogosPS) {
			roda.visualizarPS();
		}
		
		//gerando outro objeto vetor
		
		gameCLASS [] jogosNintendo = new gameCLASS[4];
		
		jogosNintendo [0] = new gameCLASS("", "Zelda: Breath of the Wild", "", "");
		jogosNintendo [1] = new gameCLASS("","Secret of Mana", null, null);
		jogosNintendo [2] = new gameCLASS(null, "Chronno Trigger", null, null);
		jogosNintendo [3] = new gameCLASS(null, "Final Fantasy", null, null);
		
		System.out.println("\n\nJogos para Nintendo: ");
		for (gameCLASS roda:jogosNintendo) {
			roda.visualizarNintendo();
		}
		
		//instanciar outro objeto do tipo vetor
		
		gameCLASS [] cartasRPG = new gameCLASS[4];
		
			cartasRPG [0] = new gameCLASS(null, null, "Pokemon", "");
			cartasRPG [1] = new gameCLASS(null, null, "Heroes", null);
			cartasRPG [2] = new gameCLASS(null, null, "Yu-Gi-Oh", null);
			cartasRPG [3] = new gameCLASS(null, null, "Tarot", null);
			
			System.out.println("\n\nJogos de Cartas RPG: ");
			for (gameCLASS roda:cartasRPG) {
				roda.visualizarRPG();
		}
			
			gameCLASS [] jogosXbox = new gameCLASS[4];
			
			jogosXbox [0] = new gameCLASS(null, null, null, "Halo");
			jogosXbox [1] = new gameCLASS(null, null, null, "Crisis");
			jogosXbox [2] = new gameCLASS(null, null, null, "Forza 4");
			jogosXbox [3] = new gameCLASS(null, null, "", "DMC ~ Devil may Cry");
			
			System.out.println("\n\nJogos para Xbox: ");
			for (gameCLASS roda:jogosXbox) {
				roda.visualizarXbox();
		}
			
		
			System.out.println("\n\n \tthanks for your visit. ");	
			
			
		
			//fim do programa

	}

}
