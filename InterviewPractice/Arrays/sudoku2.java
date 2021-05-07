boolean sudoku2(char[][] grid) {
    
    int SIZE = 9;
    for (int i = 0; i < SIZE; i++) {
        
        if (!isValidRow(grid, i) || !isValidColumn(grid, i)) {
            return false;
        }
        
        if (i % 3 == 0) {
             for (int j = 0; j <= 6 ; j += 3) {
                 if (!isValidSubGrid(grid, i, j)){
                     return false;
                 }
            }
        }
    }
    
    return true;
}

boolean isValidSubGrid(char[][] grid, int initialRow, int initialCol) {
    
    HashSet<Character> values = new HashSet<>();
    
    if (initialRow > 6 || initialCol % 3 != 0) {
        return true;
    }
    
    for (int row = initialRow; row < initialRow + 3; row++) {
        for (int col = initialCol; col < initialCol + 3; col++) {
            if (grid[row][col] != '.') {
                if (values.contains(grid[row][col])){
                    return false;
                }
                
                values.add(grid[row][col]);
            }
        }
    }
    return true; 
}

boolean isValidRow(char[][] grid, int row) {
    
    HashSet<Character> values = new HashSet<>();
    
    for (int col = 0; col < 9; col++) {
        if (grid[row][col] != '.') {
            if (values.contains(grid[row][col])) {
                return false;
            }
            
            values.add(grid[row][col]);
        }
    }
    
    return true;
}

boolean isValidColumn(char[][] grid, int col) {
    
    HashSet<Character> values = new HashSet<>();
    
    for (int row = col; row < 9; row++) {
        if (grid[row][col] != '.') {
            if (values.contains(grid[row][col])) {
                return false;
            }
            
            values.add(grid[row][col]);
        }
    }
    
    return true;
}