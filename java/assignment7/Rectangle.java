class Rectangle{
	double width;
	double height;

	public Rectangle(double w , double h){
		width = w;
		height = h;
	}

	double area(){
		return width * height;
	}
	double peri(){
		return 2*(width+height);
	}

	public static void main(String[] args){
		Rectangle r = new Rectangle(12,15);
		System.out.println("The perimeter is : " + r.peri());
		System.out.println("The area is : " + r.area());
	}
}