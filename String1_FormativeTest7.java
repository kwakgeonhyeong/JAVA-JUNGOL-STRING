import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    // 입력을 받는 함수 (공백 포함 한 줄 입력)
    public static String inputSentence(Scanner sc) {
        return sc.nextLine();
    }

    // 단어를 분리하여 출력하는 함수
    public static void splitAndPrint(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence, " ");
        int count = 1;

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(count + ". " + word);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = inputSentence(sc); // 문장 입력
        splitAndPrint(sentence);             // 단어 분리 후 출력

        sc.close();
    }
}
