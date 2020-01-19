package dev.werberson.algorithms.unionfind;

public abstract class UnionFind {

    final int[] nodes;

    public UnionFind(int size) {
        nodes = new int[size];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = i;
        }
//        nodes = IntStream.range(0, size).toArray();
    }

    public abstract void connect(int p, int q);

    public abstract boolean connected(int p, int q);
}
