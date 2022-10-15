import java.util.LinkedList;

import javax.swing.plaf.LabelUI;

public class Hashmap<K,V>{
    public class HMNode {
        K key;
        V value;
        HMNode(K k, V v){
            this.key = k;
            this.value = v;
        }
    
    }

    private LinkedList<HMNode>[]map;
    public int size;
    double load_factor = 2.0;

    private void init_map(int N){
        this.size = 0;
        this.map = new LinkedList[N];
        for(int i=0;i<N;i++){
            map[i]= new LinkedList<HMNode>();
        }
    }
    Hashmap(){
        init_map(3);
    }

    public int hashFn(K key){
        return key.hashCode();
    }

    public int getIndexWithBucket(K key){
        return ((int)Math.abs(hashFn(key)))%map.length;
    }
    private void rehash(){
        LinkedList<HMNode>[]oldMap = this.map;
        int oldBucketSize = oldMap.length;
        this.init_map(oldBucketSize*2);

        for(int i=0;i<oldBucketSize;i++){
            for(HMNode  node : oldMap[i]){
                this.put(node.key, node.value);
            }
        }
    }
    public void put(K key, V value){
        int idx = getIndexWithBucket(key);
        for(HMNode node : map[idx]){
            if(node.key==key){
                node.value = value;
                return ;
            }
        }
        this.size++;
        map[idx].add(new HMNode(key, value));
        double lamda = this.size*1.0 / (this.map.length*1.0);
        if(lamda > load_factor){
            rehash();
        }

    }

    public V get(K key) throws Exception{
        int idx = getIndexWithBucket(key);
        for(HMNode node : map[idx]){
            if(node.key==key){
                return node.value;
            }
        }
        throw new Exception("Invalid Input!! Values not present in map");
    }

    public boolean containsKey( K key ){
        int idx = getIndexWithBucket(key);
        for(HMNode node : map[idx]){
            if(node.key==key){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        if(this.size==0){
            return "";
        }else{
            StringBuilder sb  = new StringBuilder();
            for(int i=0;i<this.map.length;i++){
                for(HMNode node : map[i]){
                    sb.append( "Bucket : "+ i+ " : "+ node.key+ " -> "+node.value + "\n");
                }
            }
            return sb.toString();
        }

    }

}
