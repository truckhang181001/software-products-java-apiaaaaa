package utils.services;

import play.http.HttpErrorHandler;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import utils.models.CommonErrorResponseModel;
import utils.models.CommonException;
import utils.models.ErrorModel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ErrorHandlerService implements HttpErrorHandler {
    @Override
    public CompletionStage<Result> onClientError(Http.RequestHeader request, int statusCode, String message) {
        return CompletableFuture.completedFuture(
                Results.status(statusCode, "A client error occurred: " + message));

    }

    @Override
    public CompletionStage<Result> onServerError(Http.RequestHeader request, Throwable exception) {
        if(exception.getClass().equals(CommonException.class)){
            return CompletableFuture.completedFuture(Results.badRequest(Json.toJson(exception)));
        }

        CommonErrorResponseModel commonErrorResponseModel = new CommonErrorResponseModel(false, new ErrorModel(exception.getClass().getName(),exception.getMessage()));

        return CompletableFuture.completedFuture(Results.badRequest(Json.toJson(commonErrorResponseModel)));
    }
}
