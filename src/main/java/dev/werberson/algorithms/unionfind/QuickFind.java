package dev.werberson.algorithms.unionfind;

public class QuickFind extends UnionFind {

    public QuickFind(int size) {
        super(size);
    }

    @Override
    public void connect(int p, int q) {
        final int pValue = this.nodes[p];
        final int qValue = this.nodes[q];
        if (pValue == qValue) {
            //already connected
            return;
        }
        for (int i = 0; i < this.nodes.length; i++) {
            if (this.nodes[i] == pValue) {
                this.nodes[i] = qValue;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return this.nodes[p] == this.nodes[q];
    }

}
