package 高级算法;

public class UF {
    private int[] id;//the id
    private int count;//分量数量

    public UF(int N){
        count = N;
        id = new int[N];
        for (int i=0;i<N;i++){
            id[i] = i;
        }
    }
    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public int find(int p){
        return id[p];
    }

    public void union(int p,int q){
        int pId = find(p);
        int qId = find(q);

        if(pId==qId) return;

        for(int i =0;i<id.length;i++){
            if(id[i] == qId) id[i] = pId;
        }
        count--;
    }

    //根节点法

    public int find2(int p){
        while (p!=id[p]) p = id[p];
        return p;
    }

    public void union2(int p,int q){
        int pRoot = find2(p);
        int qRoot = find2(q);
        if(pRoot==qRoot) return;
        id[pRoot] = qRoot;
        count--;
    }


}
