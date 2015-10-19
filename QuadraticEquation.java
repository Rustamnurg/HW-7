import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     System.out.println("Add smth ");

     String ur = in.next(); 

     int ai, bi, ci;
     double x1, x2, d;
     ai = 1;
     bi = 1;
     String work;

     Double a;
     ai = ur.indexOf('x');
     work = ur.substring(0, ai);
     if(work.equals("")) 
     	a = 1.0;
     else
	 	a = Double.valueOf(work);


	 Double b;
     bi = ur.lastIndexOf('x');
	 work = ur.substring(ai + 3, bi);
	 if(work.equals("")) 
     	b = 1.0;
     else
	 	b = Double.valueOf(work);

	 Double c;
	 work = ur.substring(bi + 1, ur.length());
	 if(work.equals("")) 
     	c = 1.0;
     else
	 	c = Double.valueOf(work);

	d = 0;
	x1 = 0;
	x2 = 0;

	d = (b * b - 4 * a * c);
	if (d > 0) {
		x1 = (-b + Math.sqrt(d)) / (2.0*a); 
		x2 = (-b - Math.sqrt(d)) / (2.0*a);
		System.out.println("x1 = " + x1 + "; x2 = " + x2);
	} 
	else if (d == 0){
		x1 = (-b) / (2.0*a);
		System.out.println("x = " + x1);	
	} 
	else {
		System.out.println("x = none");	
	}


    }
}
