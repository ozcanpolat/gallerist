package com.ozcanpolat.gallerist.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;
}

