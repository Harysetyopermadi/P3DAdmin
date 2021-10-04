package com.mauliamahardika.cobalogindenganxampp.kontenmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mauliamahardika.cobalogindenganxampp.IndexMenu;
import com.mauliamahardika.cobalogindenganxampp.R;

public class Nutrisi extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi);

        back=findViewById(R.id.backarrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nutrisi.this, IndexMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}