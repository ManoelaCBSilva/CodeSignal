int[][] rotateImage(int[][] a) {
    
    int size = a.length;    
    
    for (int row = 0; row < (size + 1)/2; row++) {
        for (int col = 0; col < size/2; col++) {
            int temp =  a[size - 1 - col][row];
            a[size - 1 - col][row] = a[size - 1 - row][size - 1 - col];
            a[size - 1 - row][size - 1 - col] = a[col][size - 1 - row];
            a[col][size - 1 - row] = a[row][col];
            a[row][col] = temp;
        }   
    }
    
    return a;
}