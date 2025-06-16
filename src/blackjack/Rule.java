package blackjack;

import java.util.List;

// 경우의 수 6가지
// 1. 둘 다 총 점수가 21점 초과 >> 비김
// 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
// 3. 달러의 총 점수가 21점 초과 게이머의 총 점수가 21점에 가까움 >> 게이머 승
// 4. 둘 두 총 점수가 21점 이하이지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
// 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
// 6. 둘다 총 점수가 21점 이하이지만 딜러의 총 점수가 21저에 가까움 >> 딜러승
public class Rule {
    private final static int MAX_SCORE = 21;

    public static String getWinner(Gamer dealer, Gamer gamer) {
        int dealerScore = dealer.getTotalScore(dealer.openCards());
        int gamerScore = gamer.getTotalScore(gamer.openCards());

        if ((dealerScore > MAX_SCORE && gamerScore > MAX_SCORE) || dealerScore == gamerScore) {
            return "dead hit";
        } else if (gamerScore <= MAX_SCORE && dealerScore <= MAX_SCORE && gamerScore > dealerScore) {
            return "Gamer WIN";
        } else if (dealerScore <= MAX_SCORE && gamerScore > MAX_SCORE || dealerScore > gamerScore) {
            return "Dealer WIN";
        } else {
            return "Gamer WIN";
        }
    }

    public static int getScore(List<Card> cards) {
        int score = 0;
        for (Card card : cards) {
            int eachScore = convertDenominationToScore(card.getDenomination());
            // 이름을 주기 위해서 메소드를 주기도 한다
            score += eachScore;
        }
        return score;
    }
    private static int convertDenominationToScore(String denomination) {
        return switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}
