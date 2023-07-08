import java.util.*;

class Main {
    public static int solve(int n, int amnt, String s, int[] price) {
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        int temp = 0, ans = 0, maxFreq = 0, st = 0;
        for (int i = 0; i < n; i++) {
            int indx = ch[i] - 'a';
            freq[indx] += price[indx];
            temp += price[indx];
            maxFreq = Math.max(maxFreq, freq[indx]);
            if (temp - maxFreq > amnt) {
            while (temp > amnt) {
                boolean b = false;
                int tempIndx = ch[st] - 'a';
                if (maxFreq == freq[tempIndx]) {
                    b = true;
                }
                temp -= price[tempIndx];
                freq[tempIndx] -= price[tempIndx];
                st++;
                if (b) {
                    maxFreq = 0;
                    for (int j = 0; j < 26; j++) {
                        maxFreq = Math.max(freq[j], maxFreq);
                    }
                }
                if (temp - maxFreq < amnt) {
                    break;
                }
            }
        }
            ans = Math.max(ans, i - st + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amnt = sc.nextInt();
        String s = sc.next();
        int[] price = new int[26];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println(solve(n, amnt, s, price));
    }
}