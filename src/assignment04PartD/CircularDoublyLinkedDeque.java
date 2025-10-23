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
        if(firstnode == null)
        {
            firstnode = new DoublyLinkedNode(newEntry);
            return;
        }

        DoublyLinkedNode currentnode = firstnode;
        while(currentnode.next != null)
            currentnode = currentnode.next;
        
        currentnode.next = new DoublyLinkedNode(newEntry, currentnode, null);
    }

    @Override
    public void addToBack(T newEntry) 
    {
        if(firstnode == null)
        {
            firstnode = new DoublyLinkedNode(newEntry);
            return;
        }
        
        DoublyLinkedNode currentnode = firstnode;
        while(currentnode.prev != null)
            currentnode = currentnode.next;
        
        currentnode.prev = new DoublyLinkedNode(newEntry, null, currentnode);
    }

    @Override
    public T removeFront() 
    {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public T removeBack() 
    {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public T getFront() 
    {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public T getBack() 
    {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public boolean isEmpty() 
    {
        // TODO Auto-generated method stub

        return true;
    }

    @Override
    public void clear() 
    {
        // TODO Auto-generated method stub
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
