

    class Nodeee{
    int data;
    Nodeee next;

    Nodeee(int data){
        this.data = data;
        this.next = null;
    }
}


    public class Q_8th_ADD_TWO_NUMBERS_REPRESENTED_BY_LINKED_LISTS{
    static Nodeee head1, head2, head3, head4;

    // create the lists by adding nodes to the end
    public Nodeee createNode(int data, Nodeee head){
        Nodeee temp = head;
        Nodeee n = new Nodeee(data);
        if(head==null){
            head = n;
            return head;
        }
        while(head.next!=null){
            head = head.next;
        }
        head.next = n;
        return temp;
    }
    
    // reverse the linked list
    static Nodeee reverseLL(Nodeee head){
        Nodeee prev = null;
        Nodeee current = head;
        Nodeee next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

   
    /* Adds contents of two linked lists and return the head node of resultant list */
    Nodeee addTwoLists(Nodeee first, Nodeee second)
    {
        // res is head node of the resultant list
        Nodeee res = null;
        Nodeee prev = null;
        Nodeee temp = null;
        int carry = 0, sum;
 
        // while both lists exist
        while (first != null || second != null) {
            // Calculate value of next digit in resultant list. The next digit is sum of following things :
            // (i)  Carry
            // (ii) Next digit of first list (if there is a next digit)
            // (ii) Next digit of second list (if there is a next digit)
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
 
            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;
 
            // update sum if it is greater than 10
            sum = sum % 10;
 
            // Create a new node with sum as data
            temp = new Nodeee(sum);
 
            // if this is the first node then set it as head of the resultant list
            if (res == null) {
                res = temp;
            }
 
            // If this is not the first node then connect it to the rest.
            else {
                prev.next = temp;
            }
 
            // Set prev for next insertion
            prev = temp;
 
            // Move first and second pointers
            // to next nodes
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
 
        if (carry > 0) {
            temp.next = new Nodeee(carry);
        }
 
        // return head of the resultant list
        return res;
    }
 
    void printList(Nodeee head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
 
    public static void main(String[] args)
    {
    	Q_8th_ADD_TWO_NUMBERS_REPRESENTED_BY_LINKED_LISTS list = new Q_8th_ADD_TWO_NUMBERS_REPRESENTED_BY_LINKED_LISTS();
 
        // creating first list
        head1 = list.createNode(4, head1);
        head1 = list.createNode(5, head1);
        System.out.print("First List is ");
        list.printList(head1);
 
        // creating seconnd list
        head2 = list.createNode(3, head2);
        head2 = list.createNode(4, head2);
        head2 = list.createNode(5, head2);
        System.out.print("Second List is ");
        list.printList(head2);

        Nodeee Rhead1 = reverseLL(head1);
        Nodeee Rhead2 = reverseLL(head2);
 
        // add the two lists and see the result
        Nodeee rs = list.addTwoLists(Rhead1, Rhead2);
        Nodeee result = reverseLL(rs);
        System.out.print("Resultant List is ");
        list.printList(result);

        System.out.println();

        Q_8th_ADD_TWO_NUMBERS_REPRESENTED_BY_LINKED_LISTS list2 = new Q_8th_ADD_TWO_NUMBERS_REPRESENTED_BY_LINKED_LISTS();
 
        // creating first list
        head3 = list2.createNode(6, head3);
        head3 = list2.createNode(3, head3);
        System.out.print("First List is ");
        list.printList(head3);
 
        // creating seconnd list
        head4 = list2.createNode(7, head4);
        System.out.print("Second List is ");
        list.printList(head4);

        Nodeee Rhead3 = reverseLL(head3);
        Nodeee Rhead4 = reverseLL(head4);
 
        // add the two lists and see the result
        Nodeee rs2 = list.addTwoLists(Rhead3, Rhead4);
        Nodeee result2 = reverseLL(rs2);
        System.out.print("Resultant List is ");
        list.printList(result2);
    }
}