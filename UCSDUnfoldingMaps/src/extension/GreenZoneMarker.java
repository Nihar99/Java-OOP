package extension;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import processing.core.PGraphics;

public class GreenZoneMarker extends SimplePointMarker {
	public GreenZoneMarker(Location location) {
		super(location);
	}
	
	public GreenZoneMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	}
	public void draw(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.fill(0, 255, 0);
		pg.ellipse(x, 
				y, 
				10, 
				10);
		
		// Restore previous drawing style
		pg.popStyle();
	}
	public String getName()
	{
		return getStringProperty("name");
	}
	
	public String getConfirmed()
	{
		return getStringProperty("confirmed");
	}
	
	public String getRecovery()
	{
		return getStringProperty("recovered");
	}
	public String getDeaths()
	{
		return getStringProperty("deaths");
	}
}
