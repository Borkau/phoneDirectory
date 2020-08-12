package borkaugroup.phonedirectory.service;

import borkaugroup.phonedirectory.model.Subscriber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriberService {
    List<Subscriber> allSubs();
    void add(Subscriber subscriber);
    void delete(Subscriber subscriber);
    void edit(Subscriber subscriber);
    Subscriber getById(int id);
}