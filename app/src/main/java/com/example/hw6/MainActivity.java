package com.example.hw6;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        Button botton = findViewById(R.id.bottom);
        TextView enter = findViewById(R.id.enter);
        TextView forget = findViewById(R.id.forget);
        TextView tap_here = findViewById(R.id.tap_here);
        TextView registr = findViewById(R.id.registration);


        Boolean isEmpty = true;

        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("admin") && editText2.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Вы успешно заригистрировались", Toast.LENGTH_SHORT).show();
                    editText1.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    botton.setVisibility(View.GONE);
                    registr.setVisibility(View.GONE);
                    tap_here.setVisibility(View.GONE);
                    forget.setVisibility(View.GONE);
                    enter.setVisibility(View.GONE);
                } else  {
                    Toast.makeText(MainActivity.this, "Не правильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editText1.addTextChangedListener(new TextWatcher() {

            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                botton.setBackground(getDrawable(R.color.grey));

            }
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                botton.setBackground(getDrawable(R.color.orange));
            }
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void afterTextChanged(Editable editable) {
                botton.setBackground(getDrawable(R.color.orange));
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                botton.setBackground(getDrawable(R.color.grey));

            }
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                botton.setBackground(getDrawable(R.color.orange));
            }
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void afterTextChanged(Editable editable) {
                botton.setBackground(getDrawable(R.color.orange));
            }
        });

    }
}
