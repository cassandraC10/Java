package Diary;

import java.util.ArrayList;

public class Diary {
    private String name;
    private ArrayList<Entry> entries;
    private String lock;

    public Diary(String user, String password){
        this.name = user;
        lock = password;
    }
    public String getName() {return name;}
    public void setName(String name) { this.name = name;}
    public ArrayList<Entry> getEntries(){return entries;}
    public void setEntryFolder(ArrayList<Entry> entries) {this.entries = entries;}
    public String getLock(){ return lock;}
    public void setLock(String lock) {this.lock = lock;}
    public void addNewEntry(String title, String body, String password) {
        if (password.equals(lock)) {
            Entry entry = new Entry(title, body);
            entries.add(entry);
        } else {
            throw new IllegalArgumentException("wrong password!!! Cannot Add Entry");
        }
    }
 public Entry searchEntryByTitle(String entryTitle) {
        for (Entry entry : entries) {
            if (entry.getTitle().equalsIgnoreCase(entryTitle)){
                return entry;
            }
        }
        throw new IllegalArgumentException("Entry not found");
 }
}
