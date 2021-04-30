package com.bitbox.BITBOX.payload.response;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    @NonNull
    @Getter
    @Setter
    private String token;
    @NonNull
    @Getter
    @Setter
    private String type = "Bearer";
    @NonNull
    @Getter
    @Setter
    private String id;
    @NonNull
    @Getter
    @Setter
    private String username;
    @NonNull
    @Getter
    @Setter
    private String email;
    @NonNull
    @Getter
    @Setter
    private List<String> roles;

}
