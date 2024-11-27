public class Main {
    static final int maxLimit = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < maxLimit; i++){
            if (i % 3 == 0 && i % 5 != 1){
                int sumNum = getDigitsSum(i);
                if (sumNum < 10){
                    System.out.println(i);
                }
            }
        }
    }

    private static int getDigitsSum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}