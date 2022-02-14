package DataStructure;

import java.util.Scanner;

public class doublylinkedlist2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        dlist frnt=null, rear=null, node, newnode;
        char ch;

        node=new dlist();
        node.setPrev(null);
        frnt=node;
        do {
            System.out.println("\n Enter information part :");
            node.setInfo(scn.nextInt());
            node.setNext(null);
            rear=node;

            System.out.println("\n Do you want to continue (Y/N) :");
            ch=scn.next().charAt(0);
            if((ch=='Y')||(ch=='y'))
            {
                newnode=new dlist();
                node.setNext(newnode);
                newnode.setPrev(node);
                node=newnode;
                continue;
            }
            else
                break;
        }while(true);


        try {
            System.out.println("\n Contents of Doubly Linked List Top to bottom \n");
            node = frnt;
            while (node != null) {
                System.out.printf( "%5d" , node.getInfo());
                node = node.getNext();
            }
        }
        catch(Exception ex)
        {}

        try {
            System.out.println("\n Contents of Doubly Linked List Bottom to Top \n");
            node = rear;
            while (node != null) {
                System.out.printf( "%5d" , node.getInfo());
                node = node.getPrev();
            }
        }
        catch(Exception ex)
        {}
    }
}
