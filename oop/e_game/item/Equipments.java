package b_designpattern.com.mc.oop.e_game.item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import b_designpattern.com.mc.oop.e_game.item.code.EquipmentData;

public class Equipments {
	
	private Map<Slot, Equipment> equipments;

	public Equipments() {
		equipments = new HashMap<Slot, Equipment>();
		equipments.put(Slot.WEAPON, EquipmentData.BASIC_WEAPON.create());
	}
	
	public void equip(Equipment equipment) {
		equipments.put(equipment.getSlot(), equipment);
	}
	
	public void unequip(Slot slot) {
		if(slot.equals(Slot.WEAPON)) {
			equipments.put(Slot.WEAPON, EquipmentData.BASIC_WEAPON.create());
			return;
		}
		equipments.remove(slot);
	}

	public Collection<Equipment> findAll() {
		return equipments.values();
	}
	
	public Optional<Equipment> findBySlot(Slot slot) {
		return Optional.of(equipments.get(slot));
	}
}
