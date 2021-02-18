package com.shakal.rpg.api.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.entity.ISocialUser;
import com.shakal.rpg.api.contracts.service.user.ISocialUserService;
import com.shakal.rpg.api.dto.auth.SocialInputUserDTO;
import com.shakal.rpg.api.mappers.UserMapper;
import com.shakal.rpg.api.model.enums.SocialTypeEnum;
import com.shakal.rpg.api.model.user.FacebookUser;
import com.shakal.rpg.api.model.user.GoogleUser;
import com.shakal.rpg.api.model.user.SocialUser;
import com.shakal.rpg.api.repository.user.IFacebookUserDAO;
import com.shakal.rpg.api.repository.user.IGoogleUserDAO;

@Service
public class SocialUserService implements ISocialUserService {

	private IFacebookUserDAO facebookUserDAO;
	private IGoogleUserDAO googleUserDAO;
	
	@Autowired
	public SocialUserService(IFacebookUserDAO facebookUserDAO,IGoogleUserDAO googleUserDAO) {
		this.facebookUserDAO = facebookUserDAO;
		this.googleUserDAO = googleUserDAO;
	}

	@Override
	public ISocialUser handleLogin(SocialInputUserDTO inputValue, SocialTypeEnum type) {
		ISocialUser result = null;
		if(type == SocialTypeEnum.FACEBOOK) {
			
			Optional<FacebookUser> search = this.facebookUserDAO.findUserByFacebookId(inputValue.getId());
			
			if(search.isEmpty()) {
				FacebookUser saved = this.facebookUserDAO.save(UserMapper.facebookDTOToEntity(inputValue));
				result = new SocialUser(
						saved.getId(),
						saved.getFacebookId(),
						saved.getUsername());
			}else {
				result = new SocialUser(
						search.get().getId(),
						search.get().getFacebookId(),
						search.get().getUsername());;
			}
			
		}
		if(type == SocialTypeEnum.GOOGLE) {
			Optional<GoogleUser> search = this.googleUserDAO.findUserByGoogleId(inputValue.getId());
			
			if(search.isEmpty()) {
				GoogleUser saved = this.googleUserDAO.save(UserMapper.googleDTOToEntity(inputValue));
				result = new SocialUser(
						saved.getId(),
						saved.getGoogleId(),
						saved.getUsername());
			}else {
				result = new SocialUser(
						search.get().getId(),
						search.get().getGoogleId(),
						search.get().getUsername());;
			}
			
		}
		return result;
	}

}
