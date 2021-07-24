package com.shashank.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shashank.Models.Book_Model;
import com.shashank.mylibrary.R;

import java.util.ArrayList;
import java.util.List;

public class Book_Adaptor  extends RecyclerView.Adapter<Book_Adaptor.BookViewHolder> {

    ArrayList<Book_Model> BooksList;

    public Book_Adaptor( ArrayList<Book_Model> booksList) {

        BooksList = booksList;
    }


    @NonNull
    @Override
    public Book_Adaptor.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list,parent,false);
        return new BookViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Book_Adaptor.BookViewHolder holder, int position) {
    Book_Model book_model1 = BooksList.get(position);
    holder.BookTitle.setText(book_model1.getTitle());
    holder.author.setText(book_model1.getAuthor());
    holder.edition.setText(book_model1.getEdition());
    holder.language.setText(book_model1.getLanguage());
    holder.cat.setText(book_model1.getCategories());
    holder.desc.setText(book_model1.getDescription());
    }

    @Override
    public int getItemCount() {
        return BooksList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView BookTitle,author,edition,language,cat,desc;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            BookTitle = itemView.findViewById(R.id.txtBookName);
            author = itemView.findViewById(R.id.txtBookauthor);
            edition = itemView.findViewById(R.id.txtBookedition);
            language = itemView.findViewById(R.id.txtBookLanguage);
            cat = itemView.findViewById(R.id.txtBookCateg);
            desc = itemView.findViewById(R.id.txtBookDesc);

        }
    }
}
