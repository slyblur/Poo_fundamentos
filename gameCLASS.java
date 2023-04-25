package POO;

public class gameCLASS {
	
	String jogosPS, jogosNintendo,
	jogosXbox, cartasRPG;


	public gameCLASS(String jogosPS, String jogosNintendo, String cartasRPG, String jogosXbox) {
		super();
		this.jogosPS = jogosPS;
		this.jogosNintendo = jogosNintendo;
		this.cartasRPG = cartasRPG;
		this.jogosXbox = jogosXbox;
	}

	public String getJogosPS() {
		return jogosPS;
	}

	public void setJogosPS(String jogosPS) {
		this.jogosPS = jogosPS;
	}

	public String getJogosNintendo() {
		return jogosNintendo;
	}

	public void setJogosNintendo(String jogosNintendo) {
		this.jogosNintendo = jogosNintendo;
	}

	public String getJogosXbox() {
		return jogosXbox;
	}

	public void setJogosXbox(String jogosXbox) {
		this.jogosXbox = jogosXbox;
	}

	public String getCartasdeRPG() {
		return cartasRPG;
	}

	public void setCartasdeRPG(String cartasdeRPG) {
		this.cartasRPG = cartasdeRPG;
	}
	
	public void visualizarPS() {
		System.out.println(jogosPS);
		
	}
	
	public void visualizarNintendo() {
		System.out.println(jogosNintendo);
		
	}
	public void visualizarXbox() {
		System.out.println(jogosXbox);
		
	}
	public void visualizarRPG() {
		System.out.println(cartasRPG);
		
	}

}
