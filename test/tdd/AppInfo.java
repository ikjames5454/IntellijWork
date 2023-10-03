package tdd;

import java.util.ArrayList;
import java.util.Objects;

public class AppInfo {
    private final ArrayList<PeopleInfoCapture> captures = new ArrayList<>();
    public void createEntry(String username, String password) {
        PeopleInfoCapture capture = new PeopleInfoCapture(username,password);
        captures.add(capture);
    }
    public PeopleInfoCapture findEntry(String userName){
        for (PeopleInfoCapture capture: captures){
            if (Objects.equals(capture.returnUserName(), userName)){
                return capture;
            }
        }
        throw new NullPointerException("wrong username");
    }

    public void deleteEntry(String username,String password) {
        PeopleInfoCapture capture  = findEntry(username);
        if (Objects.equals(capture.getPassword(), password)){
            captures.remove(capture);
        }else{
            throw new NullPointerException("wrong pin");
        }

        }
    }

