package com.example.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class Saves extends AppCompatActivity implements View.OnClickListener {

    Button btnAdd;
    private ListView saved;
    private EditText savedN;
    private List<String> mLista = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saves);

        btnAdd = findViewById(R.id.addBtn);
        saved = findViewById(R.id.save_list);
        savedN = findViewById(R.id.add);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addBtn: String text = savedN.getText().toString().trim();
            mLista.add(text);
            savedN.getText().clear();
            mAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
            saved.setAdapter(mAdapter);
        }
    }
}
