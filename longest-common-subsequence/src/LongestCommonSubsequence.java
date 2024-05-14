public class LongestCommonSubsequence {
    private final String text1;
    private final String text2;

    public LongestCommonSubsequence(String text1, String text2) {
        this.text1 = " " + text1;
        this.text2 = " " + text2;
    }

    private int[][] constructTable() {
        int m = text1.length() - 1;
        int n = text2.length() - 1;
        int[][] table = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (text1.charAt(i) != text2.charAt(j)) {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                } else {
                    table[i][j] = 1 + table[i - 1][j - 1];
                }
            }
        }
        return table;
    }

    public String extractLCS() {
        int[][] table = constructTable();
        int i = text1.length() - 1;
        int j = text2.length() - 1;
        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0 && !(i == 1 && j == 1)) {
            if (text1.charAt(i) == text2.charAt(j)) {
                lcs.append(text1.charAt(i));
                i--;
                j--;
            } else {
                if (table[i - 1][j] > table[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return lcs.reverse().toString();
    }
}
