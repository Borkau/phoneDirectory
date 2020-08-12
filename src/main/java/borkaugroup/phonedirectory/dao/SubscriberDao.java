package borkaugroup.phonedirectory.dao;

import java.util.List;
import borkaugroup.phonedirectory.model.Subscriber;

public interface SubscriberDao {
    List<Subscriber> allSubs();
    void add(Subscriber subscriber);
    void delete(Subscriber subscriber);
    void edit(Subscriber subscriber);
    Subscriber getById(int id);
}
