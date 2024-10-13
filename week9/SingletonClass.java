package assignments;

public class SingletonClass {
	private int array[];
	private static boolean object_created = false;
	private static SingletonClass m_obj=null;

	//constructor
	private SingletonClass(int array[]) {
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
	
	public static SingletonClass getInstance(int array[]) {
		if(object_created == false) {
			m_obj = new SingletonClass(array);
			object_created = true;

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
