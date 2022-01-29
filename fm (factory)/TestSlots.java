package fm;

public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
                SlotStore WHStore = new WHSlotStore();
                
		Slot slot = NVStore.orderSlot(slottype.progressive);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = NVStore.orderSlot(slottype.bonus);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = NVStore.orderSlot(slottype.straight);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
                System.out.println("-------------------------------------\n");
                
		slot = NJStore.orderSlot(slottype.progressive);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = NJStore.orderSlot(slottype.bonus);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = NJStore.orderSlot(slottype.straight);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------\n");
                
                slot = WHStore.orderSlot(slottype.progressive);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = WHStore.orderSlot(slottype.bonus);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------");
                
                slot = WHStore.orderSlot(slottype.straight);
		System.out.println("Borgata ordered a "+ slot.getName());
                System.out.println("-------------------------------------\n");
	}

}
