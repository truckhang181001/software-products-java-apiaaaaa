package services.software;

import io.ebean.PagedList;
import models.requests.CommonListRequest;
import models.requests.SoftwareRequestModel;
import models.responses.CommonListResponse;
import models.responses.SoftwareResponseModel;
import repository.SoftwareRepository;
import utils.ObjectReference;

import javax.inject.Inject;
import java.util.List;

public class SoftwareService {
    private SoftwareRepository softwareRepository;

    @Inject
    public SoftwareService(SoftwareRepository softwareRepository) {
        this.softwareRepository = softwareRepository;
    }

    public SoftwareResponseModel getDetail(SoftwareRequestModel request) throws Exception {
        return null;
    }

    public List<SoftwareResponseModel> getAllSoftware() throws Exception {
        return null;
    }

    public PagedList<SoftwareResponseModel> getPageListSoftware(CommonListRequest commonListRequest) {
        return null;
    }

    public ObjectReference createSoftware() throws Exception {
        return null;
    }

    public ObjectReference updateSoftware() throws Exception {
        return null;
    }

    public ObjectReference deleteSoftware() throws Exception {
        return null;
    }
}
