package com.srm.javalabone;

import java.util.logging.Logger;
public class LinkedListMiddleElement {
	static Logger log=Logger.getLogger(LinkedListMiddleElement.class.getName());
	public static void main(String[] args) {
	      var linkedList = new LinkedList();
	      LinkedList.Node head = linkedList.head();
	      linkedList.add( new LinkedList.Node("Brown"));
	      linkedList.add( new LinkedList.Node("cony"));
	      linkedList.add( new LinkedList.Node("Milk"));
	      linkedList.add( new LinkedList.Node("Peach"));
	     
	      //finding middle element of LinkedList in single pass
	      LinkedList.Node current = head;
	      var length = 0;
	      LinkedList.Node middle = head;
	     
	      while(current.next() != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.next();
	          }
	          current = current.next();
	      }
	     
	      if(length%2 == 1){
	          middle = middle.next();
	      }
	 
	      log.info("Length of LinkedList: " + length);
	      log.info("Middle element of LinkedList : "+ middle);
	       
	    } 
 }

	class LinkedList{
	    private Node head;
	    private Node tail;
	   
	    public LinkedList(){
	        this.head = new Node("head");
	        tail = head;
	    }
	   
	    public Node head(){
	        return head;
	    }
	   
	    public void add(Node node){
	        tail.next = node;
	        tail = node;
	    }
	   
	    public static class Node{
	        private Node next;
	        private String data;
	 
	        public Node(String data){
	            this.data = data;
	        }
	       
	        public String data() {
	            return data;
	        }
	 
	        public void setData(String data) {
	            this.data = data;
	        }
	 
	        public Node next() {
	            return next;
	        }
	 
	        public void setNext(Node next) {
	            this.next = next;
	        }
	       
	        public String toString(){
	            return this.data;
	        }
	    }
	}


