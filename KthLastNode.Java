class LinkList{
    Node head;
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}

public class KthLastNode{
    private static void insert(Node root,int val){
        Node temp;
        temp=root;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= new Node(val);
    }
    
    private static int getSize(Node root){
        Node temp= root;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    private static void print(Node root){
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    
     public static void main(String []args){
        LinkList ll = new LinkList();
        ll.head=new Node(1);
        insert(ll.head,2);
        insert(ll.head,3);
        insert(ll.head,4);
        insert(ll.head,5);
        insert(ll.head,6);
        insert(ll.head,7);
        insert(ll.head,8);
        insert(ll.head,9);
        insert(ll.head,10);
        print(ll.head);
        Node temp=ll.head;
        Node end=ll.head;
        int k=3;
        
        if(k>getSize(ll.head)){
            System.out.println(-1);
        }
        while(k>1){
            end=end.next;
            k--;
        }
        
        while(end.next!=null){
            temp=temp.next;
            end=end.next;
        }
        if(end.next==null){
            System.out.println(temp.data);
        }
        
        
     }
}