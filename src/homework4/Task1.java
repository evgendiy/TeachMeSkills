package homework4;

/**
 * Создать двухмерный массив 8 на 8, заполнить в шахматном порядке буквами B, W
 */
public class Task1 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = (i + j) % 2 == 0 ? "W" : "B";
            }
        }

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
