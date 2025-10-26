package assignment04PartD;

/*
 * File: CircularDoublyLinkedDeque.java
 * By:   Robin Lane
 * Date: 10-22-25
 * 
 * Description: A double ended queue (deque) where the last node references the first node and vice versa
 *              This way you can iterate backwards and forwards through the deque to reach any item
 */

public class CircularDoublyLinkedDeque<T> implements DequeInterface<T>
{
    DoublyLinkedNode firstnode;

    @Override
    public void addToFront(T newEntry) 
    {
        //TODO: Reimplement
    }

    @Override
    public void addToBack(T newEntry) 
    {
        //TODO: Reimplement
    }
    
    public T removeFront() throws EmptyQueueException
    {
        //TODO: Reimplement
    }

    @Override
    public T removeBack() throws EmptyQueueException
    {
        //TODO: Reimplement
    }

    @Override
    public T getFront() throws EmptyQueueException
    {
        //TODO: Reimplement
    }

    @Override
    public T getBack() throws EmptyQueueException
    {
        //TODO: Reimplement
    }

    @Override
    public boolean isEmpty() 
    {
        return firstnode == null;
    }

    @Override
    public void clear() 
    {
        firstnode = null;
    }

    private class DoublyLinkedNode 
    {
        private T data;
        private DoublyLinkedNode prev;
        private DoublyLinkedNode next;

        private DoublyLinkedNode() {}

        private DoublyLinkedNode(T data) {this.data = data;}

        private DoublyLinkedNode(T data, DoublyLinkedNode prev, DoublyLinkedNode next) 
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        
    } // end DoublyLinkedNode

} // end CircularDoublyLinkedDeque
