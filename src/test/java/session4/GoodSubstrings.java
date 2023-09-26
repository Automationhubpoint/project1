package session4;

//public class GoodSubstrings {
//    public static int countStrings(String s) {
//        int n = s.length();
//        int result = 0;
//        int maxDigit = 0;
//
//        for (int i = 0; i < n; i++) {
//            maxDigit = Math.max(maxDigit, Character.getNumericValue(s.charAt(i)));
//
//            int[] freq = new int[10];
//            int windowMax = 0;
//
//            for (int j = i; j < n; j++) {
//                int digit = Character.getNumericValue(s.charAt(j));
//                freq[digit]++;
//                windowMax = Math.max(windowMax, digit);
//
//                if (windowMax < maxDigit) {
//                    result++;
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String s1 = "122321";
//        String s2 = "1231";
//        System.out.println(countStrings(s1)); // Output: 13
//        System.out.println(countStrings(s2)); // Output: 8
//    }
//}
//
public class GoodSubstrings {
    public static int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int maxDigit = 0;
            int[] freq = new int[n];

            for (int j = i; j < n; j++) {
                int digit = Character.getNumericValue(s.charAt(j));
                freq[digit]++;
                maxDigit = Math.max(maxDigit, digit);

                if (maxDigit < n && freq[maxDigit] <= maxDigit) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "1231";
        String s2 = "1231";
        System.out.println(countGoodSubstrings(s1)); // Output: 13
        System.out.println(countGoodSubstrings(s2)); // Output: 8
    }
}
