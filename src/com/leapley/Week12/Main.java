package com.leapley.Week12;

import java.util.ArrayList;
import java.util.List;

/*Implement a Queue<E> generic type similar to the Stack<E> type but with enqueue()
and dequeue() methods. The enqueue() method adds an element to the queue and the dequeue()
method removes the first/oldest element from the queue. Stacks are often described as being
"last-in, first-out" whereas queues represent a "first-in, first-out" behavior.
*/

public class Main {

    public static void main(String[] args) {
        Queue<String> que = new Queue<>();

        que.enqueue("Hi, ");
        que.enqueue("Hello");
        que.enqueue("World");
        que.display();
        que.dequeue();
        que.display();
        que.dequeue();
        que.display();
    }
}

class Queue<E>{
    List<E> list = new ArrayList<>();

    void enqueue(E value){//Puts a new element in arraylist last in queue.
        list.add(value);
    }

    E dequeue(){ //Dequeues oldest element in arraylist.
        E value = list.get(0);
        list.remove(0);
        return value;
    }

    void display(){//Displays list
        System.out.println(list);
    }
}
