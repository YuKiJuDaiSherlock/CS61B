package byog.lab6;

public class UnionFind {
    int[] id;

    public UnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = -1;
        }
    }

    public void validate(int v1) {
        if (v1 < 0 || v1 >= id.length) {
            throw new IllegalArgumentException("not a valid index");
        }
    }

    public int sizeOf(int v1) {
        validate(v1);
        if (id[v1] < 0) {
            return id[v1];
        }
        return -id[parent(v1)];
    }

    public int parent(int v1) {
        validate(v1);
        if (id[v1] < 0) {
            return id[v1];
        }
        while (id[v1] >= 0) {
            v1 = id[v1];
        }
        return v1;
    }

    public boolean connected(int v1, int v2) {
        validate(v1);
        validate(v2);
        if (parent(v1) == parent(v2) || parent(v1) == v2 || parent(v2) == v1) {
            return true;
        }
        return false;
    }

    public void union(int v1, int v2) {
        validate(v1);
        validate(v2);
        if (parent(v1) < 0) {
            if (parent(v2) < 0) {
                id[v1] = v2;
                id[v2]--;
            } else {
                id[v1] = parent(v2);
                id[parent(v2)]--;
            }
        } else {
            if (parent(v2) < 0) {
                id[v2] = parent(v1);
                id[parent(v1)]--;
            } else {
                if (sizeOf(v1) <= sizeOf(v2)) {
                    id[parent(v2)] += id[parent(v1)];
                    id[parent(v1)] = parent(v2);
                } else {
                    id[parent(v1)] += id[parent(v2)];
                    id[parent(v2)] = parent(v1);
                }
            }
        }

    }

    public int find(int v1) {
        validate(v1);
        if (parent(v1) < 0) {
            return v1;
        }
        while (id[v1] >= 0) {
            v1 = id[v1];
        }
        return v1;
    }
}
