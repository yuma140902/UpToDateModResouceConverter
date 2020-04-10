package yuma140902.uptodate_resconv.registry;

import yuma140902.uptodate_resconv.json.FIDToDestination;
import yuma140902.uptodate_resconv.json.SourceToFID;
import yuma140902.uptodate_resconv.model.FeatureID;

import javax.annotation.Nullable;
import java.util.HashMap;

public class FIDRegistry {
	public static final FIDRegistry INSTANCE = new FIDRegistry();
	
	private FIDRegistry(){}
	
	private final HashMap<FeatureID, String> sources = new HashMap<>();
	private final HashMap<FeatureID, String> destinations = new HashMap<>();
	
	public void loadMappings(SourceToFID[] mappings){
		for(final SourceToFID map : mappings){
			this.sources.put(map.featureId(), map.src);
		}
	}
	
	public void loadMappings(FIDToDestination[] mappings){
		for(final FIDToDestination map : mappings){
			this.destinations.put(map.featureID(), map.dest);
		}
	}
	
	@Nullable
	public String getSource(FeatureID id){
		return this.sources.get(id);
	}
	
	@Nullable
	public String getDestination(FeatureID id){
		return this.destinations.get(id);
	}
}
