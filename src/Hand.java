import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> cards= new ArrayList<>();
    public void addCard(Card c) {
        cards.add(c);
    }
    public int calculateTotal(){
        int total = 0;
        int aceCount =0;
        for(Card c:cards){
            total +=c.getValue();
            if (c.toString().equals("Ace")){
                aceCount++;
            }

        }
        while (total>21 && aceCount>0){
            total-=10;
            aceCount--;
        }
        return total;
    }
    public void displayHand(){
        for (Card c : cards) {
            System.out.println("  " + c);
        }
        System.out.println("Current Total "+ calculateTotal());

    }
}
