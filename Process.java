public class Process {
  int parentId;
  Node head;

public Process(int parentId){
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

public void printChildList(){
  Node current = head;

  while(current != null){
    System.out.println("number of the child: " + current.childId);
    current = current.next;
  }
}

public void printParentID(){ 
  int p = parentId;
  System.out.println("parentId : " + p);
}



}
