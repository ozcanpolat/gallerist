package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.AuthRequest;
import com.ozcanpolat.gallerist.dto.AuthResponse;
import com.ozcanpolat.gallerist.dto.DtoUser;
import com.ozcanpolat.gallerist.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
