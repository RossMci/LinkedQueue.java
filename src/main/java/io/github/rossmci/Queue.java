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
public interface Queue
{

	/**
	 * The number of elements stored in the queue
	 *
	 * @return
	 */
	int size();

	//TODO:coments
	boolean isEmpty(); // test whether the queue is empty

	// return the front element of the queue
	Object peek() throws EmptyQueueException ; // thrown if called on an empty queue
	// update methods

	void append(Object obj); // insert an element at the rear

	Object serve() throws EmptyQueueException;// return and remove the front element
}
