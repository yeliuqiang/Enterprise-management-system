package service.impl;

import java.util.List;

import dao.ProjectDao;
import entity.Project;
import service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
        private ProjectDao projectDao;
        
	public ProjectDao getProjectDao() {
			return projectDao;
		}

		public void setProjectDao(ProjectDao projectDao) {
			this.projectDao = projectDao;
		}

	@Override
	public List<Project> getList() {
		// TODO Auto-generated method stub
		return projectDao.getList();
	}

}
