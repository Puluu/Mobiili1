package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView textarvo;
    private Button button_save;
    private Button button_done;
    private EditText editText2;

    public ArrayList<String> itemList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textarvo = findViewById(R.id.textView);
        this.button_save = findViewById(R.id.button3);
        this.button_done = findViewById(R.id.button4);
        this.editText2 = findViewById(R.id.editText);



        this.button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(editText2.getText().length()<= 3 || editText2.getText().length() > 15){
                    Context context = getApplicationContext();
                    CharSequence text = "Liian lyhyt tai pitkä teksti!(min 3, max 15 kirjainta";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Teksti tallennettu listaan";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    itemList.add(editText2.getText().toString());

                }
            }
        });

        this.button_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                myIntent.putExtra("lista", itemList);
                startActivity(myIntent);

            }
        });

    }


}
