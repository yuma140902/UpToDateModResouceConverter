package yuma140902.uptodate_resconv.model;

public class ResourcePackInfo {
	public final int packFormat;
	public final String minecraftVersions;
	
	public ResourcePackInfo(int packFormat, String minecraftVersions){
		this.packFormat = packFormat;
		this.minecraftVersions = minecraftVersions;
	}
	
	public String getJsonFile(){
		return String.format("/format%d_to_fid.json", this.packFormat);
	}
	
	@Override
	public String toString() {
		return "ResourcePackInfo{" +
						"packFormat=" + packFormat +
						", minecraftVersions='" + minecraftVersions + '\'' +
						'}';
	}
}
