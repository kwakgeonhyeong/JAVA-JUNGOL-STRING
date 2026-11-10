import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String[] inputStrings(Scanner sc) {
        String s1 = sc.next();
        String s2 = sc.next();
        return new String[]{s1, s2};
    }

    // 문자열 앞부분에서 정수로 변환 가능한 부분만 추출하여 정수로 변환하는 함수
    public static long extractNumber(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 맨 앞에 부호(+, -)가 있는 경우 허용
            if (i == 0 && (c == '-' || c == '+')) {
                sb.append(c);
                continue;
            }

            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                break; // 숫자가 아닌 문자가 나오면 중단
            }
        }

        if (sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) == '-' || sb.charAt(0) == '+'))) {
            return 0; // 변환 가능한 숫자가 없는 경우
        }

        return Long.parseLong(sb.toString());
    }

    // 두 수를 곱하는 함수
    public static long multiply(long a, long b) {
        return a * b;
    }

    // 결과를 출력하는 함수
    public static void printResult(long result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = inputStrings(sc);        // 두 문자열 입력

        long num1 = extractNumber(strs[0]);       // 첫 번째 문자열에서 숫자 추출
        long num2 = extractNumber(strs[1]);       // 두 번째 문자열에서 숫자 추출

        long result = multiply(num1, num2);       // 두 수의 곱 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
