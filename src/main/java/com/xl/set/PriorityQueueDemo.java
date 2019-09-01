package com.xl.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		MinHeap();
		MaxHeap();
		int[] arr = {3, 5, 1, 32, 41, 5, 64, 2135,23,532,52,122,453,13,3};
		MaxK(4, arr);
		MinK(4, arr);
	}

	public static void MinHeap() {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		System.out.println(minHeap);
		minHeap.add(10);
		minHeap.add(2);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(13);
		minHeap.add(14);

		System.out.println(minHeap.poll());
	}

	public static void MaxHeap() {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		System.out.println(maxHeap);
		maxHeap.add(10);
		maxHeap.add(2);
		maxHeap.add(5);
		maxHeap.add(15);
		maxHeap.add(13);
		maxHeap.add(14);
		System.out.println(maxHeap.poll());

	}

	public static void MaxK(int k, int[] arr) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		if (arr.length < 1) {
			return;
		}

		for (int element : arr) {
			if (maxHeap.size() < k) {
				maxHeap.add(element);
			} else if(maxHeap.peek() < element){
				maxHeap.poll();
				maxHeap.add(element);
			}
		}

		Integer[] a = new Integer[k];
		for (int i = 0; i < k; i++) {
			a[i] = maxHeap.poll();
		}

		Arrays.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		System.out.println("------Max-----");
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
		System.out.println("------Max-----");
	}

	public static void MinK(int k, int[] arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		if (arr.length < 1) {
			return;
		}

		for (int element : arr) {
			if (minHeap.size() < k) {
				minHeap.add(element);
			} else if(minHeap.peek() > element){
				minHeap.poll();
				minHeap.add(element);
			}
		}

		Integer[] a = new Integer[k];
		for (int i = 0; i < k; i++) {
			a[i] = minHeap.poll();
		}

		Arrays.sort(a);

		System.out.println("------Min-----");
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
		System.out.println("------Min-----");
	}
}
