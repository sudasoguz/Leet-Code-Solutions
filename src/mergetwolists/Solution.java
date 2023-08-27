package mergetwolists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h=new ListNode();
        ListNode temp=h;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            }
            else{
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            temp.next=new ListNode(list1.val);
            temp=temp.next;
            list1=list1.next;
        }
        while(list2!=null){
            temp.next=new ListNode(list2.val);
            temp=temp.next;
            list2=list2.next;
        }
        return h.next;
    }
}