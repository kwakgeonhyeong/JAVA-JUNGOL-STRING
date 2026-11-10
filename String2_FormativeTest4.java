import java.util.Scanner;
import java.util.Arrays;

class Main {

    // n을 입력받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // n개의 문자열을 입력받는 함수
    public static String[] inputWords(Scanner sc, int n) {
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        return words;
    }

    // 사전순으로 정렬하는 함수 (버블 정렬)
    public static void sortWords(String[] words) {
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }

    // 결과를 출력하는 함수
    public static void printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);                  // n 입력
        String[] words = inputWords(sc, n);  // n개의 문자열 입력

        sortWords(words);   // 사전순으로 정렬

        printWords(words);  // 결과 출력

        sc.close();
    }
}
