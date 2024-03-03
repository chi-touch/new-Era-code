package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {

    private Diaries myDiaries;

    @BeforeEach
    public void initializeDiaries(){
        myDiaries = new Diaries();
    }

    @Test
    public void testToAddDiary(){
        Diary diary = new Diary("chichi","3456");
        myDiaries.add("chichi","3456");
        assertEquals(1, myDiaries.getEntryList());
    }
    @Test
    public void testToFindByUserName(){
        Diary diary = new Diary("chichi", "3456");
        myDiaries.add("chichi","3456");
       Diary found = myDiaries.findByUserName("chichi");
        assertEquals(found,myDiaries.findByUserName("chichi"));

    }

    @Test
    public void testToDeleteDiary(){
        Diary diary = new Diary("marvellous","1234");
        myDiaries.add("marvellous","1234");
        myDiaries.delete("marvellous","1234");
        assertEquals(0,myDiaries.getEntryList());

    }


}