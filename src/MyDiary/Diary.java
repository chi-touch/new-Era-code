package MyDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();
    private int counter = 10;


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;

    }


    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlockDiary(String pin){
        if(password.equals((pin))) isLocked = false;

    }
    public int generateId(){
        return counter++;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(generateId(), title, body);
        entries.add(entry);

    }

    public int getEntries() {
        return entries.size();
    }


    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        if(entry != null) entries.remove(entry);

    }
    public Entry findEntry(int id) {
        for(Entry entry:entries){
            if (entry.getId()==id){
                return entry;
            }
        }
        return null;
    }

    public void upDateEntry(int id, String title, String body) {
        for(Entry entry : entries){
            if(entry.getId()==(id)){
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
