/**
 * Created by Daniel on 1/24/14.
 */
public class chain<T>
{
    private int size;
    private node<T> head;
    private node<T> tail;
    public chain( int value )
    {
        size = value;
        head = null;
        tail = null;
        tail = head;
    }
    public void addNode( T value )
    {
        if(head == null)
        {
            head = new node<T>(value);
            tail = head;
            head.setNext(tail);
            head.setPrevious(null);
        }
        else
        {
            node<T> block = new node<T>(value);
            tail.setNext(block);
            tail = block;
        }
    }
    public void removeNode(node<T> delete)
    {
        for(node<T> i = head; i.hasNext(); i.getNext())
        {
            if(i.equals(delete) && i.hasNext())
            {
                i.getPrevious().setNext(i.getNext());
                i.getNext().setPrevious(i.getPrevious());
            }
        }
    }
}
