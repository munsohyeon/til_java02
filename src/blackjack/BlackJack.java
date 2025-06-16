package blackjack;

import java.util.List;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        // cd.printAllCards();
        Card c = cd.getCard();

        System.out.println();
        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("----------------");
        cd.printAllCards();
        System.out.println("-----gamer card------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(c);
        gamer.receiveCard(c);
        gamer.showCards();

        List<Card> cards = gamer.openCards();
        int score = Rule.getScore(cards);
        //A:1, 2~10:점수 그대로, J,Q,K: 10점
        System.out.printf("score: %d\n", score);

        System.out.println("-----dealer card------");
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.showCards();
        System.out.printf("needMoreCard: %b\n", dealer.needMoreCard());
        if (dealer.needMoreCard()) {
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();
        System.out.println("-----Result------");
        System.out.println();



    }
}



//
//
//
//    // 예외 케이스
//    return "결과 없음";
//}
//
//public static void main(String[] args) {
//    int gamerScore = 19;
//    int dealerScore = 22;
//
