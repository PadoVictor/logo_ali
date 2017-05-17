package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import static com.example.patinho.logoali.BancoDeDadosTeste.AuthenticateUserReturn.USER_ID;
import static com.example.patinho.logoali.Usuario.Role.ADMIN;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_meus_estabelecimentos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.pesquisar_estabelecimentos) {
            if (ADMIN == LoginHandler.getUsuario().getmRole()) {
                Intent intent = new Intent(ActivityEstabelecimentos.this, MainActivity.class);
                startActivity(intent);
            }
        }
        return true;
    }
}
