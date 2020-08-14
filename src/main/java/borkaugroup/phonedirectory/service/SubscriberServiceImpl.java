package borkaugroup.phonedirectory.service;

import borkaugroup.phonedirectory.dao.SubscriberDao;
import borkaugroup.phonedirectory.model.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    private SubscriberDao subscriberDao;

    @Autowired
    public void setSubscriberDao(SubscriberDao subscriberDao) {
        this.subscriberDao = subscriberDao;
    }

        @Override
        @Transactional
        public List<Subscriber> allSubs() {
            return subscriberDao.allSubs();
        }

        @Override
        @Transactional
        public void add(Subscriber subscriber) {
            subscriberDao.add(subscriber);
        }

        @Override
        @Transactional
        public void delete(Subscriber subscriber) {
            subscriberDao.delete(subscriber);
        }

        @Override
        @Transactional
        public void edit(Subscriber subscriber) {
            subscriberDao.edit(subscriber);
        }

        @Override
        @Transactional
        public Subscriber getById(int id) {
            return subscriberDao.getById(id);
        }
    }
