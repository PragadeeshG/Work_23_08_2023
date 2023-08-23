package com.test1;

public class ApiConfig {
	private int id;
	private String apiName;
	private String version;
	private String tabeViewName;
	private String defaultFilter;
	private int fetchSize;
	private String status;

	public ApiConfig() {

	}

	public ApiConfig(int id, String apiName, String version, String tabeViewName, String defaultFilter, int fetchSize,
			String status) {
		super();
		this.id = id;
		this.apiName = apiName;
		this.version = version;
		this.tabeViewName = tabeViewName;
		this.defaultFilter = defaultFilter;
		this.fetchSize = fetchSize;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTabeViewName() {
		return tabeViewName;
	}

	public void setTabeViewName(String tabeViewName) {
		this.tabeViewName = tabeViewName;
	}

	public String getDefaultFilter() {
		return defaultFilter;
	}

	public void setDefaultFilter(String defaultFilter) {
		this.defaultFilter = defaultFilter;
	}

	public int getFetchSize() {
		return fetchSize;
	}

	public void setFetchSize(int fetchSize) {
		this.fetchSize = fetchSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
