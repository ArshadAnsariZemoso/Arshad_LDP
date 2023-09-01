//package arshad.assignment.generic;
//
//class SList<T> {
//    private static class Link<T> {
//        T data;
//        Link<T> next;
//
//        Link(T data) {
//            this.data = data;
//        }
//    }
//
//    private Link<T> head;
//
//    public SList() {
//        head = null;
//    }
//
//    public SListIterator<T> iterator() {
//        return new SListIterator<>(this);
//    }
//
//    public void insert(T data) {
//        Link<T> newLink = new Link<>(data);
//        newLink.next = head;
//        head = newLink;
//    }
//
//    public void remove() {
//        if (head != null) {
//            head = head.next;
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        SListIterator<T> iterator = iterator();
//        while (iterator.hasNext()) {
//            result.append(iterator.next()).append(" -> ");
//        }
//        result.append("null");
//        return result.toString();
//    }
//}