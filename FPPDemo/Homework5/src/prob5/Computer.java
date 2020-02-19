package prob5;
import java.util.Objects;

	public class Computer {
		private String manufacturer;
		private String processor;
		private int ramSize;
		private double processorSpeed;

		public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
			this.manufacturer = manufacturer;
			this.processor = processor;
			this.ramSize = ramSize;
			this.processorSpeed = processorSpeed;
		}

		int getRamSize() {

			return ramSize;
		}

		double getProcessorSpeed() {

			return processorSpeed;
		}

		double computePower() {

			return ramSize * processorSpeed;
		}

		@Override
		public String toString() {

			return manufacturer +" " + processor  +" " + ramSize  +" " + processorSpeed;
		}

	@Override
	//Override equals method of object
	public boolean equals(Object ob) {
		if(ob== null) 
			return false;
		if(!(ob instanceof Computer))
			return false;
		Computer cm = (Computer)ob;
		if(this.manufacturer.equals(cm.manufacturer) && this.processor.equals(cm.processor)&& this.ramSize==cm.ramSize && this.processorSpeed == cm.processorSpeed)
			return true;
		return false;
		
	}
	@Override
	//Override hashcode method of object
	public int hashCode() {
		return Objects.hash(manufacturer,processor,ramSize,processorSpeed);
		
	}

	}



