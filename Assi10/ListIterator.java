// Assignment #: 10
//         Name:
//    StudentID:
//  Lab Lecture:
// Description:
// This interface contains a subset of the methods of the
//  standard java.util.ListIterator interface. The methods for
//  backward traversal are not included.

public interface ListIterator
{
   Object next();

   boolean hasNext();

   void add(Object element);

   void remove();

   void set(Object element);
}