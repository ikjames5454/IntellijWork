package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diaries {
    private boolean isLock;
    private final List<Diary> diaries = new ArrayList<>();


    public void add(String userName,String pin){
        Diary diary = new Diary(userName,pin);
        diaries.add(diary);
    }
    public Diary findByUsername(String username){
        for (Diary diary: diaries){
            if (diary.canGetDairyUsername().equals(username)) {
                return diary;
            }
        }
        throw new  NullPointerException("wrong username");

    }
    public void delete(String userName,String pin){
            Diary diary = findByUsername(userName);
            if (Objects.equals(diary.myDiaryPassword(), pin)){
                diaries.remove(diary);
            }else{
                throw new NullPointerException("wrong pin");
            }
    }
}
