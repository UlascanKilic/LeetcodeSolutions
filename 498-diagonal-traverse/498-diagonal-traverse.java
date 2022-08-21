class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length, n = mat[0].length;

        int[] result = new int[m * n];
        int row = 0, col = 0, direction = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            row -= direction;
            col += direction;

            if(row >= m) {row = m - 1; col += 2; direction = -direction;}
            if(col >= n) {col = n - 1; row += 2; direction = -direction;}

            if (row < 0)  { row = 0; direction = -direction;}
            if (col < 0)  { col = 0; direction = -direction;}


        }

        return result;
    }
}