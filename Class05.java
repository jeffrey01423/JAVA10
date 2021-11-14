class Caaa{
	private	int num;
	public Caaa(int n) {
		num=n;
	}
	public int get() {
		return num;
	}
}
class Cbbb extends Caaa {
	Cbbb(int n){
		super(n);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class JAVA1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb(2);
		bb.show();
	}

}
