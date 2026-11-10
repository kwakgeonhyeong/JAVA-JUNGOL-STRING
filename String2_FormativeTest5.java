import java.util.Scanner;

class Main {

    // 5개의 단어를 입력받는 함수
    public static String[] inputWords(Scanner sc, int n) {
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        return words;
    }

    // 문자와 문자열을 입력받는 함수
    public static String[] inputTargets(Scanner sc) {
        String ch = sc.next();       // 문자 (1글자)
        String str = sc.next();      // 문자열
        return new String[]{ch, str};
    }

    // 단어에 문자 또는 문자열이 포함되어 있는지 확인하는 함수
    public static boolean isMatch(String word, String ch, String str) {
        return word.contains(ch) || word.contains(str);
    }

    // 조건에 맞는 단어를 찾아 출력하는 함수 (개수 반환)
    public static int findAndPrint(String[] words, String ch, String str) {
        int count = 0;
        for (String word : words) {
            if (isMatch(word, ch, str)) {
                System.out.println(word);
                count++;
            }
        }
        return count;
    }

    // 결과가 없을 때 "none"을 출력하는 함수
    public static void printNoneIfEmpty(int count) {
        if (count == 0) {
            System.out.println("none");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = inputWords(sc, 5);      // 5개의 단어 입력
        String[] targets = inputTargets(sc);     // 문자, 문자열 입력

        int count = findAndPrint(words, targets[0], targets[1]); // 조건에 맞는 단어 출력
        printNoneIfEmpty(count); // 결과가 없으면 "none" 출력

        sc.close();
    }
}
