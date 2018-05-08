
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Picture sloth = new Picture("sloth.jpg");
		sloth.draw();
		
		Picture sloth2 = new Picture("sloth2.jpg");
		sloth2.translate(650, 462);
		sloth2.draw();
		
		Picture sloth3 = new Picture("sloth3.jpg");
		sloth3.translate(640, 0);
		sloth3.draw();
	}

}
