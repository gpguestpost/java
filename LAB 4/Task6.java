class Matrix {
    int rows;
    int cols;
    int[][] matx;

    public Matrix(int rows, int cols, int[][] values) {
        this.rows = rows;
        this.cols = cols;
        this.matx = new int[rows][cols];

        // Copying initial values into matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matx[i][j] = values[i][j];
            }
        }
    }

    public void get_matrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matx[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void set_element(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matx[row][col] = value;
            System.out.println("Updated element at (" + row + ", " + col + ") to " + value);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void main(String[] args) {

        int[][] initialValues1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] initialValues2 = {
            {3, 6, 9},
            {12, 15, 18},
            {21, 24, 27}
        };


        Matrix matrix1 = new Matrix(4, 3, initialValues1);
        Matrix matrix2 = new Matrix(3, 3, initialValues2);


        System.out.println("Original Matrix 1:");
        matrix1.get_matrix();
        
        System.out.println("\nOriginal Matrix 2:");
        matrix2.get_matrix();

        matrix1.set_element(1, 2, 99);

        matrix2.set_element(2, 1, 88);

        System.out.println("\nUpdated Matrix 1:");
        matrix1.get_matrix();
        
        System.out.println("\nUpdated Matrix 2:");
        matrix2.get_matrix();
    }
}

