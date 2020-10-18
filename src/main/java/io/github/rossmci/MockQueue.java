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
public class MockQueue implements Queue
{

	@Override
	public int size()
	{
		return 1;
	}

	@Override
	public boolean isEmpty()
	{
		return false;
	}

	@Override
	public Object peek() throws EmptyQueueException
	{
		System.out.println("MockQueue.peek()");
		return "#1";
	}

	@Override
	public void append(Object obj)
	{
		System.out.println("MockQueue.append()");
	}

	@Override
	public Object serve() throws EmptyQueueException
	{
		System.out.println("MockQueue.serve()");
		return "#1";
	}

}
