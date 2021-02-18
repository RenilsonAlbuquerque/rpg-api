package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.auth.SocialInputUserDTO;
import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.create.UserCreateDTO;
import com.shakal.rpg.api.model.relation.UserStory;
import com.shakal.rpg.api.model.user.FacebookUser;
import com.shakal.rpg.api.model.user.GoogleUser;
import com.shakal.rpg.api.model.user.NativeUser;
import com.shakal.rpg.api.model.user.User;

public class UserMapper {

    public static NativeUser createToEntity(UserCreateDTO createUserDTO){
        return new NativeUser(createUserDTO.getUsername(),
        				createUserDTO.getPassword());
                
    }
    public static KeyValueDTO entityToKeyValue(User entity){
    	KeyValueDTO result = new KeyValueDTO();
    	result.setId(entity.getId());
    	result.setValue(entity.getUsername());
        return result;
                
    }
    public static KeyValueDTO entityToKeyValue(UserStory entity){
    	KeyValueDTO result = new KeyValueDTO();
    	result.setId(entity.getUser().getId());
    	result.setValue(entity.getUser().getUsername());
        return result;
                
    }
    public static FacebookUser facebookDTOToEntity(SocialInputUserDTO dto) {
    	FacebookUser entity = new FacebookUser();
    	entity.setUsername(dto.getUsername());
    	entity.setLastName(dto.getLastName());
    	entity.setFacebookId(dto.getId());
    	entity.setEmail(dto.getEmail());
    	entity.setPhotoUrl(dto.getImage());
    	return entity;
    	
    }
    public static GoogleUser googleDTOToEntity(SocialInputUserDTO dto) {
    	GoogleUser entity = new GoogleUser();
    	entity.setUsername(dto.getUsername());
    	entity.setLastName(dto.getLastName());
    	entity.setGoogleId(dto.getId());
    	entity.setEmail(dto.getEmail());
    	entity.setPhotoUrl(dto.getImage());
    	return entity;
    }
}
