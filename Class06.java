class CTriangle{
	int c;
	protected int base;
	protected int height;
	
	protected void show() {
		System.out.println("base="+base+", height="+height+",volume="+c);
	}
}
class CData extends CTriangle{
	CData(int a,int b){
		this.base=a;
		this.height=b;
		c=a*b/2;
	}
}
public class JAVA1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CData obj = new CData(3,8);
		obj.show();
	}

}
