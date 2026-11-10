import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String[] inputData(Scanner sc) {
        String A = sc.next();
        String B = sc.next();
        String n = sc.next();
        return new String[]{A, B, n};
    }

    // A와 B를 연결하는 함수
    public static String concatenate(String A, String B) {
        return A + B;
    }

    // 새로운 A에서 n개의 문자를 B에 복사하는 함수 (strncpy와 유사한 동작)
    public static String copyToB(String newA, String B, int n) {
        String copiedPart = newA.substring(0, n); // 새 A의 앞 n개 문자

        if (n >= B.length()) {
            // n이 B의 길이 이상이면 그대로 교체
            return copiedPart;
        } else {
            // n개는 교체하고 나머지 B는 그대로 유지
            return copiedPart + B.substring(n);
        }
    }

    // 결과를 출력하는 함수
    public static void printResult(String A, String B) {
        System.out.println(A);
        System.out.println(B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = inputData(sc);
        String A = data[0];
        String B = data[1];
        int n = Integer.parseInt(data[2]);

        String newA = concatenate(A, B);      // 1. A에 B를 연결
        String newB = copyToB(newA, B, n);    // 2. 새 A에서 n개 문자를 B에 복사

        printResult(newA, newB); // 3. A와 B 출력

        sc.close();
    }
}
