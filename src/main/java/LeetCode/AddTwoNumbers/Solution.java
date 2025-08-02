package LeetCode.AddTwoNumbers;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;


        while ((l1 != null) || (l2 != null) || (carry != 0)) {
            int sum = carry; // если на предыдущей операции была добавочная 1
            if (l1 != null) { // если в списке 1 ещё что-то есть, то выполняем сложение
                sum += l1.val;
                l1 = l1.next; // переход на следующий элемент списка
            }
            if (l2 != null) { // если в списке 2 ещё что-то есть
                sum += l2.val;
                l2 = l2.next; // переход на следующий элемент списка
            }
            carry = sum / 10; // добавляем 1 если сумма больше 10
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Создаём списки
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Вызываем метод
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Печатаем результат
        printList(result);  // Выведет: 7 0 8
    }

    // Метод для печати списка
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}