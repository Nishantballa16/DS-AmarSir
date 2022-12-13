/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SortingDemo 
{
    int a[];
  void arrayCreation()
  {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      a=new int[n];
      for (int i =0;i<a.length;i++)
      {
          System.out.println("Element at "+i+":");
          a[i]=in.nextInt();
      }
  }
  void bubblesort()
  {
      int i,j,t;
      for(i=0;i<a.length-1;i++)
      {
          for(j=0;j<a.length-1;j++)
          {
              if(a[j]>a[j+1])
              {
                  t=a[j];
                  a[j]=a[j+1];
                  a[j+1]=t;
              }
          }
      }
  }
   void selectionsort()
  {
      int i,j,min,pos;
      for(i=0;i<a.length-1;i++)
      {
         min=a[i]; 
         pos=i;
          for(j=i+1;j<a.length;j++)
          {
              if(a[j]<min)
              {
                  min=a[j];
                  pos=j;
              }
          }
          a[pos]=a[i];
          a[i]=min;
      }
  }
 void insertionsort()
  { int i,j,newelement;
      for(i=0;i<a.length-1;i++)
      {
         newelement=a[i+1];
         j=i+1;
          while (j>0 && a[j-1]>newelement)
          {
              a[j]=a[j-1];
              j--;
          }
          a[j]=newelement;
      }

  }
 
 
 
  void mergesort(int start,int end)
  {
      if(start<end)
      {
          int mid=(start+end)/2;
          mergesort(start,mid);
          mergesort(mid+1,end);
          merger(start,mid,end);
      }
  }
 
  
  
  
    void merger(int start,int mid,int end)
    {
        int temp[]=new int[a.length];
        int i,j,index;
        i=index=start;
        j=mid+1;
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
                temp[index++]=a[i++];
            else
                temp[index++]=a[j++];
        }
        while(i<=mid)
            temp[index++]=a[i++];
        while(j<=end)
            temp[index++]=a[j++];
        
        for (i=start;i<=end;i++)
            a[i]=temp[i];
                
     }
            
    
  void quicksort(int start,int end)
  {
      int i,j,pivot;
      i=start; j=end;pivot=start;
      while(i<j)
      {
          while(a[i]<a[pivot])
              i++;
          while(a[j]>a[pivot])
              j--;
          if(i<j)
          {
              int t=a[i];
              a[i]=a[j];
              a[j]=t;
          }
      }
      if(i<end)
          quicksort(i+1,end);
      if(start<j)
          quicksort(start,j-1);
  }
    









int size()
{
    return(a.length);
}





   void arrayPrint()
  {
      
      for (int i =0;i<a.length;i++)
      {
          System.out.println("Element at "+i+":"+a[i]);
          
      }
  }
   
  void heap()
 {
 int i,k,lp,temp,done=0;
 for(i=a.length-1;i>=0;i--)
 {
 for(k=0;k<=i;k++)
 {
 done=0;
 lp=k;
 while(lp>0 && done!=1)
{
 if(a[lp]>a[lp/2])
 {
 temp=a[lp];
 a[lp]=a[lp/2];
 a[lp/2]=temp;
 lp=lp/2;
 }
 else
 done=1;
 }
 }
 temp=a[0];
 a[0]=a[i];
 a[i]=temp;
 }
 }
   public static void main(String args[])
{
    SortingDemo obj=new SortingDemo();
    obj.arrayCreation();
    System.out.println("Array Before has:");
    obj.arrayPrint();
    //obj.bubblesort();
    //obj.insertionsort();
    obj.mergesort(0, obj.size()-1);
    obj.quicksort(0,obj.size()-1);
    obj.heap();
    System.out.println("Array After has:");
    obj.arrayPrint();
    
}
}
