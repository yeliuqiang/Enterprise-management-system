package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.WorkorderDao;
import entity.Workorder;

public class WorkorderDaoImpl extends HibernateDaoSupport implements
		WorkorderDao {

	@Override
	public List<Workorder> getList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Workorder w inner join fetch w.project");
	}
  @Override
public void add(Workorder workorder) {
	// TODO Auto-generated method stub
	this.getHibernateTemplate().save(workorder);
}
  @Override
public Workorder getById(int id) {
	// TODO Auto-generated method stub
	return (Workorder)this.getHibernateTemplate().get(Workorder.class, id);
}
  @Override
public void update(Workorder workorder) {
	// TODO Auto-generated method stub
	this.getHibernateTemplate().update(workorder);
}
  @Override
public void del(int id) {
	// TODO Auto-generated method stub
Workorder workorder=(Workorder)this.getHibernateTemplate().load(Workorder.class, id);
	this.getHibernateTemplate().delete(workorder);
}
}
