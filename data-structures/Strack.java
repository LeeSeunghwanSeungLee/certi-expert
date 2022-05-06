class Stack <T> {
  private static MAX = 10000;
  private int last;
  T[] stack;
  
  public Stack() {
    this.last = 0;
    stack = new T[MAX];
  }
  
  public boolean isEmpty() {
    return last == 0;
  }
  
  public boolean isFull() {
    return last == (MAX - 1);
  }
  
  public int size() {
    return last;
  }
  
  public void push(T value) {
    if (isFull())
      return;
    
    stack[last++] = value;
  }
  
  public T pop() {
    if (isEmpty())
      return;
 
    return stack[last--];
  }
  
  public T peek() {
    if (isEmpty())
      return null;
    
    return stack[last];
  }
}
