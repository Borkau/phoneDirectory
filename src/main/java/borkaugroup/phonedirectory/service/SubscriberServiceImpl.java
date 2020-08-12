package borkaugroup.phonedirectory.service;

import borkaugroup.phonedirectory.dao.SubscriberDao;
import borkaugroup.phonedirectory.dao.SubscriberDaoImpl;
import borkaugroup.phonedirectory.model.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubscriberServiceImpl implements SubscriberService {
    private SubscriberDao subscriberDao = new SubscriberDaoImpl();

    @Autowired
    public void setSubscriberDao(SubscriberDao subscriberDao) {
        this.subscriberDao = subscriberDao;
    }

        @Override
        public List<Subscriber> allSubs() {
            return subscriberDao.allSubs();
        }

        @Override
        public void add(Subscriber subscriber) {
            subscriberDao.add(subscriber);
        }

        @Override
        public void delete(Subscriber subscriber) {
            subscriberDao.delete(subscriber);
        }

        @Override
        public void edit(Subscriber subscriber) {
            subscriberDao.edit(subscriber);
        }

        @Override
        public Subscriber getById(int id) {
            return subscriberDao.getById(id);
        }
    }
