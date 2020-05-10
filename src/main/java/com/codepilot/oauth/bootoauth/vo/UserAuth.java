package com.codepilot.oauth.bootoauth.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserAuth {

    private String principalName;
    private String authToken;
    private String email;
    private String displayName;

}
