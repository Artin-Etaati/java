public class main {
    public static void main(String[] args){

        
        // LinkedList l1 = new LinkedList();
        // l1.add(2);
        // l1.add(3);
        // l1.printList();

// ------------------------------------------------
        // LinkedList[] array = new LinkedList[3];
        // array[0] = new LinkedList();
        // array[0].add(5);
        // array[0].printList();

// ------------------------------------------------

Process[] pcb = new Process[5];

pcb[0] = new Process(-1);  // The root
pcb[0].printParentID();


 pcb[1] = new Process(0);
 pcb[0].addChild(1);

 pcb[0].printChildList();









    
    }
}
