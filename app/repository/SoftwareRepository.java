package repository;

import io.ebean.DB;
import io.ebean.PagedList;
import io.ebean.Transaction;
import models.Software;

import java.util.Optional;

public class SoftwareRepository {
    public Software getDetailSoftwareById(int id) throws Exception {
        Optional<Software> software = DB.find(Software.class)
                .setId(id)
                .findOneOrEmpty();
        return software.isPresent() ? software.get() : null;
    }

    public PagedList<Software> getPageListSoftware(int page, int pageSize, String sortBy, String order, String filter) throws Exception {
        PagedList<Software> result = DB.find(Software.class)
                .fetch("company").where()
                .ilike("name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .setFirstRow(page * pageSize)
                .setMaxRows(pageSize)
                .findPagedList();
        return result;
    }

    public Long createSoftware(Software software) throws Exception {
        software.setId(System.currentTimeMillis());
        DB.insert(software);
        return software.getId();
    }

    public Long updateSoftware(Software newSoftware) {
        Transaction txn = DB.beginTransaction();
        Long value = null;
        try {
            Software saveSoftware = DB.find(Software.class).setId(newSoftware.getId()).findOne();
            if (saveSoftware != null) {
                saveSoftware.save();
                txn.commit();
                value = newSoftware.getId();
            }
        } finally {
            txn.end();
        }
        return value;
    }

    public Boolean deleteSoftWareById(Long id) {
        Optional<Software> software = DB.find(Software.class)
                .setId(id)
                .findOneOrEmpty();
        if (software.isPresent()){
            return DB.delete(software);
        }

        return null;
    }
}
