package com.simulate.util;

import java.util.Objects;

public class XLHashMap<K, V> {

	XLHashMap.Node<K, V>[] table;

	int size;

	public XLHashMap() {
		table = new XLHashMap.Node[100];
	}

	public void add(K key, V value) {

		int index = key.hashCode() % 100;
		table[index] = new XLHashMap.Node(key.hashCode(), key, value, null);
	}

	public void remove() {
	}

	public XLHashMap.Node get(K key) {
		return null;
	}

	static class Node<K, V> {
		final int hash;
		final K key;
		V value;
		Node<K, V> next;

		Node(int hash, K key, V value, Node<K, V> next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		public final String toString() {
			return key + "=" + value;
		}

		public final int hashCode() {
			return Objects.hashCode(key) ^ Objects.hashCode(value);
		}

		public final V setValue(V newValue) {
			V oldValue = value;
			value = newValue;
			return oldValue;
		}

		public final boolean equals(Object o) {
			if (o == this)
				return true;
			if (o instanceof Node) {
				Node<?, ?> node = (Node<?, ?>) o;
				if (Objects.equals(key, node.getKey()) &&
					Objects.equals(value, node.getValue()))
					return true;
			}
			return false;
		}
	}
}
