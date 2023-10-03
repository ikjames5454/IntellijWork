package tdd;

import Exercises.Entry;

import java.util.ArrayList;

public class Diary {

    private final String userName;
    private final String pin;
    private boolean isLock;
    private final ArrayList<Entry>entries;

    public Diary(String UserName, String pin) {
        this.userName = UserName;
        this.pin = pin;
        entries = new ArrayList<>();
    }
    public int generateList(){
       return  (int) (Math.random() * 10000);
//       return entries.size() + 1;
    }
    public Entry findEntry(int id){
        for (Entry entry :
                entries) {
            if (entry.getId() == id)
                return entry;
        }
        throw  new NullPointerException("NO ENTRIES MATCHING ID " + id + "found");
    }
    public int createEntry(String title, String body){
        int idNumber = generateList();
        Entry entry = new Entry(idNumber,title,body);
        entries.add(entry);
        return idNumber;
    }


    public void lock() {
        isLock = true;
    }

    public boolean isLock() {
          return isLock;


    }

    public void remove(int id) {
        if (findEntry(id) != null) {
            entries.remove(findEntry(id));
        }
        else{
            throw new NullPointerException("no entry found");
        }
    }

    public String canGetDairyUsername(){
           return userName;

        }

    public void unLock(String pin) {
            if (!this.pin.equals(pin)){
                throw new NullPointerException("wrong pin");
            }

            isLock = false;

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


    public String myDiaryPassword() {
            return pin;
    }



}
