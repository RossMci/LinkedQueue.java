/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci;

/**
 * ****************************************************************************
 * Compilation: javac MergingTwoSortedQueues.java Execution: java
 * MergingTwoSortedQueues
 *
 * Merging two ascending sorted queues to one queue with ascending order.
 *
 * % java MergingTwoSortedQueues First queue: [a, b, g, h]
 *
 * Second queue: [A, c, d, e, f]
 *
 * Merged queue: [A, a, b, c, d, e, f, g, h]
 *
 *****************************************************************************
 */

class MergingTwoSortedQueues
{

	public static void main(String[] args)
	{
		Queue first = new LinkedQueue();
		Queue second = new LinkedQueue();

		first.append("a");
		first.append("b");
		first.append("g");
		first.append("h");

		second.append("A");
		second.append("c");
		second.append("d");
		second.append("e");
		second.append("f");

		String output =("First queue: ")+(first.toString())+("\nSecond queue: ")+(second.toString());

		Queue result = MergingTwoSortedQueues.merge(first, second);

		output +=("\nMerged queue: ")+ (result.toString());
		System.out.println(output);
	}

	public static Queue merge(Queue first, Queue second)
	{
		Queue mergedQueue = new LinkedQueue();

		// If both queues are not empty.
		while (!first.isEmpty() && !second.isEmpty())
		{
			String left = first.peek().toString();
			String right = second.peek().toString();

			if (left.compareTo(right) < 0)
			{
				mergedQueue.append(first.serve());
			}
			else
			{
				mergedQueue.append(second.serve());
			}
		}

		emptyQueueInto(first, mergedQueue);
		emptyQueueInto(second, mergedQueue);

		return mergedQueue;
	}

	public static void emptyQueueInto(Queue sourceQueue, Queue destinationQueue)
	{
		// If there are remaining items in one of the queue.
		while (!sourceQueue.isEmpty())
		{
			destinationQueue.append(sourceQueue.serve());
		}
	}
}
