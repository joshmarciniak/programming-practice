import java.util.NoSuchElementException;
public class myStack<Item>
{
	private Node<Item> first;
	private int n;
	
	private static class Node<Item>
	{
		private Item item;
		private Node<Item> next;
	}
		
	public myStack()
	{
		first = null;
		n = 0;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public int size()
	{
		return n;
	}
	
	public void push(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		n++;
	}
	
	public Item pop()
	{
		if(isEmpty()) throw new NoSuchElementException("Is Underflow");
		Item item = first.item;
		first = first.next;
		n--;
		return item;
	}
	
	public Item peek()
	{
		if(isEmpty()) throw new NoSuchElementException("Is Underflow");
		return first.item;
	}
	
	public static void main(String[] args)
	{
		myStack<String> stack = new myStack<String>();
		stack.push("hello");
		stack.push("world");
		stack.push("!");
		
		stack.pop();
		System.out.println(stack.peek());
	}
}
	