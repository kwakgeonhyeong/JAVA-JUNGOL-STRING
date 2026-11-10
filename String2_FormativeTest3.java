import java.util.Scanner;
import java.util.ArrayList;

class Main {

    // 단어를 입력받는 함수 ("0"이 나오면 종료)
    public static ArrayList<String> inputWords(Scanner sc) {
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String word = sc.next();
            if (word.equals("0")) {
                break;
            }
            words.add(word);
        }

        return words;
    }

    // 단어 개수를 출력하는 함수
    public static void printCount(int count) {
        System.out.println(count);
    }

    // 홀수 번째 단어를 출력하는 함수
    public static void printOddWords(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            // i가 0부터 시작하므로 (i+1)이 홀수번째일 때 = i가 짝수일 때
            if ((i + 1) % 2 == 1) {
                System.out.println(words.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = inputWords(sc); // 단어 입력

        printCount(words.size());  // 입력받은 단어 개수 출력
        printOddWords(words);      // 홀수 번째 단어 출력

        sc.close();
    }
}
