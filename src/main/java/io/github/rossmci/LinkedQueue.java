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
public class LinkedQueue
{

	private Node head, tail;
	private int qSize;

	public LinkedQueue()
	{
		head = tail = null;
		qSize = 0;
	}

	public void append(String obj)
	{
		Node node = new Node();
//		Node.setElement(obj);
		node.setNext(null);
		if (qSize == 0)
		{
			head=node;
		}
		else
		{
			tail.setNext(node);
		}
		tail=node;
		qSize++;
	}
	
//	public Object serve() throws QueueEmptyException{
//		
//	}

//	public int getTail()
//	{
//		return tail;
//	}

}
