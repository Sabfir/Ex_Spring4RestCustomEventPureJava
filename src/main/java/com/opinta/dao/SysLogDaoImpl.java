package com.opinta.dao;

import com.opinta.model.Customer;
import com.opinta.model.SysLog;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysLogDaoImpl implements SysLogDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<SysLog> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(SysLog.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .list();
    }

    @Override
    public void save(SysLog sysLog) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(sysLog);
    }
}
