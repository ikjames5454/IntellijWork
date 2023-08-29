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
    public ArrayList<Entry> list(){
        return entries;
    }
    public Entry array(int id){
        for (Entry entry :
                entries) {
            if (entry.getId() == id)
                return entry;
        }
        return null;
    }
    public void entry(int id,String title, String body){
        Entry entry = new Entry(id,title,body);
        entries.add(entry);
    }

    public void lock() {

        this.isLock =! isLock;
    }

    public boolean isLock(String pin) {
      if (this.pin.equals(pin)){
          return isLock;
      }
         throw new NullPointerException("wrong pin");

    }

    public void remove(int id) {
       if (array(id) != null){
           entries.remove(array(id));
       };
        }
}
