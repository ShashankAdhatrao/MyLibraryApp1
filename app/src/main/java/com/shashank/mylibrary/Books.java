package com.shashank.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.shashank.Adaptors.Book_Adaptor;
import com.shashank.Models.Book_Model;

import java.util.ArrayList;

public class Books extends AppCompatActivity {
RecyclerView recyclerView;


Book_Adaptor bookAdaptor;
ArrayList<Book_Model> bookModelsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        recyclerView = findViewById(R.id.rcv_books);
        final DatabaseReference database = FirebaseDatabase.getInstance().getReference("books");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bookModelsList = new ArrayList<>();


        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()){
                        Book_Model b=npsnapshot.getValue(Book_Model.class);
                        bookModelsList.add(b);
                    }
                    bookAdaptor=new Book_Adaptor(bookModelsList);
                    recyclerView.setAdapter(bookAdaptor);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}