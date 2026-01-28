// Question 11: Traverse a doubly linked list in reverse and print elements
public void printReverse() {
    Node temp = tail; // البدء من النهاية
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = prev;
    }
}