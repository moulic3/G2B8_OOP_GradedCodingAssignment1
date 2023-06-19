package com.gl.main;

import com.gl.model.AdminDepartment;
import com.gl.model.HrDepartment;
import com.gl.model.TechDepartment;
import com.gl.service.SuperDepartment;

public class DriverClass {

	public static void main(String[] args) {
		// This is the main method
		AdminDepartment ad = null;
		HrDepartment hrd = null;
		TechDepartment techd = null;
		// Accessing Admin Dept methods
		SuperDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday());

		System.out.println();
		
		// Accessing HR Dept methods
		SuperDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());

		// Casting Superclass object to subclass .
		if (hr instanceof HrDepartment) {
			hrd = (HrDepartment) hr;
			try {
				System.out.println(hrd.doActivity());
			} catch (ClassCastException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayHoliday());

		System.out.println();
		
		// Accessing Tech dept methods.
		SuperDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		
		// Casting Superclass object to subclass .
		if (tech instanceof TechDepartment) {
			techd = (TechDepartment) tech;

			try {
				System.out.println(techd.getTechStackInformation());
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tech.isTodayHoliday());

	}

}
