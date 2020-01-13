package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private Button button_back;
    private TextView textarvo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.button_back = findViewById(R.id.button);
        this.textarvo2 = findViewById(R.id.textView2);

        ArrayList<String> itemList = (ArrayList<String>)
                getIntent().getSerializableExtra("lista");
        textarvo2.setText(String.valueOf(itemList));





        this.button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
