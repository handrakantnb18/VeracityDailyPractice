package com.chatgpt.practiceAdvanceLevel;

class DetectCycle
{
	int val;
	DetectCycle next;
	DetectCycle(int val)
	{
		this.val = val;
	}
}

public class ListNode {

	// Delete Cycle in Linked List
	
	// public static void main(String[] args)
	public boolean hasCycle(DetectCycle head)
	{
		// Detect Cycle in Linked List
		
		DetectCycle slow = head, fast = head;
		
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
}
