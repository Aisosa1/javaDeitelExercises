package CHAPTER4DEITEL;

public class Mystery3 {
    public static void main(String[] args) {

        int row = 10;
                while (row >= 1)
                    {
                    int column = 1;

                     while (column <= 10)
                        {

                        System.out.println(row % 2 == 1 ? "* *" : "*");

                            System.out.println();
                        ++column;
                        }
                    row--;
                    }
                }
            }


