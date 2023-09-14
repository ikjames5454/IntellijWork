package tdd;

import Exercises.Entry;

import java.util.ArrayList;

public class Diary {

    private final String userName;
    private final String pin;
    private boolean isLock;
    private ArrayList<Entry>entries;

    public Diary(String UserName, String pin) {
        this.userName = UserName;
        this.pin = pin;
        entries = new ArrayList<>();
    }
    public int generateList(){

        return entries.size() + 1;
    }
    public Entry findEntry(int id){
        for (Entry entry :
                entries) {
            if (entry.getId() == id)
                return entry;
        }
        return null;
    }
    public void entry(String title, String body){
        Entry entry = new Entry(generateList(),title,body);
        entries.add(entry);
    }


    public void lock() {
    }

    public boolean isLock() {
          return true;


    }

    public void remove(int id) {
        if (findEntry(id) != null) {
            entries.remove(findEntry(id));
        }
    }

    public String canGetDairyUsername(){
           return userName;

        }

    public boolean unLock(String pin) {
            if (!this.pin.equals(pin)){
                throw new NullPointerException("wrong pin");
            }

            return isLock = true;

    }

    public void upDateEntry(int id,String title, String body) {
        Entry entry = findEntry(id);
        entry.setId(id);
        entry.setTitle(title);
        entry.setBody(body);
    }
    public String getMyDiaryName(){
        return userName;
    }
    public String MyDiaryPassword() {
            return pin;
    }

    public String lockDiary(){
        return "" + (int) (Math.random() * 10000);
    }

}
