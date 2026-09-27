package tp11;
public class point {
	private int abs ;
	private int ord ;
	private char nom ;
	void initilise (int x, int y , char c)
	{
		abs = x ;
		ord = y ;
		nom=c;
		
	}
	point( int a ,int b , char c)
	{
		abs = a;
		ord = b;
		nom=c;
	}
	point( int x , char c)	
	{
		abs = x;
		ord = 2*x;
		nom=c;
	}
	void tronz_hor(int d)
	{
		abs += d;
		}
	void tronz_vert(int d)
	{
		ord += d;
	}
	void traj (int d ,int x)
	{
		abs += d;
		ord += x;
	}
	void affiche ()
	{
		System.out.println(nom+"("+abs+","+ord+")");
		
	}
	
}
class test
{
	public static void main(String[]args)
	{
		point p;
		p= new point(3,2,'P');
		point p1= new point(1,1,'S');
		point p2= new point(2,'K');
		p.affiche();
		p1.affiche();
		p2.affiche();
		p2.tronz_hor(2);
		p1.traj(2,3);
		System.out.println(" apres translation");
		p2.affiche();
		
	}
	
	}




