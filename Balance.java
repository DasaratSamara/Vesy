public class Balance {
    static int right = 0;
    static int left = 0;

    static void addRight(int n) {
        right += n;
    }

    public static void main(String[] args) {
        int n = 2;
        int n2 = 1;
        for (int i = 0; i < 10; i++) {
            Balance.addRight(n);
            Balance.addLeft(n2);
            Balance.getSituation();
            System.out.println("Rezultat sravneniya " + Balance.getSituation());
            n += 1;
            n2 += 2;
        }
    }


    static void addLeft(int n2) {
        left += n2;
    }

    public static char getSituation() {
        char rezult = 0;
        if (right == left) {
            rezult = '=';
        } else if (right > left) {
            rezult = 'R';
        } else if (right < left) {
            rezult = 'L';
        }
        return rezult;
    }
}
