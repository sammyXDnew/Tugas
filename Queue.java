/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author M S I
 */
import java.util.LinkedList;
public class Queue {
    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }
    
    public boolean enqueue(Object ukuran){
        queue.addLast(ukuran);
        return true;
    }
    
    public Object dequeue(){
        return queue.removeFirst();
    }
    
    public boolean isEmpty(){
        if (queue.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}