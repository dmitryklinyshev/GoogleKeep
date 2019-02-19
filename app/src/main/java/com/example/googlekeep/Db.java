package com.example.googlekeep;

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class Db extends RealmObject {

    @Required
    private String title;

    private String text;

    public String  getTitle(){
        return title;
    }

    public void setTitle(final String title){
        this.title = title;
    }
    public String  getText(){
        return text;
    }

    public void setText(final String text){
        this.text = text;
    }
}
