import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String[] inputWords(Scanner sc) {
        String word1 = sc.next();
        String word2 = sc.next();
        return new String[]{word1, word2};
    }

    // 더 긴 단어의 길이를 구하는 함수
    public static int getMaxLength(String word1, String word2) {
        return Math.max(word1.length(), word2.length());
    }

    // 결과를 출력하는 함수
    public static void printResult(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = inputWords(sc);                     // 두 단어 입력
        int result = getMaxLength(words[0], words[1]);        // 더 긴 단어의 길이 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
