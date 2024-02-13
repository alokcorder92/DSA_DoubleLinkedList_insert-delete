import java.util.*;
class Node
{
	Node prev;
	int data;
	Node next;
}
class DL
{
	static Node head;
	static Scanner sc=new Scanner(System.in);
	static void create()
	{
		Node cur=null,ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
	    {
	       cur=new Node();
	       if(cur==null)
	       {
	           System.out.println("Some Problem");
	           break;
	       }
	       c++;
	       System.out.println("enter node"+c+"data");
	       cur.prev=null;   //new add
	       cur.data=sc.nextInt();
	       cur.next=null;
	       if(head==null)
	       {
	          head=cur;
	       }
	       else
	       {
	          ptr.next=cur;
	          cur.prev=ptr;  //new add
	       }
	       ptr=cur;
	       System.out.println("To create new node press y");
	       ch=sc.next().charAt(0);
	    }
	}
	static void fdisp()
	{
		if(head==null)
		{
			System.out.println("no element");
			return;
		}
		System.out.println("element are forward");
		Node ptr=head;
		while(ptr!=null)
	    {
	       System.out.println(ptr.data);  //10
	       ptr=ptr.next;
	    }

	}

	static void bdisp()
	{
		if(head==null)
		{
			System.out.println("no element");
			return;
		}
		System.out.println("element are backward");
		Node ptr=head;
		while(ptr.next!=null)
	    {
	       ptr=ptr.next;
	    }
	    while(ptr!=null)
	    {
	    	System.out.println(ptr.data);  //10
	    	ptr=ptr.prev;
	    }

	}
	static void startinsert()
	{
		Node cur=new Node();
		System.out.println("enter first element");
		cur.data=sc.nextInt();
		cur.next=head;
		if(head!=null)
		{
			head.prev=cur;
		}
		head=cur;
	}
	static void startdelete()
	{
		if(head==null)
		{
           System.out.println("no elements");
           return;
		}
		System.out.println("delete elements="+head.data);
		if(head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	static void endinsert()
	{
		Node cur=new Node();
		System.out.println("enter last element");
		cur.data=sc.nextInt();
		if(head==null)
		{
			head=cur;
			return;
		}
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=cur;
		cur.prev=ptr;
		cur.next=null;
	}
	static void enddelete()
	{
		if(head==null)
		{
           System.out.println("no elements");
           return;
		}
		Node temp,ptr;
		temp=head;
		ptr=head;
		while(temp.next!=null)
		{
			ptr=temp;
			temp=temp.next;
		}
		System.out.println("delete elements="+temp.data);
		ptr.next=null;
		temp.prev=null;
		temp=null;
	}
}
class Test
{
	public static void main(String args[])
	{
	    
	    DL.create();
	    DL.fdisp();
	    DL.bdisp();
	    DL.startinsert();
	    DL.startinsert();
	    DL.startdelete();
	    DL.endinsert();
	    DL.fdisp();
	    DL.bdisp();
	    DL.enddelete();
	    DL.fdisp();
	    DL.bdisp();
	    
	}
}