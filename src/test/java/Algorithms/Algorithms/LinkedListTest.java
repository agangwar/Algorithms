package Algorithms.Algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest 
{
   @Test(groups = { "A", "Z" })
    public void printListTest()
    {
        LinkedList LL = new LinkedList();
        LL.insertFirst(10);
        Assert.assertEquals(LL.getSize(), 1);
        LL.insertFirst(20);
        Assert.assertEquals(LL.getSize(), 2);
        LL.insertFirst(30);
        Assert.assertEquals(LL.getSize(), 3);
        LL.printList();
        LL.reverse1();
        LL.printList();
    }

    @Test(groups = { "A"})
	public void B()
    {
    	System.out.println("Inside Test case B and group A");
    }
    @Test(groups = { "Z"})
	public void C()
    {
    	System.out.println("Inside Test case C and group Z");
    }
}
