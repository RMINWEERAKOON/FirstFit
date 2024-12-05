/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * 
 * @author ishan
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
        // Initialize memory blocks
        List<MemoryBlock> memory = new ArrayList<>();
        memory.add(new MemoryBlock(100));
        memory.add(new MemoryBlock(200));
        memory.add(new MemoryBlock(300));

        // Create First Fit Allocator
        FirstFitAllocator allocator = new FirstFitAllocator(memory);

        // Display initial memory status
        System.out.println("Initial Memory Status:");
        allocator.displayMemoryStatus();

        // Simulate memory allocation
        System.out.println("\nAllocating 20 units...");
        allocator.allocate(20);
        allocator.displayMemoryStatus();
        
        // Allocate again
        System.out.println("\nAllocating 150 units...");
        allocator.allocate(150);
        allocator.displayMemoryStatus();

        // Allocate again
        System.out.println("\nAllocating 70 units...");
        allocator.allocate(70);
        allocator.displayMemoryStatus();

        // Try allocating a large block
        System.out.println("\nAllocating 400 units...");
        allocator.allocate(400);
        allocator.displayMemoryStatus();
        
          // Deallocate a block
        System.out.println("\nDeallocating block 1...");
        allocator.deallocate(1);
        allocator.displayMemoryStatus();
       
        
    }
    
}
