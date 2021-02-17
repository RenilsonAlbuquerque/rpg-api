package com.shakal.rpg.api.control;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;


import com.shakal.rpg.api.contracts.service.ICombatService;
import com.shakal.rpg.api.dto.combat.CombatStateDTO;
import com.shakal.rpg.api.dto.combat.PlayersStateDTO;
import com.shakal.rpg.api.dto.map.MapAreaDTO;



@Controller

public class CombatStompController {


	
	private ICombatService combatService;
	
	@Autowired
	public CombatStompController(
			ICombatService combatService) {
	        
	        this.combatService = combatService;
	}
	
	@MessageMapping("/players/{id}")
	public void recievePlayersDTO(@DestinationVariable Long id,PlayersStateDTO state) throws Exception {
		state = this.combatService.updatePlayersLocations(state,id);
	}
	
	@MessageMapping("/combat/{id}")
	public void recieveDTO(@DestinationVariable Long id,CombatStateDTO state) throws Exception {
		//state.setDificult(combatService.calculateChallengeDeficult(state));
		state = this.combatService.updateCombatConditions(state,id);
	}
	@MessageMapping("/combat-area/{id}")
	public void recieveCombatAreaDTO(@DestinationVariable Long id,MapAreaDTO mapState) throws Exception {
		//state.setDificult(combatService.calculateChallengeDeficult(state));
		mapState = this.combatService.updateMapArea(mapState);
		//maps.put(Long.valueOf(id),mapState);
		//this.template.convertAndSend("/topic/combat-area/"+ id, mapState);
	     
	}
	
	
	 
}
