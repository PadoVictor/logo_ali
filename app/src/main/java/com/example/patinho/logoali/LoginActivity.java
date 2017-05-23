package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.patinho.logoali.ActivityDetalhe.ID_ESTABELECIMENTO;
import static com.example.patinho.logoali.BancoDeDadosTeste.AuthenticateUserReturn.USER_ID;
import static com.example.patinho.logoali.Usuario.Role.ADMIN;
import static com.example.patinho.logoali.Usuario.Role.USER;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bLogin = (Button) findViewById(R.id.botao_logar);
        final EditText etEmail = (EditText) findViewById(R.id.edit_text_email);
        final EditText etSenha = (EditText) findViewById(R.id.edit_text_senha);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etSenha.getText().toString();
                int loginReturn = LoginHandler.login(email, password);

                Intent intent = null;

                if (loginReturn == 1) {
                    switch (LoginHandler.getUsuario().getmRole()) {
                        case USER:
                            //Se Role é user, ir à tela de pesquisa
                            intent = new Intent(LoginActivity.this, MainActivity.class);
                            break;
                        case ADMIN:
                            //Se Role é Admin, ir à tela de Meus Estabelecimentos
                            intent = new Intent(LoginActivity.this, ActivityEstabelecimentos.class);
                            break;
                        case SUPPORT:
                            //Se Role é Support, ir à tela de Criação de Estabelecimetos
                            intent = new Intent(LoginActivity.this, ActivityEditEstab.class);
                            intent.putExtra(ID_ESTABELECIMENTO, -1);
                            break;
                    }
                    startActivity(intent);
                }
            }
        });
    }
}
