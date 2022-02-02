package Prograimiz;

public class HashTable {

	private HashNode[] buckets;
	private int numOfBuckets;// capacity
	private int size;// number of key pairs in hash table or number of hash nodes

	public HashTable() {
		this(10); // default capacity
	}

	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}

	private class HashNode {
		private Integer key; // can be generic type
		private String value; // Can be generic type
		private HashNode next;// reference to next HashNode

		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void put(Integer key, String value) {
		if (key == null || value == null) {
			throw new IllegalArgumentException("Key or value is null !!!");
		}
		int bucketIndex = getBucketIndex(key);

	}

	public String get(Integer key) {
		return null;
	}

	public String remove(Integer key) {
		return null;
	}

}
