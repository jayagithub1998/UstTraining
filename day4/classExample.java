package classExample;

class Product{
	int id;
	String name;
	float price;
	
	Product(){
		id=0;
		name="";
		price=0;
	}
	
	Product(int pid,String pname,float pprice){
		id=pid;
		name=pname;
		price=pprice;
	}
	
	void display() {
		System.out.println("id "+id+"\nName "+name+"\nPrice "+price+"\n");
	}
	
}

public class classExample {

	public static void main(String[] args) {
		Product pobj = new Product(1,"Pen",5);
		pobj.display();
		
		//array of object
		Product arrayPObj[]=new Product[3]; //int a=new int[3]
		arrayPObj[0]=new Product(1,"Pen",10); //a[0]=5; -->initialization using constructor
		arrayPObj[1]=new Product(2,"Chair",100);
		arrayPObj[2]=new Product(3,"Pencil",20);
		
	/*	for(Product prob:arrayPObj) {
			prob.display();
		}
		*/
		for(int i=0;i<arrayPObj.length;i++) {
			arrayPObj[i].display();
		}
				
	}

}
