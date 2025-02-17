/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author M S I
 */
public class Graph {
   private int MaksimumVertex = 10;
   private Vertex[] DaftarVertex;
   private int[][] AdjMatrix;
   private int CacahVertex;

    public Graph() {
        DaftarVertex = new Vertex[MaksimumVertex];
        AdjMatrix = new int [MaksimumVertex][MaksimumVertex];
        for (int i = 0; i < MaksimumVertex; i++) {
            for (int j = 0; j < MaksimumVertex; j++) {
                if (i == j) {
                    AdjMatrix[i][j] = 0;
                }
            }
        }
    }
    
    public void VertexTambah(char kar){
        if (CacahVertex < MaksimumVertex) {
            DaftarVertex[CacahVertex++] = new Vertex(kar);
        } else {
            System.out.println("Graf sudah Penuh");
        }
    }
    
    public void EdgeTambah(int a, int b, int c){
        if (a >= 0 && a< CacahVertex && b >= 0 && b < CacahVertex) {
            AdjMatrix[a][b] = c;
            AdjMatrix[b][a] = c;
        } else {
            System.out.println("Index tidak Valid");
        }
    }
    
    private int indexVertex(char kar){
        for (int i = 0; i < CacahVertex; i++) {
            if (DaftarVertex[i].NamaLabel == kar) {
                return i;
            }
        }
        return -1;
    }
    
    public void EdgeTambah(char kar1, char kar2, int a){
        int index1 = indexVertex(kar1);
        int index2 = indexVertex(kar2);
        
        if (index1 != -1 && index2 != -1) {
            EdgeTambah(index1, index2, a);
        } else {
            System.out.println("Vetex tidak ditemukan");
        }
    }
    
    public void show(){
        for (int i = 0; i < CacahVertex; i++) {
            for (int j = 0; j < CacahVertex; j++) {
                if (AdjMatrix[i][j] != 0) {
                    System.out.println(DaftarVertex[i].NamaLabel+" terhubung ke "+DaftarVertex[j].NamaLabel+" dengan beban "+AdjMatrix[i][j]);
                }
            }
        }
    }
    
    public void BFS(){
        int seed = 0;
        Queue queue = new Queue();
        queue.enqueue(seed);
        while (!queue.isEmpty()){
            int bantu = (Integer)queue.dequeue();
            if(!DaftarVertex[bantu].TandaVisited){
             System.out.print(DaftarVertex[bantu].NamaLabel);
             DaftarVertex[bantu].TandaVisited = true;
             for (int i = CacahVertex-1; i >= 0; i--) {
                if (AdjMatrix[bantu][i] >= 1 && !DaftarVertex[i].TandaVisited) {
                   queue.enqueue(i);
                }
            }
            }
        }
    }
    
    @Override
    public String toString(){
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < CacahVertex; i++) {
            for (int j = 0; j < CacahVertex; j++) {
                System.out.print(AdjMatrix[i][j]+" ");
            }
            System.out.println();
            
        }
        return "";
    }
}
