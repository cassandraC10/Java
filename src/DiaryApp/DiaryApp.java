package DiaryApp;

import java.util.ArrayList;

public class DiaryApp {
    private String name;
    private String password;
    private String email;

    private final ArrayList<Entry> entries = new ArrayList<>();

    public String getName() {
        return name;
    }

    public DiaryApp(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Entry createEntry(String title, String body){return new Entry(title,body);}
    public void addEntry(Entry entry) { entries.add(entry); }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public Entry searchEntry(String title) {
        for (Entry entry:entries) {
            if (title.equalsIgnoreCase(entry.getTitle())){
                System.out.println(entry.getTitle());
                return entry;
            }
        }
        return null;
    }
    public void viewAllEntries() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            System.out.println(entry.getTitle());
            System.out.println("===============================");
        }

    }

    public boolean deleteEntry(String title) {
        for (Entry entry : entries) {
            if (title.equals(entry.getTitle())) {
                entries.remove(entry);
                return true;
            }
        }
        return  false;
    }

    public String getPassword() {
        return password;
    }
}
