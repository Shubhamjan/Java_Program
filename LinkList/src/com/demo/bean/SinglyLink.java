package com.demo.bean;

public class SinglyLink {
	private Node head;
	class Node{
		int n;
		Node next;
		Node(int value){
			n=value;
			next=null;
		}
	}
	public SinglyLink() {
		head=null;
	}
	
	public void addAtEnd(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.n);
			temp=temp.next;
		}
	}
	
	public void addAtBegin(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			head=newnode;
			newnode.next=temp;
		}
	}
	public void addByPosition(int val,int pos) {
		Node newnode=new Node(val);
		if(head==null &&pos!=1) {
			System.out.println("List is empty");
		}
		if(pos==1) {
			if(head==null) {
				head=newnode;
			}else {
				Node temp=head;
				head=newnode;
				newnode.next=temp;
			}
		}else {
			Node prev=head;
			for(int i=1;prev!=null&&i<=pos-2;i++) {
				prev=prev.next;
			}
			newnode.next=prev.next;
			prev.next=newnode;
			
		}
	}
	public void deleteByPos(int pos) {
		if(pos==1) {
			Node temp=head;
			head=temp.next;
			temp.next=null;
		}else {
			Node current=head.next;
			Node prev=head;
			for(int i=1;current!=null&&i<=pos-2;i++) {
				current=current.next;
				prev=prev.next;
			}
			prev.next=current.next;
			current.next=null;
			current=null;
		}
	}
	
}
