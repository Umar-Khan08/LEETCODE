import java.util.*;
class LFUCache {
    class Node {
        int key;
        int value;
        int count;
        Node prev;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.count = 1;
        }
    }
    class List {
        int size;
        Node head;
        Node tail;
        List() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        void addNode(Node node) {
            Node next = head.next;
            node.next = next;
            node.prev = head;
            head.next = node;
            next.prev = node;
            size++;
        }
        void removeNode(Node node) {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
            size--;
        }
    }
    int capacity;
    int minFreq;
    Map<Integer, Node> keyNode;
    Map<Integer, List> freqList;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        keyNode = new HashMap<>();
        freqList = new HashMap<>();
    }
    public int get(int key) {
        if (!keyNode.containsKey(key))
            return -1;
        Node node = keyNode.get(key);
        updateFreq(node);
        return node.value;
    }
    public void put(int key, int value) {
        if (capacity == 0)
            return;
        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }
        if (keyNode.size() == capacity) {
            List list = freqList.get(minFreq);
            Node node = list.tail.prev;
            list.removeNode(node);
            keyNode.remove(node.key);
        }
        Node node = new Node(key, value);
        keyNode.put(key, node);
        minFreq = 1;
        if (!freqList.containsKey(1))
            freqList.put(1, new List());
        freqList.get(1).addNode(node);
    }
    private void updateFreq(Node node) {
        int freq = node.count;
        List list = freqList.get(freq);
        list.removeNode(node);
        if (freq == minFreq && list.size == 0)
            minFreq++;
        node.count++;
        if (!freqList.containsKey(node.count))
            freqList.put(node.count, new List());
        freqList.get(node.count).addNode(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */