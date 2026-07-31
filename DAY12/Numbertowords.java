package DAY12;

public class Numbertowords {
    
    private static final String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder result = new StringBuilder();
        int i = 0;                      // index for thousands

        while (num > 0) {
            int chunk = num % 1000;     // process 3 digits at a time
            if (chunk != 0) {
                String part = helper(chunk).trim();
                if (!part.isEmpty()) {
                    result.insert(0, part + (thousands[i].isEmpty() ? "" : " " + thousands[i]) + " ");
                }
            }
            num /= 1000;
            i++;
        }
        return result.toString().trim();
    }

    // Converts number < 1000 to words
    private static String helper(int n) {
        if (n == 0) return "";
        else if (n < 20) return below20[n] + " ";
        else if (n < 100) return tens[n / 10] + " " + helper(n % 10);
        else return below20[n / 100] + " Hundred " + helper(n % 100);
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(numberToWords(123));         // "One Hundred Twenty Three"
        System.out.println(numberToWords(12345));       // "Twelve Thousand Three Hundred Forty Five"
        System.out.println(numberToWords(1000010));     // "One Million Ten"
    }
}
