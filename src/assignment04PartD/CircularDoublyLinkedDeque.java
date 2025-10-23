package assignment04PartD;

public class CircularDoublyLinkedDeque<T> implements DequeInterface<T>
{

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
