package Day1practise;

public class DrumkitTestDrive {

	public static void main(String[] args) {

		Drumkit d = new Drumkit();
		if (d.snare == true) {
			d.playSnare();
		}
		d.snare = false;
		d.playTopHat();
	}
}
