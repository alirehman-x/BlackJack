public class Card {
    private String suit;
    private String rank;
    private int value;
    private boolean isVisible;

    public Card(String suit, String rank,int value){
        this.suit= suit;
        this.rank= rank;
        this.value= value;
        this.isVisible= true;

    }

    public void setVisible(boolean visible) {
        this.isVisible=visible;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public int getValue(){
        return value;
    }

   @Override
    public String toString(){
        return isVisible? (rank+ " of " + suit ) : ("###HIDDEN###");
   }
}

