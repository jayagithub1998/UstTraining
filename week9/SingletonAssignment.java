package assignments;

public class SingletonAssignment {
	private int array[];
	private static SingletonAssignment m_obj[]=new SingletonAssignment[3];
	private static int curr_index=0;

	//constructor
	private SingletonAssignment(int array[]) {
		this.array = array;
	}
	
	public static SingletonAssignment getInstance (int array[]) {

		if(curr_index<3) {
			m_obj[curr_index]=new SingletonAssignment(array);
		}
			System.out.println("index-"+curr_index);	
			SingletonAssignment obj =m_obj[curr_index%3];
			curr_index++;
			return obj;
		
	}
	
	/*
	 * public static SingletonAssignment getInstance(int array[]) { if(m_obj ==
	 * null) { m_obj = new SingletonAssignment(array); } return m_obj; }
	 */
	
	public int min() {
		int min_val = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min_val) {
				min_val = array[i];
			}
		}

		return min_val;
	}



}
