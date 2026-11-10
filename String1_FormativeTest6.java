import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String inputString(Scanner sc) {
        return sc.next();
    }

    // 위치를 입력받는 함수
    public static int inputPosition(Scanner sc) {
        return sc.nextInt();
    }

    // 해당 위치의 문자를 제거하는 함수
    public static String removeChar(String str, int pos) {
        int len = str.length();

        // 위치가 문자열 길이 이상이면 마지막 문자를 제거
        if (pos >= len) {
            pos = len; // 마지막 문자(1-indexed 기준 len번째)
        }

        int index = pos - 1; // 0-indexed로 변환

        return str.substring(0, index) + str.substring(index + 1);
    }

    // 결과를 출력하는 함수
    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = inputString(sc); // 문자열 입력

        while (str.length() > 1) {
            int pos = inputPosition(sc);   // 위치 입력
            str = removeChar(str, pos);    // 해당 위치 문자 제거
            printResult(str);              // 결과 출력
        }

        sc.close();
    }
}
