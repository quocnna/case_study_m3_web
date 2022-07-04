package cg.m3.furama.repository;

import java.util.List;

public interface BaseRepository<T> {
    List<T> findAll();
    void save();
    List<T> find(String q);
}
