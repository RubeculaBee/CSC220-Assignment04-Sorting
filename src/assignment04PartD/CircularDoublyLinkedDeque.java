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
        addToBack(newEntry);
        
        firstnode = firstnode.prev; 
    }

    @Override
    public void addToBack(T newEntry) 
    {
        if(firstnode == null)
        {
            firstnode = new DoublyLinkedNode(newEntry);
            return;
        }

        DoublyLinkedNode newNode = new DoublyLinkedNode(newEntry, firstnode.prev, firstnode);
        firstnode.prev.next = newNode;
        firstnode.prev = newNode;
    }

    public T removeFront() throws EmptyQueueException
    {
        if(isEmpty())
            throw new EmptyQueueException();

        firstnode = firstnode.next;

        return removeBack();
    }

    @Override
    public T removeBack() throws EmptyQueueException
    {
        if(isEmpty())
            throw new EmptyQueueException();
        
        T data = firstnode.prev.data;

        firstnode.prev = firstnode.prev.prev;
        firstnode.prev.next = firstnode;

        return data;
    }

    @Override
    public T getFront() throws EmptyQueueException
    {
        if(isEmpty())
            throw new EmptyQueueException();
        
        return firstnode.data;
    }

    @Override
    public T getBack() throws EmptyQueueException
    {
        if(isEmpty())
            throw new EmptyQueueException();
        
        return firstnode.prev.data;
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

        private DoublyLinkedNode(T data)
        {
            this.data = data;
            this.prev = this;
            this.next = this;
        }

        private DoublyLinkedNode(T data, DoublyLinkedNode prev, DoublyLinkedNode next) 
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        
    } // end DoublyLinkedNode

} // end CircularDoublyLinkedDeque
