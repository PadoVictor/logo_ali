package com.example.patinho.logoali;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EstabelecimentoAdapter extends ArrayAdapter<Estabelecimento> {

    public EstabelecimentoAdapter(Context context, ArrayList<Estabelecimento> vEstabelecimentos) {
        super(context, 0, vEstabelecimentos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Estabelecimento mEstabelecimentoAtual = getItem(position);

        TextView mNomeDoEstabelecimento = (TextView) listItemView.findViewById(R.id.Nome);
        mNomeDoEstabelecimento.setText(mEstabelecimentoAtual.getmNomeDoEstabelecimento());

        TextView mTelefoneDoEstabelecimento = (TextView) listItemView.findViewById(R.id.Telefone);
        mTelefoneDoEstabelecimento.setText(mEstabelecimentoAtual.getmTelefoneDoEstabelecimento());

        TextView mBairroDoEstabelecimento = (TextView) listItemView.findViewById(R.id.Bairro);
        mBairroDoEstabelecimento.setText(mEstabelecimentoAtual.getmBairroDoEstabelecimento());

        TextView mCidadeDoEstabelecimento = (TextView) listItemView.findViewById(R.id.Cidade);
        mCidadeDoEstabelecimento.setText(mEstabelecimentoAtual.getmCidadeDoEstabelecimento());

        return listItemView;
    }
}
