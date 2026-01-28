// Question 9: Remove at specific position from singly linked list
public void removeAt(int position) {
    if (head == null) return;
    if (position == 0) {
        head = head.next;
        return;
    }
    Node temp = head;
    for (int i = 0; temp != null && i < position - 1; i++) {
        temp = temp.next;
    }
    if (temp == null || temp.next == null) return;
    temp.next = temp.next.next;
}