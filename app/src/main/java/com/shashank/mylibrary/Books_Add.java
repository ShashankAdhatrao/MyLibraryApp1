package com.shashank.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Books_Add extends AppCompatActivity {
    Button Viewbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_add);
        Viewbook = findViewById(R.id.btn_ViewBooks);
        Viewbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Books.class);
                startActivity(intent);
            }
        });
    }
}