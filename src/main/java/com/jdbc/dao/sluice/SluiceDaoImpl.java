package com.jdbc.dao.sluice;

import com.Entity.Sluice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SluiceDaoImpl implements SluiceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Sluice sluice) {
        String sql = "insert into sluice_t values(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, sluice.getId(), sluice.getName(), sluice.getBuildTime(), sluice.getMaster(),
                sluice.getLongitude(), sluice.getLatitude(), sluice.getIntroduction());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from sluice_t where id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(Sluice sluice) {
        String sql = "update sluice_t set name = ?, build_time = ?, master = ?, longitude = ?, latitude = ?, introduction = ? where id = ?";
        jdbcTemplate.update(sql, sluice.getName(), sluice.getBuildTime(), sluice.getMaster(), sluice.getLongitude(),
                sluice.getLatitude(), sluice.getIntroduction(), sluice.getId());
    }

    @Override
    public Sluice select(String id) {
        String sql = "select * from sluice_t where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Sluice.class), id);
    }

    @Override
    public List<Sluice> selectAll() {
        String sql = "select * from sluice_t";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Sluice.class));
    }
}
