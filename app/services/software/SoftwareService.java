package services.software;

import io.ebean.PagedList;
import models.Software;
import models.requests.CommonListRequest;
import models.requests.SoftwareRequestModel;
import repository.SoftwareRepository;
import utils.models.ObjectReference;

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

    public ObjectReference createSoftware(Software request) throws Exception {
        Software result = this.softwareRepository.createSoftware(request);

        ObjectReference objectReference = new ObjectReference();
        objectReference.setId(result.getId());
        objectReference.setMessage("created");
        objectReference.setStatus(true);

        return objectReference;
    }

    public ObjectReference updateSoftware() throws Exception {
        return null;
    }

    public ObjectReference deleteSoftware() throws Exception {
        return null;
    }
}
