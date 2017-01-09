package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Estabelecimento> arrayListEstabelecimento;
    BancoDeDadosTeste bdEstabalecimentos;
    EditText editTextNomeDaCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button mButtonBuscar = (Button) findViewById(R.id.botao_buscar_search_activity);

        mButtonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayListEstabelecimento = new ArrayList<Estabelecimento>();
                editTextNomeDaCidade = (EditText) findViewById(R.id.edit_text_cidade_search_activity);
                for (int i = 0; i < bdEstabalecimentos.getEstabelecimento().length; i++) {
                    if (editTextNomeDaCidade.getText().toString() == bdEstabalecimentos.getEstabelecimento()[i].getmCidadeDoEstabelecimento()) {
                        arrayListEstabelecimento.add(new Estabelecimento(bdEstabalecimentos.getEstabelecimento()[i].getmNomeDoEstabelecimento()
                                , bdEstabalecimentos.getEstabelecimento()[i].getmCidadeDoEstabelecimento(),
                                bdEstabalecimentos.getEstabelecimento()[i].getmBairroDoEstabelecimento()));
                    }
                }
                EstabelecimentoAdapter estAdapter = new EstabelecimentoAdapter(MainActivity.this, arrayListEstabelecimento);
                ListView listView = (ListView) findViewById(R.id.list_view_busca);
                listView.setAdapter(estAdapter);
                listView.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.fazer_login) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
