package dlz.po;

public class Version {
	private String partName;// 组件名称
	private String partCode;// 组件代码
	private int partStatus;// 组件状态位
	private String partVersion;// 组件版本
	private String filePath;// 组件地址
	private String fileURL;// 组件下载地址URL
	private String partNote;// 组件说明
	private int versionId;// 版本流水号
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public int getPartStatus() {
		return partStatus;
	}
	public void setPartStatus(int partStatus) {
		this.partStatus = partStatus;
	}
	public String getPartVersion() {
		return partVersion;
	}
	public void setPartVersion(String partVersion) {
		this.partVersion = partVersion;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileURL() {
		return fileURL;
	}
	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	}
	public String getPartNote() {
		return partNote;
	}
	public void setPartNote(String partNote) {
		this.partNote = partNote;
	}
	public int getVersionId() {
		return versionId;
	}
	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	 
}
