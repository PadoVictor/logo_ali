package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Estabelecimento> arrayListEstabelecimento;
    EditText editTextNomeDaCidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button mButtonBuscar = (Button) findViewById(R.id.botao_buscar_search_activity);

        mButtonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayListEstabelecimento = new ArrayList<>();
                editTextNomeDaCidade = (EditText) findViewById(R.id.edit_text_cidade_search_activity);
                for (Estabelecimento e : BancoDeDadosTeste.getEstabelecimento()) {
                    if (e.getmCidadeDoEstabelecimento().equalsIgnoreCase(editTextNomeDaCidade.getText().toString())) {
                        arrayListEstabelecimento.add(e);
                    }
                }
                EstabelecimentoAdapter estAdapter = new EstabelecimentoAdapter(MainActivity.this, arrayListEstabelecimento);
                final ListView listView = (ListView) findViewById(R.id.list_view_busca);
                listView.setVisibility(View.VISIBLE);
                listView.setAdapter(estAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapter, View view, int position, long l) {
                        Intent intent = new Intent(MainActivity.this, ActivityDetalhe.class);
                        int idEstabelecimento = ((Estabelecimento)adapter.getItemAtPosition(position)).getmId();
                        intent.putExtra(ActivityDetalhe.ID_ESTABELECIMENTO, idEstabelecimento);
                        startActivity(intent);
                    }
                });
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

