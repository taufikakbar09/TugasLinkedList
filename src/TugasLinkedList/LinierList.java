package TugasLinkedList;

public interface LinierList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index, Object obj);
    @Override
    public String toString();
}
