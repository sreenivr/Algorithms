class RotateMatrix {


    /**
     * Rotate the given sqaure matrix of size N x N by 90 degree (clockwise) in place.
     * We will rotate layer by layer,
     * left   -> top
     * bottom -> left
     * right  -> bottom
     * top    -> right
     * 
     * In this implementaion we are rotating one element at a time and hence the
     * space complexity is O(1)
     * 
     * Time complexity is O(N^2). We can't do better than O(N^2) since we have to
     * modify/visit every element in the array
     * 
     * @param m
     */
    static void Rotate(int[][] m) {

        System.out.println(m.length);
        System.out.println(m[0].length);
        System.out.println(m[1].length);
        
        if(m.length == 0 || m.length != m[0].length) {
            System.out.println("Invalid input. Only square matices are allowed.");
            return;
        }

        int n = m.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            // i is used as an index to iterate from first to last
            // j is used to keep track of the offset within the layer
            for (int i = first, j = 0; i < last; i ++, j++) {
                // save top
                int top = m[first][last - j];
                System.out.println("top = " + top);

                // left --> top
                m[first][last - j] = m[i][first];

                // bottom --> left
                m[i][first] = m[last][i];

                // right --> bottom
                m[last][i] = m[last - j][last];

                // top --> right
                m[last - j][last] = top;
            }
        }
    }

    static void Transpose(int[][] m) {
        int[][] copy = new int[m.length][m.length];
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++) {
                copy[j][i] = m[i][j];
            }
        }

        Print(copy);
    }

    static void Print(int[][] m) {
        for(int i = 0 ; i < m.length; i++) {
            for (int j = 0; j < m.length; j ++) {
                System.out.print(String.format("%4d", m[i][j]));
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Print(matrix);
        //Transpose(matrix);
        Rotate(matrix);
        Print(matrix);
    }
}

