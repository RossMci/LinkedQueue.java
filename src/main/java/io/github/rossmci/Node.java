/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci;

/**
 *
 * @author Ross Mcinerney
 */
public class Node
{
	private Node next;
	private Object element;

	public Node()
	{
		this(null, null);
	}

	public Node(Object e, Node n)
	{
		element = e;
		next = n;
	}

	public void setElement(Object newElem)
	{
		element = newElem;
	}

	public void setNext(Node newNext)
	{
		next = newNext;
	}
	
	  public Object getElement( ) 
  { 	return element; 		}

	  public Node getNext( ) 
  { 	return next; 		}
}
