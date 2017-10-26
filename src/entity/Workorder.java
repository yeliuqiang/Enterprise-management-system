package entity;

import java.util.Date;

public class Workorder {
    private int id;
    private Project project;
    private String executor;
    private String description;
    private int orderLeve;
    private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getOrderLeve() {
		return orderLeve;
	}
	public void setOrderLeve(int orderLeve) {
		this.orderLeve = orderLeve;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
    
    
}
