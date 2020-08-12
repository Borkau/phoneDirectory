package borkaugroup.phonedirectory.dao;

import borkaugroup.phonedirectory.model.Subscriber;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SubscriberDaoImpl implements SubscriberDao {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Subscriber> subscribers = new HashMap<>();

    static {
        Subscriber subscriber1 = new Subscriber();
        subscriber1.setId(AUTO_ID.getAndIncrement());
        subscriber1.setPhone(922179286);
        subscriber1.setName("Artem Chebarov");
        subscribers.put(subscriber1.getId(), subscriber1);
    }

    @Override
    public List<Subscriber> allSubs() {
        return new ArrayList<>(subscribers.values());
    }

    @Override
    public void add(Subscriber subscriber) {
        subscriber.setId(AUTO_ID.getAndIncrement());
        subscribers.put(subscriber.getId(), subscriber);
    }

    @Override
    public void delete(Subscriber subscriber) {
        subscribers.remove(subscriber.getId());
    }

    @Override
    public void edit(Subscriber subscriber) {
        subscribers.put(subscriber.getId(), subscriber);
    }

    @Override
    public Subscriber getById(int id) {
        return subscribers.get(id);
    }
}