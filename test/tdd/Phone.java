package tdd;

public class Phone {
    private boolean isOn;
    private String mainMenu;
    private String messages;


    public boolean getIsOn(){
        return isOn;
    }

    public void power() {
        isOn =! isOn;
    }


    public void setMainMenu(String phoneBook,String messages,String chat) {
        this.mainMenu = phoneBook;
        this.mainMenu = messages;
        this.mainMenu = chat;



    }
    public String getMainMenu(){
        return mainMenu;


    }
}
