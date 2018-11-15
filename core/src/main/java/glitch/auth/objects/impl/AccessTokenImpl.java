package glitch.auth.objects.impl;

import com.google.gson.annotations.SerializedName;
import glitch.auth.Scope;
import glitch.auth.objects.AccessToken;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.Set;

@Data
public class AccessTokenImpl implements AccessToken {
    private final String accessToken;

    private final String refreshToken;

    @Nullable
    @Accessors(fluent = true)
    @SerializedName("expires_in")
    private final Instant expiredAt;

    @SerializedName("scope")
    private final Set<Scope> scopes;
}
