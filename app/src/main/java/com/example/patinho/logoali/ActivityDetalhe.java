package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ActivityDetalhe extends AppCompatActivity {

    public static String ID_ESTABELECIMENTO = "com.example.patinho.logoali.ActivityDetalhe.ID_ESTABELECIMENTO";

    Estabelecimento estabelecimento;

    TextView nome, telefone, rua, numero, bairro, cidade;

    RatingBar nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        final Intent intent = getIntent();
        estabelecimento = BancoDeDadosTeste.selectEstabelecimento(intent.getIntExtra(ID_ESTABELECIMENTO, -1));

        //TODO: Popular views
        nome = (TextView) findViewById(R.id.nome_estabelecimento_detalhe);
        nome.setText(estabelecimento.getmNomeDoEstabelecimento());

        telefone = (TextView) findViewById(R.id.telefone_estabelecimento_detalhe);
        telefone.setText(estabelecimento.getmTelefoneDoEstabelecimento());

        rua = (TextView) findViewById(R.id.rua_estabelecimento_detalhe);
        rua.setText(estabelecimento.getmRuaDoEstabelecimento());

        numero = (TextView) findViewById(R.id.numero_estabelecimento_detalhe);
        numero.setText(estabelecimento.getmNumeroDoEstabelecimento());

        bairro = (TextView) findViewById(R.id.bairro_estabelecimento_detalhe);
        bairro.setText(estabelecimento.getmBairroDoEstabelecimento());

        cidade = (TextView) findViewById(R.id.cidade_estabelecimento_detalhe);
        cidade.setText(estabelecimento.getmCidadeDoEstabelecimento());

        nota = (RatingBar) findViewById(R.id.rating_bar_detalhe);
        nota.setNumStars(4);
    }


}
