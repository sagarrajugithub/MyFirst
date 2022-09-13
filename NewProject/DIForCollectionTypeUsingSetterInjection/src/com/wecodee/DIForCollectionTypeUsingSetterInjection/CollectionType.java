package com.wecodee.DIForCollectionTypeUsingSetterInjection;

import java.util.*;

public class CollectionType
{
	private ArrayList<Integer> al;
	private HashSet<Double> hs;
	private HashMap<Integer,Character> hm;
	
	public CollectionType() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created with No Argumented Constructor");
	}

	public ArrayList<Integer> getAl() {
		return al;
	}

	public void setAl(ArrayList<Integer> al) {
		this.al = al;
	}

	public HashSet<Double> getHs() {
		return hs;
	}

	public void setHs(HashSet<Double> hs) {
		this.hs = hs;
	}

	public HashMap<Integer, Character> getHm() {
		return hm;
	}

	public void setHm(HashMap<Integer, Character> hm) {
		this.hm = hm;
	}

	@Override
	public String toString() {
		return "Int ArrayList "+al+" \nDouble HashSet "+hs+"\nHashMap "+hm;
	}
	
	
	
	
}
