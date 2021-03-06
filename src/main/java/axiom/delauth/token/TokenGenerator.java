package axiom.delauth.token;

import org.apache.log4j.Logger;

import java.util.Random;


public class TokenGenerator {

    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(TokenGenerator.class);

    private TokenStore tokenStore = new TokenStorePojo();

    public String generateToken(String username) {
        String token = Integer.toHexString(new Random().nextInt(Integer.MAX_VALUE));

        tokenStore.addToken(username, token);

        return token;
    }

}