package myarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;
	
   public MyArrayList() {
      this(10);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int intSize) {
   
   count = intisize;
   list = (T[]) new Object[intSize];
   
   }
	
   public void add(T value)
   {
      if(count == list.length)
         resizeArray();
         
      list[count++] = value;
   
   }
	
   public void add(int index, T value)
   {
     T[] temp = list;
     list = (T[] new Object[list.length + 1];
       
       
   }
	
   public void clear()
   {
   
   }
	
   public T get(int index) {
      return null;
   }
	
   public int indexOf(T value)
   {
      return 0;
   }
	
   public boolean remove(T value)
   {
      return false;
   }
	
   public boolean isEmpty() {
      return false;
   }
	
   public T removeAt(int index)
   {
      return null;
   }
	
   public T set(int index, T element) {
      return null;
   }
	
   public int size() {
      return 0;
   }
	
   public int capacity() {
      return 0;
   }
	
   public Object[] toArray() {
      return null;
   }
	
   @Override
   public String toString()
   {
        if (size == 0) {
         return "[]";
         
        String s = "["
        int index = 0;
        for ( ; index < size - 1; index++) ****\
            s = s + list[index].toString() + ", ";
        return s + list[index].toString() + "]";
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
      
      }
   	
      public boolean hasNext() {
         return false;
      }
   	
      public T next() {
         checkForComodification();
         return null;
      }
   	
      public void remove() {
      
      }
   	
      private void checkForComodification() {
      
      }
   }
	
	// ****************** Private Helper Methods ********************
	
   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[]) new Object[list.length + 10];
      for (int index = 0; index < list.length; index++)
         temp[index] = list[index];
      list = temp;
   }
	
}