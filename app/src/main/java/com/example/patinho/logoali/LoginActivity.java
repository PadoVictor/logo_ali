package com.example.patinho.logoali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.patinho.logoali.BancoDeDadosTeste.AuthenticateUserReturn.USER_ID;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView bCriarConta = (TextView) findViewById(R.id.criar_nova_conta_login_activity);

        bCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        Button bLogin = (Button) findViewById(R.id.botao_logar);
        final EditText etEmail = (EditText) findViewById(R.id.edit_text_email);
        final EditText etSenha = (EditText) findViewById(R.id.edit_text_senha);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etSenha.getText().toString();
                BancoDeDadosTeste.AuthenticateUserReturn userReturn = BancoDeDadosTeste.authenticateUser(email, password);
                Intent intent = null;

                if (userReturn.getErr() == 1) {
                    switch (userReturn.getRole()) {
                        case USER:
                            //Se Role é user, ir à tela de pesquisa
                            intent = new Intent(LoginActivity.this, MainActivity.class);
                            break;
                        case ADMIN:
                            //Se Role é Admin, ir à tela de Meus Estabelecimentos
                            intent = new Intent(LoginActivity.this, ActivityEstabelecimentos.class);
                            break;
                    }
                    intent.putExtra(USER_ID, userReturn.getUserID());
                    startActivity(intent);
                }
            }
        });
    }
}
