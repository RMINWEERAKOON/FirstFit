/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */

import java.util.ArrayList; //Imports classes needed to manage the list of memory blocks.
import java.util.List;

//handle memory allocation and deallocation.
public class FirstFitAllocator {
    private List<MemoryBlock> memory; // List to store memory blocks.

    public FirstFitAllocator(List<MemoryBlock> memory) {
        this.memory = memory;  // Initializes the memory list
    }
    
    //allocate memory for a process with the given size.
    public boolean allocate(int requestSize) {
        for (int i = 0; i < memory.size(); i++) {
            MemoryBlock block = memory.get(i);
            if (block.isFree() && block.getSize() >= requestSize) {
                System.out.println("Allocating " + requestSize + " units in block of size " + block.getSize());
                block.allocate();
                if (block.getSize() > requestSize) {
                    // Calculate the remaining size
                    int remainingSize = block.getSize() - requestSize;

                    // Adjust the current block's size
                    block.setSize(requestSize);

                    // Create a new block for the remaining memory
                    MemoryBlock remainingBlock = new MemoryBlock(remainingSize);

                    // Insert the new block into the memory list after the current block
                    memory.add(i + 1, remainingBlock);
                }
                return true;
            }
        }
        System.out.println("Allocation failed: No suitable block found.");
        return false;
    }
    // deallocating 
    public void deallocate(int blockIndex) {
        if (blockIndex >= 0 && blockIndex < memory.size()) {
            MemoryBlock block = memory.get(blockIndex);
            if (!block.isFree()) {
                System.out.println("Deallocating block of size " + block.getSize());
                block.deallocate();
            } else {
                System.out.println("Block is already free.");
            }
        } else {
            System.out.println("Invalid block index.");
        }
    }
    // display the memory status
    public void displayMemoryStatus() {
        System.out.println("Memory Status:");
        for (int i = 0; i < memory.size(); i++) {
            System.out.println("Block " + i + ": " + memory.get(i));
        }
    }
}
 

