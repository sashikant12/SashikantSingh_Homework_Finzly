import java.util.Scanner;

class Main {

    public static String ASCIIConversion(String str) {

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                result.append((int) c);
            } else {
                result.append(' ');
            }
        }

        return result.toString();
    }

    public static void main (String[] args) {
//         keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ASCIIConversion(s.nextLine()));

    }
}

