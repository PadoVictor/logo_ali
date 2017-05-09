package com.example.patinho.logoali;

import java.util.ArrayList;

public class Administrador {

    private int mIdAdministrador;
    private String mNome;
    private String mSobrenome;
    private String mCadastroDePessoa;
    private String mEmail;
    private String mSenha;

    public Administrador(int vIdAdministrador, String vNome, String vSobrenome, String vCadastroDePessoa, String vEmail, String vSenha) {
        mIdAdministrador = vIdAdministrador;
        mNome = vNome;
        mSobrenome = vSobrenome;
        mCadastroDePessoa = vCadastroDePessoa;
        mEmail = vEmail;
        mSenha = vSenha;
    }

    public int getmIdAdministrador() {
        return mIdAdministrador;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmSobrenome() {
        return mSobrenome;
    }

    public String getmCadastroDePessoa() {
        return mCadastroDePessoa;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmSenha() {
        return mSenha;
    }
}
