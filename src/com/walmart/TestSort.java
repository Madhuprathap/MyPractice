package com.walmart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Employee implements Comparable<Employee>{
	int id;
	int mgrId;
	String name;
	double salary;
	
	public Employee(int id, int mgrId, String name, double salary) {
		super();
		this.id = id;
		this.mgrId = mgrId;
		this.name = name;
		this.salary = salary;
	}
	
	static final Comparator<Employee> salaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return Double.compare(o1.salary, o2.salary);
		}
	};
	
	@Override
	public String toString() {
		return "["+id+","+name+","+mgrId+","+salary+"]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id < o.id) {
			return 1;
		} else if (this.id > o.id) {
			return -1;
		} else {
			return 0;
		}
	};
}

class Company {
	int id;
	String name;
	public Company(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class TestSort {
	
	static List<Employee> list = new ArrayList<Employee>();
	//can sort using collections.sort, but depending on comparator it will have top element as min/max
	static PriorityQueue<Employee> queue = new PriorityQueue<Employee>();
	static PriorityQueue<Company> queueCompanies = new PriorityQueue<Company>();	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list.add(new Employee(2, 1, "Sesha", 500.00));
		list.add(new Employee(3, 2, "Bhaskar", 300.00));
		list.add(new Employee(1, 0, "Naresh", 1000.00));
		list.add(new Employee(4, 3, "Madhu", 100.00));
		
		Collections.sort(list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee type = (Employee) iterator.next();
			System.out.println(type.toString());
		}
		System.out.println("------------------------------------------------------");
		Collections.sort(list, Employee.salaryComparator);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee type = (Employee) iterator.next();
			System.out.println(type.toString());
		}
		System.out.println("------------------------------------------------------");
		queue.add(new Employee(2, 1, "Sesha", 500.00));
		queue.add(new Employee(3, 2, "Bhaskar", 300.00));
		queue.add(new Employee(1, 0, "Naresh", 1000.00));
		queue.add(new Employee(4, 3, "Madhu", 100.00));
		
		for (Iterator iterator = queue.iterator(); iterator.hasNext();) {
			Employee type = (Employee) iterator.next();
			System.out.println(type.toString());
			
		}
		System.out.println("will not sort using comparator nor maintains order, but alwyas contains min/max at top element");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("-------------------------------------------------------");
		
	}

}
