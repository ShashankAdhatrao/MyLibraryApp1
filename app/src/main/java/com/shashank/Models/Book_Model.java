package com.shashank.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Book_Model {

    @SerializedName("title")
    @Expose
    String title,author,edition,language,description,categories;

    public Book_Model(){

    }

    public Book_Model(String title, String author, String edition, String language, String description) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.language = language;
        this.description = description;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setTitle(String title) {
        this.title = title;

    }
}
