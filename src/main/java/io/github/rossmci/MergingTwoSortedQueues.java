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
import java.util.PriorityQueue;
import java.util.Queue;

class MergingTwoSortedQueues
{

	public static void main(String[] args)
	{
		Queue<String> first = new PriorityQueue<>();
		Queue<String> second = new PriorityQueue<>();

		first.add("a");
		first.add("b");
		first.add("g");
		first.add("h");

		second.add("A");
		second.add("c");
		second.add("d");
		second.add("e");
		second.add("f");

		System.out.println("First queue: ");
		System.out.println(first.toString());
		System.out.println("\nSecond queue: ");
		System.out.println(second.toString());

		Queue result = MergingTwoSortedQueues.merge(first, second);

		System.out.println("\nMerged queue: ");
		System.out.println(result.toString());
	}

	public static Queue<String> merge(Queue<String> first, Queue<String> second)
	{
		Queue<String> mergedQueue = new PriorityQueue<>();

		// If both queues are not empty.
		while (!first.isEmpty() && !second.isEmpty())
		{
			String left = first.peek();
			String right = second.peek();

			if (left.compareTo(right) < 0)
			{
				mergedQueue.add(first.poll());
			}
			else
			{
				mergedQueue.add(second.poll());
			}
		}

		emptyQueueInto(first, mergedQueue);
		emptyQueueInto(second, mergedQueue);

		return mergedQueue;
	}

	public static void emptyQueueInto(Queue<String> sourceQueue, Queue<String> destinationQueue)
	{
		// If there are remaining items in one of the queue.
		while (!sourceQueue.isEmpty())
		{
			destinationQueue.add(sourceQueue.poll());
		}
	}
}
