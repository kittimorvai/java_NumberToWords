public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(12345);
    }

    static String solution = "";

    private static int getDigitCount(int number) {
        int count = 0;
        int lastDigit;
        int newNumber = number;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (newNumber > 0) {
            lastDigit = newNumber % 10;
            count += 1;
            newNumber = newNumber / 10;
        }
        return count;
    }
    private static int reverse(int number) {
        int reverseNumber = 0;
        int lastDigit;
        int newNumber = number;

        if (newNumber != 0){
            while (newNumber != 0) {
                lastDigit = newNumber % 10;
                reverseNumber = (reverseNumber * 10) + lastDigit;
                newNumber = newNumber / 10;
            }
            return reverseNumber;
        }
        return 0;
    }
    private static String switchMethod (int lastDigit){
        switch (lastDigit){
            case 0:
                solution += "Zero ";
                break;
            case 1:
                solution += "One ";
                break;
            case 2:
                solution += "Two ";
                break;
            case 3:
                solution += "Three ";
                break;
            case 4:
                solution += "Four ";
                break;
            case 5:
                solution += "Five ";
                break;
            case 6:
                solution += "Six ";
                break;
            case 7:
                solution += "Seven ";
                break;
            case 8:
                solution += "Eight ";
                break;
            case 9:
                solution += "Nine ";
                break;
        }
        return solution;
    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else if (number == 0){
            System.out.println("Zero");
        }

        int lastDigit = 0;
        int reverseNumber = reverse(number);
        int extract = (getDigitCount(number) - getDigitCount(reverse(number)));

        if(number % 10 == 0) {
            while (reverseNumber != 0){
                lastDigit = reverseNumber % 10;
                switchMethod(lastDigit);
                reverseNumber = reverseNumber / 10;
            }
            for (int i = extract; i != 0; i--){
                solution += "Zero ";
            }
            System.out.println(solution);
        }

           else {
            while (reverseNumber != 0){
                lastDigit = (int) reverseNumber % 10;
                switchMethod(lastDigit);
                reverseNumber = reverseNumber / 10;
            }

            System.out.println(solution);
        }
    }
}
