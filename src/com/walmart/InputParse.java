package com.walmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	int id;
	int mgrId;
	String name;
	double salary;
	List<Emp> subEmps = new ArrayList<Emp>();
	
	public Emp() {
	}
	
	public Emp(int id, int mgrId, String name, double salary) {
		super();
		this.id = id;
		this.mgrId = mgrId;
		this.name = name;
		this.salary = salary;
	}
	
	static final Comparator<Emp> salaryComparator = new Comparator<Emp>() {

		@Override
		public int compare(Emp o1, Emp o2) {
			return Double.compare(o1.salary, o2.salary);
		}
	};
	
	static final Comparator<Emp> mgeIdComparator = new Comparator<Emp>() {

		@Override
		public int compare(Emp o1, Emp o2) {
			return Integer.compare(o1.mgrId, o2.mgrId);
		}
	};
	
	@Override
	public String toString() {
		return "["+id+","+name+","+mgrId+","+salary+"]";
	}

	@Override
	public int compareTo(Emp o) {
		if (this.id < o.id) {
			return 1;
		} else if (this.id > o.id) {
			return -1;
		} else {
			return 0;
		}
	};
}

public class InputParse {
	static List inputList = new ArrayList<Emp>();
	static Emp head = null;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int k = 0;
			int inputNumber = 1;
			while (true) {
				String input = reader.readLine();
				if (input.equals("0")) {
					break;
				} else {
					++k;
					String[] inputSplit = input.split(",");
					if (k == 1) {
						for (int i = 0; i < inputSplit.length; i++) {
							inputList.add(new Emp());
							Emp emp = (Emp) inputList.get(i);
							emp.id = Integer.parseInt(inputSplit[i]);
							if (emp.mgrId == 0) {
								head = emp;
							}
						}
					} else if (k == 2) {
						for (int i = 0; i < inputSplit.length; i++) {
							Emp emp = (Emp) inputList.get(i);
							emp.name = (inputSplit[i]);
						}
					} else if (k == 3) {
						for (int i = 0; i < inputSplit.length; i++) {
							Emp emp = (Emp) inputList.get(i);
							emp.mgrId = Integer.parseInt(inputSplit[i]);
						}
					} else if (k == 4) {
						for (int i = 0; i < inputSplit.length; i++) {
							Emp emp = (Emp) inputList.get(i);
							emp.salary = Double.parseDouble(inputSplit[i]);
						}
						Collections.sort(inputList, Emp.salaryComparator);
						
					} else {
						performFuncion(inputList, inputSplit[0]);
					}
					
					if (k%5 == 0) {
						k = 0;
						inputList = new ArrayList<Emp>();
					}
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	private static void performFuncion(List empList, String function) throws NumberFormatException, IOException {
		switch (Integer.valueOf(function)) {
		case 1:
			System.out.println("Sort by Salary:");
			for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
				Emp object = (Emp) iterator.next();
				System.out.println(object.toString());
				
			}
			break;

		case 2:
			System.out.println("Enter manager id: ");
			int mgrID = Integer.valueOf(reader.readLine());
			for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
				Emp object = (Emp) iterator.next();
				if (object.mgrId == mgrID) {
					System.out.println(object.toString());
				}
			}
			break;
		case 3:
			System.out.println("Enter empid to start and print hierarchy till ceo");
			int empID = Integer.valueOf(reader.readLine());
			Collections.sort(inputList, Emp.mgeIdComparator);
			
			for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
				Emp object = (Emp) iterator.next();
				constructTree(object,head);
			}
			
			System.out.println(printHierarchy(empID,head));
			break;
		}
		
	}
	private static String printHierarchy(int empID, Emp head) {
		if (head.id == empID) {
			return String.valueOf(empID);
		}
		for (Iterator iterator = head.subEmps.iterator(); iterator.hasNext();) {
			Emp obj = (Emp) iterator.next();
			String part = printHierarchy(empID, obj);
			if (part != null) {
				return String.valueOf(head.id)+"," + part;
			}
			
		}
		return null;
	}
	private static void constructTree(Emp object, Emp head) {
		Emp current = head;
		if (object.mgrId != 0) {
			if(current.id == object.mgrId) {
				current.subEmps.add(object);
			} else {
				for (Iterator iterator = current.subEmps.iterator(); iterator.hasNext();) {
					Emp obj = (Emp) iterator.next();
					constructTree(object,obj);
				}
			}
		}
		
	}

}
