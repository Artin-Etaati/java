import java.util.Scanner;


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
Scanner scn = new Scanner(System.in);
int input = 0;


Process[] pcb = new Process[5];




// pcb[1] = new Process(0);
// pcb[0].addChild(1);

// pcb[0].printChildList();

  

while(input != 4){

    
    System.out.println("\n To initialize Enter 1: \n" + "To create a child Enter 2: \n" + 
        "To destroy a child Enter 3: \n" + " To quit Enter 4: \n");
        input = scn.nextInt();

    if(input == 1){  //intitialize the frist process
        if(pcb[0] != null){
            System.out.println("The firsy process already has been intialized.");
            System.out.println("\n To initialize Enter 1: \n" + "To create a child Enter 2: \n" + 
        "To destroy a child Enter 3: \n" + " To quit Enter 4: \n");
            input = scn.nextInt();
        }
        else if(pcb[0] == null){
            pcb[0] = new Process(-1);  // The root
            pcb[0].printParentID();
            pcb[0].printChildList();
        }
    }

    else if(input == 2){  // creat child

        System.out.println("Enter the parent id: ");
        int parent = scn.nextInt();
        int childIndex = -1;

        for ( int i = 1 ; i < pcb.length ; i++){
            if(pcb[i] == null){
                childIndex = i;
                break;
            }
        }

        if( childIndex == -1 ){
            System.out.println("There is no space");

            System.out.println("\n To initialize Enter 1: \n" + "To create a child Enter 2: \n" + 
        "To destroy a child Enter 3: \n" + " To quit Enter 4: \n");
             input = scn.nextInt();
        }
        pcb[childIndex] = new Process(parent); // create a new child with a parent id
        pcb[parent].addChildToParent(childIndex);  // adds the childId to the parent child id

        System.out.println("Here is the parent process information: ");
        pcb[parent].printParentID();
        pcb[parent].printChildList();

        System.out.println("Here is the child process infromation: ");
        pcb[childIndex].printParentID();
        pcb[childIndex].printChildList();
    }


    else if(input == 4){  // if input == 4, then quit

    }






}





    
    }
}
