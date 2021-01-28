package com.shakal.rpg.api.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.info.CharacterSpellDTO;
import com.shakal.rpg.api.dto.info.CreatureSpellInfoDTO;
import com.shakal.rpg.api.model.character.CharacterSpell;
import com.shakal.rpg.api.model.character.CharacterSpellCircle;
import com.shakal.rpg.api.model.character.CharacterSpellCircleEnum;
import com.shakal.rpg.api.model.character.Character;

public class CharacterSpellMapper {

	public static CreatureSpellInfoDTO entityToDTO(CharacterSpellCircle entity) {
		CreatureSpellInfoDTO result = new CreatureSpellInfoDTO();
		result.setId(entity.getId());
		result.setQuantity(entity.getQuantity());
		result.setSpellCircle(entity.getSpellCircle());
		result.setSpellText(entity.getSpellText());
		result.setTotalAmount(entity.getTotalAmount());
		return result;
	}
	public static CharacterSpellCircle dtoToEntity(CreatureSpellInfoDTO inputDto,CharacterSpell characterSpell) {
		CharacterSpellCircle result = new CharacterSpellCircle();
		result.setId(inputDto.getId());
		result.setQuantity(inputDto.getQuantity());
		result.setSpellCircle(inputDto.getSpellCircle());
		result.setSpellText(inputDto.getSpellText());
		result.setTotalAmount(inputDto.getTotalAmount());
		result.setCharacterSpell(characterSpell);
		return result;
	}
	public static CharacterSpellDTO createEmptyDTO(long charcterId) {
		CharacterSpellDTO result = new CharacterSpellDTO();
		result.setSpellBonusAttack(0);
		List<CreatureSpellInfoDTO> spells = new ArrayList<CreatureSpellInfoDTO>();
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.TRICK.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.FIRST.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.SECOND.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.THIRD.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.FOURTH.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.FIFTH.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.SIXTH.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.SEVENTH.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.EIGHTH.getValue()));
		spells.add(createEmptyCircleDTO((short)CharacterSpellCircleEnum.NINTH.getValue()));
		result.setSpells(spells);
		return result;
	}
	public static CharacterSpellDTO spellEntityToDto(CharacterSpell entity) {
		CharacterSpellDTO result = new CharacterSpellDTO();
		result.setId(entity.getId());
		result.setSpellBonusAttack(entity.getSpellBonusAttack());
		result.setSpells(entity.getSpells().stream().map( characterSpell -> CharacterSpellMapper.entityToDTO(characterSpell))
                .collect(Collectors.toList()));
		return result;
	}
	public static CharacterSpell spellDtoToEntity(CharacterSpellDTO input,Character character) {
		CharacterSpell result = new CharacterSpell();
		result.setId(input.getId());
		result.setSpellBonusAttack(input.getSpellBonusAttack());
		result.setSpells(input.getSpells().stream().map( characterSpell -> CharacterSpellMapper.dtoToEntity(characterSpell,result))
                .collect(Collectors.toList()));
		result.setCharacter(character);
		return result;
	}
	private static CreatureSpellInfoDTO createEmptyCircleDTO(short spellCircle) {
		CreatureSpellInfoDTO result = new CreatureSpellInfoDTO();
		result.setQuantity((short)0);
		result.setTotalAmount((short)0);
		result.setSpellCircle(spellCircle);
		result.setSpellText("");
		return result;
		
	}
}
