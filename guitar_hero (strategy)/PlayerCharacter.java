/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitar_hero;

/**
 *
 * @author krita
 */
public class PlayerCharacter extends GameCharacter {
    
    GameCharacter characterChoose;

    public void playerConfig(GameCharacter character) {
        this.characterChoose = character;
    }
    
    @Override
    public void setGuitar(GuitarBehavior guitar) {
        
        this.guitarBehavior = guitar;
        
        if(this.guitarBehavior instanceof Guitar_GibsonLesPaul) {
            this.setSolo(new Solo_SmashGuitar());
        } else if(this.guitarBehavior instanceof Guitar_Telecaster) {
            this.setSolo(new Solo_PutGuitarOnFire());
        } else if(this.guitarBehavior instanceof Guitar_GibsonSG) {
            this.setSolo(new Solo_JumpOffStage());
        }
    }
    
}
