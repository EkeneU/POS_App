package com.example.posapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VerificationActivity extends AppCompatActivity {
    private ImageView ImgAppLogoLogin;
    private TextView txt_SignInText, txt_Login, txt_Password, txtSignupText, txtForgotPassword;
    private EditText edt_LoginID, edt_loginPassword;
    private Button btn_SignIn;

    private AccountManager accountManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        ImgAppLogoLogin=findViewById(R.id.ImgAppLogoLogin);
        txt_SignInText=findViewById(R.id.txt_signText);
        txt_Login=findViewById(R.id.txt_Login);
        txt_Password=findViewById(R.id.txt_Password);
        edt_LoginID=findViewById(R.id.edt_loginID);
        edt_loginPassword=findViewById(R.id.edt_loginPassword);
        txtSignupText=findViewById(R.id.txtSignupText);
        btn_SignIn=findViewById(R.id.btn_SignIn);
        txtForgotPassword=findViewById(R.id.txtForgotPassword);

        createAccount();
        forgotPassword();
        onbtnclick();


    }
    private void createAccount() {
        txtSignupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VerificationActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }

    private void forgotPassword(){
        txtForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* TODO: Intent to another activity (that would be created) and an implicit intent would be created in that activity.
                *
                */
            }
        });
    }

    private void onbtnclick(){
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getLoginID().isEmpty()||getPassword().isEmpty() ){
                    Toast.makeText(VerificationActivity.this, "Edakun fill up the blank spaces", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(VerificationActivity.this, EntryActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
    @NonNull
    private String getLoginID(){
        String login= edt_LoginID.getText().toString();
        edt_LoginID.setText("");
        return login;
    }
    @NonNull
    private String getPassword(){
        String password= edt_loginPassword.getText().toString();
        edt_loginPassword.setText("");
        return password;
    }

}