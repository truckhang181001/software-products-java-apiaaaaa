package utils.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ErrorModel {
    private String key;
    private Collection<String> params = new ArrayList<>();

    public ErrorModel() {
    }

    public ErrorModel(String key, Collection<String> params) {
        this.key = key;
        if (params != null) {
            this.params = params;
        }
    }

    public ErrorModel(String key, String... params) {
        this.key = key;
        if (params != null) {
            this.params.addAll(Arrays.asList(params));
        }
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Collection<String> getParams() {
        return params;
    }

    public void setParams(Collection<String> params) {
        this.params = params;
    }
}
