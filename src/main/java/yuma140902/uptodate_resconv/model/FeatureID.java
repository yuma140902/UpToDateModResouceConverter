package yuma140902.uptodate_resconv.model;

import java.util.Objects;

public class FeatureID {
	public final String image;
	
	public FeatureID(String image){
		assert image != null && image.contains(".");
		this.image = image;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof FeatureID)) return false;
		FeatureID featureID = (FeatureID) o;
		return image.equals(featureID.image);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(image);
	}
	
	@Override
	public String toString() {
		return "FeatureID{" +
						"image='" + image + '\'' +
						'}';
	}
}
