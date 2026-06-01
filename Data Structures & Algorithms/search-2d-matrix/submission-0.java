class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int hi = matrix.length - 1;
        int lo = 0;
        int n = matrix[0].length;
        int row = 0;

        while (hi >= lo){
            int m = lo + (hi - lo)/2;
            if(target >= matrix[m][0] && target <= matrix[m][n-1]){
                row = m;
                break;
            }else if (target > matrix[m][n-1]){
                lo = m + 1;
                //break;
            }else if (target < matrix[m][0]){
                hi = m - 1;
                //break;
            }
        }

        int r_hi = matrix[row].length - 1;
        int r_lo = 0;

        while(r_hi >= r_lo){
            int m = r_lo + (r_hi - r_lo)/2;
            if(target == matrix[row][m]){
                return true;
            }else if (target > matrix[row][m]){
                r_lo = m + 1;
                //break;
            }else if (target < matrix[row][m]){
                r_hi = m - 1;
                //break;
            }
        }
        return false;
    }
}