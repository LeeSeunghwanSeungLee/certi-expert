class Queue <T> {
  private static MAX = 10000;
  private int front;
  private int rear;
  T[] queue;
  
  public Queue() {
    this.front = this.rear = 0;
    queue = new T[MAX];
  }
  
  public boolean isEmpty() {
    return front == rear;
  }
  
  public boolean isFull() {
    return rear == (MAX - 1);
  }
  
  public int size() {
    return rear - front;
  }
  
  public void push(T value) {
    if (isFull())
      return;
    
    queue[rear++] = value;
  }
  
  public T pop() {
    if (isEmpty())
      return;
    
    return queue[front++];
  }
  
  public T peek() {
    if (isEmpty())
      return null;
    
    return queue[front];
  }
}
