import java.util.Scanner;

class Main {

    static String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};

    // 입력을 받는 함수
    public static char inputChar(Scanner sc) {
        return sc.next().charAt(0);
    }

    // 두 번째나 세 번째 위치에 해당 문자가 포함되어 있는지 확인하는 함수
    public static boolean containsInSecondOrThird(String word, char target) {
        // 인덱스 1(두 번째), 인덱스 2(세 번째)
        if (word.length() >= 2 && word.charAt(1) == target) {
            return true;
        }
        if (word.length() >= 3 && word.charAt(2) == target) {
            return true;
        }
        return false;
    }

    // 조건에 맞는 단어를 찾아 출력하고 개수를 반환하는 함수
    public static int findAndPrint(char target) {
        int count = 0;
        for (String word : words) {
            if (containsInSecondOrThird(word, target)) {
                System.out.println(word);
                count++;
            }
        }
        return count;
    }

    // 결과(개수)를 출력하는 함수
    public static void printCount(int count) {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char target = inputChar(sc);     // 문자 입력
        int count = findAndPrint(target); // 조건에 맞는 단어 출력 및 개수 계산

        printCount(count); // 개수 출력

        sc.close();
    }
}
