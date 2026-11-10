import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String inputWord(Scanner sc) {
        return sc.nextLine();
    }

    // 앞에서부터 5자를 추출하는 함수
    public static String getFirstFive(String str) {
        return str.substring(0, 5);
    }

    // 결과를 출력하는 함수
    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = inputWord(sc);           // 단어 입력
        String result = getFirstFive(word);    // 앞 5자 추출

        printResult(result); // 결과 출력

        sc.close();
    }
}
