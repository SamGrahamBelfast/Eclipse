package p3;

import java.util.Comparator;

/**
 * @author Sam Graham 
 * 40426180
 */
public class CompareByTimeSlot implements Comparator<ProgramTimeSlot> {

	@Override
	public int compare(ProgramTimeSlot o1, ProgramTimeSlot o2) {
		// TODO Auto-generated method stub
		return o1.getStartTIme().compareTo(o2.getStartTIme());
	}

}
