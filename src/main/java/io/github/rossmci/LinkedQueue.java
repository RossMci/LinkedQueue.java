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
public class LinkedQueue implements Queue
{

	private Node head, tail;
	private int qSize;

	public LinkedQueue()
	{
		head = tail = null;
		qSize = 0;
	}

	public void append(Object obj)
	{
		Node node = new Node();
		node.setElement(obj);
		node.setNext(null);
		if (qSize == 0)
		{
			head = node;
		}
		else
		{
			tail.setNext(node);
		}
		tail = node;
		qSize++;
	}

	public Object serve()
	{
		Object obj;
		if (qSize == 0)
		{
			throw new EmptyQueueException();
		}
		else
		{
			obj = head.getElement();
			head = head.getNext();
			qSize--;
		}
		if (qSize == 0)
		{
			tail = null;
		}
		return obj;
	}

	public int size()
	{
		return qSize;
	}

	public Node getTail()
	{
		return tail;
	}

	public boolean isEmpty()
	{
		return (head == null);
	}

	public Object peek()
	{
		if (isEmpty())
		{
			throw new EmptyQueueException();
		}
		else
		{
			return head.getElement();
		}
	}

	@Override
	public String toString()
	{
		Node iterator = head;
		if (iterator != null)
		{
			String message = iterator.getElement().toString();

			for (iterator = iterator.getNext(); iterator != null; iterator = iterator.getNext())
			{
				message += ", " + iterator.getElement().toString();
			}

			return message;
		}
		return "";
	}

}
