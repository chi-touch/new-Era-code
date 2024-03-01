package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryTest {
    private  Entry entry;
    @BeforeEach
    void testThisFirst(){
        LocalDate date = LocalDate.parse("2024-02-24");
        entry = new Entry(1,"myDiary","story");
    }
    @Test
    public void testForId(){
        assertEquals(1, entry.getId());
    }

    @Test
    public void testForTitle(){
        assertEquals("myDiary",entry.getTitle());
    }

    @Test
    public void testForBody(){
        assertEquals("story",entry.getBody());
    }

    @Test
    public void testForDate(){
        String day = String.valueOf(entry.getDateCreated());
        assertEquals("2024-02-24",day);
    }



}