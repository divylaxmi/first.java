 package com.comparatorinterface;

import java.util.Comparator;

public class Name implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// this method is from String class
		return o1.name.compareTo(o2.name);
	}

}
