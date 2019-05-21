/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author breydenmonyemoratho
 */
public class HashNode<K,V> {
        K key;
	V value;
	HashNode<K, V>next;
	public HashNode()
	{
		this.key=key;
		this.value=value;
	}
        public K getKey()
        { return key;
        }
        public V getValue()
        { return value;
        }
        public HashNode<K, V>next()
        { return next;
        }
    
}
