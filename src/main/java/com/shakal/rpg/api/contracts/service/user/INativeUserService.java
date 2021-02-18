package com.shakal.rpg.api.contracts.service.user;

import com.shakal.rpg.api.exception.LoginException;
import com.shakal.rpg.api.model.user.NativeUser;

public interface INativeUserService {

	NativeUser handleLogin(String username);
	NativeUser handleLogin(String username,String password) throws LoginException;
}
