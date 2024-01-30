package Strings;

import java.io.Serializable;

public class Account implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String name;
    private String age;

    public Account(String name, String age) {
        this.name = name;
        this.age = age;
    }




}
