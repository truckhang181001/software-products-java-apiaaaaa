package repository;

import io.ebean.DB;
import io.ebean.PagedList;
import models.Software;
import models.requests.CommonListRequest;

import java.util.Optional;

public class SoftwareRepository {
    public Software getDetailSoftwareById(long id) throws Exception {
        Optional<Software> software = DB.find(Software.class)
                .setId(id)
                .findOneOrEmpty();
        return software.isPresent() ? software.get() : null;
    }

    public PagedList<Software> getPageListSoftware(CommonListRequest commonListRequest) throws Exception {
        PagedList<Software> result = DB.find(Software.class)
                .fetch("company").where()
                .ilike("name", "%" + commonListRequest.getFilter() + "%")
                .orderBy(commonListRequest.getSortBy() + " " + commonListRequest.getOrderBy())
                .setFirstRow(commonListRequest.getPage() * commonListRequest.getPageSize())
                .setMaxRows(commonListRequest.getPageSize())
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
