// Question 7: Search for element in singly linked list and return its position
public int search(int data) {
    Node temp = head;
    int position = 1;
    while (temp != null) {
        if (temp.data == data) {
            return position;
        }
        temp = temp.next;
        position++;
    }
    return -1; // إذا لم يتم العثور عليه
}