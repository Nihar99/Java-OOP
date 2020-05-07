package extension;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import processing.core.PGraphics;

public class OrangeZoneMarker extends SimplePointMarker {
	public OrangeZoneMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	}
	public void draw(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.fill(255, 175, 0);
		pg.ellipse(x, 
				y, 
				10, 
				10);
		
		// Restore previous drawing style
		pg.popStyle();
	}
}
