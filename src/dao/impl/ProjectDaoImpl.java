package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ProjectDao;
import entity.Project;

public class ProjectDaoImpl extends HibernateDaoSupport implements ProjectDao {

	@Override
	public List<Project> getList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Project");
	}

}
