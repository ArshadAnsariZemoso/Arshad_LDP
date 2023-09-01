//package arshad.assignment.generic;
//
//class SListIterator<T> {
//    private SList<T> list;
//    private SList.Link<T> current;
//
//    SListIterator(SList<T> list) {
//        this.list = list;
//        this.current = list.head;
//    }
//
//    public boolean hasNext() {
//        return current != null;
//    }
//
//    public T next() {
//        if (current == null) {
//            throw new java.util.NoSuchElementException();
//        }
//        T data = current.data;
//        current = current.next;
//        return data;
//    }
//}