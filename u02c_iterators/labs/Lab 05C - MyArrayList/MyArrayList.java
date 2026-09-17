package myarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;

   public MyArrayList()
   {
      this(10);
   }

   @SuppressWarnings("unchecked")
   public MyArrayList(int intSize)
   {
      count = 0;
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
      if(index < 0 || index > count)
         throw new IndexOutOfBoundsException();

      if(count == list.length)
         resizeArray();

      for(int i = count; i > index; i--)
         list[i] = list[i - 1];

      list[index] = value;
      count++;
   }

   public void clear()
   {
      for(int i = 0; i < count; i++)
         list[i] = null;

      count = 0;
   }

   public T get(int index)
   {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException();

      return list[index];
   }

   public int indexOf(T value)
   {
      for(int i = 0; i < count; i++)
      {
         if(list[i].equals(value))
            return i;
      }

      return -1;
   }

   public boolean remove(T value)
   {
      int index = indexOf(value);

      if(index == -1)
         return false;

      removeAt(index);
      return true;
   }

   public boolean isEmpty()
   {
      return count == 0;
   }

   public T removeAt(int index)
   {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException();

      T removed = list[index];

      for(int i = index; i < count - 1; i++)
         list[i] = list[i + 1];

      list[count - 1] = null;
      count--;

      return removed;
   }

   public T set(int index, T element)
   {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException();

      T oldValue = list[index];
      list[index] = element;

      return oldValue;
   }

   public int size()
   {
      return count;
   }

   public int capacity()
   {
      return list.length;
   }

   public Object[] toArray()
   {
      Object[] arr = new Object[count];

      for(int i = 0; i < count; i++)
         arr[i] = list[i];

      return arr;
   }

   @Override
   public String toString()
   {
      if(count == 0)
         return "[]";

      String s = "[";

      int index = 0;

      for(; index < count - 1; index++)
         s += list[index] + ", ";

      return s + list[index] + "]";
   }

   @Override
   public Iterator<T> iterator()
   {
      return new LinkedListIterator();
   }

   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;

      public LinkedListIterator()
      {
         expectedCount = count;
         last = -1;
         next = 0;
      }

      public boolean hasNext()
      {
         return next < count;
      }

      public T next()
      {
         checkForComodification();

         if(!hasNext())
            throw new NoSuchElementException();

         last = next;
         return list[next++];
      }

      public void remove()
      {
         checkForComodification();

         if(last < 0)
            throw new IllegalStateException();

         removeAt(last);

         next = last;
         last = -1;
         expectedCount = count;
      }

      private void checkForComodification()
      {
         if(expectedCount != count)
            throw new ConcurrentModificationException();
      }
   }

   // ****************** Private Helper Methods ********************

   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[]) new Object[list.length + 10];

      for(int index = 0; index < list.length; index++)
         temp[index] = list[index];

      list = temp;
   }
}
