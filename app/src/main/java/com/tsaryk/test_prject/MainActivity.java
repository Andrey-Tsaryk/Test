package com.tsaryk.test_prject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class MainActivity<Firebase> extends AppCompatActivity {

    private EditText edit_t;
    Firebase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        edit_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Edit_t = edit_t.getText().toString();
                List<String> edit_t = List<>();
                edit_t.put(edit_t);

                db.collection();
            }
        });
    }
}