class Solution {

    public char[][] rotateTheBox(char[][] box) {

        int rows = box.length;
        int cols = box[0].length;

        // STEP 1: move stones to the right
        for (int r = 0; r < rows; r++) {

            int empty = cols - 1;

            for (int c = cols - 1; c >= 0; c--) {

                // obstacle
                if (box[r][c] == '*') {
                    empty = c - 1;
                }

                // stone
                else if (box[r][c] == '#') {

                    box[r][c] = '.';
                    box[r][empty] = '#';

                    empty--;
                }
            }
        }

        // STEP 2: rotate matrix
        char[][] res = new char[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                res[c][rows - 1 - r] = box[r][c];
            }
        }

        return res;
    }
}