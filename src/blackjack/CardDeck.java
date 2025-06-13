package blackjack;

import java.util.Random;

public class CardDeck {
    String[] patterns = {"Spade ♠", "Heart ♥", "Diamond ♦", "Clover ♣"};
    private Card[] cards = new Card[52];
    private int selectedIdx = 0;

    public CardDeck() {
        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            for (int k = 1; k <= 13; k++) {
                String denomination;
                switch (k) {
                    case 1:
                        denomination = "A";
                        break;
                    case 10:
                        denomination = "J";
                        break;
                    case 11:
                        denomination = "Q";
                        break;
                    case 12:
                        denomination = "K";
                        break;
                    default:
                        denomination = String.valueOf(k);
                        break;
                }
                cards[index++] = new Card(patterns[i], denomination);
            }
        }
        shuffle();
    }

    private void shuffle() {
        // 카드 객체 순서 섞기
        for (int i = 0; i < cards.length; i++) {
            // 0부터 i까지의 무작위로 섞어야 하는 인덱스
            int c = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[c];
            cards[c] = temp;
        }


//            Random random = new Random();
//            for (int i = cards.length - 1; i > 0; i--) {
//                int C = random.nextInt(i + 1); // 0부터 i까지의 무작위 인덱스
//                Card temp = cards[i];
//                cards[i] = cards[C];
//                cards[C] = temp;
//            }

    }

    public Card getCard() {
        if (selectedIdx == cards.length) {
            return null;
        }
        Card c = cards[selectedIdx];
        cards[selectedIdx++] = null;
        return c;
    }

    public void printAllCards() {
        for (Card card : cards) {
            // System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }

    @Override // Annotation
    public String toString() {
        return "나는 카드덱이야";
    }

}
