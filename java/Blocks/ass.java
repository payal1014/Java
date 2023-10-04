package Blocks;

public class ass {
    static int globalVariable;

    // Static block
    static {
        // Initialization of the global variable inside the static block
        globalVariable = 42;
        System.out.println("Inside static block: globalVariable = " + globalVariable);
    }

    // Non-static block (instance initializer block)
    {
        // Initialization of the global variable inside the non-static block
        globalVariable = 99;
        System.out.println("Inside non-static block: globalVariable = " + globalVariable);
    }

    public static void main(String[] args) {
        // Printing the value of the global variable after the blocks are executed
        System.out.println("Value of globalVariable in the main method: " + globalVariable);
    }
}


