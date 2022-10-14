package controllers;

import io.ebean.PagedList;
import models.requests.CommonListRequest;
import models.requests.SoftwareRequestModel;
import models.responses.SoftwareResponseModel;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Http;
import play.mvc.Result;
import services.software.SoftwareService;

import javax.inject.Inject;

import static play.mvc.Results.ok;

public class SoftwareController extends BaseController {
    private SoftwareService softwareService;

    @Inject
    public SoftwareController(SoftwareService softwareService) {
        this.softwareService = softwareService;
    }

    public Result getAllSoftware(Http.Request request) throws Exception {
        return ok();
    }

    public Result getDetailSoftware(Http.Request request) throws Exception {
        SoftwareRequestModel softwareRequestModel = this.getBody(request, SoftwareRequestModel.class);
        SoftwareResponseModel result = this.softwareService.getDetail(softwareRequestModel);
        return this.ok(result);
    }

    public Result getListSoftware(Http.Request request) throws Exception {
        CommonListRequest commonListRequest =
                this.getBody(request, CommonListRequest.class);
        PagedList<SoftwareResponseModel> result = this.softwareService.getPageListSoftware(commonListRequest);
        return this.ok(result);
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result createSoftware(Http.Request request) throws Exception {
        return ok();
    }

    public Result deleteSoftware(Http.Request request) throws Exception {
        return ok();
    }

    public Result updateSoftware(Http.Request request) throws Exception {
        return ok();
    }
}
