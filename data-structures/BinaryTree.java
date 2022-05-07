class Tree<T> {
  private Node<T> root;
  private int size;
  
  public Tree(Node<T> root) {
    this.root = root;
    if (root != null) size = 1;
  }
  
  public Tree() {
    this(null);
  }
  
  public int size() {
    return this.size;
  }
  
  public Node<T> getRoot() {
    return this.root;
  }
  
  public Tree<T> setRoot(T element) {
    if (root == null)
      size = 1;
    
    this.root = new Node<T>(element);'
    return this;
  }
  
  public Tree<T> setRoot(Node<T> element) {
    if (root == null)
      size = 1;
    
    this.root = element;
    return this;
  }
  
  public Node<T> addLeft(Node<T> parent, Node<T> child){
      if(parent.getLeft() != null){
          System.out.println("Already have left");
          return null;
      }
      size++;
      parent.setLeft(child);
      return parent;
  }

  public Node<T> addRight(Node<T> parent, Node<T> child){
      if(parent.getRight() != null){
          System.out.println("Already have right");
          return null;
      }
      size++;
      parent.setRight(child);
      return parent;
  }

  public Node<T> removeLeft(Node<T> parent){
      Node<T> target = parent.getLeft();
      if(target != null)
          size--;
      parent.setLeft(null);
      return target;
  }

  public Node<T> removeRight(Node<T> parent){
      Node<T> target = parent.getRight();
      if(target != null)
          size--;
      parent.setRight(null);
      return target; 
  }
  
  public void preorder(Node<T> node) {
    System.out.println(node.getElement());
    if (node.getLeft() != null)
      preorder(node.getLeft());
    
    if (node.getRight() != null)
      preorder(node.getRight();
  }
  
  public void inOrder(Node<T> node) {
    if (node.getLeft() != null)
      preorder(node.getLeft());
    
    System.out.println(node.getElement());
    
    if (node.getRight() != null)
      preorder(node.getRight();
  }
  
  public void postOrder(Node<T> node) {
    if (node.getLeft() != null)
      preorder(node.getLeft());
        
    if (node.getRight() != null)
      preorder(node.getRight();
               
   System.out.println(node.getElement());
  }
}


class Node<T> {
  private T element;
  private Node<T> parent;
  private Node<T> left;
  private Node<T> right;
  
  public Node(T element) {
    this.element = element;
    this.parent = null;
    this.left = null;
    this.right = null;
  }
  
  public Node(T element, Node<T> left, Node<T> right) {
    this.element = element;
    this.parent = null;
    this.left = left;
    this.right = right;
  }
  
  public Node(T element, Node<T> parent, Node<T> left, Node<T> right) {
    this.element = element;
    this.parent = parent;
    this.left = left;
    this.right = right;
  }
  
  public Node<T> setParent(Node<T> parent) {
    this.parent = parent;
    return this; // builder pattern
  }
  
  public T getElement() {
    return this.element;
  }
  
  public Node<T> setElement(T element){ this.element = element; return this; }
  public Node<T> getLeft(){ return this.left;    }
  public Node<T> setLeft(Node<T> left){ this.left = left; return this; }
  public Node<T> getRight(){ return this.right;  }
  public Node<T> setRight(Node<T> right){ this.right = right; return this; }
  public Node<T> getParent(){ return this.parent;}
}
