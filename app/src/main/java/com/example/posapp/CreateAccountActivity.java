package com.example.posapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class CreateAccountActivity extends AppCompatActivity {
    private TextView txtName, txtDateofBirth, txtGender, txtNationality, txtPhoneNumber, txtBVN, txtEmail;
    private static EditText SignupName, DateofBirth, Gender, PhoneNumber, ReenterPassword, BVN, EmailAddress;
    private Spinner Nationality;
    private static EditText CreatePassword;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        txtName=findViewById(R.id.txtName);
        txtDateofBirth=findViewById(R.id.txtDateofBirth);
        txtGender=findViewById(R.id.txtGender);
        txtNationality=findViewById(R.id.txtNationality);
        txtPhoneNumber=findViewById(R.id.txtPhoneNumber);
        txtBVN=findViewById(R.id.txtBVN);
        txtEmail=findViewById(R.id.txtEmail);

        SignupName=findViewById(R.id.SignupName);
        DateofBirth=findViewById(R.id.DateofBirth);
        Gender=findViewById(R.id.Gender);
        Nationality=findViewById(R.id.Nationality);
        PhoneNumber=findViewById(R.id.PhoneNumber);
        BVN=findViewById(R.id.BVN);
        EmailAddress=findViewById(R.id.EmailAddress);

        btnSignUp=findViewById(R.id.btnSignup);

        signupbutton();
        populateSpinner();

    }

    private void populateSpinner() {
        Locale[] locales=Locale.getAvailableLocales();
        ArrayList<String> countries= new ArrayList<>();
        for(Locale locale : locales){
            String country=locale.getDisplayCountry();
            if(country.length() > 0 && !countries.contains(country)){
                countries.add(country);
            }
        }
        Collections.sort(countries);
        ArrayAdapter<String> countriesAdapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        countriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Nationality.setAdapter(countriesAdapter);


    }

    private void signupbutton() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signupName().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Input your name, don't be unfortunate", Toast.LENGTH_SHORT).show();
                }
                else if(dateofBirth().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Input your date of birth, don't be unfortunate", Toast.LENGTH_SHORT).show();
                }
                else if(gender().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Gender izz compostree pliks, dun be unfortunate", Toast.LENGTH_SHORT).show();
                }
                else if(phonenumber().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Kindly input phone number", Toast.LENGTH_SHORT).show();
                }
                else if(bvn().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Kindly input your BVN", Toast.LENGTH_SHORT).show();
                }
                else if(email().isEmpty()){
                    Toast.makeText(CreateAccountActivity.this, "Kindly input your email address", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(CreateAccountActivity.this, VerificationActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    @NonNull
    private String signupName(){
        String name=SignupName.getText().toString();
        return name;
    }
    @NonNull
    private String dateofBirth(){
        String dob=DateofBirth.getText().toString();
        return dob;
    }
    @NonNull
    private String gender(){
        String gender=Gender.getText().toString();
        return gender;
    }
    @NonNull
    private String phonenumber(){
        String phonenumber=PhoneNumber.getText().toString();
        return phonenumber;
    }
    @NonNull
    private String bvn(){
        String bvn=BVN.getText().toString();
        return bvn;
    }
    @NonNull
    private String email(){
        String email=EmailAddress.getText().toString();
        return email;
    }
}