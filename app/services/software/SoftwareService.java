package services.software;

import io.ebean.PagedList;
import models.Software;
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

    public Software getDetail(SoftwareRequestModel request) throws Exception {
        return softwareRepository.getDetailSoftwareById(request.getId());
    }

    public List<Software> getAllSoftware() throws Exception {
        return null;
    }

    public PagedList<Software> getPageListSoftware(CommonListRequest commonListRequest) throws Exception {
        return softwareRepository.getPageListSoftware(commonListRequest);
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
