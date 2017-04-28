package com.kiuwan.client.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationFiles {

	protected String name;
	protected String description;
	protected String label;
	protected Date date;
	protected String encoding;
	protected String qualityModel;
	protected String orderedBy;
	protected Long filesCount;
	protected Long count;
	protected Long page;
	protected List<File> files = new ArrayList<File>();
	protected String analysisCode;
	protected String analysisStatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	@JsonProperty("quality_model")
	public String getQualityModel() {
		return qualityModel;
	}
	public void setQualityModel(String qualityModel) {
		this.qualityModel = qualityModel;
	}
	@JsonProperty("ordered_by")
	public String getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}
	public Long getCount() {
		return count;
	}
	@JsonProperty("files_count")
	public Long getFilesCount() {
		return filesCount;
	}
	public void setFilesCount(Long filesCount) {
		this.filesCount = filesCount;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getPage() {
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}
	/**
	 * @return the analysisCode
	 */
	public String getAnalysisCode() {
		return analysisCode;
	}
	/**
	 * @param analysisCode the analysisCode to set
	 */
	public void setAnalysisCode(String analysisCode) {
		this.analysisCode = analysisCode;
	}
	/**
	 * @return the analysisStatus
	 */
	public String getAnalysisStatus() {
		return analysisStatus;
	}
	/**
	 * @param analysisStatus the analysisStatus to set
	 */
	public void setAnalysisStatus(String analysisStatus) {
		this.analysisStatus = analysisStatus;
	}
	@Override
	public String toString() {
		return "ApplicationFiles [name=" + name + ", description="
				+ description + ", label=" + label + ", date=" + date
				+ ", encoding=" + encoding + ", qualityModel=" + qualityModel
				+ ", orderedBy=" + orderedBy + ", filesCount=" + filesCount
				+ ", count=" + count + ", page=" + page + ", files=" + files
				+ "]";
	}
	
	
	
	
}
