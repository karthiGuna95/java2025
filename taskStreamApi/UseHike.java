package taskStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseHike {
	public static void main(String[] args) {
		Hike hike1=new Hike("Karthi",50000,2.5f);
		Hike hike2=new Hike("Gobi",30000,1.5f);
		Hike hike3=new Hike("Keerthe",40000,3.5f);
		Hike hike4=new Hike("Geetha",55000,4.5f);
		Hike hike5=new Hike("Guna",60000,5.5f);
		ArrayList<Hike> hikes = new ArrayList<>();
		hikes.add(hike1);
		hikes.add(hike2);
		hikes.add(hike3);
		hikes.add(hike4);
		hikes.add(hike5);
		List<Integer> hi = hikes.stream().filter(f->f.getExp()>3).map(m->m.getSalary()).collect(Collectors.toList());
		for(Hike h : hikes) {
			if(h.getExp()>3) {
				h.setSalary(h.getSalary()+h.getSalary()*10/100);
			System.out.println(h);
			}
		}
	}

}
class Hike {
	private String name;
	private int salary;
	private float experience;
	
	public Hike(String name,int salary,float experience) {
		this.name=name;
		this.salary=salary;
		this.experience=experience;
	}
	
	public String toString() {
		return name+","+salary+","+experience;
	}
	
	public void setBrand(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setExp(float experience) {
		this.experience=experience;
	}
	public float getExp() {
		return experience;
	}

}