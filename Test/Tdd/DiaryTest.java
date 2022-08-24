//package Tdd;
//
//import Diary.Diary;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class DiaryTest {
//    Diary sandraDiary;
//    @BeforeEach
//    public void setUp() {
//        sandraDiary = new Diary("Cassandra", "Cassie123");}
//    @Test
//    public void diaryCanBeCreated(){
//        assertEquals(sandraDiary.getName(), "Cassandra");
//        assertEquals("Cassie123", sandraDiary.getLock());
//    }
//    @Test
//    public void changePassword(){
//        sandraDiary.setLock("sandra456");
//        assertEquals("sandra456", sandraDiary.getLock());
//    }
//    @Test
//    public void createEntry(){
//        sandraDiary.setEntryFolder( new ArrayList<>());
//        assertEquals(0, sandraDiary.getEntries().size());
//        sandraDiary.addNewEntry("The Assignment ", "Mr Chibuzor decided to make it up to us in class, He didnt give us assignment anymore...", "Cassie123");
//        assertEquals(1, sandraDiary.getEntries().size());
//        sandraDiary.addNewEntry("The Business Trip ", "My Fiance and i booked a flight to cappadocia in Turkey  ...", "Cassie123");
//        assertEquals(2, sandraDiary.getEntries().size());
//    }
//    @Test
//    public void findEntryUsingTitle(){
//        sandraDiary.addNewEntry("The Assignment ", "Mr Chibuzor decided to " +
//                "make it up to us in class, He didnt give us assignment anymore...", "Cassie123");
//        sandraDiary.addNewEntry("The Business Trip ", "My Fiance and i booked a flight to cappadocia in Turkey  ...", "Cassie123");
//        assertEquals(2, sandraDiary.getEntries().size());
//
//        Entry myEntry = sandraDiary.searchEntryByTitle("The Assignment");
//        assertEquals("The Assignment", myEntry.getTitle());
//       // assertEquals("Mr Chibuzor decided to make it up to us in class, He didnt give us assignment anymore...");
//   System.out.println(myEntry);
//    }
//}
//
