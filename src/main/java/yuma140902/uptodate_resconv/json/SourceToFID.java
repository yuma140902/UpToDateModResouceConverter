package yuma140902.uptodate_resconv.json;

import yuma140902.uptodate_resconv.model.FeatureID;

public class SourceToFID {
	public String src;
	public String id;
	
	public FeatureID featureId(){
		return new FeatureID(id);
	}
}
