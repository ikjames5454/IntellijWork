package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NamesInputTest {
    @Test
    public void testICanCollectInitials() {
        NamesInput names = new NamesInput();
        String actual = names.collectName("alagbu ikenna james");
        String expected = "A. I. james";
        assertEquals(actual, expected);
    }
    @Test
    public void testCanAddDigit(){
        NamesInput names = new NamesInput();
        int actual = Integer.parseInt(String.valueOf(names.canAdd("1234refds3456")));
        int expected = 28;
        assertEquals(actual,expected);
    }
    @Test
    public void testItIsAnagram(){
        NamesInput names = new NamesInput();
        String word = "james";
        String scrabbledWord = "majes";
        boolean collected = names.anagram(word,scrabbledWord);
        assertTrue(collected);
    }
    @Test
    public void testThatHashAndLetterCanRemove(){
        NamesInput names = new NamesInput();
        String word = "a#b#d#pqrs#";
        String word1 = "ac#d##pqr";
        boolean collected = names.remove(word,word1);
        assertTrue(collected);
    }
    @Test
    public void removeSpecialCharacter(){
        NamesInput names = new NamesInput();
        String input = names.replace("The&name&of&my&guy&is&Seyi%And&he&is&mad");
        String output = "The name of my guy is Seyi.    And he is mad";
        assertEquals(input,output);
    }
    @Test
    public void reverseString(){
        NamesInput names = new NamesInput();
        String sequence = names.reverse("A better place").trim();
        String output = "A retteb ecalp";
        assertEquals(sequence,output);

    }
}
