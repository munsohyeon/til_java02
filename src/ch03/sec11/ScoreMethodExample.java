package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
    int randomScore = getRandomValue(10, 100); // 10~100
        //(int)(Math.random() * 91) + 10
    int randomScore2 = getRandomValue(1, 5); // 1~5
        //(int)(Math.random() * 5) + 1

        char grade = getGrade(randomScore);
        // 100점 초과시 혹은 0점 미만시 ''리턴
        // 90점 이상 'A'리턴
        // 80점 이상 'B'리턴
        // 70점 이상 'C'리턴
        // 나머지 이상 'D'리턴

        System.out.println("result: " + randomScore);
        System.out.println("grade: " + grade);

    }

    // 리턴 메소드
    public static int getRandomValue(int from, int to) {
        int plus = to - from + 1;
        int random = (int)(Math.random() * plus ) + from;
        return random;
        // return (int)(Math.random() * (to - from + 1)) + from;
    }

    public static char getGrade(int randomScore) {

        // if문
        if (randomScore > 100 || randomScore < 0) {
            return ' ';
        } else if (randomScore >= 90) {
            return 'A';
        } else if (randomScore >= 80) {
            return 'B';
        } else if (randomScore >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }
    /*
            // switch 문
        char result = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'A';
            case 7 -> 'A';
            default -> 'D';
        }
     */
}




