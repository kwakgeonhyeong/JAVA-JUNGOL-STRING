import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static String[] inputData(Scanner sc) {
        String word = sc.next();
        String ch = sc.next();
        return new String[]{word, ch};
    }

    // 문자를 찾아 위치를 반환하는 함수
    public static int findPosition(String word, char target) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                return i; // 처음 나오는 위치 반환
            }
        }
        return -1; // 찾지 못한 경우
    }

    // 결과를 출력하는 함수
    public static void printResult(int pos) {
        if (pos == -1) {
            System.out.println("No");
        } else {
            System.out.println(pos);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = inputData(sc);           // 단어와 문자 입력
        char target = data[1].charAt(0);

        int pos = findPosition(data[0], target); // 위치 탐색

        printResult(pos); // 결과 출력

        sc.close();
    }
}
