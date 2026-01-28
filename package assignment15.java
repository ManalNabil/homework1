// Question 15: Search for an element in a circular linked list
public boolean searchCircular(int key) {
    if (head == null) return false;
    Node temp = head;
    do {
        if (temp.data == key) return true;
        temp = temp.next;
    } while (temp != head);
    return false;
}