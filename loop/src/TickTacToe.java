public class TickTacToe {

    public static void main(String[] args) {

        char[][] array = {{'x','0','O'},{'O', 'X', 'X'},{'O','X','O'}};
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                System.out.println(array[row][column]+ " ");
            }
            System.out.println();
        }



    }

}
