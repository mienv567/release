package com.fanwe.o2o.http;

import com.fanwe.library.adapter.http.model.SDRequestParams;
import com.fanwe.library.adapter.http.model.SDResponse;

public abstract class AppRequestCallbackWrapper<D> extends AppRequestCallback<D> {

    private AppRequestCallback<D> originalCallback;

    public AppRequestCallbackWrapper(AppRequestCallback<D> originalCallback) {
        super();
        this.originalCallback = originalCallback;
    }

    public AppRequestCallback<D> getOriginalCallback() {
        return originalCallback;
    }

    @Override
    public void setRequestParams(SDRequestParams requestParams) {
        super.setRequestParams(requestParams);
        if (originalCallback != null) {
            originalCallback.setRequestParams(requestParams);
        }
    }

    @Override
    protected void onStartAfter() {
        super.onStartAfter();
        if (originalCallback != null) {
            originalCallback.notifyStart();
        }
    }

    @Override
    protected void onSuccessAfter(SDResponse resp) {
        super.onSuccessAfter(resp);
        if (originalCallback != null) {
            originalCallback.notifySuccess(resp);
        }
    }

    @Override
    protected void onCancel(SDResponse resp) {
        super.onCancel(resp);
        if (originalCallback != null) {
            originalCallback.notifyCancel(resp);
        }
    }

    @Override
    protected void onError(SDResponse resp) {
        super.onError(resp);
        if (originalCallback != null) {
            originalCallback.notifyError(resp);
        }
    }

    @Override
    protected void onFinish(SDResponse resp) {
        super.onFinish(resp);
        if (originalCallback != null) {
            originalCallback.notifyFinish(resp);
        }
    }

}
