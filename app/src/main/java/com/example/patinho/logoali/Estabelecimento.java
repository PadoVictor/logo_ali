package com.example.patinho.logoali;

import android.widget.RatingBar;

public class Estabelecimento {

    private int mId;
    private int mIdAdministrador;
    private String mNomeDoEstabelecimento;
    private String mRuaDoEstabelecimento;
    private String mNumeroDoEstabelecimento;
    private String mBairroDoEstabelecimento;
    private String mCidadeDoEstabelecimento;
    private String mTelefoneDoEstabelecimento;
    private float mNotaEstabelecimento = 4.5f;

    public Estabelecimento(int id, String vNomeDoEstabelecimento, String vRuaDoEstabelecimento, String vNumeroDoEstabelecimento
            , String vBairroDoEstabelecimento, String vCidadeDoEstabelecimento, String vTelefoneDoEstabelecimento
            , int vIdAdministrador){

        mId = id;
        mIdAdministrador = vIdAdministrador;
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

    public int getmIdAdministrador() {
        return mIdAdministrador;
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
