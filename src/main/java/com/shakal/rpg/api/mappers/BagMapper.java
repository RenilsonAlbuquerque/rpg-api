package com.shakal.rpg.api.mappers;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.info.BagInfoDTO;
import com.shakal.rpg.api.dto.overview.EquipmentBagOverviewDTO;
import com.shakal.rpg.api.model.character.Bag;
import com.shakal.rpg.api.model.character.BagEquipment;

public class BagMapper {

	public static BagInfoDTO entityToDTO(Bag entity) {
		BagInfoDTO result = new BagInfoDTO();
		result.setId(entity.getId());
		result.setCopper(entity.getCopperPieces());
		result.setSilver(entity.getSilverPieces());
		result.setElectrum(entity.getElectrumPieces());
		result.setGold(entity.getGoldPieces());
		result.setPlatinum(entity.getPlatinumPieces());
		result.setEquipments(entity.getBagEquipments().stream()
				.map(bagEquipment -> EquipmentMapper.mapBagEntityToDTO(bagEquipment))
				.collect(Collectors.toList()));
		return result;
	}
	public static BagInfoDTO createEmptyDTO(long id) {
		BagInfoDTO result = new BagInfoDTO();
		result.setId(id);
		result.setCopper((short)0);
		result.setSilver((short)0);
		result.setElectrum((short)0);
		result.setGold((short)0);
		result.setPlatinum((short)0);
		result.setEquipments(new ArrayList<>());
		return result;
	}
	
	
}
