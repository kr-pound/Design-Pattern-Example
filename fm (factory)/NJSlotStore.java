package fm;

public class NJSlotStore extends SlotStore {

        @Override
	protected Slot makeSlot(slottype type) {
                
            if (type.equals(slottype.progressive)) return new NJSlotProgressive();
            else if (type.equals(slottype.bonus)) return new NJSlotBonus();
            else if (type.equals(slottype.straight)) return new NJSlotStraight();
            
            else return null;
	}
}
