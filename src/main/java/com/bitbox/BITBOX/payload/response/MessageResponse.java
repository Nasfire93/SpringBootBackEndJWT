package com.bitbox.BITBOX.payload.response;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
public class MessageResponse {

    @Getter
    @Setter
    @NonNull
    private String message;

}
