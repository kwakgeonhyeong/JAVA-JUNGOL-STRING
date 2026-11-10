import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String inputString(Scanner sc) {
        return sc.nextLine();
    }

    // 영문자와 숫자만 남기고 영문자는 소문자로 변환하는 함수
    public static String filterAndLower(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                // 숫자는 그대로 추가
                sb.append(c);
            } else if (c >= 'a' && c <= 'z') {
                // 이미 소문자면 그대로 추가
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자면 소문자로 변환하여 추가
                sb.append((char) (c - 'A' + 'a'));
            }
            // 그 외 문자(특수문자 등)는 무시
        }

        return sb.toString();
    }

    // 결과를 출력하는 함수
    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = inputString(sc);              // 문자열 입력
        String result = filterAndLower(str);        // 필터링 및 소문자 변환

        printResult(result); // 결과 출력

        sc.close();
    }
}
