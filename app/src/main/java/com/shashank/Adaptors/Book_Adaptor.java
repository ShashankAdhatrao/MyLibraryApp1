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
    Context mContext;
    ArrayList<Book_Model> BooksList;

    public Book_Adaptor(Context mContext, ArrayList<Book_Model> booksList) {
        this.mContext = mContext;
        BooksList = booksList;
    }

    @NonNull
    @Override
    public Book_Adaptor.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.book_list,parent,false);
        return new BookViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Book_Adaptor.BookViewHolder holder, int position) {
    Book_Model book_model = BooksList.get(position);
    holder.BookTitle.setText(book_model.getBook_name());
    }

    @Override
    public int getItemCount() {
        return BooksList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView BookTitle;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            BookTitle = itemView.findViewById(R.id.txtBookName);

        }
    }
}
