public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(365));
        System.out.println(sumFirstAndLastDigit(9090));
        System.out.println(sumFirstAndLastDigit(125));
        System.out.println(sumFirstAndLastDigit(-9474));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;


        int firstDigit = 0;

        while (number > 0){
            firstDigit = number;
            number /= 10;
        }

        int sum = lastDigit + firstDigit;
        return sum;
    }
}
