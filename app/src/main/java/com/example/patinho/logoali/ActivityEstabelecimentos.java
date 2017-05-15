package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.patinho.logoali.BancoDeDadosTeste.AuthenticateUserReturn.USER_ID;

public class ActivityEstabelecimentos extends AppCompatActivity {

    int adminID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estabelecimentos);

        adminID = LoginHandler.getUsuario().getmIdUsuario();

        ArrayList<Estabelecimento> arrayListEstabelecimento = BancoDeDadosTeste.selectEstabelecimentoByAdmin(adminID);
        EstabelecimentoAdapter estAdapter = new EstabelecimentoAdapter(ActivityEstabelecimentos.this, arrayListEstabelecimento);
        final ListView listView = (ListView) findViewById(R.id.listview_activity_estabelecimentos);
        listView.setVisibility(View.VISIBLE);
        listView.setAdapter(estAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long l) {
                Intent intent = new Intent(ActivityEstabelecimentos.this, ActivityDetalhe.class);
                int idEstabelecimento = ((Estabelecimento) adapter.getItemAtPosition(position)).getmId();
                intent.putExtra(ActivityDetalhe.ID_ESTABELECIMENTO, idEstabelecimento);
                startActivity(intent);
            }
        });
    }
}
