package com.accenture.datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapImplementaion {
	
	Map<Integer, Integer>zipcodeMap = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> zipcodeMap1 = new LinkedHashMap<Integer, Integer>();
	SortedMap<Integer, Integer> zipcodeMap2 = new TreeMap<Integer, Integer>();
	Map<Character,List<String>> listmap = new TreeMap<Character, List<String>>();
	
	public void insertValuesInHashMap(int key, int value) {
		zipcodeMap.put(key, value);
	}
	
	public void insertValuesInLinkedHashMap(int key, int value) {
		zipcodeMap1.put(key, value);
	}
	
	public void insertValuesInTreeMap(int key, int value) {
		zipcodeMap2.put(key, value);
	}
	
	public void insertValues(char key, List<String> value) {
		listmap.put(key, value);
			
	}
	public Map<Integer, Integer> getHashMap(){
		
		return zipcodeMap;
		
	}
	
	public Map<Integer, Integer> getLinkedHashMap(){
		
		return zipcodeMap1;
		
	}
	
	public Map<Integer, Integer> getTreeMap(){
		
		return zipcodeMap2;
		
	}
	
	public Map<Character, List<String>> getlist(){
		
		return listmap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapImplementaion obj = new MapImplementaion();
		obj.insertValuesInHashMap(1, 40);
		obj.insertValuesInHashMap(1, 40);
		obj.insertValuesInHashMap(2, 40);
		obj.insertValuesInHashMap(10, 0);
		//obj.insertValuesInHashMap((int) null, 8);
		//obj.insertValuesInHashMap(1, 40);
		System.out.println(obj.getHashMap().size());
		
		System.out.println(obj.zipcodeMap);
		Set<Map.Entry<Integer, Integer>> st = obj.getHashMap().entrySet();
		for(Map.Entry<Integer, Integer> me:st) {
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
	}

}
