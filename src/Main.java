import java.util.*;
class Main {
    public static void main(String[] args) {
        char[][] matrix =  {{'1','1','1', '1'},
                {'1','S','1', '1'},
                {'1','1','X', '1'},
                {'1','1','1', 'E'}};

        //System.out.println(shortestPath(matrix));
    }

    public static int shortestPath(List<List<Integer>> area, int numRows, int numColumns) {
        int count = 0;
        Queue<int[]> nextToVisit = new LinkedList<>();
        nextToVisit.offer(new int[] {numRows, numColumns});
        Set<int[]> visited = new HashSet<>();
        Queue<int[]> temp = new LinkedList<>();

        while (!nextToVisit.isEmpty()) {
            int[] position = nextToVisit.poll();
            int row = position[0];
            int col = position[1];

            if (area.get(row).get(col) == 9)
                return count;
            if (row > 0 && !visited.contains(new int[] {row - 1, col}) && area.get(row - 1).get(col) != 0)
                temp.offer(new int[] {row - 1, col});
            if (row < numRows - 1 && !visited.contains(new int[] {row + 1, col})
                    && area.get(row + 1).get(col) != 0)
                temp.offer(new int[] {row + 1, col});
            if (col > 0 && !visited.contains(new int[] {row, col - 1}) && area.get(row).get(col - 1) != 0)
                temp.offer(new int[] {row, col - 1});
            if (col < numColumns - 1 && !visited.contains(new int[] {row, col + 1})
                    && area.get(row).get(col + 1) != 0)
                temp.offer(new int[] {row, col + 1});

            if (nextToVisit.isEmpty() && !temp.isEmpty()) {
                nextToVisit = temp;
                temp = new LinkedList<>();
                count++;
            }

        }

        return count;
    }
}
