//package list.solution26;
//
//import list.listnode.ListNode;
//
//public class MergeTwoLists {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode list = new ListNode(0);
//        ListNode cur = l1;
//        while (l1 != null || l2 != null){
//            if(l1.val <= l2.val){
//                cur = cur.next;
//            }
//            else {
//                cur.val = l2.val;
//                cur.next = l2
//            }
//        }
//        return l1;
//    }
//}
