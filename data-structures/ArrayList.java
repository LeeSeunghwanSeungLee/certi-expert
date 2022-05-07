class ArrayList<T> {
  private static int CAPACITY_EXPANSION_SIZE = 2;
  private Object[] arr = null;
  private int capacity = 0;
  private int size = 0;
  
  public ArrayList(int capacity) {
    this.capacity = capacity;
    arr = new Object[capacity];
    size = 0;
  }
  
  public ArrayList() {
    capacity = 1;
    arr = new Object[capacity];
    size = 0;
  }
  
  public void add(T element) {
    if (size == capacity) {
      expandArray();
    }
    
    arr[size++] = element;
  }
  
  public void addFirst(T element) {
    add(0, element);
  }
  
  public void add(int index, T element) {
    if (size == capacity) {
      expandArray();
    }
    
    for (int i = size; i > index; i--) {
      arr[i] = arr[i - 1];
    }
    
    arr[index] = element;
    size++;
  }
  
  private void expandArray() {
    capacity *= CAPACITY_EXPANSION_SIZE ;
    Object[] tempArr = new Object[capacity];
    copyArr(tempArr, arr);
    arr = new Object[capacity];
    copyArr(arr, tempArr);
  }
  
  private void copyArr(Object[] arr, Object[] targetArr) {    
    for (int i = 0; i < targetArr.length; i++) 
      arr[i] = targetArr[i];
  }
  
  public T get(int index) {
    if (size < 0) return null;
    return (T) arr[index];
  }
  
  public T remove(int index) {
    T result = (T) arr[index];
    if (size > 0) {
      for (int i = index; i < size; i++) {
        arr[i] = arr[i + 1];
      }
    }
    size--;
    return result;
  }
  
  public void reset() {
    size = 0;
    arr = new Object[capacity];
  }
  
  public int size() {
    return this.size;
  }
  
  public int getCapacity() {
    return this.capacity;
  }
}
