package MyDiary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();


    public void add(String userName, String password) {
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    public int getEntryList() {
        return diaries.size();
    }

    public Diary findByUserName(String userName) {

        for (int index = 0; index < diaries.size(); index++) {
            Diary myDiary = diaries.get(index);
            if (myDiary.getUsername().equals(userName)) return myDiary;

        }
        return null;
    }

    public void delete(String userName, String password) {
        Diary found = findByUserName(userName);
        diaries.remove(found);

    }
}

