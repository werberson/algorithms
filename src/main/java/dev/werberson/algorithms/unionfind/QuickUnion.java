package dev.werberson.algorithms.unionfind;

public class QuickUnion extends UnionFind {

    public QuickUnion(int size) {
        super(size);
    }

    @Override
    public void connect(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP != rootQ) {
            this.nodes[rootP] = rootQ;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int root(int index) {
        while (this.nodes[index] != index) {
            index = this.nodes[index];
        }
        return index;
    }
}
