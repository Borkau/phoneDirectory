package borkaugroup.phonedirectory.dao;

import borkaugroup.phonedirectory.model.Subscriber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SubscriberDaoImpl implements SubscriberDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @SuppressWarnings("unchecked")
    public List<Subscriber> allSubs() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Subscriber ").list();
    }

    @Override
    public void add(Subscriber subscriber) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(subscriber);
    }

    @Override
    public void delete(Subscriber subscriber) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(subscriber);
    }

    @Override
    public void edit(Subscriber subscriber) {
        Session session = sessionFactory.getCurrentSession();
        session.update(subscriber);
    }

    @Override
    public Subscriber getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Subscriber.class, id);
    }
}