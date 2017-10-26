package service.impl;

import java.util.List;

import dao.WorkorderDao;
import entity.Workorder;
import service.WorkorderService;

public class WorkorderServiceImpl implements WorkorderService {
        private WorkorderDao workorderDao;
        
	public WorkorderDao getWorkorderDao() {
			return workorderDao;
		}

		public void setWorkorderDao(WorkorderDao workorderDao) {
			this.workorderDao = workorderDao;
		}

	@Override
	public List<Workorder> getList() {
		// TODO Auto-generated method stub
		return workorderDao.getList();
	}
	@Override
	public void update(Workorder workorder) {
	// TODO Auto-generated method stub
	     workorderDao.update(workorder);
	}
	@Override
	public void add(Workorder workorder) {
	// TODO Auto-generated method stub
	   workorderDao.add(workorder);
	}
    @Override
    public Workorder getById(int id) {
    // TODO Auto-generated method stub
    return workorderDao.getById(id);
    }
    @Override
    public void del(int id) {
    // TODO Auto-generated method stub
      workorderDao.del(id);
    }
}
