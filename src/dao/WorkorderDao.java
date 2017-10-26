package dao;

import java.util.List;

import entity.Workorder;

public interface WorkorderDao {
   public List<Workorder> getList();
   public Workorder  getById(int id);
   public void update(Workorder workorder);
   public void del(int id);
   public void add(Workorder workorder);
}
