package com.ozcanpolat.gallerist.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ozcanpolat.gallerist.controller.IRestAuthenticationController;
import com.ozcanpolat.gallerist.controller.RestBaseController;
import com.ozcanpolat.gallerist.controller.RootEntity;
import com.ozcanpolat.gallerist.dto.AuthRequest;
import com.ozcanpolat.gallerist.dto.AuthResponse;
import com.ozcanpolat.gallerist.dto.DtoUser;
import com.ozcanpolat.gallerist.dto.RefreshTokenRequest;
import com.ozcanpolat.gallerist.service.IAuthenticationService;

import jakarta.validation.Valid;

@RestController
public class RestAuthenticationControllerImpl extends RestBaseController implements IRestAuthenticationController{

	
	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping("/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.register(input));
	}

	@PostMapping("/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.authenticate(input));
	}

	@PostMapping("/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
		return ok(authenticationService.refreshToken(input));
	}

	
}
