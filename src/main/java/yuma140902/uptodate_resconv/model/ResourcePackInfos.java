package yuma140902.uptodate_resconv.model;

import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;
import java.util.List;

public final class ResourcePackInfos {
	public static final List<ResourcePackInfo> infos = ImmutableList.of(
					new ResourcePackInfo(0, "～1.8.7"),
					new ResourcePackInfo(1, "1.8.8～1.8.9"),
					new ResourcePackInfo(2, "1.9～1.10"),
					new ResourcePackInfo(3, "1.11～1.12"),
					new ResourcePackInfo(4, "1.13～")
	);
	
	@Nullable
	public static ResourcePackInfo get(int packFormat){
		for(final ResourcePackInfo info : infos){
			if(info.packFormat == packFormat) return info;
		}
		return null;
	}
}
