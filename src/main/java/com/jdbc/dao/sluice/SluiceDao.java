package com.jdbc.dao.sluice;

import com.Entity.Sluice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SluiceDao {

    void add(Sluice sluice);

    void delete(String id);

    void update(Sluice sluice);

    Sluice select(String id);

    List<Sluice> selectAll();
}
