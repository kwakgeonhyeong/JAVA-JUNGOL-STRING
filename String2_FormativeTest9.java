import java.util.Scanner;

class Main {

    // 정수를 입력받는 함수
    public static int inputInt(Scanner sc) {
        return sc.nextInt();
    }

    // 실수를 입력받는 함수
    public static double inputDouble(Scanner sc) {
        return sc.nextDouble();
    }

    // 문자열을 입력받는 함수
    public static String inputString(Scanner sc) {
        return sc.next();
    }

    // 세 값을 하나의 문자열로 합치는 함수 (실수는 소수 셋째자리까지 반올림)
    public static String combine(int n, double d, String str) {
        String doubleStr = String.format("%.3f", d); // 소수 셋째자리까지 반올림
        return n + doubleStr + str;
    }

    // 문자열을 절반으로 나누어 출력하는 함수
    public static void printHalf(String str) {
        int len = str.length();
        int firstLen = (len % 2 == 0) ? len / 2 : (len / 2) + 1; // 홀수면 첫 줄에 하나 더

        String first = str.substring(0, firstLen);
        String second = str.substring(firstLen);

        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputInt(sc);        // 정수 입력
        double d = inputDouble(sc);  // 실수 입력
        String str = inputString(sc); // 문자열 입력

        String combined = combine(n, d, str); // 문자열 합치기

        printHalf(combined); // 절반으로 나누어 출력

        sc.close();
    }
}
