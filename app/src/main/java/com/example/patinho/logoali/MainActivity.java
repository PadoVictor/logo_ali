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

    Estabelecimento estabelecimento0 = new Estabelecimento("Corte Rápido", "São José dos Campos", "Vista Verde");
    Estabelecimento estabelecimento1 = new Estabelecimento("Corte Bom", "São José dos Campos", "Aquários");
    Estabelecimento estabelecimento2 = new Estabelecimento("Corte Lindo", "São José dos Campos", "Jardim das Industrias");
    Estabelecimento estabelecimento3 = new Estabelecimento("Corte Prático", "Caçapava", "Centro");
    Estabelecimento estabelecimento4 = new Estabelecimento("Corte Limpo", "Caçapava", "Vila Nova");
    Estabelecimento estabelecimento5 = new Estabelecimento("Cabelo Bom", "Pindamonhangaba", "Marlene Miranda");
    Estabelecimento estabelecimento6 = new Estabelecimento("Cabelo Pronto", "Pindamonhangaba", "Centro");
    Estabelecimento estabelecimento7 = new Estabelecimento("Cabelo Colorido", "Pindamonhangaba", "Jardim das Flores");
    Estabelecimento estabelecimento8 = new Estabelecimento("Cabelo no Chão", "Jacarei", "Cunha");

    Estabelecimento[] estabelecimentos = new Estabelecimento[9];
    ArrayList<Estabelecimento> arrayListEstabelecimento;
    EditText editTextNomeDaCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        estabelecimentos[0] = estabelecimento0;
        estabelecimentos[1] = estabelecimento1;
        estabelecimentos[2] = estabelecimento2;
        estabelecimentos[3] = estabelecimento3;
        estabelecimentos[4] = estabelecimento4;
        estabelecimentos[5] = estabelecimento5;
        estabelecimentos[6] = estabelecimento6;
        estabelecimentos[7] = estabelecimento7;
        estabelecimentos[8] = estabelecimento8;

        Button mButtonBuscar = (Button) findViewById(R.id.botao_buscar_search_activity);

        mButtonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayListEstabelecimento = new ArrayList<Estabelecimento>();
                editTextNomeDaCidade = (EditText) findViewById(R.id.edit_text_cidade_search_activity);
                for(int i = 0; i < estabelecimentos.length; i++) {
                    if (editTextNomeDaCidade.getText().toString() == estabelecimentos[i].getmCidadeDoEstabelecimento()){
                        arrayListEstabelecimento.add(new Estabelecimento(estabelecimentos[i].getmNomeDoEstabelecimento()
                                , estabelecimentos[i].getmCidadeDoEstabelecimento(), estabelecimentos[i].getmBairroDoEstabelecimento()));
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

        if(id == R.id.fazer_login){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
