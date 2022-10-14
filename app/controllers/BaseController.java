package controllers;

import models.requests.SoftwareRequestModel;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class BaseController extends Controller {
   public <T> T getBody(Http.Request request, Class<T> clazz){
       return Json.fromJson(request.body().asJson(), clazz);
   }

   public Result ok(Object response){
       return ok(Json.toJson(response));
   }
}
