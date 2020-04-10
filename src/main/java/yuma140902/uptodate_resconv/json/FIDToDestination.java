package yuma140902.uptodate_resconv.json;

import yuma140902.uptodate_resconv.model.FeatureID;

public class FIDToDestination {
	public String id;
	public String dest;
	
	public FeatureID featureID(){
		return new FeatureID(id);
	}
}
