package com.bitbox.BITBOX.payload.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class LoginRequest {
    @NonNull
    @Getter
    @Setter
    private String name;

    @NonNull
    @Getter @Setter private String password;
}
