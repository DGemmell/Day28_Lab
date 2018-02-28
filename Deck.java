import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class
public class Deck{

    private ArrayList<Deck> cards;

//    constructor with deck array list set to 52
    public Deck(Suit suit, Value value){
        this.cards = new ArrayList<Deck>(52);
        addCardsToDeck();
    }


    public int addSuit(){
        return this.addSuit();
    }

    public int addValue(){
        return this.addValue();
    }

//    I thought i could refer to the class Card as it is public but its doesnt seem to like.  i have tried
//    adding Deck but then i can't apply suit and value.
    public Void addCardsToDeck(){
        for (Suit suit: Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Deck(suit,value));
            }

        }
    }

    public int checkDeckSize(){
        return this.cards.size();}

//        because this is an arraylist i wasnt sure how to specify the get method.
//    This is my shuffle method bt couldnt get it working so commented out.

//    public int shuffleDeck(){
//        Collections.shuffle(this.cards);
//        return this.cards.get();}



}
