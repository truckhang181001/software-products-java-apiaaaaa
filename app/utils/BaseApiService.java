package utils;

import play.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BaseApiService {
//    protected void checkRequiredFields(Object model, String... names) throws Exception {
//        if (model == null) {
//            return;
//        }
//
//        Class<? extends Object> modelClass = model.getClass();
//        Object validModel = new ErrorCodes.REQUIRE_ERROR();
//        Class<? extends Object> validClass = validModel.getClass();
//
//        List<ErrorModel> errors = new ArrayList<>();
//        if (names != null && names.length > 0) {
//            for (int i = 0; i < names.length; i++) {
//                String fName = names[i];
//                Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(modelClass, fName, true);
//                if (field == null) {
//                    Logger.error("Model does not contains field: {}", fName);
//                    throw new Exception("Model does not contains field: " + fName);
//                }
//                Object modelValue = field.get(model);
//
//                if (modelValue == null || String.valueOf(modelValue).trim().isEmpty()) {
//                    try {
//                        Field valid = org.apache.commons.lang3.reflect.FieldUtils
//                                .getField(validClass, fName.toUpperCase(), true);
//                        errors.add(new ErrorModel(valid.get(validModel).toString()));
//                    } catch (Exception ex) {
//                        Logger.error("checkRequiredFields field={}, message={}", fName, ex.getMessage());
//                        throw new Exception(fName + " is required.");
//                    }
//                }
//            }
//        }
//
//        if (!errors.isEmpty()) {
//            Logger.error("checkRequiredFields exists model={}, names={}", model, names);
//            throw new CsaException(errors);
//        }
//    }
}
