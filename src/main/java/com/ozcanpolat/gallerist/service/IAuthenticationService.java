package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.AuthRequest;
import com.ozcanpolat.gallerist.dto.AuthResponse;
import com.ozcanpolat.gallerist.dto.DtoUser;
import com.ozcanpolat.gallerist.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
