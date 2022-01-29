package guitar_hero;

public class TestGuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GameCharacter player1 = new GameCharacterSlash();
		//GameCharacter player2 = new GameCharacterHendrix();
                        
                PlayerCharacter player = new PlayerCharacter();
                player.playerConfig(new GameCharacterSlash());
                player.setGuitar(new Guitar_GibsonLesPaul());
                        
                player.playGuitar();
                player.playSolo();
                
                player.playerConfig(new GameCharacterHendrix());
                player.setGuitar(new Guitar_Telecaster());
                
                player.playGuitar();
                player.playSolo();
	}
}

