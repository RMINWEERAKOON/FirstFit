/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
public class MemoryBlock {
    private int size; // Holds the size of the memory block.
    private boolean isFree; // Indicates whether the block is free (true) or allocated (false).

    public MemoryBlock(int size) {
        this.size = size; //initialize a memory block with a specific size
        this.isFree = true; //Sets isFree to true by default.
    }

    public int getSize() {
        return size; //Getter method to retrieve the size of the block.
    }

    public boolean isFree() {
        return isFree; //Getter method to check if the block is free.
    }

    public void allocate() {
        isFree = false; //Marks the block as allocated.
    }

    public void deallocate() {
        isFree = true; //Marks the block as free
    }

    public void setSize(int newSize) {
        this.size = newSize; //: Updates the size of the block
    }

    @Override
    public String toString() {
        return "Block [Size: " + size + ", Free: " + isFree + "]"; // Returns a string representation of the block,
        //showing its size and allocation status
    }
}
  

