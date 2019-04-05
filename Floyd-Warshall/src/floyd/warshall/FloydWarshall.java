/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd.warshall;

/**
 *
 * @author romerojesus
 */
public class FloydWarshall {

    static void flowd_warshall(int grafo[][]){
    int n=grafo.length,tmp;
        int[][] caminos= new int [n][n];
        //crear matriz de distnaica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                caminos[i][j]=j;
            }
        }
        //ejecutar el metodos floyd-warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tmp=grafo[i][k]+grafo[k][j];
                    if(tmp<grafo[i][j]){
                        grafo[i][j]=tmp;
                        caminos[i][j]=k;
                    }
                }
            }
        }
        System.out.println("");
        print(caminos);
        print(grafo);
    }
    static void print(int m[][]){
        System.out.println("");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
