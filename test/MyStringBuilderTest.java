import org.junit.Test;
import tdd.MyStringBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStringBuilderTest {

    @Test
    public void testThatCanAppend(){
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        String sentence = "How are u during my dear";
        String expected = String.valueOf(myStringBuilder.appends(sentence));
        assertEquals(sentence,expected);
    }
    @Test
    public void testThatCanDelete(){
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.appends("How are u during my dear");
        System.out.println(myStringBuilder);
        myStringBuilder.delete(9,16);
        System.out.println(myStringBuilder);
        myStringBuilder.insert(9," coping");
        System.out.println(myStringBuilder);
        myStringBuilder.replace(10,16,"during");
        System.out.println(myStringBuilder);
        myStringBuilder.reverse();
        System.out.println(myStringBuilder);
        System.out.println();
        myStringBuilder.undo();
        System.out.println(myStringBuilder);
        System.out.println(myStringBuilder);
        myStringBuilder.undo();
        System.out.println(myStringBuilder);
        myStringBuilder.undo();
        System.out.println(myStringBuilder);
        myStringBuilder.undo();
        System.out.println(myStringBuilder);
    }
}
