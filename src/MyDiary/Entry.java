package MyDiary;

import java.time.LocalDate;


public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;


    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return String.format("""
                Title: %s
                Body: %s
                """,title,body);
    }

    public Entry add(Entry entry) {
        return entry;
    }
}
