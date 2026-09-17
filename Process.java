public class Process {
  int parentId;
  Node head;

public Process(int parentId, int childId){
  this.parentId = parentId;
  this.head = null;
}

public void addChild(int childId){
  Node newChild = new Node(childId);

  if ( head == null){
    head = newChild;
    return;
  }

  Node current = head;

  while(current.next != null){
    current = current.next;
  }
  current.next = newChild;
}












}
