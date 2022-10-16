package Projects;
// In this project I have worked on to find the area and perimerter of diiferent shapes and one can select the shape and provide the 
// length and width or radius then u will ge the result of area and perimeter.
import java.util.*;
public class shapes{
    public void rectangle(double l,double b){
		System.out.println("Perimeter is: "+(2*(l+b)));
		System.out.println("Area is:      "+(l*b));
    }
	private void square(double side) {
		System.out.println("Perimeter is: "+(4*side));
		System.out.println("Area is:      "+(side*side));
	}
	private void triangle(double l,double b) {
		System.out.println("Area is:      "+(0.5*l*b));
	}
	private void circle(double radius) {
		System.out.println("Circumference is: "+(2*Math.PI*radius));
		System.out.println("Area is:      "+(radius*radius*Math.PI));
	}
	private void cone(double l, double b) {
		System.out.println("Volume is:    "+(Math.PI*l*l*b)/3);
		System.out.println("Area is:      "+((l+b)*l*Math.PI));
	}
	private void cuboid(double l, double b, double h) {
		System.out.println("Perimeter is: "+(4*(l+b+h)));
		System.out.println("Volume is: "+(l*h*b));
		System.out.println("Area is:      "+((l+b)*(h+b)*(l+h)*2));
	}
	private void sphere(double l) {
		System.out.println("Volume is: "+((4/3)*Math.PI*l*l*l));
		System.out.println("Area is:      "+(4*l*l*Math.PI));
	}
	private void cylinder(double b, double h) {
		System.out.println("Volume is: "+(Math.PI*b*b*h));
		System.out.println("Area is:      "+((b+h)*2*b*Math.PI));
	}
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
	    shapes shapes1=new shapes();
	    int i;
		do{
		    System.out.println("Enter 1 for Rectangle");
		    System.out.println("Enter 2 for Square");
		    System.out.println("Enter 3 for Triangle");
		    System.out.println("Enter 4 for Circle");
		    System.out.println("Enter 5 for Cone");
		    System.out.println("Enter 6 for Cuboid");
		    System.out.println("Enter 7 for Sphere");
		    System.out.println("Enter 8 for Cylinder");
		    System.out.println("Enter 9 to Exit");
		     i=s.nextInt();
		     switch(i){
		         case 1:
				 System.out.println("Enter Length:");
				 double l=s.nextInt();
				 System.out.println("Enter Breadth:");
				 double b=s.nextInt();
		        shapes1.rectangle(l,b);
				break;
				case 2:
				System.out.println("Enter side:");
				 l=s.nextInt();
				shapes1.square(l);
				break;
				case 3:
				System.out.println("Enter Base:");
				 l=s.nextInt();
				System.out.println("Enter Height:");
				 b=s.nextInt();
			   shapes1.triangle(l,b);
                break;
				case 4:
				System.out.println("Enter Radius:");
				l=s.nextInt();
				shapes1.circle(l);
				break;
				case 5:
				System.out.println("Enter Radius:");
				l=s.nextInt();
				System.out.println("Enter Height:");
				 b=s.nextInt();
				shapes1.cone(l,b);
				break;
				case 6:
				System.out.println("Enter Base:");
				 l=s.nextInt();
				 System.out.println("Enter Radius:");
				b=s.nextInt();
				System.out.println("Enter Height:");
				 double h=s.nextInt();
				 shapes1.cuboid(l,b,h);
				 break;
				 case 7:
				 System.out.println("Enter Radius:");
				 l=s.nextInt();
				 shapes1.sphere(l);
				 break;
                case 8:
				System.out.println("Enter Radius:");
				b=s.nextInt();
				System.out.println("Enter Height:");
				  h=s.nextInt();
				 shapes1.cylinder(b,h);
				 break;
				 case 9:
				 break;
				 default:
				 System.out.println("Wrong Input!!! Please Enter a valid Number");


		     }
		    System.out.println();
		}while(i!=9);
	}

	
    }

