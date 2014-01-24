/**
 * Created by Daniel on 1/24/14.
 */
public class node<T>
{
    private T data;
    private node<T> next;
    private node<T> previous;

    public node(T value)
    {
        data = value;
        next = null;
        previous = null;
    }
    public T getData()
    {
        return data;
    }
    public boolean hasNext()
    {
        boolean hasNext = false;
        if (next != null)
        {
            hasNext = true;
        }
        return hasNext;
    }
    public node<T> getNext()
    {
        return next;
    }
    public void setNext(node<T> siguente)
    {
        next = siguente;
    }
    public void setPrevious(node<T> anterior)
    {
        previous = anterior;
    }
    public node<T> getPrevious()
    {
        return previous;
    }
}
