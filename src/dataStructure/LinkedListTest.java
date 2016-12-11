package dataStructure;

public class LinkedListTest {
	 class ListNode{
		 int val;
		 ListNode next;
		 ListNode(int val){
			this.val = val;
			this.next = null;
		}
	}
	//单项链表 反转
	public ListNode reverse(ListNode head){
		ListNode prev = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = prev;
			prev =head;
			head =next;
		}
		return prev;
	}
	
	 class DListNode{
		int val;
		DListNode prev,next;
		DListNode(int val){
			this.val =val;
			this.prev=this.next=null;
		}
	  }
		//双向链表 反转
	public DListNode reverse(DListNode head){
		DListNode curr = null;
		while(head!=null){
			curr=head;
			head=curr.next;
			curr.next=curr.prev;
			curr.prev = head;
		}
		return curr;
	}
	public boolean hasCircle(ListNode self,ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(slow!=null&&fast!=null){
			fast = fast.next;
			slow = slow.next;
			if(fast!=null){
				fast=fast.next;
			}
			if(fast == slow){
				break;
			}
		}
		if(fast!=null&&slow!=null&&fast==slow){
			return true;
		}else{
			return false;
		}
	}
	
}
