/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

/**
 *
 * @author User
 */
import java.util.*;
public class SearchDemo 
{
  int a[];
  void arrayCreation(int n)
  {
      Scanner in =new Scanner(System.in);
      a=new int[n];
      for (int i =0;i<a.length;i++)
      {
          System.out.println("Element at "+i+":");
          a[i]=in.nextInt();
      }
  }
  
  int sequentialsearch(int key)
  {
      //for(int i =0;a[i]==key || i<a.length;i++);
      for(int i=0;i<a.length;i++)
      {
          if(key==a[i])
              return(i);
      }
          
     return(-1);
  }
  
 void binarysearch(int start,int end,int key)
  {
     if(start<=end)
     {
       int mid=(start+end)/2;
       if(a[mid]==key)
          System.out.println("found at:"+(mid+1));
            
       if(key<a[mid])//left only
               binarysearch(start,mid-1,key);
       
       if(key>a[mid])//right only
               binarysearch(mid+1,end,key);
     }
     else
         System.out.println("Not found");
  }  

 
public static void main(String args[])
{
    SearchDemo obj=new SearchDemo();
    obj.arrayCreation(5);
    Scanner in =new Scanner(System.in);
    System.out.println("Enter key to search:");
    int key=in.nextInt();
    obj.binarysearch(0,4,key);
  /* int res=obj.sequentialsearch(key);
   if(res==-1)
       System.out.println(key+" not found");
   else
       System.out.println(key+" found at position "+(res+1));
   */
   
  
    
}
}













