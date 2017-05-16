package com.example.patinho.logoali;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ActivityDetalhe extends AppCompatActivity {

    public final static String ID_ESTABELECIMENTO = "com.example.patinho.logoali.ActivityDetalhe.ID_ESTABELECIMENTO";
    public final static String ID_USUARIO = "com.example.patinho.logoali.ActivityDetalhe.ID_USUARIO";

    private final int MenuItem_EditId = 1;

    Estabelecimento estabelecimento;
    Usuario usuario;
    //Testando

    TextView nome, telefone, rua, numero, bairro, cidade, servicos, horario;

    ImageView imagem;

    RatingBar nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        final Intent intent = getIntent();
        estabelecimento = BancoDeDadosTeste.selectEstabelecimento(intent.getIntExtra(ID_ESTABELECIMENTO, -1));
        usuario = BancoDeDadosTeste.selectAdministrador(intent.getIntExtra(ID_USUARIO, -1));

        imagem = (ImageView) findViewById(R.id.imagem_estabelecimento_detalhe);
        imagem.setImageResource(estabelecimento.getmImagemEstabelecimento());

        nome = (TextView) findViewById(R.id.nome_estabelecimento_detalhe);
        nome.setText(estabelecimento.getmNomeDoEstabelecimento());

        telefone = (TextView) findViewById(R.id.telefone_estabelecimento_detalhe);
        telefone.setText(estabelecimento.getmTelefoneDoEstabelecimento());

        rua = (TextView) findViewById(R.id.rua_estabelecimento_detalhe);
        rua.setText(estabelecimento.getmRuaDoEstabelecimento());

        numero = (TextView) findViewById(R.id.numero_estabelecimento_detalhe);
        numero.setText(String.valueOf(estabelecimento.getmNumeroDoEstabelecimento()));

        bairro = (TextView) findViewById(R.id.bairro_estabelecimento_detalhe);
        bairro.setText(estabelecimento.getmBairroDoEstabelecimento());

        cidade = (TextView) findViewById(R.id.cidade_estabelecimento_detalhe);
        cidade.setText(estabelecimento.getmCidadeDoEstabelecimento());

        servicos = (TextView) findViewById(R.id.serviços_estabelecimento_detalhe);
        servicos.setText(estabelecimento.getmServicos());

        horario = (TextView) findViewById(R.id.horario_estabelecimento_detalhe);
        horario.setText(estabelecimento.getmHorarioAtendimento());

        nota = (RatingBar) findViewById(R.id.rating_bar_detalhe);
        nota.setRating(estabelecimento.getmNotaEstabelecimento());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_details, menu);
        if (estabelecimento.getmIdAdministrador() == LoginHandler.getUsuario().getmIdUsuario()) {
            MenuItem edit_item = menu.add(0, MenuItem_EditId, 0, R.string.edit);
            edit_item.setIcon(R.drawable.ic_mode_edit_white_24dp);
            edit_item.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        return true;
    }

    public void createAlarm(String message) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, 0)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.adicionar_alarme) {
            createAlarm(nome.getText().toString());
        }
        return true;
    }
}
