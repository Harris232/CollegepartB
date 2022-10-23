package collegepartb;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import collegeparta.CourseProgramme;
import collegeparta.Lecturer;
import collegeparta.Student;
import collegeparta.module;

public class Driver {
	
	
	public Driver() {
		
		Lecturer lect = new Lecturer("David Burns", "34", "15/08/1989", "6712344", null);
		Lecturer lec = new Lecturer("Charlie Burns", "34", "15/08/1989", "675644", null);
		Lecturer le = new Lecturer("David Attoms", "34", "15/08/1989", "4442344", null);
		Lecturer l = new Lecturer("Burns David", "34", "15/08/1989", "6712638", null);
		
		Student stud = new Student("Barry Morgan", "23", "12/02/99", "1234567", "ECE", null );
		Student stu = new Student("Larry Morgan", "22", "17/09/00", "1234567", "ECE", null );
		Student st = new Student("Barry Korgan", "23", "09/05/99", "1234567", "ECE", null );
		Student s = new Student("Morgan Barry", "22", "31/03/00", "1234567", "ECE", null );
		
		List<String> c = new ArrayList<String>();
		c.add("ECE");
		List<Object> ss = new ArrayList<Object>();
		
		module mods = new module("Java", "JA34", "David Burns", ss, c);
		module mod = new module("Pyton", "PY67", "Charlie Burns", ss, c);
		module mo = new module("Ruby", "RY53", "David Attoms", ss, c);
		module m = new module("Matlab", "MB99", "Burns David", ss, c);
		
		DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		DateTime start = DateTime.parse("09/05/2023", dateFormatter);
		DateTime finish = DateTime.parse("18/05/2024", dateFormatter);
		
		List<Object> ms = new ArrayList<Object>();
		List<Object> sss = new ArrayList<Object>();
		CourseProgramme cp = new CourseProgramme("ECE", ms, sss, start, finish );
		
		List<Object> modules = new ArrayList<Object>();
		modules.add(mods);
		lect.setModules(modules);
		List<Object> module = new ArrayList<Object>();
		module.add(mod);
		lec.setModules(module);
		List<Object> modul = new ArrayList<Object>();
		modul.add(mo);
		le.setModules(modul);
		List<Object> modu = new ArrayList<Object>();
		modu.add(m);
		l.setModules(modu);
		
		List<Object> modus = new ArrayList<Object>();
		modus.add(mods);
		modus.add(mod);
		modus.add(mo);
		modus.add(m);
		
		stud.setModules(modus);
		stu.setModules(modus);
		st.setModules(modus);
		s.setModules(modus);
		
		mods.addStudents(stud);
		mods.addStudents(stu);
		mods.addStudents(st);
		mods.addStudents(s);
		
		mod.addStudents(stud);
		mod.addStudents(stu);
		mod.addStudents(st);
		mod.addStudents(s);
		
		mo.addStudents(stud);
		mo.addStudents(stu);
		mo.addStudents(st);
		mo.addStudents(s);
		
		m.addStudents(stud);
		m.addStudents(stu);
		m.addStudents(st);
		m.addStudents(s);
		
		cp.addModules(mods);
		cp.addModules(mod);
		cp.addModules(mo);
		cp.addModules(m);
		
		cp.addStudents(stud);
		cp.addStudents(stu);
		cp.addStudents(st);
		cp.addStudents(s);
		
		System.out.println(""+stud.getName());
		System.out.println(""+mods.getName());
		System.out.println(""+lect.getName());
		System.out.println(""+cp.getName());
		
	}
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
	}

}
