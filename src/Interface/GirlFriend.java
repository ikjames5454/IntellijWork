package Interface;

public class GirlFriend {

    private BoyFriend boyfriend;
    public GirlFriend(BoyFriend boyfriend){
        this.boyfriend = boyfriend;
    }
    public void spending(){
        boyfriend.spending();
    }
}
