/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;
public class GraphDemo 
{
  int v,visited[],g[][];
  boolean flag=false;
  void createGraph(int nodes)
  {
      v=nodes;
      Scanner in=new Scanner(System.in);
      g=new int[v][v];
      visited=new int[v];
      for(int i =0;i<v;i++)
      {
          for(int j=0;j<v;j++)
          {
              System.out.println("Enter value for v"+i+" to v"+j+" (999 for infinity):");
              g[i][j]=in.nextInt();
              
          }
      }
  }
  void printG()
  {
       for(int i =0;i<v;i++)
      {
          for(int j=0;j<v;j++)
          {
              System.out.print(g[i][j]+"\t");
          }
              System.out.println();
      }
  }
  
  public void resetvisited()
  {
         for(int i =0;i<v;i++)
         {
             visited[i]=0;//unvisited 0 and 1 means visited
         }
             
   }
  
  public void DFS(int source)
  {
      visited[source]=1;
      System.out.println("V"+source);
      for(int i=0;i<v;i++)
      {
          if(g[source][i]==1 && visited[i]!=1)
          //neighbour and unvisited
          {
              DFS(i);
          }
      }
  }
    public boolean DFS_search(int source,int key)
  {
      if(key==source)
      {
           flag=true;
      }
       visited[source]=1;
      System.out.println("V"+source);
      for(int i=0;i<v;i++)
      {
          if(g[source][i]==1 && visited[i]!=1)//neighbour and unvisited
          {
              DFS_search(i,key);
          }
      }
       return(flag);
  }

  public void BFS(int source)
  {
      int q[]=new int[v];
      int front=0,rear=-1;
      visited[source]=1;
      q[++rear]=source;//enqueue
      while(front<=rear)//not empty
      {
          int element=q[front++];//dequeue
          System.out.print("V"+element+"-");
         
          for(int i=0;i<v;i++)
            {
               if(g[element][i]==1 && visited[i]!=1)//neighbour and unvisited
               {
                  visited[i]=1;//visited
                  q[++rear]=i;//enqueue
               }
            }
      }
  }
  public static void main(String args[])
  {
      GraphDemo  obj=new GraphDemo();
      obj.createGraph(4);
      obj.printG();
      obj.resetvisited();
      System.out.println("DFS");
      obj.DFS(3);
      //obj.resetvisited();
      //System.out.println("BFS");
      //obj.BFS(0);
      
  }
}
