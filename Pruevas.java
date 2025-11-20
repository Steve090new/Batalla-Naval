public class Pruevas{
    public static void main(String[] args) {
        int filas = 1;
        int columnas = 10;
        String array[][] =new String[columnas][filas];
        for(int x=0;x<columnas;x++){
            for(int y=0;y<filas;y++){
                array[x][y] = "["+x+"]columna:";
            }
        }
        for(int x2=0;x2<columnas;x2++){
            for(int y2=0;y2<filas;y2++){
                array[x2][y2] += "filas";
            }
        }
        for(int fila=0;fila<columnas;fila++){
            for(int columna=0;columna<filas;columna++){
                System.out.println(array[fila][columna]);
            }
        }
    }
}