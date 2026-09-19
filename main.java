import java.util.Scanner;

public class main {
    public static void printMenu(){
        System.out.println("""
                           
                            To initialize Enter 1: 
                           To create a child Enter 2: 
                           To destroy a child Enter 3: 
                            To quit Enter 4: 
                           """);
}
    public static void main(String[] args){

        

Scanner scn = new Scanner(System.in);
int input = 0;
Process[] pcb = new Process[5];






while(input != 4){

    
        printMenu();
        input = scn.nextInt();

    switch (input) {
        case 1:
            //intitialize the frist process
            if(pcb[0] != null){
                System.out.println("The first process already has been intialized.");
            }
            else if(pcb[0] == null){
                pcb[0] = new Process(-1);  // The root
                pcb[0].printParentID();
                pcb[0].printChildList();
            }   break;
        case 2:
            // creat child
            
            System.out.println("Enter the parent id: ");
            int parent = scn.nextInt();
            int childIndex = -1;
            if(pcb[parent] == null){ // checks if the parent exists
                System.out.println("This parentId is invalid. \n Maybe try checking to see if you have initialized the first process.");
                break;
            } 
            for ( int i = 1 ; i < pcb.length ; i++){
                if(pcb[i] == null){
                    childIndex = i;
                    break;
                }
            }   if( childIndex == -1 ){
                System.out.println("There is no space");
                
                printMenu();
                input = scn.nextInt();
            }
            else{
                
                pcb[childIndex] = new Process(parent); // create a new child with a parent id
                pcb[parent].addChildToParent(childIndex);  // adds the childId to the parent child id
                
                System.out.println("Here is the parent process information: ");
                pcb[parent].printParentID();
                pcb[parent].printChildList();
                
                System.out.println("Here is the child process infromation: ");
                pcb[childIndex].printParentID();
                pcb[childIndex].printChildList();
            }   break;
        case 4:
            System.out.println("you have existed out of the program");
            break;
        default:
            System.out.println("this command is not defined");
            printMenu();
            input = scn.nextInt();
            break;
    }


}










    }
}
