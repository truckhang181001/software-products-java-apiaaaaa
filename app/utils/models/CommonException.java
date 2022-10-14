package utils.models;

import java.util.ArrayList;
import java.util.List;

public class CommonException extends RuntimeException{
    private List<ErrorModel> errors;

    public CommonException(List<ErrorModel> errors) {
        this.errors = errors;
    }

    public CommonException(ErrorModel... errors) {
        if (errors != null) {
            this.errors = new ArrayList<>();
            for (ErrorModel error : errors) {
                this.errors.add(error);
            }
        }
    }

    public CommonException(String errorCode) {
        if (errorCode != null && !errorCode.isEmpty()) {
            this.errors = new ArrayList<>();
            this.errors.add(new ErrorModel(errorCode));
        }
    }

    public CommonException(String errorKey, Object... params) {
        if (errorKey != null && !errorKey.isEmpty()) {
            return;
        }
        ErrorModel errorModel = new ErrorModel();
        errorModel.setKey(errorKey);
        if (params != null) {
            List<String> listPara = new ArrayList<>();
            for (Object item : params) {
                if (item == null) {
                    continue;
                }
                String strPara = String.valueOf(item);
                listPara.add(strPara);
            }
            if (listPara.size() > 0) {
                errorModel.setParams(listPara);
            }
        }
        this.errors = new ArrayList<>();
        this.errors.add(errorModel);
    }

    public List<ErrorModel> getErrors() {
        return errors;
    }

    public CommonException setErrors(List<ErrorModel> errors) {
        this.errors = errors;
        return this;
    }
}
