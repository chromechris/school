// Assignment #: 10
//         Name:
//    StudentID:
//  Lab Lecture:
// Description: A linked list is a sequence of nodes with efficient
// element insertion and removal.
// This class contains a subset of the methods of the
// standard java.util.LinkedList class.
//Only this File shall be edited

import java.util.NoSuchElementException;

public class LinkedList
{
   private class Node
   {
          public Object data;
          public Node next;
   }

   private Node first;

   public LinkedList()
   {
      first = null;
   }

   public Object getFirst()
   {
      if (first == null)
       {
         NoSuchElementException ex
             = new NoSuchElementException();
         throw ex;
       }
      else
         return first.data;
   }

   public Object removeFirst()
   {
      if (first == null)
       {
         NoSuchElementException ex = new NoSuchElementException();
         throw ex;
       }
      else
       {
         Object element = first.data;
         first = first.next;
         return element;
       }
   }

   public void addFirst(Object element)
   {
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }

   public ListIterator listIterator()
   {
      return new LinkedListIterator();
   }

   public String toString() {
	   String linkedListOutputStr = "{ ";
	   
	   if( !listIterator().hasNext() ) {
		   return "{ }\n";
	   }
	   else {
		   Node tempNode = first;
		   
		   while( tempNode != null ) {
			   linkedListOutputStr = linkedListOutputStr + tempNode.data + " ";
			   tempNode = tempNode.next;
		   }
	   }
	   
	   linkedListOutputStr = linkedListOutputStr + "}\n";
	   return linkedListOutputStr;
   }

   public int size() {
	   int count = 0;
	   LinkedListIterator myListIterator = (LinkedListIterator) this.listIterator();
	   
	   if( !myListIterator.hasNext() ) {
		   return count;
	   } else {
		   Node tempNode = first;
		   while( tempNode != null ) {
			   count++;
			   tempNode = tempNode.next;
		   }
		   return count;
	   }

   }

   public void addElement(Object element, int index) {
	   int currentIndex = 0;
	   LinkedListIterator myListIterator = (LinkedListIterator) this.listIterator();
	   
	   if(index > size() || index < 0) {
		   IndexOutOfBoundsException ioobe = new IndexOutOfBoundsException ();
		   throw ioobe;
	   } else {
		   if( !myListIterator.hasNext() ) {
			   myListIterator.add(element);
		   } else {
			   if(index == 0) {
					   myListIterator.add(element);
			   } else {
				   if(index == size()) {
					   while(myListIterator.hasNext()) {
						   myListIterator.next();
					   }
					   myListIterator.add(element);
				   } else if(index < 0) {
					   IndexOutOfBoundsException ioobe = new IndexOutOfBoundsException ();
					   throw ioobe;
				   } else if(index > size()) {
					   IndexOutOfBoundsException ioobe = new IndexOutOfBoundsException ();
					   throw ioobe;
				   } else {
					   while(currentIndex != index) {
						   myListIterator.next();
						   currentIndex++;
					   }
					   myListIterator.add(element);
				   }
			   }
			   
		   }
	   }
	   
   }

   public String findSmallest() {
	   LinkedListIterator myListIterator = (LinkedListIterator) this.listIterator();
	   String currentString;
	   String finalString = null;
	   
	   if(!myListIterator.hasNext()) {
		   return null;
	   } else {
		   Node tempNode = first;
		   while(tempNode!=null) {
			   if(tempNode.next != null) {
				   finalString = (String) tempNode.next.data;
			   } else {
				   return finalString;
			   }
			   currentString = (String) tempNode.data;
			   if(currentString.compareToIgnoreCase(finalString)<1) {
				   finalString = currentString;
			   } else if(currentString.compareToIgnoreCase(finalString)==0) {
				   finalString = currentString;
			   } else {
				   finalString = finalString;
			   }
			   tempNode = tempNode.next;
		   }
		   return finalString;
	   }
   }

   public void searchAndReplace(Object first, Object second) {
	   LinkedListIterator myListIterator = (LinkedListIterator) this.listIterator();
	   
	   if(!myListIterator.hasNext()) {

	   } else {
		   
		   while(myListIterator.hasNext()) {
			   String currentString = myListIterator.next().toString();
			   
			   if(currentString.equalsIgnoreCase(first.toString())) {
				   myListIterator.set(second);
			   }
		   }

	   }
   }

   public void searchAndRemove(Object toBeRemoved) {
	   LinkedListIterator myListIterator = (LinkedListIterator) this.listIterator();
	   
	   if(!myListIterator.hasNext()) {

	   } else {
		   
		   while(myListIterator.hasNext()) {
			   String currentString = myListIterator.next().toString();
			   
			   if(currentString.equalsIgnoreCase(toBeRemoved.toString())) {
				   myListIterator.remove();
			   }
		   }

	   }
   }

   public void reverseFirstSome(int howMany) {
	   LinkedListIterator myListIteratorCurrent = (LinkedListIterator) this.listIterator();
	   LinkedListIterator myListIteratorLast = (LinkedListIterator) this.listIterator();
	   Node tempCurrent = first;
	   Node tempPrevious = null;
	   Node tempNext = null;
	   Node tempLast = first;
	   while(tempLast!=null) {
		   tempLast = tempLast.next;
	   }
	   while(myListIteratorLast.hasNext()) {
		   myListIteratorLast.next();
	   }
	   int counter = 0;
	   int modulo = size();
	   
	   if(howMany <= 0) {
		   System.out.println("If");
	   } else if(howMany >= size()) {
		   System.out.println("Else If");
		   if(!myListIteratorCurrent.hasNext()) {
			 System.out.println("List in local LinkedListIterator Object is NULL");
		   } else {
			   if(modulo!=0) {
				   myListIteratorCurrent.next();
				   myListIteratorCurrent.set(tempLast);
				   myListIteratorLast.set(tempCurrent);
				   modulo = modulo-2;
			   } else {
				   
			   }
		   }
	   } else {
		   System.out.println("Else");
		   if(!myListIteratorCurrent.hasNext()) {
			   System.out.println("List in local LinkedListIterator Object is NULL");
		   } else {
			   System.out.println("It");
			   Node tempNode = first;
			   Node tempNode2 = first.next;
			   myListIteratorCurrent.next();
			   while(counter!=howMany) {
				   if(myListIteratorCurrent.hasNext() && tempNode2.data!=null) {
					   myListIteratorCurrent.set(tempNode2.data);
					   tempNode2 = tempNode2.next;
					   myListIteratorCurrent.next();
				   }
				   counter++;
			   }

		   }
	   }
	   
   }

   private class LinkedListIterator implements ListIterator
   {
      private Node position;
      private Node previous;

      public LinkedListIterator()
      {
         position = null;
         previous = null;
      }

     public boolean hasNext()
      {
         if (position == null)
          {
             if (first != null)
                return true;
             else
                return false;
          }
         else
           {
              if (position.next != null)
                 return true;
              else
                 return false;
           }
      }

      public Object next()
      {
         if (!hasNext())
          {
           NoSuchElementException ex = new NoSuchElementException();
           throw ex;
          }
         else
          {
            previous = position;

            if (position == null)
               position = first;
            else
               position = position.next;

            return position.data;
          }
      }

      public void add(Object element)
      {
         if (position == null)
         {
            addFirst(element);
            position = first;
         }
         else
         {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;
         }
         previous = position;
      }

      public void remove()
      {
         if (previous == position)
          {
            IllegalStateException ex = new IllegalStateException();
            throw ex;
          }
         else
          {
           if (position == first)
            {
              removeFirst();
            }
           else
            {
              previous.next = position.next;
            }
           position = previous;
      }
      }

      public void set(Object element)
      {
         if (position == null)
          {
            NoSuchElementException ex = new NoSuchElementException();
            throw ex;
          }
         else
          position.data = element;
      }
      
   }
}