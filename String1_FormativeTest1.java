import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static char[] inputChars(Scanner sc) {
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        return new char[]{c1, c2};
    }

    // 아스키코드의 합을 구하는 함수
    public static int getSum(char c1, char c2) {
        return (int) c1 + (int) c2;
    }

    // 아스키코드의 차를 구하는 함수
    public static int getDiff(char c1, char c2) {
        return Math.abs((int) c1 - (int) c2);
    }

    // 출력하는 함수
    public static void printResult(int sum, int diff) {
        System.out.println(sum + " " + diff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = inputChars(sc);           // 영문자 두 개 입력
        int sum = getSum(chars[0], chars[1]);    // 아스키코드 합
        int diff = getDiff(chars[0], chars[1]);  // 아스키코드 차

        printResult(sum, diff); // 결과 출력

        sc.close();
    }
}
