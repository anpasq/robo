package algorithm;

public class SensorInfo {

	
	private double[] streamSensed;
	
	public void setStreamSensed(double[] streamSensed) {
		this.streamSensed=streamSensed;
	}
	
	public double getMinDistance(){
		double min=100.0;
		for (int i = 0; i < streamSensed.length; i++) {
			double d = streamSensed[i];
			if(d<min)
				min=d;
		}
		return min;
	}
	
}