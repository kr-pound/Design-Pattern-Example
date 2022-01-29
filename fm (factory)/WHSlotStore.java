/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm;

/**
 *
 * @author krita
 */
public class WHSlotStore extends SlotStore {

    @Override
    protected Slot makeSlot(slottype type) {
        
        if (type.equals(slottype.progressive)) return new WHSlotProgressive();
            else if (type.equals(slottype.bonus)) return new WHSlotBonus();
            else if (type.equals(slottype.straight)) return new WHSlotStraight();
            
            else return null;
    }
    
}
