package utils.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CommonErrorResponseModel {
    private boolean success;
    private Collection<ErrorModel> errors = new ArrayList<>();

    public CommonErrorResponseModel() {
    }

    public CommonErrorResponseModel(boolean status,
                                    Collection<ErrorModel> errors) {
        this.success = status;
        this.errors = errors;
    }

    public CommonErrorResponseModel(boolean success,
                                    ErrorModel... errors) {
        this.success = success;
        this.errors.addAll(Arrays.asList(errors));
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Collection<ErrorModel> getErrors() {
        return errors;
    }

    public void setErrors(Collection<ErrorModel> errors) {
        this.errors = errors;
    }
}
