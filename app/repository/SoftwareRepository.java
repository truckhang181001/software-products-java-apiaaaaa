package repository;

import io.ebean.DB;
import io.ebean.PagedList;
import models.Software;

import java.util.Optional;

public class SoftwareRepository {
    public Software getDetailSoftwareById(long id) throws Exception {
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

    public Software createSoftware(Software software) throws Exception {
        software.setId(System.currentTimeMillis());
        DB.insert(software);
        return software;
    }

    public Boolean updateSoftware(Software newSoftware) throws Exception {
        Optional<Software> saveSoftware = DB.find(Software.class).setId(newSoftware.getId()).findOneOrEmpty();
        if (saveSoftware.isPresent()) {
            newSoftware.save();
            return true;
        }
        return false;
    }

    public Boolean deleteSoftWareById(long id) throws Exception {
        Optional<Software> software = DB.find(Software.class)
                .setId(id)
                .findOneOrEmpty();
        if (software.isPresent()) {
            return DB.delete(software);
        }
        return false;
    }
}
