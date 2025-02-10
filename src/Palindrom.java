public class Palindrom {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String nizZnakova) {
        nizZnakova = nizZnakova.toLowerCase();
        for (int i = 0; i < nizZnakova.length()/2 ; i++) {
            if (nizZnakova.charAt(i) != nizZnakova.charAt(nizZnakova.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
