// Question 5: Write a function to concatenate two linked lists
public void concatenate(LinkedList list2) {
    if (this.head == null) {
        this.head = list2.head;
        return;
    }
    Node temp = this.head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = list2.head;
}