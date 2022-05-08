Class LinkedList<T> {
  private Node<T> head;
  
  public LinkedList() {
    this.head = null;
  }
  
  public void insertAtFirst(Node<T> newNode) {
  
  }
  
  public void insertAtIndexNode() {
  
  }
  
  public void deletNodeAtIndex() {
  
  }
  // ...

}

class Node<T> {
  private T element;
  private Node<T> next;
  
  public Node(T elem) {
    this.element = elem;
    this.next = null;
  }
  
  public Node(T elem, Node<T> next) {
    this.element = elem;
    this.next = next;
  }
  
  public Node() {
    this.element = null;
    this.element = null;
  }
  
  
  public T getData() {
    return element; 
  }
  
  public void setData(T elem) {
    this.element = elem; 
  }
  
  public Node<T> getNext() {
    return next;
  }
  
  public void setNext(Node<T> next) {
    this.next = next;
  }
}
