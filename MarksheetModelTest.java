package javaBean;

import java.util.Iterator;
import java.util.List;

public class MarksheetModelTest {

	public static void main(String[] args) throws Exception {

		//testAdd();
		
		//testSearch();
		
		//testUpdate(9);
		
		//testSearch();
		
		//testDelete(23);
		
		//testGet(12);
		
		testGetMeritList();
		
	}

	public static void testGetMeritList() throws Exception {
		

		MarksheetModel mm = new MarksheetModel();
     
		List<Marksheet> op = mm.getMeritList();                     
		
		Iterator it = op.iterator();
		
      while (it.hasNext()) {
		
    	  Marksheet m = (Marksheet) it.next();
		
        System.out.println(m.getId()+m.getRollNo()+m.getFname()+m.getLname()+m.getPhy()+m.getChem()+m.getMath());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	}

	public static void testSearch() throws Exception {

		Marksheet msset = new Marksheet();

		MarksheetModel mm = new MarksheetModel();

		mm.search(msset);

	}

	public static void testGet(int i) throws Exception {

		Marksheet msset = new Marksheet();

		msset.setId(i);

		MarksheetModel mm = new MarksheetModel();

		mm.get(msset);

	}

	public static void testDelete(int k) throws Exception {

		Marksheet msset = new Marksheet();

		msset.setId(k);

		MarksheetModel mm = new MarksheetModel();
		mm.delete(msset);
	}

	public static void testUpdate(int l) throws Exception {

		Marksheet msset = new Marksheet();

		msset.setId(l);
		msset.setRollNo("108");
		msset.setFname("Thomas");
		msset.setLname("Sharma");
		msset.setPhy(99);
		msset.setChem(99);
		msset.setMath(99);

		MarksheetModel mm = new MarksheetModel();
		mm.update(msset);
	}

	public static void testAdd() throws Exception {

		Marksheet msset = new Marksheet();

		msset.setRollNo("116");
		msset.setFname("Roopa");
		msset.setLname("Baniyan");
		msset.setPhy(78);
		msset.setChem(88);
		msset.setMath(79);

		MarksheetModel mm = new MarksheetModel();
		mm.add(msset);
	}

}
