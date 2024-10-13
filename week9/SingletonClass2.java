package assignments;

public class SingletonClass2 {
	private int array[];
	private static SingletonClass2 m_obj=null;

	//constructor
	private SingletonClass2(int array[]) {
		this.array = array;
	}
	
	/*
	public static SingletonClass getInstance(int array[]) {
		SingletonClass obj = null;
		if(object_created == false) {
			obj = new SingletonClass(array);
			object_created = true;
		}
		return obj;
	}
	*/
	
	public static SingletonClass2 getInstance(int array[]) {
		if(m_obj == null) {
			m_obj = new SingletonClass2(array);
		}
		return m_obj;
	}
	public int min() {
		int min_val = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min_val) {
				min_val = array[i];
			}
		}

		return min_val;
	}
	
	//max
	
	//avg
	
	//etc...

}
