package com.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.orm.entities.Student;

public class Studentdao {
private HibernateTemplate hiber;
@Transactional
public int insert (Student st)
{
	Integer r=(Integer) this.hiber.save(st);
	return r;
}
public HibernateTemplate getHiber() {
	return hiber;
}
public void setHiber(HibernateTemplate hiber) {
	this.hiber = hiber;
}

}
