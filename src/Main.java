import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        Hand player = new Hand();
        DealersHand dealer = new DealersHand();

        player.addCard(deck.draw());
        player.addCard(deck.draw());

        Card d1 = deck.draw();
        dealer.addCard(d1);

        Card d2 = deck.draw();
        d2.setVisible(false);
        dealer.addCard(d2);

        while (player.calculateTotal() < 21) {
            player.displayHand();
            dealer.displayHand();

            System.out.print("\n(H)it or (S)tand? ");
            String choice = sc.next().toLowerCase();
            if (choice.equals("h")) {
                player.addCard(deck.draw());
            }
            else {
                break;
            }
        }
            if (player.calculateTotal()>21){
                player.displayHand();
                System.out.println("You busted! Loser");
                return;

            }
            System.out.println("\n--- Player Stands. Dealer's Turn ---");
            dealer.revealHoleCard();
            dealer.displayHand();

            while (dealer.calculateTotal()<17){
                System.out.println(" dealer hits ");
                dealer.addCard(deck.draw());
                dealer.displayHand();
            }

            int ptotal = player.calculateTotal();
            int dtotal = dealer.calculateTotal();
            if (dtotal>21){
                System.out.println("Dealer busted! You win");
            }
            else if(ptotal>dtotal){
                System.out.println("You win");
            }
            else if (dtotal>ptotal){
                System.out.println("Dealer Wins");
            }
            else{
                System.out.println("its a push");
            }
        }



    }


