package tdd;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void add(String userName,String pin){
        Diary diary = new Diary(userName,pin);
        diaries.add(diary);
    }
    public String generateDiaries(){
        return diaries.size() + 1 + " ";
    }
    public Diary findByUsername(String username){
        for (Diary diary: diaries){
            if (diary.canGetDairyUsername().equals(username)) {
                return diary;
            }
        }
        return null;

    }
    public void delete(String userName,String pin){
//            Diary diary = new Diary(userName, pin);
//            diaries.remove(diary);
        if (findByUsername(userName)!= null) {
            diaries.remove(findByUsername(userName));
        }

    }

}
