import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    // 입력을 받는 함수 (공백 포함 한 줄 입력)
    public static String inputSentence(Scanner sc) {
        return sc.nextLine();
    }

    // 문자열을 단어별로 분리하여 배열에 저장하는 함수
    public static String[] splitWords(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence, " ");
        String[] words = new String[st.countTokens()];

        int idx = 0;
        while (st.hasMoreTokens()) {
            words[idx] = st.nextToken();
            idx++;
        }

        return words;
    }

    // 배열을 역순으로 출력하는 함수
    public static void printReverse(String[] words) {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = inputSentence(sc);   // 문장 입력
        String[] words = splitWords(sentence); // 단어별로 분리하여 배열에 저장

        printReverse(words); // 역순으로 출력

        sc.close();
    }
}
