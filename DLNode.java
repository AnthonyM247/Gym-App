public class DLNode<T>{
  protected T data;
  protected DLNode<T> next;
  protected DLNode<T> prev;

  public DLNode(){
    this.data = data;
    this.next = null;
    this.prev = null;
  }

    public DLNode(T data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }

    public void setData(T data){
      this.data = data;
    }

    public void setNext(DLNode<T> next){
      this.next = next;
    }

    public void setPrev(DLNode<T> prev) {
        this.prev = prev;
    }

    public T getData(){
      return this.data;
    }

    public DLNode<T> getNext(){
      return this.next;
    }

    public DLNode<T> getPrev(){
      return this.prev;
    }

}
