package action;

import java.util.List;

import service.ProjectService;
import service.WorkorderService;

import com.opensymphony.xwork2.ActionSupport;

import entity.Project;
import entity.Workorder;

public class WorkorderAction extends ActionSupport {
       private WorkorderService workorderService;
       private ProjectService projectService;
       private List<Workorder> list;
       private List<Project> plist;
       private int id;
       private Workorder w;      
	public Workorder getW() {
		return w;
	}
	public void setW(Workorder w) {
		this.w = w;
	}
	public WorkorderService getWorkorderService() {
		return workorderService;
	}
	public void setWorkorderService(WorkorderService workorderService) {
		this.workorderService = workorderService;
	}
	
	public ProjectService getProjectService() {
		return projectService;
	}
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	public List<Workorder> getList() {
		return list;
	}
	public void setList(List<Workorder> list) {
		this.list = list;
	}
	

	public List<Project> getPlist() {
		return plist;
	}
	public void setPlist(List<Project> plist) {
		this.plist = plist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	  
	  public String list(){
		  list=workorderService.getList();
		  return SUCCESS;
	  }
	  public String add(){
		 plist=projectService.getList();	 
		  return"index";
	  }
	  public String save(){
		  this.clearMessages();
		  try {	 
	      workorderService.add(w);
	     this.addActionMessage("添加成功");
		} catch (Exception e) {
			// TODO: handle exception
		 this.addActionMessage("添加失败");
		}
		  return "list";
	  }
	  public String edit(){
		  w=workorderService.getById(id);
		 
		  return "edit";
	  }
	
	  public String update(){
		  workorderService.update(w);
		  try {
			  this.addActionMessage("修改成功");
		} catch (Exception e) {
			// TODO: handle exception
			  this.addActionMessage("修改失败");
		}
		  return "list";
	  }
	  public String del(){
		  w=workorderService.getById(id);
		  workorderService.del(id);
		  try {
			  this.addActionMessage("删除成功");
		} catch (Exception e) {
			// TODO: handle exception
			this.addActionMessage("删除失败");
		}  
		  return "list";
	  }
}
