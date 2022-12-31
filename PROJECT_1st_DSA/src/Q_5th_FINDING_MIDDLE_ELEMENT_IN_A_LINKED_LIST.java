
	public class Q_5th_FINDING_MIDDLE_ELEMENT_IN_A_LINKED_LIST {
		
		    Node head;
		    // Node class
		    class Node{
		        int key;
		        Node next;
		        
		        Node(int data)
		        {
		            key = data;
		            next = null;
		        }
		    }
		    
		    // Method for inserting node to the front
		    public void push(int data)
		    {
		        Node new_node = new Node(data);
		        new_node.next = head;
		        head = new_node;
		    }
		    
		    // Method for inserting a node at the last
		    public void insertAtLast(int data)
		    {
		        Node new_node = new Node(data);
		        if(head == null){
		            head = new_node;
		            return;
		        }
		        
		        
		        Node temp = head;
		        while(temp.next != null)
		        {
		            temp = temp.next;
		        }
		        
		        temp.next = new_node;
		        return;
		    }
		    
		    

		    // Method to get the count of number of nodes in the List
		    public int getCount()
		    {
		        int count = 0;
		        Node temp = head;
		        while(temp!= null)
		        {
		            count++;
		            temp = temp.next;
		        }
		        return count;
		    }
		    
		    // Method to find the middle node of a linked list
		    public void findMiddleNode()
		    {
		        int count = getCount();
		        Node temp = head;
		        
		        // If the number of nodes are even, then there are
		        // two middle nodes print the first middle node
		        if(count%2 == 0)
		        {
		            int i = (count/2) - 1;
		            while(i != 0)
		            {
		                temp = temp.next;
		                i--;
		            }
		            
		            System.out.println(temp.key);
		        }
		        
		        // If the number of nodes are even
		        else{
		            int i = (count/2);
		            while(i != 0)
		            {
		                temp = temp.next;
		                i--;
		            }
		            System.out.println(temp.key);
		        }
		    }
		    


		   // A utility method to print the Linked List
		    public void printList()
		    {
		        Node temp = head;
		        while(temp != null)
		        {
		            System.out.print(temp.key + " ");
		            temp = temp.next;

		        }
		    }
		    public static void main(String []args)
		    {
		    	Q_5th_FINDING_MIDDLE_ELEMENT_IN_A_LINKED_LIST ll = new Q_5th_FINDING_MIDDLE_ELEMENT_IN_A_LINKED_LIST();
		        
		        ll.push(1);
		        ll.insertAtLast(2);
		        ll.insertAtLast(3);
		        ll.insertAtLast(4);
		        ll.insertAtLast(5);
		        System.out.println("Printing the original Linked List");
		        ll.printList();
		        System.out.println("\nThe middle Element in a Linked list is");
		        ll.findMiddleNode();

		     }
		}