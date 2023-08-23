package com.test1;

public class ApiConfigDetail {
	private int id;
	private String columnName;
	private String filter;
	private String whereCondition;
	private String columnType;
	private int columnSize;
	private String required;
	private String defaultValues;
	private String status;

	public ApiConfigDetail() {

	}

	public ApiConfigDetail(int id, String columnName, String filter, String whereCondition, String columnType,
			int columnSize, String required, String defaultValues, String status) {
		super();
		this.id = id;
		this.columnName = columnName;
		this.filter = filter;
		this.whereCondition = whereCondition;
		this.columnType = columnType;
		this.columnSize = columnSize;
		this.required = required;
		this.defaultValues = defaultValues;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getWhereCondition() {
		return whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public int getColumnSize() {
		return columnSize;
	}

	public void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getDefaultValues() {
		return defaultValues;
	}

	public void setDefaultValues(String defaultValues) {
		this.defaultValues = defaultValues;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
