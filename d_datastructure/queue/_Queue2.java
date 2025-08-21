package com.mc.algorithm.d_datastructure.queue;

import com.mc.algorithm.d_datastructure.list.Node;

public class _Queue2<E> {
	
	private Node<E> top;
	private Node<E> bottom; 
	private int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(E e) {
		Node<E> newNode = new Node<>(e);
		// 큐가 비어있을 경우, top과 bottom이 모두 새 노드를 가리킵니다.
		if (isEmpty()) {
			top = newNode;
			bottom = newNode;
		} else {
			// 큐가 비어있지 않으면, 현재 bottom 노드의 다음을 새 노드로 연결하고
			// bottom 포인터를 새 노드로 업데이트합니다.
			bottom.next(newNode);
			bottom = newNode;
		}
		
		size++;
	}
	
	public E dequeue() {
		if (isEmpty()) {
			// 큐가 비어있으면 null을 반환하거나 예외를 발생시킬 수 있습니다.
			return null; 
		}

		// top 노드의 데이터를 임시로 저장합니다.
		E data = top.data();
		
		// top 포인터를 다음 노드로 이동시킵니다.
		top = top.next();
		size--;

		// 만약 dequeue 후 큐가 비게 되면, bottom 포인터도 null로 만들어야 합니다.
		if (isEmpty()) {
			bottom = null;
		}

		return data;
	}
}

