package controllers;

import play.mvc.BodyParser;
import play.mvc.Http;
import play.mvc.Result;

import static play.mvc.Results.ok;

public class SoftwareController {
    public Result getAllSoftware(){
        return ok();
    }
    public Result getDetailSoftware(Http.Request request){
        return ok();
    }
    public Result getListSoftware(){
        return ok();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result createSoftware(){
        return ok();
    }
    public Result deleteSoftware(){
        return ok();
    }
    public Result updateSoftware(){
        return ok();
    }
}
