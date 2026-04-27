public class DealersHand extends Hand{

    public void revealHoleCard(){
        if(cards.size()>=2){
            cards.get(1).setVisible(true);
        }

    }
    @Override
    public void displayHand(){
        System.out.println("--------##Dealer's Hand##--------");
        for (Card c:cards){



                System.out.println(" "+ c);

        }
        System.out.println("Total= "+calculateTotal());
    }
}
