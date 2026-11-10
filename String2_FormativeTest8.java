import java.util.Scanner;

class Main {

    // 단어를 입력받는 함수
    public static String inputWord(Scanner sc) {
        return sc.next();
    }

    // 문자열을 뒤집는 함수
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    // 결과를 출력하는 함수
    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = inputWord(sc); // 단어 입력

            if (word.equals("END")) {
                break; // "END" 입력 시 종료
            }

            String reversed = reverseWord(word); // 단어 뒤집기
            printResult(reversed);                // 결과 출력
        }

        sc.close();
    }
}
