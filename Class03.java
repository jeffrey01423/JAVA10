class Caaa{
	public int num1;
	public int num2;
	Caaa(){
		this.num1=1;
		this.num2=1;
	}
	Caaa(int a,int b){
		this.num1=a;
		this.num2=b;
	}
	void main() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
class Cbbb extends Caaa{
	Cbbb(int a,int b){
		super(a,b);
	}
}
public class JAVA1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa a = new Caaa();
		Caaa b = new Caaa(5,10);
		Caaa c = new Cbbb(6,20);
		a.main();
		b.main();
		c.main();
	}

}
