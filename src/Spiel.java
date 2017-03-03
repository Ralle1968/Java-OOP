
public class Spiel {

	public static void main(String[] args) {
		Player p1 = new Player("Ralf", 12);
		
		Player p2 = new Player("Anne", 13);
		
		p1.playCard();
		
		p1.printPlayerInfo();
		p2.printPlayerInfo();

	}

}
