package cse360assignments02;

public class AddingMachine {
    private int total;
    String ret = "0 ";  //String variable to maintain a history of transactions

    /**
     * Constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * getTotal()
     * return the current total
     * @return
     */
    public int getTotal () {
        System.out.println(total);
        return 0;
    }

    /**
     * add()
     *  add the parameter to the total variable
     * @param value
     */
    public void add (int value) {
        total+=value;
        ret = ret + "+ " + value + " ";     //append transaction to variable string
    }

    /**
     * substract()
     * subtract the parameter from the total variable
     * @param value
     */
    public void subtract (int value) {
        total-=value;
        ret = ret + "- " + value + " ";     //append transaction to variable string
    }

    /**
     * toString()
     * @return
     */
    public String toString () {
        return ret;
    }

    /**
     * clear()
     * should clear your "memory"
     */
    public void clear() {
        total = 0;
    }
}