/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

public class Map<K,V> {
	
	public ArrayList<HashNode<K, V>> bucket;
	int numBuckets=5;
	int size;
	public Map()
	{   bucket=new ArrayList<>();
		for(int i=0;i<numBuckets;i++)
		{
			bucket.add(null);
		}
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	private int getBucketIndex(K key)
	{
//		int hashCod=key.hashCode();
//		return hashCod%numBuckets;
            return hashFunction(key);
	}
	public V get(K key)
	{
		 int index=getBucketIndex(key);
                 String kk=(String)key;
             
		HashNode<K, V> head=bucket.get(index);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;
		}
		return null;	
	}
	
	public void add(K key,V value)
	{
		
		int index=getBucketIndex(key);
		//=System.out.println(index);
		HashNode<K, V> head=bucket.get(index);
		HashNode<K, V> toAdd=new HashNode<>();
		toAdd.key=key;
		toAdd.value=value;
		if(head==null)
		{
			bucket.set(index, toAdd);
			size++;
			
		}
		else
		{  // chaining 
                   HashNode<K, V> temp=head;
                   head=toAdd;
                   head.next=temp;
                   bucket.set(index, head);
                   size++;
                }
		
		
	}
   public int hashFunction(K key) {
        // Your code here.
        int hashval=0;
        String kk=(String)key;
        for (int i=0;i<kk.length();i++)
        {   hashval=37*hashval+kk.charAt(i);
        
        }
        hashval%=numBuckets;
        if (hashval<0)
        {   hashval+=numBuckets;
        }
        return hashval;
    }

}
