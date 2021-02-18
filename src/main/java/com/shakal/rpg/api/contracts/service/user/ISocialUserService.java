package com.shakal.rpg.api.contracts.service.user;

import com.shakal.rpg.api.contracts.entity.ISocialUser;
import com.shakal.rpg.api.dto.auth.SocialInputUserDTO;
import com.shakal.rpg.api.model.enums.SocialTypeEnum;

public interface ISocialUserService {

	ISocialUser handleLogin(SocialInputUserDTO inputValue,SocialTypeEnum type);
}
