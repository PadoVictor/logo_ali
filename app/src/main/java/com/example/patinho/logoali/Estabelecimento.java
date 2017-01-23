package com.example.patinho.logoali;

import android.widget.RatingBar;

public class Estabelecimento {

    private int mId;
    private Administrador mAdministrador;
    private String mNomeDoEstabelecimento;
    private String mRuaDoEstabelecimento;
    private String mNumeroDoEstabelecimento;
    private String mBairroDoEstabelecimento;
    private String mCidadeDoEstabelecimento;
    private String mTelefoneDoEstabelecimento;
    private float mNotaEstabelecimento = 4.5f;

    public Estabelecimento(int id, String vNomeDoEstabelecimento, String vRuaDoEstabelecimento, String vNumeroDoEstabelecimento
            , String vBairroDoEstabelecimento, String vCidadeDoEstabelecimento, String vTelefoneDoEstabelecimento
            , Administrador vAdministrador){

        mId = id;
        mAdministrador = vAdministrador;
        mNomeDoEstabelecimento = vNomeDoEstabelecimento;
        mRuaDoEstabelecimento = vRuaDoEstabelecimento;
        mNumeroDoEstabelecimento = vNumeroDoEstabelecimento;
        mBairroDoEstabelecimento = vBairroDoEstabelecimento;
        mCidadeDoEstabelecimento = vCidadeDoEstabelecimento;
        mTelefoneDoEstabelecimento = vTelefoneDoEstabelecimento;
    }

    public int getmId() {
        return mId;
    }

    public String getmNomeDoEstabelecimento() {
        return mNomeDoEstabelecimento;
    }

    public String getmRuaDoEstabelecimento() {
        return mRuaDoEstabelecimento;
    }

    public String getmTelefoneDoEstabelecimento() {
        return mTelefoneDoEstabelecimento;
    }

    public Administrador getmAdministrador() {
        return mAdministrador;
    }

    public String getmNumeroDoEstabelecimento() {
        return mNumeroDoEstabelecimento;
    }

    public String getmBairroDoEstabelecimento() {
        return mBairroDoEstabelecimento;
    }

    public String getmCidadeDoEstabelecimento() {
        return mCidadeDoEstabelecimento;
    }

    public float getmNotaEstabelecimento() {
        return mNotaEstabelecimento;
    }
}
