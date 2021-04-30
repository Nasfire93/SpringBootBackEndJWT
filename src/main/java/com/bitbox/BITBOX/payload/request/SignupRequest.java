package com.bitbox.BITBOX.payload.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

public class SignupRequest {
    @NonNull
    @Getter
    @Setter
    public String dni;
    @NonNull
    @Getter
    @Setter
    private String name;

    @NonNull
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private Set<String> role;

    @NonNull
    @Getter
    @Setter
    private String password;


}
