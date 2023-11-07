/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrinicialisacion;

/**
 *
 * @author Usuario
 */
public class ArrInicialisacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] nombres = {
            {"Pao", "Jessi", "jesus"},
            {"Pablo", "Karla", "Isma"},
            {"Fanny", "Alex", "Samuel"}
        };
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j]+"  , ");
            }
            System.out.println();
        }
    }
}
