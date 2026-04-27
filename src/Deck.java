import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards;
    Random random = new Random();


    public Deck(){
        this.cards= new ArrayList<>();
        String[] suits= {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for(String suit :suits){
            for(String rank:ranks){
                int value = getValue(rank);
                this.cards.add(new Card(suit,rank,value));  //adding Card type objects to cards arraylist

            }

        }
        shuffle();

    }

    public int getValue(String rank){
        if(rank.equals("Ace")){return 11;}
        if (rank.equals("Jack") ||rank.equals("Queen") ||rank.equals("King")){return 10;}
        return Integer.parseInt(rank); // calculating normal numbers

    }
    private void shuffle() {
        int i = cards.size()-1;
        while(i>0){
            int r = random.nextInt(i+1);// generates 0 to size of cards
            Card temp = cards.get(i);
            cards.set(i, cards.get(r));// i for index and cards.get(r) to get the value you want to put on that index
            cards.set(r,temp);
            i--;
        }

    }
    public Card draw(){
        if (cards.isEmpty()){
            System.out.println("deck is empty");
            return null;
        }
        return cards.remove(0);
    }


}
