/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author M S I
 */
public class TestMain {
    public static void main(String[] args) {
        Graph grph=new Graph();
        grph.VertexTambah('A');
        grph.VertexTambah('B');
        grph.VertexTambah('C');
        grph.VertexTambah('D');
        grph.VertexTambah('E');
        
        grph.EdgeTambah('A', 'B', 1);
        grph.EdgeTambah('A', 'C', 1);
        grph.EdgeTambah('A', 'D', 1);
        grph.EdgeTambah('A', 'E', 1);
        grph.EdgeTambah('B', 'C', 1);
        grph.EdgeTambah('C', 'D', 1);
        grph.EdgeTambah('C', 'E', 1);
        
        System.out.println("Hasil Matrik");
        System.out.println(grph.toString());
        System.out.println("Hasil Kunjungan BFS");
        grph.BFS();
    }
}