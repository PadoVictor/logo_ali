package com.example.patinho.logoali;

public class Administrador {

    private String mNome;
    private String mSobrenome;
    private String mCadastroDePessoa;
    private String mEmail;
    private String mSenha;

    public Administrador(String vNome, String vSobrenome, String vCadastroDePessoa, String vEmail, String vSenha) {
        mNome = vNome;
        mSobrenome = vSobrenome;
        mCadastroDePessoa = vCadastroDePessoa;
        mEmail = vEmail;
        mSenha = vSenha;
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
