package Exercises;

import java.time.LocalDateTime;
import java.util.Objects;

public class Entry {
    private int id;
    private String title;
    private String body;
    private static  LocalDateTime dateCreated = LocalDateTime.now();




    public Entry(int id,String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;


    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setBody(String body){
        this.body = body;
    }
    public String getBody(){
        return body;
    }

    public String getEntry(){
        return "Title: " + title + "\n" + " Body: " + body + "\n" + dateCreated ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return id == entry.id && Objects.equals(title, entry.title) && Objects.equals(body, entry.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';

    }

}
