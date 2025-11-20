public class Pruevas{
    public static void main(String[] args) {
        int filas_y = 10;
        int filas_x = 10;
        String numeros = "   [1][2][3][4][5][6][7][8][9][10]\n";
        String letras = "ABCDEFGHIJ";
        String tablero = "";
        for(int x=0;x<filas_x;x++){
            tablero+="["+letras.charAt(x)+"]";
            for(int y=0;y<filas_y;y++){
                tablero+="[0]";
            }
            tablero+="|\n";
        }
        System.out.println(numeros+tablero);
    }
}