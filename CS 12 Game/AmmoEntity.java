import java.awt.Graphics2D;

public class AmmoEntity extends Entity{
private Game game;
	
	public AmmoEntity(Game g,String r, int newX, int newY) {
		super(r, newX, newY);
		game = g;
	}

	public void collidedWith(Entity other) {}

	public void rotate(Graphics2D g, double rotatingAngle, double xRotate, double yRotate) {
	}
}
