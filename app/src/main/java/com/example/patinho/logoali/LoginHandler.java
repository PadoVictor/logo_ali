package com.example.patinho.logoali;

/**
 * Created by Dener on 15/05/2017.
 */

public class LoginHandler {
    private static Usuario usuario;

    public static int login(String email, String senha) {
        BancoDeDadosTeste.AuthenticateUserReturn userReturn = BancoDeDadosTeste.authenticateUser(email, senha);
        usuario = userReturn.getUsuario();
        return userReturn.getErr();
    }

    public static void logout() {
        usuario = null;
    }

    public static Usuario getUsuario() {
        return usuario;
    }
}
