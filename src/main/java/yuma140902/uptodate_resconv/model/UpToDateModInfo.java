package yuma140902.uptodate_resconv.model;

public class UpToDateModInfo {
	public final String version;
	public final String versions;
	
	public UpToDateModInfo(String version, String versions){
		this.version = version;
		this.versions = versions;
	}
	
	public String getJsonFile(){
		return String.format("/fid_to_uptodatemod%s.json", this.version);
	}
	
	@Override
	public String toString() {
		return String.format("UpToDateModInfo{version='%s', versions='%s'}", version, versions);
	}
}
