package com.example.patinho.logoali;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import static com.example.patinho.logoali.ActivityDetalhe.ID_ESTABELECIMENTO;

public class ActivityEditEstab extends AppCompatActivity {

    private Estabelecimento estabelecimento;

    ImageView imagem;

    EditText nome, telefone, rua, numero, bairro, cidade, servicos, horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_estab);

        final Intent intent = getIntent();
        estabelecimento = BancoDeDadosTeste.selectEstabelecimento(intent.getIntExtra(ID_ESTABELECIMENTO, -1));

        if (estabelecimento != null) {
            populateViews();
        }
    }

    private void populateViews() {
        imagem = (ImageView) findViewById(R.id.imageView);
        imagem.setImageResource(estabelecimento.getmImagemEstabelecimento());

        nome = (EditText) findViewById(R.id.edit_text_nome_estabelecimento);
        nome.setText(estabelecimento.getmNomeDoEstabelecimento());

        telefone = (EditText) findViewById(R.id.edit_text_telefone_estabelecimento);
        telefone.setText(estabelecimento.getmTelefoneDoEstabelecimento());

        rua = (EditText) findViewById(R.id.edit_text_rua_estabelecimento);
        rua.setText(estabelecimento.getmRuaDoEstabelecimento());

        numero = (EditText) findViewById(R.id.edit_text_numero_estabelecimento);
        numero.setText(String.valueOf(estabelecimento.getmNumeroDoEstabelecimento()));

        bairro = (EditText) findViewById(R.id.edit_text_bairro_estabelecimento);
        bairro.setText(estabelecimento.getmBairroDoEstabelecimento());

        cidade = (EditText) findViewById(R.id.edit_text_cidade_estabelecimento);
        cidade.setText(estabelecimento.getmCidadeDoEstabelecimento());

        servicos = (EditText) findViewById(R.id.edit_text_servicos_estabelecimento);
        servicos.setText(estabelecimento.getmServicos());

        horario = (EditText) findViewById(R.id.edit_text_horario_estabelecimento);
        horario.setText(estabelecimento.getmHorarioAtendimento());
    }

    @Override
    protected void onPause() {

        estabelecimento.setmNomeDoEstabelecimento(nome.getText().toString());
        estabelecimento.setmTelefoneDoEstabelecimento(telefone.getText().toString());
        estabelecimento.setmRuaDoEstabelecimento(rua.getText().toString());
        estabelecimento.setmNumeroDoEstabelecimento(numero.getText().toString());
        estabelecimento.setmBairroDoEstabelecimento(bairro.getText().toString());
        estabelecimento.setmCidadeDoEstabelecimento(cidade.getText().toString());
        estabelecimento.setmServicos(servicos.getText().toString());
        estabelecimento.setmHorarioAtendimento(horario.getText().toString());

        BancoDeDadosTeste.updateEstabelecimento(estabelecimento);
        super.onPause();
    }
}
